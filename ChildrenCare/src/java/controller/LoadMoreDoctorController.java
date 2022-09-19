/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Models.Service;
import Models.User;
import dao.ServiceDao;
import dao.UserDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author vinh2
 */
public class LoadMoreDoctorController extends HttpServlet {

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
        HttpSession session = request.getSession();
        User u = (User) session.getAttribute("user");
        UserDao ud = new UserDao();
        ServiceDao sd = new ServiceDao();
        int amount = Integer.parseInt(request.getParameter("numberExist"));
        List<User> ListDoc = ud.getNext3Doctor(amount);
        List<Service> ListS = sd.getAllService();
        PrintWriter out = response.getWriter();
        String s = "";
        for(Service service:ListS){
            s+= "<option value=\""+service.getId() +"-"+ service.getSalePrice() +"\">${p.fullname}</option>";
        }
        
        for(User doc :ListDoc ){
            out.println("<div class=\"single-doctor-item wow fadeInUp\" data-wow-delay=\"300ms\">\n" +
"                                    <div class=\"row\">\n" +
"                                        <div class=\"col-xl-5\">\n" +
"                                            <div class=\"img-holder\">\n" +
"                                                <img src=\""+ doc.getImage()+"\" alt=\"Awesome Image\">\n" +
"                                                <div class=\"overlay\">\n" +
"                                                    <div class=\"box\">\n" +
"                                                        <div class=\"content\">\n" +
"                                                            <a class=\"btn-one\" href=\"#reservation\" data-toggle=\"modal\">Appointment</a>\n" +
"                                                        </div>\n" +
"                                                    </div>\n" +
"                                                </div>\n" +
"                                            </div>\n" +
"                                        </div>\n" +
"                                        <div class=\"col-xl-7\">\n" +
"                                            <div class=\"text-holder\">\n" +
"                                                <h3>"+doc.getFullName()+"</h3>\n" +
"                                                <h6>Qualification</h6>\n" +
"                                                <ul>\n" +
"                                                    <li><span class=\"icon-phone\"></span>"+doc.getMobile()+"</li>\n" +
"                                                    <li><span class=\"flaticon-e-mail-envelope\"></span>"+doc.getEmail()+"</li>\n" +
"                                                </ul>\n" +
"                                            </div>\n" +
"                                        </div>\n" +
"                                    </div>\n" +
"                                </div>\n" +
"                                <div id=\"reservation\" class=\"modal fade\">\n" +
"                                    <div class=\"modal-dialog\">\n" +
"                                        <div class=\"modal-content\">\n" +
"                                            <form action=\"BookingReservation?docID="+doc.getId()+"\" method=\"post\">\n" +
"                                                <div class=\"modal-header\">						\n" +
"                                                    <h4 class=\"modal-title\">Edit reservation</h4>\n" +
"                                                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n" +
"                                                </div>\n" +
"                                                <div class=\"modal-body\">					\n" +
"                                                    <div class=\"form-group\">\n" +
"                                                        <label>Name</label>\n" +
"                                                        <input type=\"text\" value=\""+u.getFullName()+" \"class=\"form-control\" readonly>\n" +
"                                                    </div>\n" +
"                                                    <div class=\"form-group\">\n" +
"                                                        <label>Phone</label>\n" +
"                                                        <input type=\"text\" value=\""+u.getMobile()+" \"class=\"form-control\" readonly>\n" +
"                                                    </div>\n" +
"                                                    <div class=\"form-group\">\n" +
"                                                        <label>Email</label>\n" +
"                                                        <input type=\"text\" value=\""+u.getEmail()+" \"class=\"form-control\" readonly>\n" +
"                                                    </div>\n" +
"                                                    <div class=\"form-group\">\n" +
"                                                        <label>Number of people</label>\n" +
"                                                        <input id=\"NOP\" name=\"numberOfPeople\" type=\"number\" class=\"form-control\" required oninput=\"updateTotal()\">\n" +
"                                                    </div>\n" +
"                                                    <div class=\"form-group\">\n" +
"                                                        <label>Check up date</label>\n" +
"                                                        <input name=\"CheckUpDate\" type=\"date\" class=\"form-control hasDatepicker\" required >\n" +
"                                                    </div>\n" +
"                                                    <div class=\"form-group\">\n" +
"                                                        <label>Price</label>\n" +
"                                                        <input id=\"price\" type=\"number\" class=\"form-control\" readonly>\n" +
"                                                    </div>\n" +
"                                                    <div class=\"form-group\">\n" +
"                                                        <label>Total cost</label>\n" +
"                                                        <input name=\"TotalCost\" type=\"number\" id=\"total\" class=\"form-control\" readonly>\n" +
"                                                    </div>\n" +
"                                                    <div class=\"form-group\">\n" +
"                                                        <label>Services</label>\n" +
"                                                        <select id=\"service\" name=\"service\" class=\"form-select\" aria-label=\"Default select example\" onchange=\"setNewValue()\">\n" +
"                                                            <c:forEach items=\"${ListS}\" var=\"p\">\n" + s+                                                             
"                                                            </c:forEach>\n" +
"                                                        </select>\n" +
"                                                    </div>\n" +
"                                                </div>\n" +
"                                                <div class=\"modal-footer\">\n" +
"                                                    <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\n" +
"                                                    <input type=\"submit\" class=\"btn btn-success\" value=\"Booking\">\n" +
"                                                </div>\n" +
"                                            </form>\n" +
"                                        </div>\n" +
"                                    </div>\n" +
"                                </div>");
        }
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
