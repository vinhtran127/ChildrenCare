/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Models.User;
import SentEmail.sendLink;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
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
public class SentLinkController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Views/SendVerifyCode.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        String email = (String) request.getParameter("email");
        try {
            User u = new dao.UserDao().searchUserByEmail(email);
            if (u == null) {
                request.setAttribute("messAlert", "We can not find your account in our system, pls re-enter");
                request.getRequestDispatcher("/Views/SendVerifyCode.jsp").forward(request, response);
            } else {

                sendLink sL = new sendLink();
                String randomString = sL.getAlphaNumericString();
                sL.SendLinkToMail(email, "ResetPassword", randomString);
                session.setAttribute("email", email);
                Cookie ck = new Cookie(randomString, email);
                ck.setMaxAge(5 * 60);
                response.addCookie(ck);
                request.setAttribute("messSuccess", "We have sent vetificate link to reset password, check your email box");
                request.getRequestDispatcher("/Views/SendVerifyCode.jsp").forward(request, response);
            }
        } catch (Exception ex) {
            Logger.getLogger(SentLinkController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
