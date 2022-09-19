/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Models.ReservationService;
import Models.Service;
import Models.User;
import dao.ReservationDao;
import dao.ServiceDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author vinh2
 */
public class ManageReservationController extends HttpServlet {

     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        User u = (User) session.getAttribute("user");
        ReservationDao rd = new ReservationDao();
        ServiceDao sd = new ServiceDao();
        String strPageIndex = request.getParameter("pageIndex");
        int pageIndex = 1;
        if (strPageIndex == null) {
            pageIndex = 1;
        } else {
            pageIndex = Integer.parseInt(strPageIndex);
        }
        List<ReservationService> listRS = rd.getReservationOnPage(pageIndex);
        int totalRecord = rd.CountRecordReservationService_2();
        int endPage = totalRecord % 4 == 0 ? (totalRecord / 4) : (totalRecord / 4 + 1);

        request.setAttribute("totalRecord", totalRecord);
        request.setAttribute("endPage", endPage);
        request.setAttribute("pageIndex", pageIndex);
        
        request.setAttribute("listRS", listRS);

        List<Service> listS = sd.getAllService();
        request.setAttribute("listS", listS);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Views/ManageReservation.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(MyReservationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Views/ManageReservation.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
