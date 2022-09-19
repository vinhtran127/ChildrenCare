/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Models.User;
import dao.ReservationDao;
import dao.UserDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author vinh2
 */
public class BookingReservationController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        ReservationDao rd = new ReservationDao();
        HttpSession session = request.getSession();
        User u = (User) session.getAttribute("user");
        int doctorID = Integer.parseInt(request.getParameter("docID"));
        int NOP = Integer.parseInt(request.getParameter("numberOfPeople"));
        Float totalCost = Float.parseFloat(request.getParameter("TotalCost"));
        String sArray[] = request.getParameter("service").split("-");
        int serviceID = Integer.parseInt(sArray[0]);
        String checkUpDate = request.getParameter("CheckUpDate");

        UserDao ud = new UserDao();
        User doc = ud.getDocByID(doctorID);
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
        Date curDate = new Date();
        String sDate = formater.format(curDate);
        rd.InsertToReservation(u.getId(),totalCost,doc.getUsername(),sDate,doc.getFullName(),doc.getMobile(),doc.getEmail());
        int newId = rd.getNewID();
        rd.InserToReservationService(newId, serviceID, checkUpDate, NOP);
        request.getRequestDispatcher("Reservation").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
