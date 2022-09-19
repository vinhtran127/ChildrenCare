<%-- 
    Document   : changePass
    Created on : Mar 14, 2022, 3:26:40 PM
    Author     : vinh2
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       	<meta charset="UTF-8">
        <title>Change password</title>

        <!-- responsive meta -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- For IE -->
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <style>
            *{
                padding:0px;
                margin:0px;
                color:#808080;
                font-family:arial;
                box-sizing:border-box;
            }
            body{
                background-color:#0062c4;
            }
            a{
                text-decoration:none;
            }
            .link{
                color: gray;
                font-weight: 600;
            }
            p{
                margin:5px 0px;
            }
            .box{
                width:400px;
                height:auto;
                margin:0 auto;
                background-color:white;
            }
            .inner-box{
                padding:20px;
            }
            .box h1,h2,h3,h4,h5,h6{
                text-align:center;
                margin:5px 0px;
            }
            .forgot{
                float:right;
            }
            input[type="text"],input[type="password"],input[type="submit"],input[type="email"]{
                width:100%;
                padding:10px;
                margin:10px 0px;
                border:2px solid #c0c0c0;
            }
            input[type="submit"]{
                border:1px solid #32b6a1 !important;
                background-color:#32b6a1 !important;
                color:white;
                font-size:16px;
                font-weight:600;
                cursor:pointer;
            }
        </style>
        <jsp:include page="../Views/LinkHeader.jsp"/>
    </head>
    <body>
        <jsp:include page ="../Views/Header.jsp"/>
        <!-- Page Header Start -->
        <div class="container-fluid bg-secondary mb-5">
            <div class="d-flex flex-column align-items-center justify-content-center" style="min-height: 300px">
                <h1 class="font-weight-semi-bold text-uppercase mb-3">Change Password</h1>
                <div class="d-inline-flex">
                    <p class="m-0"><a href="">Home</a></p>
                    <p class="m-0 px-2">-</p>
                    <p class="m-0">Change Password</p>
                </div>
            </div>
        </div>
        <!-- Page Header End -->

        <div class="box">

            <div class="inner-box">

                <form action="ChangePassword" method="post">

                    <h2>Change your pass</h2>

                    <input  name= "oldpass" type="password" placeholder="Old password" required />
                    <input name="newpass" type="password" placeholder="New password" required />
                    <input name="reNewpass" type="password" placeholder="Re-enter new pass" required />
                    <p class="text-warning">${messAlert}</p>
                    <p class="text-warning">${messSuccess}</p>
                    <input type="submit" value="Save" />

                </form>

            </div>
        </div>
        <jsp:include page="../Views/Footer.jsp"/>
        <!-- /.End Of Color Palate -->
        <jsp:include page="../Views/LinkFooter.jsp"/>
    </body>
</html>
