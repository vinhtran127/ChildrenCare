<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Blog</title>
    
        <jsp:include page="/Views/LinkHeader.jsp"/>
        <jsp:useBean id="daoPost" class="dao.PostDao" scope="request"/>
        <jsp:useBean id="daoService" class="dao.ServiceDao" scope="request"/>
    </head>

    <body>
        <%@include file="/Views/Header.jsp" %>      
        <section class="breadcrumb-area" style="background-image: url(./images/resources/breadcrumb-bg.jpg);">
            <div class="container">
                <div class="row">
                    <div class="col-xl-12">
                        <div class="inner-content clearfix">
                            <div class="title float-left">
                                <h2>Post</h2>
                            </div>
                            <div class="breadcrumb-menu float-right">
                                <ul class="clearfix">
                                    <li><a href="HomePage">Home</a></li>
                                    <li><i class="fa fa-angle-right" aria-hidden="true"></i></li>
                                    <li class="active">Post</li>
                                </ul>    
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <section id="blog-area" class="blog-default-area">
            <div class="container">
                <div class="row" >
                    <div id="content" class="col-xl-8 col-lg-8 col-md-12 col-sm-12"style="display: flex;flex-wrap: wrap;" >   
                        
                            <c:forEach var="x" items="${listPost}" >                 
                                <div class="single-blog-post col-xl-6  col-lg-8 col-md-12 col-sm-12" style="justify-content: space-between;margin-bottom: 0; "   >                                        
                                        <div class="img-holder"style="width: 100%; height: 200px;  ">
                                            <img src="${x.thumbnailLink}" alt="Awesome Image">
                                            <div class="categorie-button">
                                                <a class="btn-one" href="#">${x.category.name}</a>    
                                            </div>
                                        </div>
                                        <div class="text-holder"style="width: 100%; height: 400px;">
                                            <div class="meta-box">
                                                <div class="author-thumb">
                                                    <img src="./images/blog/author-2.png" alt="Image">
                                                </div>
                                                <ul class="meta-info">
                                                    <li><a href="#">${x.author}</a></li>
                                                    <li><a href="#">${x.datePublic2}</a></li>
                                                </ul>    
                                            </div>
                                            <h3 class="blog-title"><a href="PostDetail?index=${x.id}">${x.title}</a></h3> 
                                            <div class="text-box">
                                                <p>${x.content}</p>
                                            </div>
                                            <div class="readmore-button">
                                                <a class="btn-two" href="PostDetail?index=${x.id}"><span class="flaticon-next"></span>Continue Reading</a>
                                            </div>  
                                        </div>   
                                    </div>
                             
                            </c:forEach>
                    </div>
                    <!-- sidebar Wrapper-->
                    <%@include file="/Views/SidebarWrapper.jsp" %> 
                
                
                    <div class="col-md-12"><!-- /.post-pagination -->
                        <ul class="post-pagination text-center">
                       
                            <li class="float-left"><a  href="Post?pageNumber1=${pageNumber==null?0:pageNumber}&categoryId=${categoryId}"><i class="fa-solid fa-angles-left" style="padding: 12px;"></i></a></li>
                            <li class="text-center">${pageNumber==0?pageNumber1+1:pageNumber+1} of ${totalPage+1}</li>
                            <li class="float-right"><a  href="Post?pageNumber=${pageNumber==null?0:pageNumber}&categoryId=${categoryId}"><i class="fa-solid fa-angles-right" style="padding: 12px;"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </section>
        <%@include file="/Views/Footer.jsp" %>
        <jsp:include page="/Views/LinkFooter.jsp"/>
    </body>
 
</html>
