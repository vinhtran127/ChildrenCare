/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ReservationDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * EditReservationController
 *
 * @author vinh2
 */
public class EditReservationController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        int rID = Integer.parseInt(request.getParameter("rID"));
        int numberOfPeople = Integer.parseInt(request.getParameter("numberOfPeople"));
        String checkUpDate = request.getParameter("CheckUpDate");
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//        Date date = new Date();
//        String curDate = formatter.format(date);
        float totalCost = Float.parseFloat(request.getParameter("Total"));
        String sArray[] = request.getParameter("service").split("-");
        int serviceID = Integer.parseInt(sArray[0]);
        ReservationDao rd = new ReservationDao();
        rd.UpdateReservation(rID, totalCost);
        rd.UpdateReservationService(rID, numberOfPeople, serviceID, checkUpDate);
//        request.getRequestDispatcher("MyReservation").forward(request, response);
        response.sendRedirect("MyReservation");

    }
}
