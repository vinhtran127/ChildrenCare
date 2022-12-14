<%-- 
    Document   : Contact
    Created on : May 16, 2022, 11:16:04 PM
    Author     : Nguyen Minh Hoang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<!-- Mirrored from st.ourhtmldemo.com/new/Dento/contact.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 05 Jan 2021 02:08:58 GMT -->
<head>
	<meta charset="UTF-8">
	<title>Contact</title>

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
                       <h2>Contact Us</h2>
                    </div>
                    <div class="breadcrumb-menu float-right">
                        <ul class="clearfix">
                            <li><a href="Homepage.jsp">Home</a></li>
                            <li><i class="fa fa-angle-right" aria-hidden="true"></i></li>
                            <li class="active">Contact Us</li>
                        </ul>    
                    </div>
                </div>
            </div>
        </div>
	</div>
</section>
<!--End breadcrumb area--> 

<!--Start Contact info map area-->
<section class="contact-info-map-area">
    <div class="container">
        <div class="sec-title max-width text-center">
            <h1>We are Here to Help You, Don’t Hesitate.</h1>
        </div>
        <div class="row">
            <div class="col-xl-12">
                <div class="contact-info-map">
                    <div class="row">
                        <div class="col-xl-4">
                            <div class="contact-info-left">
                                <div class="contact-title">
                                    <h2>Send Your Message Us</h2>
                                    <p>Dont be shy, Send your message or through form, our expert will help you ASAP.</p>
                                </div>
                                <div class="state-select-box2">
                                    <select class="selectmenu area_select">
                                        <option value="1">North California</option>
                                        <option value="2">Los Angeles</option>
                                        <option value="3">San Francisco</option>
                                        <option value="4">British Columbia</option>
                                        <option value="5">Nova Scotia</option>
                                    </select>
                                    <div class="state-content">
                                        <div class="state" id="value1">
                                            <ul>
                                                <li>
                                                    <div class="text">
                                                        <h5>Address</h5>
                                                        <p>Romanian  9520 Faires Farm Road,<br> Carlsbad, NC 28213, California.</p>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="text">
                                                        <h5>Phone</h5>
                                                        <p>Phone 1: +1 555-7890-123<br> Phone 2: (+ 760) 987-65-43210.</p>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="text">
                                                        <h5>Email</h5>
                                                        <p>supportyou@example.com</p>
                                                    </div>
                                                </li>
                                            </ul>
                                        </div>
                                        <div class="state" id="value2">
                                            <ul>
                                                <li>
                                                    <div class="text">
                                                        <h5>Address</h5>
                                                        <p>Romanian  9520 Faires Farm Road,<br> Carlsbad, NC 28213, Los Angeles.</p>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="text">
                                                        <h5>Phone</h5>
                                                        <p>Phone 1: +1 555-7890-123<br> Phone 2: (+ 760) 987-65-43210.</p>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="text">
                                                        <h5>Email</h5>
                                                        <p>supportyou@example.com</p>
                                                    </div>
                                                </li>
                                            </ul>
                                        </div>
                                        <div class="state" id="value3">
                                            <ul>
                                                <li>
                                                    <div class="text">
                                                        <h5>Address</h5>
                                                        <p>Romanian  9520 Faires Farm Road,<br> Carlsbad, NC 28213, San Francisco.</p>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="text">
                                                        <h5>Phone</h5>
                                                        <p>Phone 1: +1 555-7890-123<br> Phone 2: (+ 760) 987-65-43210.</p>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="text">
                                                        <h5>Email</h5>
                                                        <p>supportyou@example.com</p>
                                                    </div>
                                                </li>
                                            </ul>
                                        </div>
                                        <div class="state" id="value4">
                                            <ul>
                                                <li>
                                                    <div class="text">
                                                        <h5>Address</h5>
                                                        <p>Romanian  9520 Faires Farm Road,<br> Carlsbad, NC 28213, British Columbia.</p>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="text">
                                                        <h5>Phone</h5>
                                                        <p>Phone 1: +1 555-7890-123<br> Phone 2: (+ 760) 987-65-43210.</p>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="text">
                                                        <h5>Email</h5>
                                                        <p>supportyou@example.com</p>
                                                    </div>
                                                </li>
                                            </ul>
                                        </div>
                                        <div class="state" id="value5">
                                            <ul>
                                                <li>
                                                    <div class="text">
                                                        <h5>Address</h5>
                                                        <p>Romanian  9520 Faires Farm Road,<br> Carlsbad, NC 28213, Nova Scotia.</p>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="text">
                                                        <h5>Phone</h5>
                                                        <p>Phone 1: +1 555-7890-123<br> Phone 2: (+ 760) 987-65-43210.</p>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="text">
                                                        <h5>Email</h5>
                                                        <p>supportyou@example.com</p>
                                                    </div>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>   
                                </div>
                            </div>
                        </div>
                        <div class="col-xl-8">
                            <div class="google-map-box">
                                <div 
                                    class="google-map" 
                                    id="contact-google-map" 
                                    data-map-lat="40.584160" 
                                    data-map-lng="-74.415543" 
                                    data-icon-path="../images/resources/map-marker.png" 
                                    data-map-title="Brooklyn, New York, United Kingdom" 
                                    data-map-zoom="12" 
                                    data-markers='{
                                        "marker-1": [40.584160, -74.415543, "<h4>Head Office</h4><p>44/108 Brooklyn, UK</p>"],
                                        "marker-2": [40.602230, -74.689910, "<h4>Head Office</h4><p>44/108 Brooklyn, UK</p>"],
                                        "marker-3": [35.616959, -87.838852, "<h4>Head Office</h4><p>44/108 Brooklyn, UK</p>"]

                                    }'>
                                </div>   
                            </div> 
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>      
<!--End Contact info map area-->      

<!--Start contact form area-->
<section class="contact-form-area">
    <div class="container">
        <div class="row">
            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12">
                <div class="contact-form">
                    <div class="contact-title">
                        <h2>Send Your Message Us</h2>
                        <p>Dont be shy, Send your message or quiries through below form, our expert team will help you ASAP.</p>
                    </div>
                    <form id="contact-form" name="contact_form" class="default-form" action="http://st.ourhtmldemo.com/new/Dento/inc/sendmail.php" method="post">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="input-box">   
                                    <input type="text" name="form_name" value="" placeholder="Your Name*" required="">
                                </div>
                                <div class="input-box"> 
                                    <input type="email" name="form_email" value="" placeholder="Your Mail*" required="">
                                </div>
                                <div class="input-box"> 
                                    <input type="text" name="form_phone" value="" placeholder="Phone">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="input-box">    
                                    <textarea name="form_message" placeholder="Your Message.." required=""></textarea>
                                </div>
                                <div class="button-box">
                                    <input id="form_botcheck" name="form_botcheck" class="form-control" type="hidden" value="">
                                    <button class="btn-one" type="submit" data-loading-text="Please wait...">Send Your Message</button>    
                                </div>     
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            
        </div>
    </div>
</section>
<!--End contact form area-->

<jsp:include page="../Views/Footer.jsp"/>
<!-- /.End Of Color Palate -->
<jsp:include page="../Views/LinkFooter.jsp"/>

</body>

<!-- Mirrored from st.ourhtmldemo.com/new/Dento/contact.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 05 Jan 2021 02:09:00 GMT -->
</html>
