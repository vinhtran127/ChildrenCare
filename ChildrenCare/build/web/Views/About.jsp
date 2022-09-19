
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<!-- Mirrored from st.ourhtmldemo.com/new/Dento/about.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 05 Jan 2021 02:06:23 GMT -->
<head>
	<meta charset="UTF-8">
	<title>About </title>
    <jsp:include page="/Views/LinkHeader.jsp"/>
        <jsp:useBean id="daoPost" class="dao.PostDao" scope="request"/>
        <jsp:useBean id="daoService" class="dao.ServiceDao" scope="request"/>
    
</head>

<body>
     <%@include file="/Views/Header.jsp" %>   
<!--Start mainmenu area-->

<!--Start breadcrumb area-->     
<section class="breadcrumb-area" style="background-image: url(./images/resources/breadcrumb-bg.jpg);">
    <div class="container">
        <div class="row">
            <div class="col-xl-12">
                <div class="inner-content clearfix">
                    <div class="title float-left">
                       <h2>About Us</h2>
                    </div>
                    <div class="breadcrumb-menu float-right">
                        <ul class="clearfix">
                            <li><a href="Homepage">Home</a></li>
                            <li><i class="fa fa-angle-right" aria-hidden="true"></i></li>
                            <li class="active">About Us</li>
                        </ul>    
                    </div>
                </div>
            </div>
        </div>
	</div>
</section>
<!--End breadcrumb area--> 

<!--Start About Area-->
<section class="about-area home2">
    <div class="container">
        <div class="row">
            <div class="col-xl-6">
                <div class="about-image-holder wow fadeInLeft" data-wow-delay="900ms">
                    <img src="./images/resources/about1.jpg" alt="Awesome Image">
                </div>    
            </div>
            <div class="col-xl-6">
                <div class="inner-content">
                    <div class="sec-title">
                        <h3>About Us</h3>
                        <h1>Mission and Story About<br> Our Children Care Service</h1>
                    </div>
                    <div class="about-text-holder">
                        <p>Our mission is to provide the highest quality comprehensive pediatric and adolescent medical care in our community. We practice medicine as a team and value the contributions of all of our staff in providing excellent medical care and service. We emphasize your children’s health and well-being as our primary responsibility, and collaborate with parents to help children develop healthy habits and lifestyles so that they may achieve their greatest potential.</p>
                        <p>In fulfilling our mission each and every day, we practice child-centered and family-focused healthcare, partnering with you and guiding the choices that are right for your child.</p>
                        <div class="author-box fix">
                            <div class="img-box">
                                <img src="./images/users/hoangphoto.jpg" alt="Awesome Image">
                            </div>
                            <div class="text-box">
                                <h3>Minh Hoang</h3>
                                <span>CEO & Founder</span>
                            </div>
                            <div class="signatire-box">
                                <img src="./images/resources/signature.png" alt="Signature">
                            </div>
                        </div>
                       
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!--End About Area-->

<!--Start fact counter area-->
<section class="fact-counter-area style2">
    <div class="container">
        <div class="row">
            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12">
                <ul class="clearfix">
                    <!--Start single fact counter-->
                    <li class="single-fact-counter text-center wow fadeInUp" data-wow-delay="300ms">
                        <div class="count-box">
                            <div class="icon">
                                <span class="icon-tooth-3"></span>    
                            </div>
                            <h1>
                                <span class="timer" data-from="1" data-to="4257" data-speed="5000" data-refresh-interval="50">4257</span>
                            </h1>
                            <div class="title">
                                <h3>Projects Completed</h3>
                            </div>
                            <div class="text">
                                <p>Nor again is there anyone who loves or pursues or desires obtain.</p>
                            </div>
                        </div>
                    </li>
                    <!--End single fact counter-->
                    <!--Start single fact counter-->
                    <li class="single-fact-counter text-center wow fadeInUp" data-wow-delay="600ms">
                        <div class="count-box">
                            <div class="icon">
                                <span class="icon-doctor-1"></span>    
                            </div>
                            <h1>
                                <span class="timer" data-from="1" data-to="18" data-speed="5000" data-refresh-interval="50">18</span>
                            </h1>
                            <div class="title">
                                <h3>Expert Dentists</h3>
                            </div>
                            <div class="text">
                                <p>Desires to obtain pain of itself, because all circumstances occur.</p>
                            </div>
                        </div>
                    </li>
                    <!--End single fact counter-->
                    <!--Start single fact counter-->
                    <li class="single-fact-counter text-center wow fadeInUp" data-wow-delay="900ms">
                        <div class="count-box">
                            <div class="icon">
                                <span class="icon-hospital"></span>    
                            </div>
                            <h1>
                                <span class="timer" data-from="1" data-to="6" data-speed="5000" data-refresh-interval="50">6</span>
                            </h1>
                            <div class="title">
                                <h3>Branches In City</h3>
                            </div>
                            <div class="text">
                                <p>Know  pursue pleasure rationally that all consequences service.</p>
                            </div>
                        </div>
                    </li>
                    <!--End single fact counter-->
                </ul>
            </div>
        </div>
    </div>
</section>
<!--End fact counter area--> 

<!--Start mission vision area-->
<section class="mission-vision-area sec-pd2" style="background-image: url(./images/parallax-background/mission-vision-bg.jpg);">
    <div class="container">
        <div class="row">
            <!--Start single mission vision box-->
            <div class="col-xl-4 col-lg-4">
                <div class="single-mission-vision-box text-center wow fadeInLeft" data-wow-delay="0ms" data-wow-duration="1500ms">
                    <h6>Team Approach</h6>
                    <p>CHC is composed of a diverse group of providers that work closely together to treat not only symptoms but the whole child. Our team includes board-certified pediatricians, nurse practitioners, nurses, a pediatric nutritionist, social workers, and a special needs expert. We encourage family involvement by working closely with parents to ensure the treatments we provide are effective and that your child is thriving between visits.</p>
                    <a class="btn-two" href="#">Read More</a>    
                </div>
            </div>
            <!--End single mission vision box-->
            <!--Start single mission vision box-->
            <div class="col-xl-4 col-lg-4">
                <div class="single-mission-vision-box text-center wow fadeInUp" data-wow-delay="0ms" data-wow-duration="1500ms" style="height: 560px;">
                    <h6>Circle of Care</h6>
                    <p>We strongly believe in the full circle of care to help your child reach their greatest potential. Our providers collaborate with each other, with our on-staff specialists, and with you as a parent to ensure your child receives the care they need during each developmental stage. Should your child require a referral to an off-site specialist, we continuously communicate with the specialist to monitor your child’s progress throughout their course of treatment.</p>
                    <a class="btn-two" href="#">Read More</a>    
                </div>
            </div>
            <!--End single mission vision box-->
            <!--Start single mission vision box-->
            <div class="col-xl-4 col-lg-4">
                <div class="single-mission-vision-box text-center wow fadeInRight" data-wow-delay="0ms" data-wow-duration="1500ms">
                    <h6>Extended Hours</h6>
                    <p>Our providers are available when you need us. We offer extended hours in the morning at all locations for walk-in sick visits, as well as weekend and holiday hours at our Newburyport Lower Level office. CHC triage nurses are available to answer questions by phone during our office hours. Outside of our normal office hours, a CHC provider is always on call to respond to emergencies and answer urgent questions. If you need to speak to the on-call provider,</p>
                    <a class="btn-two" href="#">Read More</a>    
                </div>
            </div>
            <!--End single mission vision box-->
        </div>
    </div>
</section>  
<!--End mission vision area--> 

<!--Start Choose area--> 
<section class="choose-area">
    <div class="container">
        <div class="sec-title max-width text-center">
            <h3>Why Choose Us</h3>
            <h1>We’re committed to being fair and inclusive across our whole organisation</h1>
            <p>We believe in promoting equality, valuing diversity, and working inclusively. This is the world we want for our staff, volunteers and the people we help. It informs our campaigns. And it’s the heart of everything we do to protect and promote children’s rig</p>
        </div>
        <div class="row">
            <!--Start single choose box-->
            <div class="col-xl-3 col-lg-6 col-md-6 col-sm-12">
                <div class="single-choose-box text-center wow fadeInLeft" data-wow-delay="0ms" data-wow-duration="300ms">
                    <div class="count">
                        <span>01</span>
                    </div>
                    <div class="icon-holder">
                        <img src="./images/parallax-background/A1.jpg" alt="Signature">
                    </div>
                    <h3>Anti-racism action plan</h3>    
                </div>
            </div>
            <!--End single choose box-->
            <!--Start single choose box-->
            <div class="col-xl-3 col-lg-6 col-md-6 col-sm-12">
                <div class="single-choose-box text-center wow fadeInLeft" data-wow-delay="0ms" data-wow-duration="600ms" style="height: 320px">
                    <div class="count">
                        <span>02</span>
                    </div>
                    <div class="icon-holder">
                        <img src="./images/parallax-background/A2.jpg" alt="Signature">
                    </div>
                    <h3>The gender pay gap</h3>    
                </div>
            </div>
            <!--End single choose box-->
            <!--Start single choose box-->
            <div class="col-xl-3 col-lg-6 col-md-6 col-sm-12">
                <div class="single-choose-box text-center wow fadeInLeft" data-wow-delay="0ms" data-wow-duration="900ms">
                    <div class="count">
                        <span>03</span>
                    </div>
                    <div class="icon-holder">
                        <img src="./images/parallax-background/B3.jpg" alt="Signature">
                    </div>
                    <h3>Modern slavery statement</h3>    
                </div>
            </div>
            <!--End single choose box-->
            <!--Start single choose box-->
            <div class="col-xl-3 col-lg-6 col-md-6 col-sm-12">
                <div class="single-choose-box text-center wow fadeInLeft" data-wow-delay="0ms" data-wow-duration="1200ms">
                    <div class="count">
                        <span>04</span>
                    </div>
                    <div class="icon-holder">
                        <img src="./images/parallax-background/B2.jpg" alt="Signature">
                    </div>
                    <h3>Supporting staff and others</h3>    
                </div>
            </div>
            <!--End single choose box-->
        </div>
        <div class="row">
            <div class="col-xl-6">
                <div class="choose-carousel owl-carousel owl-theme" style="background-image: url(./images/parallax-background/choose-carousel-bg1.jpg);">
                    <div class="single-choose-item text-center">
                        <h6>Our vision, mission and values</h6>
                        <h3>Where your money goes</h3>
                        <p>Find out how we use your donations to make the greatest impact on children’s lives </p>
                    </div>
                    <div class="single-choose-item text-center">
                        <h6>Our vision, mission and values</h6>
                        <h3>Campaign with us</h3>
                        <p>Join us, take a stand and raise your voice for better and brighter childhoods</p>
                    </div>
                    <div class="single-choose-item text-center">
                        <h6>Our vision, mission and values</h6>
                        <h3>Our work and impact</h3>
                        <p>We help children across the UK to grow up safe and happy. We offer practical and emotional support to families.</p>
                    </div>
                </div>
            </div>
            <div class="col-xl-6">
                <div class="video-holder-box" style="background-image: url(./images/parallax-background/video-holder-bg1.jpg);">
                    <div class="icon-holder">
                        <div class="icon">
                            <div class="inner">
                                <a class="html5lightbox" title="Dento Video Gallery" href="https://www.youtube.com/watch?v=njXKJAbCrHY">
                                    <span class="flaticon-multimedia"></span>
                                </a>
                            </div>   
                        </div>
                    </div>    
                </div>
            </div>
        </div>
    </div>
</section> 

<%@include file="/Views/Footer.jsp" %>
        <jsp:include page="/Views/LinkFooter.jsp"/>

</body>

<!-- Mirrored from st.ourhtmldemo.com/new/Dento/about.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 05 Jan 2021 02:06:30 GMT -->
</html>