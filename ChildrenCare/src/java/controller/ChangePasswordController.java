/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Models.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author vinh2
 */
public class ChangePasswordController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Views/ChangePassword.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        User u = (User) session.getAttribute("user");
        String email = u.getEmail();
        String originPass = u.getPassword();
        String oldPass = request.getParameter("oldpass");
        String newPass = request.getParameter("newpass");
        String reNewpass = request.getParameter("reNewpass");
        String passPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20}$";
        Pattern pat = Pattern.compile(passPattern);
        Matcher mat = pat.matcher(newPass);
        if (!mat.matches()) {
            request.setAttribute("messAlert", "Password have at least 8 character contain at least one number, one lowercase, one uppercase");
            request.getRequestDispatcher("/Views/ChangePassword.jsp").forward(request, response);
        }
        if (!oldPass.equals(originPass)) {
            request.setAttribute("messAlert", "Old pass is incorrect");
        } else {
            if (!newPass.equals(reNewpass)) {
                request.setAttribute("messAlert", "Pass and repass don't match");
            } else {
                request.setAttribute("messSuccess", "Change pass succesfully");
                try {
                    new dao.UserDao().setNewPassword(email, newPass);
                } catch (Exception ex) {
                    Logger.getLogger(ChangePasswordController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        request.getRequestDispatcher("/Views/ChangePassword.jsp").forward(request, response);

    }
}
