<%-- 
    Document   : Appointment
    Created on : May 16, 2022, 11:10:14 PM
    Author     : Nguyen Minh Hoang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<!-- Mirrored from st.ourhtmldemo.com/new/Dento/apppointment.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 05 Jan 2021 02:08:58 GMT -->
<head>
	<meta charset="UTF-8">
	<title>Apppointment </title>

	<!-- responsive meta -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- For IE -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    
	
 <jsp:include page="../Views/LinkHeader.jsp"/>
    
</head>

<body>
<jsp:include page ="../Views/Header.jsp"/>     

<!--Start breadcrumb area-->     
<section class="breadcrumb-area" style="background-image: url(../images/resources/breadcrumb-bg.jpg);">
    <div class="container">
        <div class="row">
            <div class="col-xl-12">
                <div class="inner-content clearfix">
                    <div class="title float-left">
                       <h2>Make Apppointment</h2>
                    </div>
                    <div class="breadcrumb-menu float-right">
                        <ul class="clearfix">
                            <li><a href="Homepage.jsp">Home</a></li>
                            <li><i class="fa fa-angle-right" aria-hidden="true"></i></li>
                            <li class="active">Make Apppointment</li>
                        </ul>    
                    </div>
                </div>
            </div>
        </div>
	</div>
</section>
<!--End breadcrumb area-->  

<!--Start Appointment area -->
<div class="appointment-area2">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="sec-title max-width text-center">
                    <h1>Make an Appointment</h1>
                    <p>Here you can get doctors available time & you can get your perfect visiting time to hospital.</p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-xl-8">
                <div class="appointment-form-left">
                    <form name="appointment-form" action="#" method="post">
                        <div class="row">
                            <div class="col-xl-12 col-lg-12">
                                <div class="single-box">
                                    <div class="title">
                                        <h5>Times for</h5>
                                    </div>
                                    <div class="input-box">
                                        <select class="selectmenu">
                                            <option selected="selected">Dr. Daryl Cornelius</option>
                                            <option>Evelynne Mirando</option>
                                            <option>Dr. Robert B. Moreau</option>
                                            <option>Dr. Greg House</option>
                                            <option>Dr. Sarah Johnson</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xl-12 col-lg-12">
                                <div class="single-box">
                                    <div class="title">
                                        <h5>Available at</h5>
                                    </div>
                                    <div class="input-box">
                                        <div class="available-time">
                                            <ul>
                                                <li>9.00am</li>
                                                <li class="active">11.30am</li>
                                                <li>12.00pm</li>
                                                <li>3.00pm</li>
                                                <li>4.00pm</li>
                                                <li>5.00pm</li>
                                                <li>5.30pm</li>
                                                <li>6.00pm</li>
                                                <li>7.00pm</li>
                                                <li>7.30pm</li>
                                            </ul>    
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div> 
                        <div class="row">
                            <div class="col-xl-12 col-lg-12">
                                <div class="single-box">
                                    <div class="title">
                                        <h5>Personal Info</h5>
                                    </div>
                                    <div class="input-box">
                                        <div class="row">
                                            <div class="col-xl-6">
                                                <input type="text" name="p_name" value="" placeholder="Patient Name*" required="">    
                                            </div>
                                            <div class="col-xl-6">
                                                <select class="selectmenu">
                                                    <option selected="selected">Service</option>
                                                    <option>Dental Implants</option>
                                                    <option>Cosmetic Dentistry</option>
                                                    <option>Laser Dentistry</option>
                                                    <option>Orthodontics</option>
                                                    <option>Endodontics</option>
                                                    <option>Periodontics</option>
                                                </select>    
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-6">
                                                <input type="text" name="phn_num" value="" placeholder="Ph Num*" required="">    
                                            </div>
                                            <div class="col-xl-6">
                                                <input type="text" name="age" value="" placeholder="Age">      
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12">
                                                <textarea name="form_description..." placeholder="Description..."></textarea>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12">
                                                <div class="button-box">
                                                    <button class="btn-one" type="submit">Select</button>   
                                                </div>
                                            </div>
                                        </div>    
                
                                    </div>
                                </div>
                            </div>
                        </div>
                            
                    </form>   
                </div>
            </div>
            <div class="col-xl-4 col-lg-6 col-md-9">
                <div class="appointment-right">
                    <form name="appointment-right" action="#" method="post">
                        <div class="input-box">
                            <input type="text" name="date" placeholder="Date" id="datepicker">
                            <div class="icon-box">
                                <i class="fa fa-calendar" aria-hidden="true"></i>
                            </div>
                        </div>
                        <div class="confirm-booking">
                            <h3>Confirm Your Booking</h3>
                            <ul>
                                <li><span>Patient Name</span><b>:</b> George Turner</li>
                                <li><span>Age</span><b>:</b> 36 Years</li>
                                <li><span>Service</span><b>:</b> Root Canel</li>
                                <li><span>Date & Time</span><b>:</b> Nov 22nd, 2018. 11.30am</li>
                                <li><span>Price</span><b>:</b> $65.00</li>
                            </ul>    
                        </div>
                        <div class="button-box">
                            <button class="btn-one" type="submit">Confirm</button>   
                            <button class="btn-one" type="submit">Cancel</button>   
                        </div>    
                    </form>   
                </div>
            </div>
        </div>
    </div>
</div>
<!--End Appointment area -->


<jsp:include page="../Views/Footer.jsp"/>
<!-- /.End Of Color Palate -->
<jsp:include page="../Views/LinkFooter.jsp"/>


</body>

<!-- Mirrored from st.ourhtmldemo.com/new/Dento/apppointment.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 05 Jan 2021 02:08:58 GMT -->
</html>
