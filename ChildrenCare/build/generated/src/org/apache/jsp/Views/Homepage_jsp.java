package org.apache.jsp.Views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/Views/LinkHeader.jsp", out, false);
      out.write("\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <title>Home</title>\r\n");
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
      out.write("    </head>\r\n");
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
      out.write("    </div>        \r\n");
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
      out.write("                                <li class=\"dropdown\"><a href=\"Reservation\">Reservation</a>\r\n");
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
      out.write("                                        <li><a href=\"Appointment.jsp\">Feedback list</a></li>\r\n");
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
      out.write("            <p>© Dento 2018, All Rights Reserved.</p>\r\n");
      out.write("        </div> \r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("<!-- End Hidden Bar -->     \r\n");
      out.write("\r\n");
      out.write("        <section class=\"services-style1-area sec-pd1\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"sec-title max-width text-center\">\r\n");
      out.write("                    <h3>Family Focused</h3>\r\n");
      out.write("                    <h1>Child Centered</h1>\r\n");
      out.write("                    <p>Children's Health Care of Newburyport and Haverhill provides comprehensive pediatric health care from birth to young adulthood. </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12\">\r\n");
      out.write("                        <div class=\"services-carousel owl-carousel owl-theme\">\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div> \r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <section class=\"highlights-area\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-xl-12 wow fadeInUp\" data-wow-delay=\"600ms\">\r\n");
      out.write("                        <div class=\"single-box float-left text-center\">\r\n");
      out.write("                            <div class=\"icon-holder\">\r\n");
      out.write("                                <span class=\"icon-support-1\"></span>    \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h3>E-Consultation</h3> \r\n");
      out.write("                            <span class=\"border-box\"></span>\r\n");
      out.write("                            <p>To take  trivial example, which undertakes laborious.</p> \r\n");
      out.write("                            <a href=\"#\">Start From Here</a>  \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"single-middle-box float-left text-center\">\r\n");
      out.write("                            <div class=\"icon-holder\">\r\n");
      out.write("                                <span class=\"icon-support-1\"></span>    \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h3>E-Consultation</h3>\r\n");
      out.write("                            <form name=\"visit-form\" action=\"\" method=\"post\">\r\n");
      out.write("                                <div class=\"row mar-ninus10\">\r\n");
      out.write("                                    <div class=\"col-xl-4 pd10\">\r\n");
      out.write("                                        <div class=\"input-box\">   \r\n");
      out.write("                                            <input type=\"text\" name=\"form_name\" value=\"\" placeholder=\"Name\" required=\"\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-xl-4 pd10\">\r\n");
      out.write("                                        <div class=\"input-box\">   \r\n");
      out.write("                                            <input type=\"text\" name=\"form_phone\" value=\"\" placeholder=\"Phone\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-xl-4 pd10\">\r\n");
      out.write("                                        <div class=\"input-box\">\r\n");
      out.write("                                            <select class=\"selectmenu\" name=\"service\">\r\n");
      out.write("                                                ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"row mar-ninus10\">\r\n");
      out.write("                                    <div class=\"col-xl-4 pd10\">\r\n");
      out.write("                                        <div class=\"input-box\">\r\n");
      out.write("                                            <input type=\"text\" name=\"time\" placeholder=\"Time\">\r\n");
      out.write("                                            <div class=\"icon-box\">\r\n");
      out.write("                                                <i class=\"fa fa-clock-o\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-xl-4 pd10\">\r\n");
      out.write("                                        <div class=\"input-box\">\r\n");
      out.write("                                            <input type=\"text\" name=\"date\" placeholder=\"Date\" id=\"datepicker\">\r\n");
      out.write("                                            <div class=\"icon-box\">\r\n");
      out.write("                                                <i class=\"fa fa-calendar\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-xl-4 pd10\">\r\n");
      out.write("                                        <div class=\"input-box\">\r\n");
      out.write("                                            <input type=\"text\" name=\"number\" value=\"\" placeholder=\"Number\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"row mar-ninus10\" >        \r\n");
      out.write("                                    <div class=\"col-xl-4 pd10\">\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-xl-4 pd10\">\r\n");
      out.write("                                        <div class=\"button-box\">\r\n");
      out.write("                                            <button class=\"btn-one\" type=\"submit\">Submit Info</button>   \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>     \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"single-box float-right text-center\">\r\n");
      out.write("                            <div class=\"icon-holder\">\r\n");
      out.write("                                <span class=\"icon-support-1\"></span>    \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h3>Find a Doctor</h3> \r\n");
      out.write("                            <span class=\"border-box\"></span>\r\n");
      out.write("                            <p>To take  trivial example, which undertakes laborious.</p> \r\n");
      out.write("                            <a href=\"Reservation\">Meet Our Team</a>  \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <section class=\"latest-blog-area sec-pd1\">\r\n");
      out.write("            <div class=\"container inner-content\">\r\n");
      out.write("                <div class=\"sec-title max-width text-center\">\r\n");
      out.write("                    <h3>Read Our</h3>\r\n");
      out.write("                    <h1>Latest From Our Blog</h1>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <section class=\"testimonial-area\">\r\n");
      out.write("            <div class=\"container inner-content\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-xl-12\">\r\n");
      out.write("                        <div class=\"sec-title float-left\">\r\n");
      out.write("                            <h3>Feedback</h3>\r\n");
      out.write("                            <h1>What Our Customers Say?</h1>\r\n");
      out.write("                        </div> \r\n");
      out.write("                        <div class=\"button float-right\">\r\n");
      out.write("                            <a class=\"btn-one\" href=\"#\">Read More</a>\r\n");
      out.write("                        </div>   \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-xl-12\">\r\n");
      out.write("                        <div class=\"testimonial-carousel owl-carousel owl-theme\">\r\n");
      out.write("                            <!--Start Single Testimonial Item-->\r\n");
      out.write("                            <div class=\"single-testimonial-item text-center\">\r\n");
      out.write("                                <div class=\"text-holder\">\r\n");
      out.write("                                    <p>It was an experience of lifetime with you guys….it is definitely the best dental clinic I have ever visited.</p>\r\n");
      out.write("                                    <div class=\"img-holder\">\r\n");
      out.write("                                        <img src=\"./images/testimonial/1.png\" alt=\"Awesome Image\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"name\">\r\n");
      out.write("                                    <h3>Erick Frederick</h3>\r\n");
      out.write("                                    <span>Denver</span>\r\n");
      out.write("                                </div>    \r\n");
      out.write("                            </div>    \r\n");
      out.write("                            <!--End Single Testimonial Item-->\r\n");
      out.write("                            <!--Start Single Testimonial Item-->\r\n");
      out.write("                            <div class=\"single-testimonial-item text-center\">\r\n");
      out.write("                                <div class=\"text-holder\">\r\n");
      out.write("                                    <p>Now I’ve got my tooth back, I can eat anything I like again.  I would recommend dento centre to everyone.</p>\r\n");
      out.write("                                    <div class=\"img-holder\">\r\n");
      out.write("                                        <img src=\"./images/testimonial/2.png\" alt=\"Awesome Image\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"name\">\r\n");
      out.write("                                    <h3>Evelynne Celie</h3>\r\n");
      out.write("                                    <span>Houston</span>\r\n");
      out.write("                                </div>    \r\n");
      out.write("                            </div>    \r\n");
      out.write("                            <!--End Single Testimonial Item-->\r\n");
      out.write("\r\n");
      out.write("                            <!--Start Single Testimonial Item-->\r\n");
      out.write("                            <div class=\"single-testimonial-item text-center\">\r\n");
      out.write("                                <div class=\"text-holder\">\r\n");
      out.write("                                    <p>It was an experience of lifetime with you guys….it is definitely the best dental clinic I have ever visited.</p>\r\n");
      out.write("                                    <div class=\"img-holder\">\r\n");
      out.write("                                        <img src=\"./images/testimonial/1.png\" alt=\"Awesome Image\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"name\">\r\n");
      out.write("                                    <h3>Erick Frederick</h3>\r\n");
      out.write("                                    <span>Denver</span>\r\n");
      out.write("                                </div>    \r\n");
      out.write("                            </div>    \r\n");
      out.write("                            <!--End Single Testimonial Item-->\r\n");
      out.write("                            <!--Start Single Testimonial Item-->\r\n");
      out.write("                            <div class=\"single-testimonial-item text-center\">\r\n");
      out.write("                                <div class=\"text-holder\">\r\n");
      out.write("                                    <p>Now I’ve got my tooth back, I can eat anything I like again.  I would recommend dento centre to everyone.</p>\r\n");
      out.write("                                    <div class=\"img-holder\">\r\n");
      out.write("                                        <img src=\"./images/testimonial/2.png\" alt=\"Awesome Image\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"name\">\r\n");
      out.write("                                    <h3>Evelynne Celie</h3>\r\n");
      out.write("                                    <span>Houston</span>\r\n");
      out.write("                                </div>    \r\n");
      out.write("                            </div>    \r\n");
      out.write("                            <!--End Single Testimonial Item-->\r\n");
      out.write("\r\n");
      out.write("                            <!--Start Single Testimonial Item-->\r\n");
      out.write("                            <div class=\"single-testimonial-item text-center\">\r\n");
      out.write("                                <div class=\"text-holder\">\r\n");
      out.write("                                    <p>It was an experience of lifetime with you guys….it is definitely the best dental clinic I have ever visited.</p>\r\n");
      out.write("                                    <div class=\"img-holder\">\r\n");
      out.write("                                        <img src=\"./images/testimonial/1.png\" alt=\"Awesome Image\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"name\">\r\n");
      out.write("                                    <h3>Erick Frederick</h3>\r\n");
      out.write("                                    <span>Denver</span>\r\n");
      out.write("                                </div>    \r\n");
      out.write("                            </div>    \r\n");
      out.write("                            <!--End Single Testimonial Item-->\r\n");
      out.write("                            <!--Start Single Testimonial Item-->\r\n");
      out.write("                            <div class=\"single-testimonial-item text-center\">\r\n");
      out.write("                                <div class=\"text-holder\">\r\n");
      out.write("                                    <p>Now I’ve got my tooth back, I can eat anything I like again.  I would recommend dento centre to everyone.</p>\r\n");
      out.write("                                    <div class=\"img-holder\">\r\n");
      out.write("                                        <img src=\"./images/testimonial/2.png\" alt=\"Awesome Image\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"name\">\r\n");
      out.write("                                    <h3>Evelynne Celie</h3>\r\n");
      out.write("                                    <span>Houston</span>\r\n");
      out.write("                                </div>    \r\n");
      out.write("                            </div>    \r\n");
      out.write("                        </div> \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>  \r\n");
      out.write("            </div>    \r\n");
      out.write("        </section>\r\n");
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
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
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
      if (_jspx_meth_c_forEach_5(_jspx_page_context))
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
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user != null  }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        <ul>\r\n");
        out.write("                                            <li><a href=\"MyReservation\">My Reservation</a></li>\r\n");
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
        out.write("                                              <li><a href=\"CustomerDetail\">Customer Detail</a></li>\r\n");
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
        out.write("                                    <li class=\"dropdown\"><a href=\"#\">Your account</a>\r\n");
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
    _jspx_th_c_forEach_1.setVar("x");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listService}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <div>\r\n");
          out.write("                                    <div class=\"single-solution-style1\">\r\n");
          out.write("                                        <div class=\"img-holder\" style=\"width: 100%; height: 200px;\">\r\n");
          out.write("                                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.thumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"Awesome Image\">                                        \r\n");
          out.write("                                        </div>\r\n");
          out.write("                                        <div class=\"text-holder\"style=\"width: 100%; height: 250px;\">\r\n");
          out.write("                                            <h3>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3>\r\n");
          out.write("                                            <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.shortDescription}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                                            <div class=\"readmore\">\r\n");
          out.write("                                                <a href=\"#\"><span class=\"flaticon-next\"></span></a>\r\n");
          out.write("                                                <div class=\"overlay-button\">\r\n");
          out.write("                                                    <a href=\"#\">Read More</a>    \r\n");
          out.write("                                                </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </div>\r\n");
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

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("x");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listService}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                                                ");
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
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listPost}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <div class=\"col-xl-4  col-md-12 col-sm-12\">\r\n");
          out.write("                            <div class=\"single-blog-post\">\r\n");
          out.write("                                <div class=\"img-holder\" style=\"width: 100%; height: 200px;\">\r\n");
          out.write("                                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.thumbnailLink}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"Awesome Image\" >\r\n");
          out.write("                                    <div class=\"categorie-button\">\r\n");
          out.write("                                        <a class=\"btn-one\" href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.category}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>    \r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                                <div class=\"text-holder\"style=\"width: 100%; height: 450px;\">\r\n");
          out.write("                                    <div class=\"meta-box\">\r\n");
          out.write("                                        <div class=\"author-thumb\">\r\n");
          out.write("                                            <img src=\"./images/blog/author-1.png\" alt=\"Image\">\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                        <ul class=\"meta-info\">           \r\n");
          out.write("                                            <li><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.author}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\r\n");
          out.write("                                            <li><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.datePublic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\r\n");
          out.write("                                            \r\n");
          out.write("                                        </ul>    \r\n");
          out.write("                                    </div>\r\n");
          out.write("                                    <h3 class=\"blog-title\"><a href=\"PostDetail?index=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h3> \r\n");
          out.write("                                    <div class=\"text-box\">\r\n");
          out.write("                                        <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                    <div class=\"readmore-button\">\r\n");
          out.write("                                        <a class=\"btn-two\" href=\"PostDetail?index=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><span class=\"flaticon-next\"></span>Continue REading</a>\r\n");
          out.write("                                    </div>  \r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    ");
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
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${daoService.categoryService}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <li><a href=\"#\">");
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

  private boolean _jspx_meth_c_forEach_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent(null);
    _jspx_th_c_forEach_5.setVar("x");
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${daoPost.categoryPost}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <li><a href=\"Post?categoryId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }
}
