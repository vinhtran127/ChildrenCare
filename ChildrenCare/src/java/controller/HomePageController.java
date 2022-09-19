/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Models.CategoryPost;
import Models.CategoryService;
import Models.Post;
import Models.Service;
import dao.PostDao;
import dao.ServiceDao;
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
public class HomePageController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PostDao pd = new PostDao();
        ServiceDao sd = new ServiceDao();
        List<CategoryService> listService = sd.getCategoryService();
        List<CategoryPost> listCategoryPost = pd.getCategoryPost();
        List<Post> listPost = pd.getPosts();
        request.setAttribute("listService", listService);
        request.setAttribute("listPost", listPost);
        request.setAttribute("listCategoryPost", listCategoryPost);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Views/Homepage.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
//        request.setCharacterEncoding("UTF-8");
//        PostDao pd = new PostDao();
//        ServiceDao sd = new ServiceDao();
//        List<CategoryService> listService = sd.getCategoryService();
//        List<CategoryPost> listCategoryPost = pd.getCategoryPost();
//        List<Post> listPost = pd.getPosts();
//        request.setAttribute("listService", listService);
//        request.setAttribute("listPost", listPost);
//        request.setAttribute("listCategoryPost", listCategoryPost);
//        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Views/Homepage.jsp");
//        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

}
