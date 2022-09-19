<%-- 
    Document   : PostDetail
    Created on : May 16, 2022, 10:59:43 PM
    Author     : Nguyen Minh Hoang
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <!-- Mirrored from st.ourhtmldemo.com/new/Dento/blog-single.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 05 Jan 2021 02:08:35 GMT -->
    <head>
        <meta charset="UTF-8">
        <title>Post Detail</title>

        <!-- responsive meta -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- For IE -->
        <meta http-equiv="X-UA-Compatible" content="IE=edge">

        <jsp:include page="/Views/LinkHeader.jsp"/>
        <jsp:useBean id="daoPost" class="dao.PostDao" scope="request"/>
        <jsp:useBean id="daoService" class="dao.ServiceDao" scope="request"/>
    </head>

    <body>
        <%@include file="/Views/Header.jsp" %>   

        <!--Start breadcrumb area-->     
        <section class="breadcrumb-area" style="background-image: url(./images/resources/breadcrumb-bg.jpg);">
            <div class="container">
                <div class="row">
                    <div class="col-xl-12">
                        <div class="inner-content clearfix">
                            <div class="title float-left">
                                <h2>Single Post</h2>
                            </div>
                            <div class="breadcrumb-menu float-right">
                                <ul class="clearfix">
                                    <li><a href="Homepage.jsp">Home</a></li>
                                    <li><i class="fa fa-angle-right" aria-hidden="true"></i></li>
                                    <li class="active">Post Detail</li>
                                </ul>    
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!--End breadcrumb area-->    

        <!--Start blog area-->
        <section id="blog-area" class="blog-single-area">
            <div class="container">
                <div class="row">
                    <div  class="col-xl-8 col-lg-8 col-md-12 col-sm-12">
                        <div class="blog-post">
                            <!--Start Single blog Post-->
                            <div class="single-blog-post single_post">
                                <div class="top-box">
                                    <div class="left post-info-style1">
                                        <c:set var = "string1" value = "${post.getDatePublic()}"/>
                                        <c:set var = "month" value = "${fn:split(string1, ' ')}" />
                                        <h3>${month[0]}</h3>
                                        <div class="borders"></div>
                                        <p>${month[1]}</p>    
                                    </div>
                                    <div class="right">
                                        <div class="title-holder">
                                            <h3 class="blog-title">${post.getTitle()}</h3> 
                                        </div>
                                        <div class="meta-box">
                                            <ul class="meta-info">
                                                <li><a href="#"><span class="flaticon-pencil"></span>${post.getAuthor()}</a></li>
                                                <li><a href="#"><span class="flaticon-document"></span>${post.category.name}</a></li>
                                                <li><a href="#"><span class="flaticon-comment"></span>0 Comments</a></li>
                                            </ul>    
                                        </div>
                                    </div>
                                </div>
                                <div class="single-post-image">
                                    <div class="image-box">
                                        <img src="${post.getThumbnailLink()}" alt="Awesome Image">
                                    </div>
                                </div>
                                <div class="text-box1">
                                    <p style="color: hsl(0,0%,16%);font-family:PublicoText;font-size:18px;line-height:27px;margin:24px 0px">${post.getDescription()}</p>    
                                </div>                              
                                <div class="tag-holder-box">
                                    <div class="left float-left">
                                        <h5>Tags:</h5> 
                                        <ul>
                                            <li><a href="#">Regular Clean</a></li>
                                            <li><a href="#">Surgery</a></li>
                                            <li><a href="#">Cosmetic</a></li>
                                        </ul>   
                                    </div>
                                    <%--<div class="right float-right">
                                        <p><i class="fa fa-heart-o" aria-hidden="true"></i>2 Likes</p>    
                                    </div>--%>
                                </div>
                                <div class="author-box-holder">
                                    <div class="inner-box">
                                        <div class="img-box">
                                            <img src="./images/blog/author.png" alt="Awesome Image">
                                        </div>
                                        <div class="text">
                                            <h3>${post.getAuthor()}</h3>
                                            <p>Denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness.</p>
                                            <div class="author-social-links">
                                                <ul class="sociallinks-style-one">
                                                    <li><a href="#"><i class="fa-brands fa-facebook"></i></a></li>
                                                    <li><a href="#"><i class="fa-brands fa-twitter"></i></a></li>
                                                    <li><a href="#"><i class="fa-brands fa-skype"></i></a></li>
                                                    <li><a href="#"><i class="fa-brands fa-linkedin"></i></a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="blog-prev-next-option">
                                    <c:forEach var="x" items="${PreNextPost}" varStatus="loop">
                                        <div class="single prev">
                                            <div class="image-thumb">
                                                <img src="${x.thumbnailLink}" alt="Image">
                                            </div>
                                            <div class="title">
                                                <h3>${x.title}</h3>
                                                <a href="PostDetail?index=${x.id}">
                                                    <c:choose>
                                                        <c:when test="${loop.index==0}">
                                                           <i class="fa fa-angle-double-left" aria-hidden="true"></i> Previous Post
                                                        </c:when>
                                                        <c:otherwise>
                                                           Next Post <i class="fa fa-angle-double-right" aria-hidden="true"></i> 
                                                        </c:otherwise>
                                                    </c:choose>
                                                </a>
                                            </div>
                                        </div>
                                    </c:forEach> 

                                </div>
                               <%-- <div class="inner-comment-box">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="single-blog-title-box">
                                                <h2>Read Comments</h2>
                                            </div>
                                            <!--Start single comment box-->
                                            <div class="single-comment-box">
                                                <div class="img-holder">
                                                    <img src="./images/blog/comment-1.jpg" alt="Awesome Image">
                                                </div>
                                                <div class="text-holder">
                                                    <div class="top">
                                                        <div class="date"style="display: flex; flex-wrap: wrap;justify-content: space-between;">
                                                            <h5>Steven Rich – Sep 17, 2018:</h5>
                                                            <form method="post"style="float: right;" >
                                                                <input name="idToDelete" value="${x.id}" style="display: none">
                                                                <button class=" remove-icon"  name="action" value="delete"><i class="fa-solid fa-xmark"></i></i></button>  
                                                            </form>
                                                        </div>

                                                    </div>
                                                    <div class="text">
                                                        <p>Omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam eaque ipsa quae ab illo inventore veritatis et quasi architecto.</p>
                                                    </div>
                                                    <div class="reply-button">
                                                        <a href="#"><span class="icon-reload"></span>Reply</a>
                                                    </div>
                                                </div>
                                            </div>
                                            <!--End single comment box-->
                                            <!--Start single comment box-->
                                            <div class="single-comment-box mar-left">
                                                <div class="img-holder">
                                                    <img src="./images/blog/comment-2.jpg" alt="Awesome Image">
                                                </div>
                                                <div class="text-holder">
                                                    <div class="top">
                                                        <div class="date">
                                                            <h5>William Cobus – Sep 17, 2018:</h5>

                                                        </div>

                                                    </div>
                                                    <div class="text">
                                                        <p>Voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque veritatis et quasi architecto beatae vitae dicta sunt explicabo.</p>
                                                    </div>
                                                    <div class="reply-button">
                                                        <a href="#"><span class="icon-reload"></span>Reply</a>
                                                    </div>
                                                </div>
                                            </div>
                                            <!--End single comment box-->


                                        </div>
                                    </div>
                                </div>
                                <div class="add-comment-box">
                                    <div class="single-blog-title-box">
                                        <h2>Leave Your Reply</h2>
                                    </div>
                                    <form id="add-comment-form" action="#">
                                        <div class="row">
                                            <div class="col-md-12">
                                                <div class="row">
                                                    <div class="col-md-4">
                                                        <input type="text" name="fname" value="" placeholder="Name*" required="">
                                                    </div>
                                                    <div class="col-md-4">
                                                        <input type="email" name="form_email" value="" placeholder="Email Address*" required="">
                                                    </div>
                                                    <div class="col-md-4">
                                                        <input type="text" name="website" value="" placeholder="Website">
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-12">
                                                        <textarea name="comment" placeholder="Comments*" required=""></textarea>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-12">
                                                        <button class="btn-one" type="submit">Submit Now</button>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </form>
                                </div>--%>
                            </div>
                            <!--End Single blog Post-->

                        </div>
                    </div>

                    <!-- sidebar Wrapper-->
                    <%@include file="/Views/SidebarWrapper.jsp" %> 


                </div>
            </div>
        </section> 
        <!--End blog area--> 


        <%@include file="/Views/Footer.jsp" %>

        <jsp:include page="/Views/LinkFooter.jsp"/>


    </body>

    <!-- Mirrored from st.ourhtmldemo.com/new/Dento/blog-single.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 05 Jan 2021 02:08:52 GMT -->
</html>
