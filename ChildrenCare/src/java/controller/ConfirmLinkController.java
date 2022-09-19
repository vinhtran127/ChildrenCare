/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Models.User;
import dao.UserDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class ConfirmLinkController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        String randomString = (String) request.getParameter("randomString");
        String action = (String) request.getParameter("action");
        Cookie cookies[] = request.getCookies();
        boolean isExitCookie = false;
        String emailForTheCookie = null;
        for (int i = 0; i < cookies.length; i++) {
            if (cookies[i].getName().equals(randomString)) {
                emailForTheCookie = cookies[i].getValue();
                isExitCookie = true;
            }
        }
//        if(isExitCookie){
//            try {
//                User u = new UserDao().searchUserByEmail(emailForTheCookie);
//                UserDao().setActive(emailForTheCookie);
//            } catch (Exception ex) {
//                Logger.getLogger(ConfirmCodeController.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }

        String email = (String) session.getAttribute("email");
        if (action.equals("signup")) {
            if (isExitCookie && emailForTheCookie.equals(email)) {
                String phone = (String) session.getAttribute("phone");
                String username = (String) session.getAttribute("username");
                String fullname = (String) session.getAttribute("fullname");
                String pass = (String) session.getAttribute("pass");
                try {
                    new dao.UserDao().addUser(fullname, phone, username, email, pass);
                } catch (Exception ex) {
                    Logger.getLogger(ConfirmLinkController.class.getName()).log(Level.SEVERE, null, ex);
                }
                request.setAttribute("messSuccess", "Register finish, you can go to login");
            } else {
                request.setAttribute("messAlert", "Time out 5min to confirm your account");
            }
            request.getRequestDispatcher("/Views/ConfirmCode.jsp").forward(request, response);
        }
        if (action.equalsIgnoreCase("ResetPassword")) {
            if (isExitCookie) {
                request.getRequestDispatcher("/Views/ResetPassword.jsp").forward(request, response);
            } else {
                request.setAttribute("messAlert", "Time out 5min to confirm reset code");
                request.getRequestDispatcher("/Views/ConfirmCode.jsp").forward(request, response);
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
