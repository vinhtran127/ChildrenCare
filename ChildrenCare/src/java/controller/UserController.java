/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Models.User;
import dao.PostDao;
import dao.UserDao;
import java.io.IOException;

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
public class UserController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        UserDao ud = new UserDao();
        User u =(User) request.getSession().getAttribute("user");
        int gender = -1;
        int status = 0;
        int role=0;
        
        if(request.getParameter("gender")!= null){
            gender = Integer.parseInt(request.getParameter("gender"));
        }
         if(request.getParameter("status")!= null){
            status = Integer.parseInt(request.getParameter("status"));
        }
        int index = 0;
        
        if(request.getParameter("index")!=null){
             index = Integer.parseInt(request.getParameter("index"));
        }
       
       if(request.getParameter("role")!=null){
             role = Integer.parseInt(request.getParameter("role"));
        }
        int totalCustomer = (int) Math.ceil(ud.getTotalCustomer() / 5);
        int start = index;
       
        int end = index+4;
        if(end > totalCustomer){
            end -=1;
        } 
        if (request.getParameter("action") != null) {
            if (request.getParameter("action").equals("previous")) {
                if(start > 1){
                    
                    start -= 1;
                    end -= 1;
                    index -=1;
                }
                
            } else if (request.getParameter("action").equals("next")) {
                if (end < totalCustomer) {
                    start += 1;
                    end += 1;                    
                }    
                index +=1;
            }
        }
        int totalUser = ud.getTotalCustomer(role, gender, status);
         List<User> listCustomer = ud.getCustomersToPaging(index*5,role,gender,status);
         if(u.getRole().getId()==2){
             listCustomer = ud.getCustomersToPaging(index*5,2,gender,status);
         }
         if(index>=totalUser){
             request.setAttribute("disable", 1);
         }
         
        request.setAttribute("gender", gender); 
        request.setAttribute("status", status); 
        request.setAttribute("role", role); 
        request.setAttribute("check", index);
        request.setAttribute("start", start);
        request.setAttribute("end", end);
        request.setAttribute("totalPage", totalCustomer);
        request.setAttribute("listCustomer", listCustomer);
        request.setAttribute("totalUser", totalUser);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Views/Customer.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
