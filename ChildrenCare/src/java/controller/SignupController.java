/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Models.User;
import SentEmail.sendLink;
import dao.UserDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
public class SignupController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.getRequestDispatcher("/Views/Signup.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        String passPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20}$";
        Pattern pat = Pattern.compile(passPattern);
        String email = request.getParameter("email").trim();
        String phone = request.getParameter("phone").trim();
        String fullname = request.getParameter("fullname").trim();
        String username = request.getParameter("username").trim();
        String pass = request.getParameter("pass");
        String repass = request.getParameter("repass");

        session.setAttribute("email", email);
        session.setAttribute("username", username);
        session.setAttribute("fullname", username);
        session.setAttribute("phone", username);

        UserDao uDao = new UserDao();

        Matcher mat = pat.matcher(pass);
        if (!mat.matches()) {
            request.setAttribute("messAlert", "Password have at least 8 character contain at least one number, one lowercase, one uppercase");
            request.getRequestDispatcher("/Views/Signup.jsp").forward(request, response);
        }
        if (!(pass.equals(repass))) {
            request.setAttribute("messAlert", "Repass doesn't match");
            request.getRequestDispatcher("/Views/Signup.jsp").forward(request, response);
        }
        try {
            User u = uDao.searchUserByEmail(email);
            if (u == null) {
                session.setAttribute("pass", pass);
                sendLink sL = new sendLink();
                String randomString = sL.getAlphaNumericString();
                sL.SendLinkToMail(email, "signup", randomString);
                Cookie ck = new Cookie(randomString, email);
                ck.setMaxAge(5 * 60);
                request.setAttribute("messSuccess", "We have sent a verify link to your email, it is valid in 5min.");
                response.addCookie(ck);
                request.getRequestDispatcher("/Views/Signup.jsp").forward(request, response);
            } else {
                request.setAttribute("messAlert", "Email is already exist");
                request.getRequestDispatcher("/Views/Singup.jsp").forward(request, response);
            }
        } catch (Exception ex) {
            Logger.getLogger(SignupController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
