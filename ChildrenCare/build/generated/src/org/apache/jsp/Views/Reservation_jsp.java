package org.apache.jsp.Views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Reservation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Views/Header.jsp");
    _jspx_dependants.add("/Views/Footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <title>Reservation</title>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/Views/LinkHeader.jsp", out, false);
      out.write("\r\n");
      out.write("        ");
      dao.PostDao daoPost = null;
      synchronized (request) {
        daoPost = (dao.PostDao) _jspx_page_context.getAttribute("daoPost", PageContext.REQUEST_SCOPE);
        if (daoPost == null){
          daoPost = new dao.PostDao();
          _jspx_page_context.setAttribute("daoPost", daoPost, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("        ");
      dao.ServiceDao daoService = null;
      synchronized (request) {
        daoService = (dao.ServiceDao) _jspx_page_context.getAttribute("daoService", PageContext.REQUEST_SCOPE);
        if (daoService == null){
          daoService = new dao.ServiceDao();
          _jspx_page_context.setAttribute("daoService", daoService, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--Start header style1 area-->\r\n");
      out.write("<header class=\"header-style1-area\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-xl-12 col-lg-12 col-md-12\">\r\n");
      out.write("                <div class=\"inner-content clearfix\">\r\n");
      out.write("                    <div class=\"header-style1-logo float-left\">\r\n");
      out.write("                        <a href=\"HomePage\">\r\n");
      out.write("                            <img src=\"./images/icon/logo.png\" style=\"width: 105px; height: 100px;\"  alt=\"Awesome Logo\">\r\n");
      out.write("\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>   \r\n");
      out.write("                    <div class=\"header-contact-info float-left\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <div class=\"single-item\">\r\n");
      out.write("                                    <div class=\"icon\">\r\n");
      out.write("                                        <span class=\"icon-support\"></span>    \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"text\">\r\n");
      out.write("                                        <p>+1 555-7890-123</p> \r\n");
      out.write("                                        <span>support@example.com</span>   \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <div class=\"single-item\">\r\n");
      out.write("                                    <div class=\"icon\">\r\n");
      out.write("                                        <span class=\"icon-gps\"></span>    \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"text\">\r\n");
      out.write("                                        <p>86 Brattle Street</p> \r\n");
      out.write("                                        <span>Cambridge, MA 02138</span>   \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>  \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"header-style1-button float-right\">\r\n");
      out.write("                        <a href=\"Reservation\"><span class=\"icon-date\"></span>Make Appointment</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div> \r\n");
      out.write("    <style>\r\n");
      out.write("        @media only screen and (min-width: 992px) and (max-width: 1199px){\r\n");
      out.write("            .main-menu.style1 .navigation li a {\r\n");
      out.write("                padding: 28px 15px 28px;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .main-menu.style1 .navigation li img {\r\n");
      out.write("            margin: 10px 22px;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            opacity: 1;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            transition: all 300ms ease;\r\n");
      out.write("            height: 50px;\r\n");
      out.write("            width: 50px;\r\n");
      out.write("            vertical-align: middle;\r\n");
      out.write("            border-radius: 50% !important;\r\n");
      out.write("            align-content: center;\r\n");
      out.write("            left: 50%;\r\n");
      out.write("            transform: translateX(-50%);\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("        }\r\n");
      out.write("        .main-menu.style1 .navigation li img:before {\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            left: 0;\r\n");
      out.write("            right: 0;\r\n");
      out.write("            bottom: -2px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            opacity: 0;\r\n");
      out.write("            transition: all 500ms ease;\r\n");
      out.write("            transition-delay: .2s;\r\n");
      out.write("            width: 30px;\r\n");
      out.write("            height: auto;\r\n");
      out.write("            vertical-align: middle;\r\n");
      out.write("            border-radius: 50% !important; \r\n");
      out.write("            align-content: center;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</header>  \r\n");
      out.write("<!--End header style1 area-->\r\n");
      out.write("\r\n");
      out.write("<!--Start mainmenu area-->\r\n");
      out.write("<section class=\"mainmenu-area stricky\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-xl-12\">\r\n");
      out.write("                <div class=\"inner-content clearfix\">\r\n");
      out.write("                    <nav class=\"main-menu style1 clearfix\">\r\n");
      out.write("                        <div class=\"navbar-header clearfix\">   \t\r\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                                <span class=\"icon-bar\"></span>\r\n");
      out.write("                                <span class=\"icon-bar\"></span>\r\n");
      out.write("                                <span class=\"icon-bar\"></span>\r\n");
      out.write("                            </button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"navbar-collapse collapse clearfix\">\r\n");
      out.write("                            <ul class=\"navigation clearfix\">\r\n");
      out.write("                                <li class=\"dropdown current\"><a href=\"HomePage\">Home</a></li>\r\n");
      out.write("                                <li><a href=\"About\">About Us</a></li>\r\n");
      out.write("                                <li class=\"dropdown\"><a href=\"specialities.html\">Services</a>\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"dropdown\"><a href=\"#\">Reservation</a>\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"dropdown\"><a href=\"Post\">Blog</a></li>\r\n");
      out.write("                                <li class=\"dropdown\"><a href=\"#\">More</a>\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li><a href=\"TimeTable.jsp\">Timetable</a></li>\r\n");
      out.write("                                        <li><a href=\"Appointment.jsp\">Apppointment</a></li>\r\n");
      out.write("                                        <li><a href=\"FeedbacksList\">Feedback list</a></li>\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        <li><a href=\"Contact.jsp\">Contact</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </nav>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"mainmenu-right\">\r\n");
      out.write("                        <div class=\"search-box-style1\">\r\n");
      out.write("                            <form class=\"search-form\" method=\"post\" action=\"http://st.ourhtmldemo.com/new/Dento/index.html\">\r\n");
      out.write("                                <input type=\"search\" name=\"search\" placeholder=\"Search.\" required>\r\n");
      out.write("                                <button type=\"submit\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i></button>\r\n");
      out.write("                            </form>        \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"toggler-button\">\r\n");
      out.write("                            <div class=\"nav-toggler hidden-bar-opener\">\r\n");
      out.write("                                <div class=\"inner\">\r\n");
      out.write("                                    <span></span>\r\n");
      out.write("                                    <span></span>\r\n");
      out.write("                                    <span></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>    \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div> \r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>                 \r\n");
      out.write("<!--End mainmenu area--> \r\n");
      out.write("\r\n");
      out.write("<!-- Hidden Navigation Bar -->\r\n");
      out.write("<section class=\"hidden-bar right-align\">\r\n");
      out.write("    <div class=\"hidden-bar-closer\">\r\n");
      out.write("        <button><span class=\"flaticon-remove\"></span></button>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"hidden-bar-wrapper\">\r\n");
      out.write("        <div class=\"logo\">\r\n");
      out.write("            <a href=\"HomePage\"><img src=\"./images/icon/logo.png\" style=\"width: 105px; height: 100px;\" alt=\"\"/></a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"contact-info-box\">\r\n");
      out.write("            <h3>Contact Info</h3>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <h5>Address</h5>\r\n");
      out.write("                    <p>Romanian  9520 Faires Farm Road,<br> Carlsbad, NC 28213.</p>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <h5>Phone</h5>\r\n");
      out.write("                    <p>Phone 1: +1 555-7890-123</p>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <h5>Email</h5>\r\n");
      out.write("                    <p>supportyou@example.com</p>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>       \r\n");
      out.write("        <div class=\"newsletter-form-box\">\r\n");
      out.write("            <h3>Newsletter Subscribe</h3>\r\n");
      out.write("            <span>Get healthy tips & latest updates in inbox.</span>\r\n");
      out.write("            <form action=\"#\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-xl-12\">\r\n");
      out.write("                        <input type=\"email\" name=\"email\" placeholder=\"Email Address...\"> \r\n");
      out.write("                        <button type=\"submit\"><span class=\"flaticon-arrow\"></span></button>    \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"offer-box text-center\">\r\n");
      out.write("            <div class=\"big-title\">50% <span>Offer</span></div>\r\n");
      out.write("            <h3>5 Years Warranty</h3>\r\n");
      out.write("            <a class=\"btn-one\" href=\"#\">Pricing Plans</a>    \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"copy-right-text\">\r\n");
      out.write("            <p>?? Dento 2018, All Rights Reserved.</p>\r\n");
      out.write("        </div> \r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("<!-- End Hidden Bar -->     \r\n");
      out.write("   \r\n");
      out.write("        <!--Start breadcrumb area-->     \r\n");
      out.write("        <section class=\"breadcrumb-area\" style=\"background-image: url(./images/resources/breadcrumb-bg.jpg);\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-xl-12\">\r\n");
      out.write("                        <div class=\"inner-content clearfix\">\r\n");
      out.write("                            <div class=\"title float-left\">\r\n");
      out.write("                                <h2>Reservation</h2>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"breadcrumb-menu float-right\">\r\n");
      out.write("                                <ul class=\"clearfix\">\r\n");
      out.write("                                    <li><a href=\"HomePage\">Home</a></li>\r\n");
      out.write("                                    <li><i class=\"fa fa-angle-right\" aria-hidden=\"true\"></i></li>\r\n");
      out.write("                                    <li class=\"active\">Doctors</li>\r\n");
      out.write("                                </ul>    \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!--End breadcrumb area--> \r\n");
      out.write("\r\n");
      out.write("        <!--Start Doctor area-->\r\n");
      out.write("        <section class=\"doctor-area\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-xl-4 col-lg-8\">\r\n");
      out.write("                        <div class=\"doctor-sidebar\">\r\n");
      out.write("                            <!--Start Single Sidebar-->\r\n");
      out.write("                            <div class=\"single-sidebar\">\r\n");
      out.write("                                <div class=\"doctor-tab-box tabs-box\">\r\n");
      out.write("                                    <ul class=\"tab-btns tab-buttons clearfix\">\r\n");
      out.write("                                        <li class=\"tab-btn left\"><span>Doctor Name</span></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                    <div class=\"tab\">\r\n");
      out.write("                                        <input type=\"text\" placeholder=\"Doctor name\" name=\"doctorName\" onchange=\"searchDoctor(this)\">\r\n");
      out.write("                                    </div>    \r\n");
      out.write("                                </div>   \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!--End Single Sidebar-->\r\n");
      out.write("                        </div>    \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-xl-8\">\r\n");
      out.write("                        <div id=\"doctors\"class=\"doctor-content\">\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <!--End Single doctor item-->\r\n");
      out.write("\r\n");
      out.write("                        </div>        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!--End Doctor area-->\r\n");
      out.write("        ");
      out.write("<footer class=\"footer-area\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-xl-3 col-lg-6 col-md-6 col-sm-12\">\r\n");
      out.write("                <div class=\"single-footer-widget marbtm50\">\r\n");
      out.write("                    <div class=\"about-us\">\r\n");
      out.write("                        <div class=\"footer-logo fix\">\r\n");
      out.write("                            <a href=\"HoamePage\">\r\n");
      out.write("                               <img src=\"./images/icon/logo.png\" style=\"width: 105px; height: 100px;\"  alt=\"Awesome Logo\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>  \r\n");
      out.write("                        <div class=\"text-box fix\">\r\n");
      out.write("                            <p>Dento was started in the year 1995 as a small private clinic in VietNam. Looking for affordable children care?</p>\r\n");
      out.write("                            <p class=\"bottom-text\">To take a trivial example, which of us ever undertakes laborious physical \r\n");
      out.write("                            exercise, except to obtain.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"button fix\">\r\n");
      out.write("                            <a class=\"btn-one\" href=\"#\">Read More</a>\r\n");
      out.write("                        </div>   \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-xl-3 col-lg-6 col-md-6 col-sm-12\">\r\n");
      out.write("                <div class=\"single-footer-widget martop6 marbtm50\">\r\n");
      out.write("                    <div class=\"title\">\r\n");
      out.write("                        <h3>Services</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <ul class=\"specialities\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-xl-3 col-lg-6 col-md-6 col-sm-12\">\r\n");
      out.write("                <div class=\"single-footer-widget martop6 pdbtm50\">\r\n");
      out.write("                    <div class=\"title\">\r\n");
      out.write("                        <h3>Blogs</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <ul class=\"facilities\">\r\n");
      out.write("                         ");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("                      \r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-xl-3 col-lg-6 col-md-6 col-sm-12\">\r\n");
      out.write("                <div class=\"single-footer-widget martop6 pdtop-50\">\r\n");
      out.write("                    <div class=\"title\">\r\n");
      out.write("                        <h3>Opening Hours</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <ul class=\"opening-hours\">\r\n");
      out.write("                        <li>Monday <span class=\"float-right\">8.30am -> 6.30pm</span></li>\r\n");
      out.write("                        <li>Tuesday <span class=\"float-right\">10.00am -> 8.00pm</span></li>\r\n");
      out.write("                        <li>Wednesday <span class=\"float-right\">8.30am -> 6.30pm</span></li>\r\n");
      out.write("                        <li>Thursday <span class=\"float-right\">8.30am -> 7.00pm</span></li>\r\n");
      out.write("                        <li>Friday <span class=\"float-right\">8.30am -> 3.00pm</span></li>\r\n");
      out.write("                        <li>Saturday <span class=\"float-right clr-green\">Closed</span></li>\r\n");
      out.write("                        <li>Sunday <span class=\"float-right clr-green\">Closed</span></li>\r\n");
      out.write("                    </ul>   \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>           \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>   \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"scroll-to-top scroll-to-target thm-bg-clr\" data-target=\"html\"><span class=\"fa fa-angle-up\"></span></div>\r\n");
      out.write("\r\n");
      out.write("<!-- Color Palate / Color Switcher -->\r\n");
      out.write("<div class=\"color-palate\">\r\n");
      out.write("    <div class=\"color-trigger\">\r\n");
      out.write("        <i class=\"fa fa-gear\"></i>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"color-palate-head\">\r\n");
      out.write("        <h6>Choose Your Color</h6>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"various-color clearfix\">\r\n");
      out.write("        <div class=\"colors-list\">\r\n");
      out.write("            <span class=\"palate default-color active\" data-theme-file=\"css/color-themes/default-theme.css\"></span>\r\n");
      out.write("            <span class=\"palate teal-color\" data-theme-file=\"css/color-themes/teal-theme.css\"></span>\r\n");
      out.write("            <span class=\"palate navy-color\" data-theme-file=\"css/color-themes/navy-theme.css\"></span>\r\n");
      out.write("            <span class=\"palate yellow-color\" data-theme-file=\"css/color-themes/yellow-theme.css\"></span>\r\n");
      out.write("            <span class=\"palate blue-color\" data-theme-file=\"css/color-themes/blue-theme.css\"></span>\r\n");
      out.write("            <span class=\"palate purple-color\" data-theme-file=\"css/color-themes/purple-theme.css\"></span>\r\n");
      out.write("            <span class=\"palate olive-color\" data-theme-file=\"css/color-themes/olive-theme.css\"></span>\r\n");
      out.write("            <span class=\"palate red-color\" data-theme-file=\"css/color-themes/red-theme.css\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"palate-foo\">\r\n");
      out.write("        <span>You can easily change and switch the colors.</span>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/Views/LinkFooter.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("    <script>\r\n");
      out.write("        function updateTotal() {\r\n");
      out.write("            var NOP = document.getElementById(\"NOP\").value;\r\n");
      out.write("            var price = document.getElementById(\"price\").value;\r\n");
      out.write("            document.getElementById(\"total\").value = NOP * price;\r\n");
      out.write("        }\r\n");
      out.write("        function setNewValue() {\r\n");
      out.write("            var NOP = document.getElementById(\"NOP\").value;\r\n");
      out.write("            var text = document.getElementById(\"service\").value;\r\n");
      out.write("            const myArray = text.split(\"-\");\r\n");
      out.write("            var price = myArray[1];\r\n");
      out.write("            document.getElementById(\"price\").value = price;\r\n");
      out.write("            document.getElementById(\"total\").value = NOP * price;\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        function loadMore() {\r\n");
      out.write("            var amount = document.getElementsByClassName(\"countDoc\").length;\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url: \"/ChildrenCare/LoadMoreDoctor\",\r\n");
      out.write("                type: \"get\",\r\n");
      out.write("                data: {\r\n");
      out.write("                    numberExist: amount;\r\n");
      out.write("                },\r\n");
      out.write("                success: function (data) {\r\n");
      out.write("                    var row = document.getElementById(\"doctors\");\r\n");
      out.write("                    row.innerHTML += data;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Mirrored from st.ourhtmldemo.com/new/Dento/doctors.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 05 Jan 2021 02:07:28 GMT -->\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("x");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${daoService.categoryService}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                            <li><a href=\"\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\r\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user != null && sessionScope.user.role.id == 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        <ul>\r\n");
        out.write("                                            <li><a href=\"MyReservation\">My Reservation</a></li>\r\n");
        out.write("                                            <li><a href=\"Reservation\">Reservation</a></li>\r\n");
        out.write("                                        </ul>  \r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user != null && sessionScope.user.role.id == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("   \r\n");
        out.write("                                            <li><a href=\"AdminDashboard\">Admin Dashboard</a></li>\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user != null \r\n                                                      && sessionScope.user.role.id != 4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("   \r\n");
        out.write("                                              <li><a href=\"Customer\">Customer List</a></li>\r\n");
        out.write("                                              ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <li class=\"dropdown\" id=\"responsive\"><img  src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" >\r\n");
        out.write("                                        <ul>\r\n");
        out.write("                                            <li><a href=\"TimeTable.jsp\">Edit profile</a></li>\r\n");
        out.write("                                            <li><a href=\"ChangePassword\">Change Password</a></li>\r\n");
        out.write("                                            <li><a href=\"Logout\">Logout</a></li>\r\n");
        out.write("                                        </ul>\r\n");
        out.write("                                    </li>\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <li><a href=\"Login\">Login</a></li>\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ListDoc}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("o");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <div class=\"single-doctor-item wow fadeInUp countDoc\" data-wow-delay=\"300ms\">\r\n");
          out.write("                                    <div class=\"row\">\r\n");
          out.write("                                        <div class=\"col-xl-5\">\r\n");
          out.write("                                            <div class=\"img-holder\">\r\n");
          out.write("                                                <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"Awesome Image\">\r\n");
          out.write("                                                <div class=\"overlay\">\r\n");
          out.write("                                                    <div class=\"box\">\r\n");
          out.write("                                                        <div class=\"content\">\r\n");
          out.write("                                                            <a class=\"btn-one\" href=\"#reservation\" data-toggle=\"modal\">Appointment</a>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                        <div class=\"col-xl-7\">\r\n");
          out.write("                                            <div class=\"text-holder\">\r\n");
          out.write("                                                <h3>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.fullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3>\r\n");
          out.write("                                                <h6>Qualification</h6>\r\n");
          out.write("                                                <ul>\r\n");
          out.write("                                                    <li><span class=\"icon-phone\"></span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.mobile}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</li>\r\n");
          out.write("                                                    <li><span class=\"flaticon-e-mail-envelope\"></span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</li>\r\n");
          out.write("                                                </ul>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                                <div id=\"reservation\" class=\"modal fade\">\r\n");
          out.write("                                    <div class=\"modal-dialog\">\r\n");
          out.write("                                        <div class=\"modal-content\">\r\n");
          out.write("                                            <form action=\"BookingReservation?docID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" method=\"post\">\r\n");
          out.write("                                                <div class=\"modal-header\">\t\t\t\t\t\t\r\n");
          out.write("                                                    <h4 class=\"modal-title\">Edit reservation</h4>\r\n");
          out.write("                                                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                                <div class=\"modal-body\">\t\t\t\t\t\r\n");
          out.write("                                                    <div class=\"form-group\">\r\n");
          out.write("                                                        <label>Name</label>\r\n");
          out.write("                                                        <input type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.fullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" \"class=\"form-control\" readonly>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                    <div class=\"form-group\">\r\n");
          out.write("                                                        <label>Phone</label>\r\n");
          out.write("                                                        <input type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.mobile}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" \"class=\"form-control\" readonly>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                    <div class=\"form-group\">\r\n");
          out.write("                                                        <label>Email</label>\r\n");
          out.write("                                                        <input type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" \"class=\"form-control\" readonly>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                    <div class=\"form-group\">\r\n");
          out.write("                                                        <label>Number of people</label>\r\n");
          out.write("                                                        <input id=\"NOP\" name=\"numberOfPeople\" type=\"number\" class=\"form-control\" required oninput=\"updateTotal()\">\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                    <div class=\"form-group\">\r\n");
          out.write("                                                        <label>Check up date</label>\r\n");
          out.write("                                                        <input name=\"CheckUpDate\" type=\"date\" class=\"form-control hasDatepicker\" required >\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                    <div class=\"form-group\">\r\n");
          out.write("                                                        <label>Price</label>\r\n");
          out.write("                                                        <input id=\"price\" type=\"number\" class=\"form-control\" readonly>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                    <div class=\"form-group\">\r\n");
          out.write("                                                        <label>Total cost</label>\r\n");
          out.write("                                                        <input name=\"TotalCost\" type=\"number\" id=\"total\" class=\"form-control\" readonly>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                    <div class=\"form-group\">\r\n");
          out.write("                                                        <label>Services</label>\r\n");
          out.write("                                                        <select id=\"service\" name=\"service\" class=\"form-select\" aria-label=\"Default select example\" onchange=\"setNewValue()\">\r\n");
          out.write("                                                            ");
          if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("                                                        </select>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                                <div class=\"modal-footer\">\r\n");
          out.write("                                                    <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\r\n");
          out.write("                                                    <input type=\"submit\" class=\"btn btn-success\" value=\"Booking\">\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                            </form>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </div>\r\n");
          out.write("\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ListS}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("p");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('-');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.salePrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.fullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setVar("x");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${daoService.categoryService}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <li><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(null);
    _jspx_th_c_forEach_4.setVar("x");
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${daoPost.categoryPost}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <li><a href=\"Post?categoryId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }
}
