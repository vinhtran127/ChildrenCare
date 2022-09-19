

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--Start header style1 area-->
<header class="header-style1-area">
    <div class="container">
        <div class="row">
            <div class="col-xl-12 col-lg-12 col-md-12">
                <div class="inner-content clearfix">
                    <div class="header-style1-logo float-left">
                        <a href="HomePage">
                            <img src="./images/icon/logo.png" style="width: 105px; height: 100px;"  alt="Awesome Logo">

                        </a>
                    </div>   
                    <div class="header-contact-info float-left">
                        <ul>
                            <li>
                                <div class="single-item">
                                    <div class="icon">
                                        <span class="icon-support"></span>    
                                    </div>
                                    <div class="text">
                                        <p>+1 555-7890-123</p> 
                                        <span>support@example.com</span>   
                                    </div>
                                </div>
                            </li>
                            <li>
                                <div class="single-item">
                                    <div class="icon">
                                        <span class="icon-gps"></span>    
                                    </div>
                                    <div class="text">
                                        <p>86 Brattle Street</p> 
                                        <span>Cambridge, MA 02138</span>   
                                    </div>
                                </div>
                            </li>
                        </ul>  
                    </div>
                    <div class="header-style1-button float-right">
                        <a href="Reservation"><span class="icon-date"></span>Make Appointment</a>
                    </div>
                </div>
            </div>
        </div>
    </div> 
    <style>
        @media only screen and (min-width: 992px) and (max-width: 1199px){
            .main-menu.style1 .navigation li a {
                padding: 28px 15px 28px;
            }
        }

        .main-menu.style1 .navigation li img {
            margin: 10px 22px;
            position: relative;
            opacity: 1;
            text-align: center;
            transition: all 300ms ease;
            height: 50px;
            width: 50px;
            vertical-align: middle;
            border-radius: 50% !important;
            align-content: center;
            left: 50%;
            transform: translateX(-50%);
            display: inline-block;
        }
        .main-menu.style1 .navigation li img:before {
            position: absolute;
            left: 0;
            right: 0;
            bottom: -2px;
            text-align: center;
            opacity: 0;
            transition: all 500ms ease;
            transition-delay: .2s;
            width: 30px;
            height: auto;
            vertical-align: middle;
            border-radius: 50% !important; 
            align-content: center;
        }
    </style>
</header>  
<!--End header style1 area-->

<!--Start mainmenu area-->
<section class="mainmenu-area stricky">
    <div class="container">
        <div class="row">
            <div class="col-xl-12">
                <div class="inner-content clearfix">
                    <nav class="main-menu style1 clearfix">
                        <div class="navbar-header clearfix">   	
                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                        </div>
                        <div class="navbar-collapse collapse clearfix">
                            <ul class="navigation clearfix">
                                <li class="dropdown current"><a href="HomePage">Home</a></li>
                                <li><a href="About">About Us</a></li>
                                <li class="dropdown"><a href="specialities.html">Services</a>
                                    <ul>
                                        <c:forEach var="x" items="${daoService.categoryService}">
                                            <li><a href="">${x.name}</a></li>
                                            </c:forEach>

                                    </ul>
                                </li>
                                <li class="dropdown"><a href="#">Reservation</a>
                                    <c:if test="${sessionScope.user != null && sessionScope.user.role.id == 3}">
                                        <ul>
                                            <li><a href="MyReservation">My Reservation</a></li>
                                            <li><a href="Reservation">Reservation</a></li>
                                        </ul>  
                                    </c:if>
                                    <c:if test="${sessionScope.user != null && sessionScope.user.role.id == 2}">
                                        <ul>
                                            <li><a href="ManageReservation">Manage Reservation</a></li>
                                        </ul>  
                                    </c:if>



                                </li>
                                <li class="dropdown"><a href="Post">Blog</a></li>
                                <li class="dropdown"><a href="#">More</a>
                                    <ul>
                                        <li><a href="TimeTable.jsp">Timetable</a></li>
                                        <li><a href="Appointment.jsp">Apppointment</a></li>
                                        <li><a href="FeedbacksList">Feedback list</a></li>
                                            <c:if test="${sessionScope.user != null && sessionScope.user.role.id == 1}">   
                                            <li><a href="AdminDashboard">Admin Dashboard</a></li>
                                            </c:if>

                                        <c:if test="${sessionScope.user != null 
                                                      && sessionScope.user.role.id == 2}">   
                                              <li><a href="Customer">Customer List</a></li>
                                              </c:if>
                                              <c:if test="${sessionScope.user != null 
                                                            && sessionScope.user.role.id == 1}">   
                                              <li><a href="Customer">User List</a></li>
                                              </c:if>
                                        <li><a href="Contact.jsp">Contact</a></li>
                                    </ul>
                                </li>
                                <c:if test="${sessionScope.user != null}">
                                    <li class="dropdown" id="responsive"><img  src="${sessionScope.user.image}" >
                                        <ul>
                                            <li><a href="TimeTable.jsp">Edit profile</a></li>
                                            <li><a href="ChangePassword">Change Password</a></li>
                                            <li><a href="Logout">Logout</a></li>
                                        </ul>
                                    </li>
                                </c:if>
                                <c:if test="${sessionScope.user == null}">
                                    <li><a href="Login">Login</a></li>
                                    </c:if>

                            </ul>
                        </div>
                    </nav>

                    <div class="mainmenu-right">
                        <div class="search-box-style1">
                            <form class="search-form" method="post" action="http://st.ourhtmldemo.com/new/Dento/index.html">
                                <input type="search" name="search" placeholder="Search." required>
                                <button type="submit"><i class="fa fa-search" aria-hidden="true"></i></button>
                            </form>        
                        </div>
                        <div class="toggler-button">
                            <div class="nav-toggler hidden-bar-opener">
                                <div class="inner">
                                    <span></span>
                                    <span></span>
                                    <span></span>
                                </div>
                            </div>    
                        </div>
                    </div> 

                </div>
            </div>
        </div>
    </div>
</section>                 
<!--End mainmenu area--> 

<!-- Hidden Navigation Bar -->
<section class="hidden-bar right-align">
    <div class="hidden-bar-closer">
        <button><span class="flaticon-remove"></span></button>
    </div>
    <div class="hidden-bar-wrapper">
        <div class="logo">
            <a href="HomePage"><img src="./images/icon/logo.png" style="width: 105px; height: 100px;" alt=""/></a>
        </div>
        <div class="contact-info-box">
            <h3>Contact Info</h3>
            <ul>
                <li>
                    <h5>Address</h5>
                    <p>Romanian  9520 Faires Farm Road,<br> Carlsbad, NC 28213.</p>
                </li>
                <li>
                    <h5>Phone</h5>
                    <p>Phone 1: +1 555-7890-123</p>
                </li>
                <li>
                    <h5>Email</h5>
                    <p>supportyou@example.com</p>
                </li>
            </ul>
        </div>       
        <div class="newsletter-form-box">
            <h3>Newsletter Subscribe</h3>
            <span>Get healthy tips & latest updates in inbox.</span>
            <form action="#">
                <div class="row">
                    <div class="col-xl-12">
                        <input type="email" name="email" placeholder="Email Address..."> 
                        <button type="submit"><span class="flaticon-arrow"></span></button>    
                    </div>
                </div>
            </form>
        </div>
        <div class="offer-box text-center">
            <div class="big-title">50% <span>Offer</span></div>
            <h3>5 Years Warranty</h3>
            <a class="btn-one" href="#">Pricing Plans</a>    
        </div>
        <div class="copy-right-text">
            <p>© Dento 2018, All Rights Reserved.</p>
        </div> 
    </div>
</section>
<!-- End Hidden Bar -->     
