<%-- 
    Document   : TimeTable
    Created on : May 16, 2022, 11:12:53 PM
    Author     : Nguyen Minh Hoang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<!-- Mirrored from st.ourhtmldemo.com/new/Dento/timetable.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 05 Jan 2021 02:08:58 GMT -->
<head>
	<meta charset="UTF-8">
	<title>Timetable</title>

	<!-- responsive meta -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- For IE -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    	
 <jsp:include page="../Views/LinkHeader.jsp"/>
    
</head>

<body>
<jsp:include page ="../Views/Header.jsp"/>     

<!--Start breadcrumb area-->     
<section class="breadcrumb-area" style="background-image: url(images/resources/breadcrumb-bg.jpg);">
    <div class="container">
        <div class="row">
            <div class="col-xl-12">
                <div class="inner-content clearfix">
                    <div class="title float-left">
                       <h2>Timetable</h2>
                    </div>
                    <div class="breadcrumb-menu float-right">
                        <ul class="clearfix">
                            <li><a href="Homepage.jsp">Home</a></li>
                            <li><i class="fa fa-angle-right" aria-hidden="true"></i></li>
                            <li class="active">Timetable</li>
                        </ul>    
                    </div>
                </div>
            </div>
        </div>
	</div>
</section>
<!--End breadcrumb area-->  

<!--Start visit timetable area -->
<div class="visit-timetable-area">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="sec-title max-width text-center">
                    <h1>Time for your next visit!</h1>
                    <p>Here you can get doctors available time & you can get your perfect visiting time to hospital.</p>
                </div>
                <div class="find-doctor-specialities">
                    <div class="row">
                        <div class="col-xl-6">
                            <div class="input-box">
                                <select class="selectmenu">
                                    <option selected="selected">Specialities</option>
                                    <option>Dental Implants</option>
                                    <option>Cosmetic Dentistry</option>
                                    <option>Laser Dentistry</option>
                                    <option>Orthodontics</option>
                                    <option>Endodontics</option>
                                    <option>Periodontics</option>
                                </select>
                            </div>    
                        </div>
                        <div class="col-xl-6">
                            <div class="input-box">
                                <select class="selectmenu">
                                    <option selected="selected">Doctor</option>
                                    <option>Dr. Daryl Cornelius</option>
                                    <option>Evelynne Mirando</option>
                                    <option>Dr. Robert B. Moreau</option>
                                    <option>Dr. Greg House</option>
                                    <option>Dr. Sarah Johnson</option>
                                </select>
                            </div>
                        </div>
                    </div>
                </div>    
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <div class="table-responsive">
                    <table class="table visit_timetable">
                        <thead>
                            <tr>
                                <th>
                                    <div class="single">
                                        Time    
                                    </div>
                                </th>
                                <th>
                                    <div class="single">
                                        Monday    
                                    </div>
                                </th>
                                <th>
                                    <div class="single">
                                        Tuesday    
                                    </div>
                                </th>
                                <th>
                                    <div class="single">
                                        Wednesday    
                                    </div>
                                </th>
                                <th>
                                    <div class="single">
                                        Thursday    
                                    </div>
                                </th>
                                <th>
                                    <div class="single">
                                        Friday    
                                    </div>
                                </th>
                                <th>
                                    <div class="single">
                                        Saturday    
                                    </div>
                                </th>
                                <th>
                                    <div class="single">
                                        Sunday    
                                    </div>
                                </th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td class="vertical-middle">
                                    <div class="single time-box">
                                        <h5>9.00am</h5>
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style1 gray_bg">
                                        <p>Scalling & Root Planning</p>
                                        <span>9.00 - 10.30</span>
                                        <h6 class="green">Dr.Steve Lyne </h6>
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style2">
                                        <p>Laser Bleaching</p>
                                        <span>9.00 - 10.00</span>
                                        <h6>Dr.Riya Peter</h6>
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style2 gray_bg">
                                        <p>Tooth Whitening</p>
                                        <span>9.00 - 10.00</span>
                                        <h6>Dr.Veena Mark </h6>
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style1">
                                        <div class="blank"></div>
                                    </div>    
                                </td>
                                <td>
                                    <div class="single box-style2 gray_bg">
                                        <p>Cosmetic Gum Surgery</p>
                                        <span>9.00- 10.30</span>
                                        <h6>Dr.Mark Joe</h6>
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style1">
                                        <p>Laser Bleaching</p>
                                        <span>9.00 - 10.30</span>
                                        <h6 class="green">Dr.Riya Peter</h6>
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style2 gray_bg">
                                        <p>Gum Contouring</p>
                                        <span>9.00- 10.00</span>
                                        <h6>Dr.Dylon Taylor</h6>
                                    </div>
                                </td>
                            </tr>
                            
                            
                            <tr>
                                <td class="vertical-middle">
                                    <div class="single time-box">
                                        <h5>10.00am</h5>
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style1">
                                        <p>Teeth Replacement</p>
                                        <span>10.30 - 12.00</span>
                                        <h6>Dr.Zionee Saw</h6>
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style2 gray_bg">
                                        <div class="blank"></div>
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style2">
                                        <p>Cosmetic Gum Surgery</p>
                                        <span>10.00 - 11.30</span>
                                        <h6 class="green">Dr.Steve Lyne</h6>
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style1 gray_bg">
                                        <p>Scalling & Root Planning</p>
                                        <span>10.30 - 11.30</span>
                                        <h6 class="green">Dr.Steve Lyne </h6>  
                                    </div>    
                                </td>
                                <td>
                                    <div class="single box-style2">
                                        <p>Scalling & Root Planning</p>
                                        <span>09.00 - 10.30</span>
                                        <h6>Dr.Steve Lyne </h6>  
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style1 gray_bg">
                                        <div class="blank"></div>
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style2">
                                        <div class="blank"></div>
                                    </div>
                                </td>
                            </tr>
                            
                            <tr>
                                <td class="vertical-middle">
                                    <div class="single time-box">
                                        <h5>11.00am</h5>
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style1 gray_bg">
                                        <p>Teeth Replacement</p>
                                        <span>10.30 - 12.00</span>
                                        <h6 class="green">Dr.Zionee Saw</h6>
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style2">
                                        <p>Gum Contouring</p>
                                        <span>11.30 - 1.00</span>
                                        <h6>Dr.Dylon Taylor</h6>
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style1 gray_bg">
                                        <p>Scalling & Root Planning</p>
                                        <span>11.30 - 12.30</span>
                                        <h6>Dr.Steve Lyne </h6>  
                                    </div>    
                                </td>
                                <td>
                                    <div class="single box-style2">
                                        <p>Laser Bleaching</p>
                                        <span>11.30 - 1.00</span>
                                        <h6 class="green">Dr.Riya Peter</h6>
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style2 gray_bg">
                                        <p>Tooth Whitening</p>
                                        <span>09.00 - 10.30</span>
                                        <h6>Dr.Veena Mark</h6>  
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style1">
                                        <div class="blank"></div>
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style2 gray_bg">
                                        <div class="blank"></div>
                                    </div>
                                </td>
                            </tr>
                            
                            <tr>
                                <td class="vertical-middle">
                                    <div class="single time-box">
                                        <h5>12.00am</h5>
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style1">
                                        <div class="blank"></div>
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style2 gray_bg">
                                        <p>Gum Contouring</p>
                                        <span>11.30 - 1.00</span>
                                        <h6 class="green">Dr.Dylon Taylor</h6>
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style2">
                                        <p>Scalling & Root Planning</p>
                                        <span>11.30 - 12.30</span>
                                        <h6>Dr.Steve Lyne </h6>  
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style1 gray_bg">
                                        <p>Laser Bleaching</p>
                                        <span>11.30 - 1.00</span>
                                        <h6 class="green">Dr.Riya Peter</h6>
                                    </div>    
                                </td>
                                <td>
                                    <div class="single box-style2">
                                        <p>Scalling & Root Planning</p>
                                        <span>09.00 - 10.30</span>
                                        <h6>Dr.Steve Lyne </h6>  
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style1 gray_bg">
                                        <div class="blank"></div>
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style2">
                                        <div class="blank"></div>
                                    </div>
                                </td>
                            </tr>
                            
                            <tr>
                                <td class="vertical-middle">
                                    <div class="single time-box">
                                        <h5>1.00pm</h5>
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style1 gray_bg">
                                        <p>Cosmetic Gum Surgery</p>
                                        <span>1.00 - 2.00</span>
                                        <h6>Dr.Mark Joe</h6>
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style2">
                                        <p>Dental Implants</p>
                                        <span>1.00 - 2.00</span>
                                        <h6 class="green">Dr.David Lee</h6>    
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style1 gray_bg">
                                        <div class="blank"></div>
                                    </div>    
                                </td>
                                <td>
                                    <div class="single box-style2">
                                        <p>Teeth Replacement</p>
                                        <span>1.00 - 2.00</span>
                                        <h6>Dr.Zionee Saw</h6>
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style2 gray_bg">
                                        <div class="blank"></div>
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style1">
                                        <p>Scalling & Root Planning</p>
                                        <span>1.00 - 2.00</span>
                                        <h6 class="green">Dr.Steve Lyne</h6>      
                                    </div>
                                </td>
                                <td>
                                    <div class="single box-style2 gray_bg">
                                        <div class="blank"></div>
                                    </div>
                                </td>
                            </tr>
                            
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
<!--End visit timetable area -->

<jsp:include page="../Views/Footer.jsp"/>
<!-- /.End Of Color Palate -->
<jsp:include page="../Views/LinkFooter.jsp"/>



</body>

<!-- Mirrored from st.ourhtmldemo.com/new/Dento/timetable.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 05 Jan 2021 02:08:58 GMT -->
</html>
