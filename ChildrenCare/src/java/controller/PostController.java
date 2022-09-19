package controller;

import Constant.Constant;
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
public class PostController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PostDao pd = new PostDao();        
         int pageNumber = 0; //next
        int pageNumber1 = 0; //previous
        int totalPage = (int) Math.ceil(pd.getTotalPost() / Constant.PAGE_SIZE);
        //get default page post
        List<Post> listPost = pd.getAllPosts(0);
        //get default page post by category
        if(request.getParameter("categoryId")!=null
                &&!request.getParameter("categoryId").equals("")){
            int categoryId = Integer.parseInt(request.getParameter("categoryId"));
            listPost = pd.getPostsByCategory(0,categoryId );
            request.setAttribute("categoryId", categoryId);
             totalPage = (int) Math.ceil(pd.getTotalPostByCategory(Integer.parseInt
                    (request.getParameter("categoryId"))) / Constant.PAGE_SIZE);
        }               
        if (request.getParameter("pageNumber") != null) {
            pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
            //page index < total page                                
            if (pageNumber < totalPage) {
                pageNumber += 1;
            }
            if (pageNumber1 < totalPage) {
                pageNumber1 += 1;
            }
            listPost = pd.getAllPosts(pageNumber);
            if(request.getParameter("categoryId")!=null 
                    &&!request.getParameter("categoryId").equals("")){
                 listPost = pd.getPostsByCategory(pageNumber, Integer.parseInt
                    (request.getParameter("categoryId")));               
            }            
        }
        if (request.getParameter("pageNumber1") != null) {
            pageNumber1 = Integer.parseInt(request.getParameter("pageNumber1"));
            if (pageNumber != 0) {
                pageNumber -= 1;
            }
            if (pageNumber1 != 0) {
                pageNumber1 -= 1;
            }
            listPost = pd.getAllPosts(pageNumber1);
            if(request.getParameter("categoryId")!=null
                     &&!request.getParameter("categoryId").equals("")){
                 listPost = pd.getPostsByCategory(pageNumber1, Integer.parseInt
                    (request.getParameter("categoryId")));               
            }            
        }       
       request.setAttribute("totalPage", totalPage);
        request.setAttribute("pageNumber", pageNumber);
        request.setAttribute("pageNumber1", pageNumber1);
        request.setAttribute("listPost", listPost);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Views/Posts.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8"); 
            String title = request.getParameter("postTitle");
            PostDao pd = new PostDao();
            List<Post> listPost = pd.getPostsByTitle(title);
            request.setAttribute("listPost", listPost);
             RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Views/Posts.jsp");
        dispatcher.forward(request, response);
    }

}
