/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Models.Post;
import dao.PostDao;
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
public class PostDetailController extends HttpServlet {

   

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PostDao pd = new PostDao();
        int index = Integer.parseInt(request.getParameter("index"));
        Post post = pd.getPost(index);
        List<Post> preNextPost = pd.getPreNextPost(index);
        request.setAttribute("post", post);
        request.setAttribute("PreNextPost", preNextPost);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Views/PostDetail.jsp");
        dispatcher.forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }


}
