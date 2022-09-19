
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Models.Role;
import Models.User;
import dao.UserDao;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import utility.Generate;
import utility.SendEmail;

/**
 *
 * @author Nguyen Minh Hoang
 */
@MultipartConfig()
public class UserDetailController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int id = 0;
        if (request.getParameter("id") != null&&request.getParameter("id")!="") {
              UserDao ud = new UserDao();
              id = Integer.parseInt(request.getParameter("id"));
            if(request.getParameter("action")!=null){
                ud.getDeleteCustomer(id);
                response.sendRedirect("Customer");
                return;
            }
            User user = ud.getCustomerDetail(id);
            request.setAttribute("User", user);
            request.setAttribute("unknown", "none");
        } else {            
            request.setAttribute("AddNew", 1);
        }
            User user = (User) request.getSession().getAttribute("user");
            int RoleUser = user.getRole().getId();
            request.setAttribute("roleCheck", RoleUser);
            
            request.setAttribute("status", user.getStatus());
            
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Views/CustomerDetail.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        User ur =(User) request.getSession().getAttribute("user");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String fullName = request.getParameter("FullName");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String mobile = request.getParameter("phone");
        String address = request.getParameter("address");
        int status = Integer.parseInt(request.getParameter("status"));
        int roleId = Integer.parseInt(request.getParameter("role"));
            Role r = new Role(roleId, "");
         long millis=System.currentTimeMillis();   
        java.sql.Date date=new java.sql.Date(millis);
        UserDao ud = new UserDao();        
        // xử lý ảnh 
        // image( blog ) 
        Part blog_img = request.getPart("img_blog"); //
         // get file name of file 
        String raw_fileName = Paths.get(blog_img.getSubmittedFileName()).getFileName().toString();
        String fileName; 
        if(raw_fileName == null || raw_fileName.length() == 0){ // User dont send image
            fileName = request.getParameter("old_img_blog");
        }else{ //User sended image and Doing
             // getRealPath to return location ( không fix cứng với máy code - tất cả tv nhóm push về đều dùng được )
            String raw_realPath = request.getServletContext().getRealPath("");// F:\Documents\git_ripo\ChildrenCare\build\web
            // Xử lý chuỗi - chỉ lấy C:\Users\pv\Desktop\Project SWP391\OnlineLearning\web ( bỏ qua forder build )
            String realPath = raw_realPath.substring(0, raw_realPath.indexOf("build")) + "web\\images\\users"; // F:\Documents\git_ripo\ChildrenCare\web\images\\users
            // get type of file 
            int index = raw_fileName.lastIndexOf('.');
            String typeFile = "";
            if (index > 0) {
                typeFile = raw_fileName.substring(index + 1);
            }
            // generateFileName 
            Generate g = new Generate();
            String tempNameGenerate;
            while(true){
              tempNameGenerate = g.generateResetToken();
              tempNameGenerate += "." + typeFile;
              if(ud.doesExistImgNameBlog(tempNameGenerate) == false){
                  break;
              }
            }
            // final fileName to save 
            fileName = tempNameGenerate;
            // Save file at location 
            InputStream is = blog_img.getInputStream();
            // String test = "C:\\Users\\pv\\Desktop\\Project SWP391\\OnlineLearning\\web\\images\\avatar"; // fix cứng máy người code
            Files.copy(is, Paths.get(realPath + File.separator + fileName), StandardCopyOption.REPLACE_EXISTING); // upload image to forder
        }
        
        
        
        String image = fileName;
        if(request.getParameter("checkAdd").equals("update")){
             int id = Integer.parseInt(request.getParameter("id"));
             User u = null;
             u = new User(username, email, password, fullName, gender, mobile, address, status, image,r);
            
            ud.InsertHistoryUpdateUser(id);
            ud.getEditCustomer(id, u);
        }else if(request.getParameter("checkAdd").equals("add")){
            
            User u = new User(username, email, password, fullName, gender, mobile, address, status, image,r);
            ud.getAddCustomer(u);
            if(ur.getRole().getId()==1){
                SendEmail se = new SendEmail();
                se.send("tvinh2312001@gmail.com", "New Email:"+email+"/n"+"New Password"+password, "new User and Password");
            }
        }          
        response.sendRedirect("Customer");
    }

}
