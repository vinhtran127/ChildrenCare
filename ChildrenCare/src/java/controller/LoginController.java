/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Models.User;
import java.io.IOException;
import java.io.PrintWriter;
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
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie arr[] = request.getCookies(); // trả về dãy các cookies
        if (arr != null) { // !(nếu cookie bị xoá hết khi đóng trình duyệt)
            for (Cookie o : arr) {
                if (o.getName().equals("emailC")) {
                    request.setAttribute("emailC", o.getValue());
                }
                if (o.getName().equals("passC")) {
                    request.setAttribute("passC", o.getValue());
                }
            }
        }
        request.getRequestDispatcher("/Views/Login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        String email = request.getParameter("email");
        String password = request.getParameter("pass");
        User u = new dao.UserDao().getAnUser(email, password);

        if (u == null) {
            String messAlert = "Wrong password or email";
            session.setAttribute("messAlert", messAlert);
            request.getRequestDispatcher("/Views/Login.jsp").forward(request, response);
        } else {
            String remember = request.getParameter("remember");
            if (remember == null) {
                session.setAttribute("user", u);
                request.getRequestDispatcher("HomePage").forward(request, response);
            } else {
                session.setAttribute("user", u);

                Cookie emailC = new Cookie("emailC", email);
                Cookie passC = new Cookie("passC", password);
                emailC.setMaxAge(60 * 5);
                passC.setMaxAge(60 * 5);
                response.addCookie(passC);
                response.addCookie(emailC);
                request.getRequestDispatcher("HomePage").forward(request, response);
            }
        }
    }
}
