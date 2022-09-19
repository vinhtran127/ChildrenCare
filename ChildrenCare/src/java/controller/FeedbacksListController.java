/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Models.Feedback;
import dao.FeedBackDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nguyen Minh Hoang
 */
public class FeedbacksListController extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        FeedBackDao fb = new FeedBackDao();
        String sort = "f.id";
        if(request.getParameter("sortby")!=null){
            sort = request.getParameter("sortby");
        }
        int pageIndex = 1;
        int start=1;
        try {
            pageIndex = request.getParameter("indexPage")==null?1:Integer.parseInt(request.getParameter("indexPage"));
        } catch (Exception e) {
        }
        int end = (int) Math.ceil(fb.getCountAllFeedsBack()/3);
        request.setAttribute("end", end);
        request.setAttribute("pageIndex", pageIndex);
        List<Feedback> listFeedBack = fb.getFeedsBack(pageIndex,sort);
        request.setAttribute("end", end);
        request.setAttribute("pageIndex", pageIndex);
        request.setAttribute("ListFeedsBack", listFeedBack);
        request.setAttribute("sortable", sort);
         RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Views/FeedbacksList.jsp");
        dispatcher.forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
