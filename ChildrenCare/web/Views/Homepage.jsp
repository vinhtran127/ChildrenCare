<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <jsp:include page="/Views/LinkHeader.jsp"/>
        <meta charset="UTF-8">
        <title>Home</title>
        <jsp:useBean id="daoService" class="dao.ServiceDao" scope="request"/>
        <jsp:useBean id="daoPost" class="dao.PostDao" scope="request"/>
    </head>
    <body>
        <%@include file="/Views/Header.jsp" %>
        <section class="services-style1-area sec-pd1">
            <div class="container">
                <div class="sec-title max-width text-center">
                    <h3>Family Focused</h3>
                    <h1>Child Centered</h1>
                    <p>Children's Health Care of Newburyport and Haverhill provides comprehensive pediatric health care from birth to young adulthood. </p>
                </div>
                <div class="row">
                    <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12">
                        <div class="services-carousel owl-carousel owl-theme">
                            <c:forEach var="x" items="${listService}">
                                <div>
                                    <div class="single-solution-style1">
                                        <div class="img-holder" style="width: 100%; height: 200px;">
                                            <img src="${x.thumbnail}" alt="Awesome Image">                                        
                                        </div>
                                        <div class="text-holder"style="width: 100%; height: 250px;">
                                            <h3>${x.name}</h3>
                                            <p>${x.shortDescription}</p>
                                            <div class="readmore">
                                                <a href="#"><span class="flaticon-next"></span></a>
                                                <div class="overlay-button">
                                                    <a href="#">Read More</a>    
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach> 
                        </div>
                    </div>
                </div> 
            </div>
        </section>
        <section class="highlights-area">
            <div class="container">
                <div class="row">
                    <div class="col-xl-12 wow fadeInUp" data-wow-delay="600ms">
                        <div class="single-box float-left text-center">
                            <div class="icon-holder">
                                <span class="icon-support-1"></span>    
                            </div>
                            <h3>E-Consultation</h3> 
                            <span class="border-box"></span>
                            <p>To take  trivial example, which undertakes laborious.</p> 
                            <a href="#">Start From Here</a>  
                        </div>
                        <div class="single-middle-box float-left text-center">
                            <div class="icon-holder">
                                <span class="icon-support-1"></span>    
                            </div>
                            <h3>E-Consultation</h3>
                            <form name="visit-form" action="" method="post">
                                <div class="row mar-ninus10">
                                    <div class="col-xl-4 pd10">
                                        <div class="input-box">   
                                            <input type="text" name="form_name" value="" placeholder="Name" required="">
                                        </div>
                                    </div>
                                    <div class="col-xl-4 pd10">
                                        <div class="input-box">   
                                            <input type="text" name="form_phone" value="" placeholder="Phone">
                                        </div>
                                    </div>
                                    <div class="col-xl-4 pd10">
                                        <div class="input-box">
                                            <select class="selectmenu" name="service">
                                                <c:forEach var="x" items="${listService}">
                                                    <option value="${x.id}">${x.name}</option>
                                                </c:forEach>

                                            </select>
                                        </div>
                                    </div>
                                </div>
                                <div class="row mar-ninus10">
                                    <div class="col-xl-4 pd10">
                                        <div class="input-box">
                                            <input type="text" name="time" placeholder="Time">
                                            <div class="icon-box">
                                                <i class="fa fa-clock-o" aria-hidden="true"></i>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-xl-4 pd10">
                                        <div class="input-box">
                                            <input type="text" name="date" placeholder="Date" id="datepicker">
                                            <div class="icon-box">
                                                <i class="fa fa-calendar" aria-hidden="true"></i>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-xl-4 pd10">
                                        <div class="input-box">
                                            <input type="text" name="number" value="" placeholder="Number">
                                        </div>
                                    </div>
                                </div>
                                <div class="row mar-ninus10" >        
                                    <div class="col-xl-4 pd10">

                                    </div>
                                    <div class="col-xl-4 pd10">
                                        <div class="button-box">
                                            <button class="btn-one" type="submit">Submit Info</button>   
                                        </div>
                                    </div>
                                </div>
                            </form>     
                        </div>
                        <div class="single-box float-right text-center">
                            <div class="icon-holder">
                                <span class="icon-support-1"></span>    
                            </div>
                            <h3>Find a Doctor</h3> 
                            <span class="border-box"></span>
                            <p>To take  trivial example, which undertakes laborious.</p> 
                            <a href="Reservation">Meet Our Team</a>  
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <section class="latest-blog-area sec-pd1">
            <div class="container inner-content">
                <div class="sec-title max-width text-center">
                    <h3>Read Our</h3>
                    <h1>Latest From Our Blog</h1>
                </div>
                <div class="row">
                    <c:forEach var="x" items="${listPost}">
                        <div class="col-xl-4  col-md-12 col-sm-12">
                            <div class="single-blog-post">
                                <div class="img-holder" style="width: 100%; height: 200px;">
                                    <img src="${x.thumbnailLink}" alt="Awesome Image" >
                                    <div class="categorie-button">
                                        <a class="btn-one" href="#">${x.category}</a>    
                                    </div>
                                </div>
                                <div class="text-holder"style="width: 100%; height: 450px;">
                                    <div class="meta-box">
                                        <div class="author-thumb">
                                            <img src="./images/blog/author-1.png" alt="Image">
                                        </div>
                                        <ul class="meta-info">           
                                            <li><a href="#">${x.author}</a></li>
                                            <li><a href="#">${x.datePublic}</a></li>
                                            
                                        </ul>    
                                    </div>
                                    <h3 class="blog-title"><a href="PostDetail?index=${x.id}">${x.title}</a></h3> 
                                    <div class="text-box">
                                        <p>${x.content}</p>
                                    </div>
                                    <div class="readmore-button">
                                        <a class="btn-two" href="PostDetail?index=${x.id}"><span class="flaticon-next"></span>Continue REading</a>
                                    </div>  
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </section>
<%--       <section class="works-area">
            <div class="container wow fadeInUp" data-wow-delay="0ms" data-wow-duration="1500ms">
                <div class="sec-title max-width text-center">
                    <h3>Body and Mind</h3>
                    <h1>Our Services</h1>
                </div>
                <div class="row">
                    <div class="col-xl-12">
                        <div class="works-content">
                            <div class="works-tab-box">
                                <div class="tabmenu-box text-center">
                                    <ul class="tab-btns tab-buttons">
                                        <c:forEach var="x" items="${listService}" varStatus="loop">
                                            <li class=" p-tab-btn active-btn" data-tab="#p-tab-${loop.index}" style="margin-top: 20px;"><span>${x.name}</span></li>
                                        </c:forEach>

                                    </ul>
                                </div>
                                <div class="tab-content-box">
                                    <c:forEach begin="1" end="5" varStatus="loop">
                                        <div class="single-tab-content " id="p-tab-${loop.index}">
                                            <div class="tab-content-carousel owl-carousel owl-theme">
                                                <div class="single-item">
                                                    <div class="row mar0">
                                                        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 pd0">
                                                            <div class="img-holder">
                                                                <img src="./images/resources/teeth-before-1.jpg" alt="Awesome Image">
                                                                <div class="before">
                                                                    <a href="#">Before</a>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 pd0">
                                                            <div class="img-holder">
                                                                <img src="./images/resources/teeth-after-1.jpg" alt="Awesome Image">
                                                                <div class="after">
                                                                    <a href="#">After</a>
                                                                </div>
                                                            </div>    
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="single-item">
                                                    <div class="row mar0">
                                                        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 pd0">
                                                            <div class="img-holder">
                                                                <img src="./images/resources/teeth-before-1.jpg" alt="Awesome Image">
                                                                <div class="before">
                                                                    <a href="#">Before</a>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 pd0">
                                                            <div class="img-holder">
                                                                <img src="./images/resources/teeth-after-1.jpg" alt="Awesome Image">
                                                                <div class="after">
                                                                    <a href="#">After</a>
                                                                </div>
                                                            </div>    
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="single-item">
                                                    <div class="row mar0">
                                                        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 pd0">
                                                            <div class="img-holder">
                                                                <img src="./images/resources/teeth-before-1.jpg" alt="Awesome Image">
                                                                <div class="before">
                                                                    <a href="#">Before</a>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 pd0">
                                                            <div class="img-holder">
                                                                <img src="./images/resources/teeth-after-1.jpg" alt="Awesome Image">
                                                                <div class="after">
                                                                    <a href="#">After</a>
                                                                </div>
                                                            </div>    
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section> --%>
        <section class="testimonial-area">
            <div class="container inner-content">
                <div class="row">
                    <div class="col-xl-12">
                        <div class="sec-title float-left">
                            <h3>Feedback</h3>
                            <h1>What Our Customers Say?</h1>
                        </div> 
                        <div class="button float-right">
                            <a class="btn-one" href="#">Read More</a>
                        </div>   
                    </div>
                </div>
                <div class="row">
                    <div class="col-xl-12">
                        <div class="testimonial-carousel owl-carousel owl-theme">
                            <!--Start Single Testimonial Item-->
                            <div class="single-testimonial-item text-center">
                                <div class="text-holder">
                                    <p>It was an experience of lifetime with you guys….it is definitely the best dental clinic I have ever visited.</p>
                                    <div class="img-holder">
                                        <img src="./images/testimonial/1.png" alt="Awesome Image">
                                    </div>
                                </div>
                                <div class="name">
                                    <h3>Erick Frederick</h3>
                                    <span>Denver</span>
                                </div>    
                            </div>    
                            <!--End Single Testimonial Item-->
                            <!--Start Single Testimonial Item-->
                            <div class="single-testimonial-item text-center">
                                <div class="text-holder">
                                    <p>Now I’ve got my tooth back, I can eat anything I like again.  I would recommend dento centre to everyone.</p>
                                    <div class="img-holder">
                                        <img src="./images/testimonial/2.png" alt="Awesome Image">
                                    </div>
                                </div>
                                <div class="name">
                                    <h3>Evelynne Celie</h3>
                                    <span>Houston</span>
                                </div>    
                            </div>    
                            <!--End Single Testimonial Item-->

                            <!--Start Single Testimonial Item-->
                            <div class="single-testimonial-item text-center">
                                <div class="text-holder">
                                    <p>It was an experience of lifetime with you guys….it is definitely the best dental clinic I have ever visited.</p>
                                    <div class="img-holder">
                                        <img src="./images/testimonial/1.png" alt="Awesome Image">
                                    </div>
                                </div>
                                <div class="name">
                                    <h3>Erick Frederick</h3>
                                    <span>Denver</span>
                                </div>    
                            </div>    
                            <!--End Single Testimonial Item-->
                            <!--Start Single Testimonial Item-->
                            <div class="single-testimonial-item text-center">
                                <div class="text-holder">
                                    <p>Now I’ve got my tooth back, I can eat anything I like again.  I would recommend dento centre to everyone.</p>
                                    <div class="img-holder">
                                        <img src="./images/testimonial/2.png" alt="Awesome Image">
                                    </div>
                                </div>
                                <div class="name">
                                    <h3>Evelynne Celie</h3>
                                    <span>Houston</span>
                                </div>    
                            </div>    
                            <!--End Single Testimonial Item-->

                            <!--Start Single Testimonial Item-->
                            <div class="single-testimonial-item text-center">
                                <div class="text-holder">
                                    <p>It was an experience of lifetime with you guys….it is definitely the best dental clinic I have ever visited.</p>
                                    <div class="img-holder">
                                        <img src="./images/testimonial/1.png" alt="Awesome Image">
                                    </div>
                                </div>
                                <div class="name">
                                    <h3>Erick Frederick</h3>
                                    <span>Denver</span>
                                </div>    
                            </div>    
                            <!--End Single Testimonial Item-->
                            <!--Start Single Testimonial Item-->
                            <div class="single-testimonial-item text-center">
                                <div class="text-holder">
                                    <p>Now I’ve got my tooth back, I can eat anything I like again.  I would recommend dento centre to everyone.</p>
                                    <div class="img-holder">
                                        <img src="./images/testimonial/2.png" alt="Awesome Image">
                                    </div>
                                </div>
                                <div class="name">
                                    <h3>Evelynne Celie</h3>
                                    <span>Houston</span>
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


</html>
