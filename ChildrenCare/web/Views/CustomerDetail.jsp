<%-- 
    Document   : CustomerDetail
    Created on : May 25, 2022, 3:34:27 PM
    Author     : Nguyen Minh Hoang
--%>
<%@page import="Models.User"%>
<%@page import="Models.User"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <!-- Mirrored from st.ourhtmldemo.com/new/Dento/blog.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 05 Jan 2021 02:07:28 GMT -->
    <head>
        <meta charset="UTF-8">
        <title>Blog</title>


        <jsp:include page="/Views/LinkHeader.jsp"/>
        <jsp:useBean id="daoPost" class="dao.PostDao" scope="request"/>
        <jsp:useBean id="daoService" class="dao.ServiceDao" scope="request"/>
        <jsp:useBean id="daoUser" class="dao.UserDao" scope="request"/>
        <jsp:useBean id="history" class="dao.UserDao" scope="request"/>
        <style>
            body{
                margin-top:20px;
                background:#f5f7fa;
            }
            .panel.panel-default {
                border-top-width: 3px;
            }
            .panel {
                box-shadow: 0 3px 1px -2px rgba(0,0,0,.14),0 2px 2px 0 rgba(0,0,0,.098),0 1px 5px 0 rgba(0,0,0,.084);
                border: 0;
                border-radius: 4px;
                margin-bottom: 16px;
            }
            .thumb96 {
                width: 96px!important;
                height: 96px!important;
            }
            .thumb48 {
                width: 48px!important;
                height: 48px!important;
            }
        </style>
    </head>

    <body>
        <%@include file="/Views/Header.jsp" %>   

        <!--Start breadcrumb area-->     
        <section class="breadcrumb-area" style="background-image: url(./images/resources/breadcrumb-bg.jpg); margin-bottom: 30px;" >
            <div class="container">
                <div class="row">
                    <div class="col-xl-12">
                        <div class="inner-content clearfix">
                            <div class="title float-left">
                                <h2>Post</h2>
                            </div>
                            <div class="breadcrumb-menu float-right">
                                <ul class="clearfix">
                                    <li><a href="Homepage.jsp">Home</a></li>
                                    <li><i class="fa fa-angle-right" aria-hidden="true"></i></li>
                                    <li class="active">Customer Detail</li>
                                </ul>    
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <div class="container bootstrap snippets bootdey">
            <div class="row ng-scope">
                <div class="col-md-4">
                    <div class="panel panel-default">
                        <div class="panel-body text-center">
                            <div class="pv-lg"><img class="center-block img-responsive img-circle img-thumbnail thumb96" 
                                                    src="${User.getImage()}" alt="Image"></div>
                            <h3 class="m0 text-bold">${User.getFullName()}</h3>
                            <div class="mv-lg">
                                <p>Hello, I'm a just a dummy contact in your contact list and this is my presentation text. Have fun!</p>
                            </div>
                            <!--                            <div class="text-center"><a class="btn btn-primary" href="">Send message</a></div>-->
                        </div>
                    </div>
                    <div class="panel panel-default hidden-xs hidden-sm">
                        <div class="panel-heading">
                            <div class="panel-title text-center">Recent Changed History</div>
                        </div>
                        <c:forEach var="h" items="${history.historyUserEdit}">
                            <div class="panel-body">
                                <div class="media">
                                    <div class="media-left media-middle">
                                        <a href="CustomerDetail?id=${h.user.getId()}"><img class="media-object img-circle img-thumbnail thumb48" src="${h.user.getImage()}" alt="Contact"></a>
                                    </div>
                                    <div class="media-body pt-sm">
                                        <div class="text-bold">${h.user.getFullName()}
                                            <div class="text-sm text-muted">${h.dob} ago</div>
                                            <fmt:parseDate value = "${h.dob}" var = "parsedMyDate" pattern = "yyyy-MM-dd" />
                                            <c:out value = "${parsedMyDate}" />
                                        </div>
                                    </div>
                                </div>                            
                            </div>
                        </c:forEach>

                    </div>
                </div>
                <div class="col-md-8">
                    <div class="panel panel-default">
                        <div class="panel-body">

                            <div class="h4 text-center">Customer Detail</div>
                            <div class="row pv-lg">
                                <div class="col-lg-2"></div>
                                <div class="col-lg-8">
                                    <form class="form-horizontal ng-pristine ng-valid" method="post" enctype="multipart/form-data" >
                                        <input  type="hidden" name="id" value="${User.getId()}"/>

                                        <div class="form-group">
                                            <label class="col-sm-2 control-label" for="inputContact3">FullName</label>
                                            <div class="col-sm-10">
                                                <input <c:if test="${roleCheck==1 and unknown =='none'}"> readonly</c:if> required="" pattern="[a-zA-Z\s]+"
                                                                                                          class="form-control" name="FullName"  type="text" value="${User.getFullName()==null?"":User.getFullName()}">
                                            </div>
                                        </div>
                                        <div class="form-group" style="display: flex; justify-content: space-between;">
                                            <label  class="col-sm-2 control-label" for="male">Male</label>
                                            <div class="col-sm-5">
                                                <input <c:if test="${roleCheck==1and unknown =='none'}"> readonly style="pointer-events: none;" </c:if>  type="radio"
                                                                                                         name="gender" id="male" value="true" <c:if test="${User.isGender()}">checked</c:if>>
                                                </div>
                                                <label  class="col-sm-2 control-label" for="female">Female</label>
                                                <div class="col-sm-5">
                                                    <input <c:if test="${roleCheck==1and unknown =='none'}"> readonly style="pointer-events: none;"</c:if>    type="radio"
                                                                                                         name="gender" id="female" value="false" <c:if test="${User.isGender()==false}">checked</c:if>>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label" for="inputContact2">Email</label>
                                                <div class="col-sm-10">
                                                    <input <c:if test="${roleCheck==1and unknown =='none'}"> readonly</c:if> required="" class="form-control" name="email" 
                                                                                                         type="email" value="${User.getEmail()}">
                                            </div>
                                        </div>
                                        <% User user = (User) request.getSession().getAttribute("user");
                                            int RoleUser = user.getRole().getId();
                                        %>
                                        <div class="form-group" style="display: ${unknown==null?block:unknown}<%if (RoleUser == 1) {%> display:block;<%}%>" >
                                            <label class="col-sm-2 control-label" for="role">Role ID</label>
                                            <div class="col-sm-10">

                                                <select id="role" name="role"class="form-control">


                                                    <% if (RoleUser == 1) {%>
                                                    <c:forEach var="x" items="${daoUser.allRole}">
                                                        <option <c:if test="${User.getRole().getId() == x.id}">selected=""</c:if> value="${x.id}">${x.name}</option>   
                                                    </c:forEach>
                                                    <%} else {%>
                                                    <option selected value="${User.getRole().getId()}">${User.getRole().getName()}</option>   
                                                    <%}%>


                                                </select>
                                            </div>

                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label" for="inputContact4">Phone</label>
                                            <div class="col-sm-10">

                                                <input <c:if test="${roleCheck==1and unknown =='none'}"> readonly </c:if> pattern="^[0]{1}[0-9]{9}$"
                                                                                                         class="form-control"name="phone"  type="tel" value="${User.getMobile()}">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label" for="inputContact5">UserName</label>
                                            <div class="col-sm-10">
                                                <input <c:if test="${roleCheck==1and unknown =='none'}"> readonly</c:if> required=""  class="form-control" name="username" 
                                                                                                         pattern="[a-zA-Z\s]+"  type="text" value="${User.getUsername()}">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label" for="inputContact6">Password</label>
                                            <div class="col-sm-10">
                                                <input <c:if test="${roleCheck==1and unknown =='none'}"> readonly</c:if> required=""  class="form-control" name="password" 
                                                                                                         type="text" value="${User.getPassword()}">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label" for="inputContact7">Status</label>
                                            <div class="col-sm-10">
                                                <input class="form-control"  required="" name="status"  pattern="[1-3]{1}" title="Must be 1-4"
                                                       value="${User.status}">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label" for="inputContact8">Address</label>
                                            <div class="col-sm-10">
                                                <input <c:if test="${roleCheck==1and unknown =='none'}"> readonly</c:if>  class="form-control"
                                                                                                         name="address"  type="text" value="${User.getAddress()}">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label" for="inputContact9">Image</label>
                                            <div class="col-sm-10">
                                                <%--<input id="picture" type="file" name="picture"  accept="image/*"  required="" value="" />
                                                <input style="display: none;" id="empty" type="text" value="" name="img"/> --%>
                                                <img  id = "avatar"  alt="image" src="${User.getImage()}" style="width: 500px; height: 300px"/>
                                                <c:set var="imageName" value="${fn:split(User.getImage(), '/')}" />
                                                <input value="${imageName[3]}" type="text" hidden="hidden" name = "old_img_blog"/>
                                                <input <c:if test="${roleCheck==1and unknown =='none'}"> disabled=""</c:if> type="file" onchange="getImgPreview_profileUser(event)" name = "img_blog" class="text-center center-block file-upload">
                                            </div>
                                        </div>
                                        <input style="display: none;" id="updateAdd" type="text"  name="checkAdd"/><!--check-->
                                        <div class="form-group">
                                            <div class="col-sm-offset-2 col-sm-10">
                                                <button id="submit" onclick="submitForm()" class="btn btn-info" type="submit">
                                                    <c:choose>
                                                        <c:when test="${AddNew==1}"> 
                                                            Add New User
                                                        </c:when>
                                                        <c:otherwise>
                                                            Update
                                                        </c:otherwise>

                                                    </c:choose> </button>
                                            </div>
                                        </div>
                                    </form>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%@include file="/Views/Footer.jsp" %>
        <!-- /.End Of Color Palate -->
        <jsp:include page="/Views/LinkFooter.jsp"/>

    </body>
    <script>
        function  submitForm() {
            //var image = document.getElementById("picture").value;
            var checkSubmit = document.getElementById("submit").innerHTML;
            //var empty = document.getElementById("empty");
            //var words = image.split('\\');
            //empty.innerHTML=words[words.length - 1];
            //document.getElementById("empty").setAttribute('value', words[words.length - 1]);
            if (checkSubmit.includes("Update")) {
                document.getElementById("updateAdd").setAttribute('value', "update");
                confirm("Do you want to edit customer?");
                //console.log(words[words.length - 1]);
            } else {
                //                var input = document.createElement("input");
                //                input.type = "text";
                //                input.className = "checkAdd"; // set the CSS class
                //                input.style.display = none;
                //                input.name = "checkAdd";
                //                input.value = "addMore";
                //                container.appendChild(input); // put it into the DOM
                document.getElementById("updateAdd").setAttribute('value', "add");
                confirm("Do you want to add more customer?");
            }
        }
        function getImgPreview_profileUser(event) {
            var image = URL.createObjectURL(event.target.files[0]);
            var imagediv = document.getElementById("avatar");
            imagediv.setAttribute('src', image);
        }
    </script>

</html>
