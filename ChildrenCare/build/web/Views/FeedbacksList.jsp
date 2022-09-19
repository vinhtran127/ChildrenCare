<%-- 
    Document   : FeedbacksList
    Created on : 2-Jul-2022, 11:04:42 AM
    Author     : Nguyen Minh Hoang
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="Models.Feedback"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Feedbacks List</title>
        <jsp:include page="/Views/LinkHeader.jsp"/>
        <jsp:useBean id="daoPost" class="dao.PostDao" scope="request"/>
        <jsp:useBean id="daoService" class="dao.ServiceDao" scope="request"/>
        <style type="text/css">
            body{
                background-color: #eee;
            }
            div.stars {
                display: inline-block;
            }
            .mt-200{
                margin-top:200px;  
            }
            input.star { display: none; }
            label.star {
                float: right;
                padding: 10px;
                font-size: 18px;
                color: #6ab04c;
                transition: all .2s;
            }
            input.star:checked ~ label.star:before {
                content: '\f005';
                color: #FD4;
                transition: all .25s;
            }
            input.star-1:checked ~ label.star:before {
                color: #FE7;
                text-shadow: 0 0 20px #952;
            }
            input.star-5:checked ~ label.star:before { color: #F62; }
            label.star:hover { transform: rotate(-15deg) scale(1.3); }
            label.star:before {
                content: '\f006';
                font-family: FontAwesome;
            }
            .optionbox select {           
                color: hsl(219,22%,43%);
                padding: 10px;
                width: 100%;
                height: 38px;
                border: none;
                font-size: 15px;               
            }
        </style>
    </head>
    <body>
        <%@include file="/Views/Header.jsp" %>  
        <section class="breadcrumb-area" style="background-image: url(././images/resources/breadcrumb-bg.jpg);">
            <div class="container">
                <div class="row">
                    <div class="col-xl-12">
                        <div class="inner-content clearfix">
                            <div class="title float-left">
                                <h2>Feedbacks List</h2>
                            </div>
                            <div class="breadcrumb-menu float-right">
                                <ul class="clearfix">
                                    <li><a href="HomePage">Home</a></li>
                                    <li><i class="fa fa-angle-right" aria-hidden="true"></i></li>
                                    <li class="active">Feedbacks List</li>
                                </ul>    
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!--Start blog area-->
        <section id="blog-area" class="blog-large-area">
            <div class="container">
                <div class="row">
                    <div class="col-xl-8 col-lg-7 col-md-12 col-sm-12">
                        <div class="doctor-content" id="myText">
                            <!--Start Single doctor item-->
                            <c:forEach var="x" items="${ListFeedsBack}">
                                <div class="single-doctor-item wow fadeInUp" data-wow-delay="300ms">
                                    <div class="row">
                                        <div class="col-xl-5">
                                            <div class="img-holder">
                                                <img src="${x.user.getImage()}" alt="Awesome Image">
                                                <div class="overlay">
                                                    <div class="box">
                                                        <div class="content">
                                                            <a class="btn-one" href="#">Feedbacks Detail</a>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xl-7">
                                            <div class="text-holder">

                                                <span>${x.service.getFullname()}</span>
                                                <h3>${x.user.getFullName()}</h3>
                                                <p>${x.content}</p>
                                                <ul>
                                                    <li><span class="icon-phone"></span>${x.user.getMobile()}</li>
                                                    <li><span class="flaticon-e-mail-envelope"></span>${x.user.getEmail()}</li>
                                                </ul>
                                                <div class="d-flex">
                                                    <div class="stars">                                                   
                                                        <form action="">
                                                            <c:forEach  begin="1" end="5" varStatus="i">
                                                                <input disabled="" class="star star-${i.index}"<c:if test="${x.ratedStar == i.index}">checked</c:if> id="star-${i.index}" type="radio" name="star"/>
                                                                <label class="star star-${i.index}" for="star-${i.index}"></label>
                                                            </c:forEach>                                                       
                                                        </form>
                                                    </div>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                            ${end}

                            <nav aria-label="Page navigation example">
                                <ul class="pagination" style="justify-content: center;">
                                    <li class="page-item"><a class="page-link" href="FeedbacksList?indexPage=1&&sortby=${sortable}">First</a></li>
                                        <c:forEach begin="${pageIndex}" end="${pageIndex+2}" var="i">
                                        <li class="page-item"><a style="<c:if test="${end lt i}">pointer-events: none;</c:if>" class="page-link" href="FeedbacksList?indexPage=${i}&&sortby=${sortable}">${i}</a></li>
                                        </c:forEach>   
                                    <li class="page-item"><a class="page-link" href="FeedbacksList?indexPage=${end}&&sortby=${sortable}">Last</a></li>
                                </ul>
                            </nav>


                        </div>
                    </div>

                    <!--Start sidebar Wrapper-->
                    <div class="col-xl-4 col-lg-5 col-md-7 col-sm-12">
                        <div class="sidebar-wrapper">
                            <!--Start single sidebar-->
                            <div class="single-sidebar">
                                <form class="search-form" action="#">
                                    <input id="myInput" placeholder="Search" type="text">
                                    <button type="submit"><i class="fa fa-search" aria-hidden="true"></i></button>
                                </form>
                            </div>
                            <!--End single sidebar-->
                            <!--Start single sidebar-->
                            <div class="single-sidebar">
                                <div class="sidebar-title">
                                    <h3>Sortable</h3>
                                </div>
                                <ul class="categories clearfix">
                                    <li><a href="FeedbacksList?sortby=u.FullName">Full Name </a></li>
                                    <li><a href="FeedbacksList?sortby=sr.[Name]">Service Name </a></li>
                                    <li><a href="FeedbacksList?sortby=f.RatedStar">Rate Star </a></li>
                                    <li><a href="FeedbacksList?sortby=f.[Description]">Content </a></li>
                                </ul>
                            </div>
                            <div class="single-sidebar">
                                <div class="sidebar-title">
                                    <h3>Filter</h3>
                                </div>
                                <ul class="categories clearfix optionbox">
                                    <li>
                                        <select id="RateStar"> 
                                            <option  value="0">Rate Start</option>
                                            <c:forEach begin="1" end="5" varStatus="i">
                                                <option  value="${i.index}">${i.index}</option>
                                            </c:forEach>                                       
                                        </select>
                                    </li>
                                    <li>
                                        <select id="ServiceName"> 
                                            <option  value="0">Service</option>     
                                            <c:forEach var="x" items="${daoService.categoryService}">
                                                <option  value="${x.id}">${x.name}</option>
                                            </c:forEach>
                                        </select>
                                    </li>
                                    <li>
                                        <select id="Status"> 
                                            <option  value="1">Active</option>     
                                            <option  value="2">Inactive</option>
                                        </select>
                                    </li>
                                </ul>
                            </div>
                            <!--End single sidebar-->  
                        </div>    
                    </div>
                    <!--End Sidebar Wrapper-->
                </div>
            </div>
        </section> 
        <!--End blog area--> 

        <!--Start footer area-->  
        <%@include file="/Views/Footer.jsp" %>
        <jsp:include page="/Views/LinkFooter.jsp"/>     
        <!--End footer area-->
    </div>
    <script>
        $(document).ready(function () {
            $("#myInput").on("keyup", function () {
                var value = $(this).val().toLowerCase();
                $("#myText .single-doctor-item").filter(function () {
                    $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1);
                });
            });
        });
    </script>
</body>
</html>
