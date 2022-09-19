<%-- 
    Document   : Customer
    Created on : May 20, 2022, 11:39:48 PM
    Author     : Nguyen Minh Hoang
--%>
<%@page import="Models.User"%>
<%@page import="Models.User"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Customer</title>

        <jsp:include page="/Views/LinkHeader.jsp"/>

        <link href="./css/CustomerCss.css" rel="stylesheet" type="text/css"/>
        <jsp:useBean id="daoPost" class="dao.PostDao" scope="request"/>
        <jsp:useBean id="daoService" class="dao.ServiceDao" scope="request"/>
        <jsp:useBean id="daoUser" class="dao.UserDao" scope="request"/>
        <style type="text/css">
            .optionbox select {
                box-shadow: 0 5px 48px rgb(93, 15, 9);               
                color: hsl(219,22%,43%);
                padding: 10px;
                width: 172px;
                height: 38px;
                border: none;
                font-size: 15px;               
            }
        </style>
    </head>
    <body>
        <%@include file="/Views/Header.jsp" %>     
        <% User user = (User) request.getSession().getAttribute("user");
            int RoleUser = user.getRole().getId();
        %>
        <div class="container-xl">
            <div class="table-responsive">
                <div class="table-wrapper">
                    <div class="table-title">
                        <div class="row">
                            <div class="col-sm-5">
                                <h2>User <b>Management</b></h2>
                            </div>

                            <div class="col-sm-7">
                                <%if (RoleUser == 1) {%>
                                <a href="CustomerDetail" class="btn btn-secondary"><span>Add New User</span></a>	
                                <%}%> 
                                <div class="optionbox">
                                    <%if (RoleUser == 1) {%>
                                    <select id="GenderFunction"  > 
                                        <option <c:if test="${gender==-1}">selected</c:if> value="-1">Gender</option>
                                        <option <c:if test="${gender==1}">selected</c:if>  value="1">Male</option>
                                        <option <c:if test="${gender==0}">selected</c:if>  value="0">Female</option>
                                        </select>
                                        <select id="RoleFunction"> 
                                            <option <c:if test="${role==0}">selected</c:if>  value="0">Role</option>
                                        <option <c:if test="${role==1}">selected</c:if> value="1">Admin</option>
                                        <option <c:if test="${role==2}">selected</c:if> value="2">Manager</option>
                                        <option <c:if test="${role==3}">selected</c:if> value="3">Customer</option>
                                        <option <c:if test="${role==4}">selected</c:if> value="4">Staff</option>
                                        </select>
                                        <%}%> 
                                        <select id="StatusFunction"> 
                                            <option <c:if test="${status==0}">selected</c:if>  value="0">Status</option>
                                        <option <c:if test="${status==1}">selected</c:if> value="1">Active</option>
                                        <option <c:if test="${status==2}">selected</c:if> value="2">Inactive</option>
                                        <option <c:if test="${status==3}">selected</c:if> value="3">Suspended</option>
                                        </select>
                                    </div>
                                   


                            </div>

                        </div>
                    </div>
                    <div class="text-center form-group" >
                        <input style="width: 25%; padding: 10px;" oninput="searchUser(this)" name="postTitle" placeholder="Search..." type="text">
                    </div>
                    <table class="table table-striped table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Full Name</th>
                                    <%if (RoleUser == 1) {%>
                                <th>Role</th>
                                    <%}%>    
                                <th>Gender</th>
                                <th>Email</th>
                                <th>Phone Number</th>
                                <th>Status</th>
                                <th>Action</th>                       
                            </tr>
                        </thead>
                
                        <tbody id="content">                           
                       
                            <c:forEach var="x" items="${listCustomer}">
                                <tr>
                                    <td>${x.id}</td>
                                    <td><a href="CustomerDetail?id=${x.id}"><img style="max-width: 2%;" src="${x.image}" class="avatar" alt="Avatar"> ${x.fullName}</a></td>
                                            <%if (RoleUser == 1) {%>
                                    <td>${x.getRole().getName()}</td>
                                    <%}%>
                                    <td>
                                        <c:choose>
                                            <c:when test="${x.gender}">
                                                Male
                                            </c:when>                            
                                            <c:otherwise>
                                                Female
                                            </c:otherwise>                         
                                        </c:choose>
                                    </td>                        
                                    <td>${x.email}</td>
                                    <td>${x.mobile}</td>
                                    <td><span class="status 
                                              <c:choose>
                                                  <c:when test="${x.status == 1}">
                                                      text-success ">&bull;</span> Active </td>
                                              </c:when> 
                                              <c:when test="${x.status == 2}">
                                              text-warning ">&bull;</span> Inactive</td>
                                        </c:when>
                                        <c:otherwise>
                                            text-danger ">&bull;</span> Suspended</td>
                                        </c:otherwise>                         
                                    </c:choose>
                                    <td>
                                        <a href="CustomerDetail?id=${x.id}" class="settings" title="Settings" data-toggle="tooltip"><i class="fa fa-cog" aria-hidden="true"></i></a>
                                        <a href="CustomerDetail?id=${x.id}&action=delete" class="delete" title="Delete" data-toggle="tooltip"><i onclick="return confirm('are you sure?')" class="fa fa-trash" aria-hidden="true"></i></a>
                                    </td>
                                </tr>
                                </c:forEach>
                       
                                
                                
                        </tbody>
                    </table>
                    <div class="clearfix">
                        <div class="hint-text">Showing <b>
                                <c:choose>
                                    <c:when test="${totalUser<5}">
                                        
                                        ${totalUser}
                                    </c:when>
                                    <c:otherwise>
                                        5
                                    </c:otherwise>
                                </c:choose>

                            </b> out of <b>${totalUser}</b> entries</div>
                        <ul class="pagination">
                            <li class="page-item disabled"><a <c:if test="${check == 0}">style="pointer-events: none"</c:if>  href="Customer?action=previous&index=${check-1}&gender=${gender}&role=${role}&status=${status}">Previous</a></li>
                                <c:forEach begin="${start}" end="${end}" varStatus="loop">
                                <li class="page-item <c:if test="${check==loop.index}">active</c:if>"><a href="Customer?index=${loop.index}&gender=${gender}&role=${role}&status=${status}" <c:if test="${disable==1}">style="pointer-events: none"</c:if> class="page-link">${loop.index+1}</a></li>
                                </c:forEach>                           
                            <li class="page-item"><a href="Customer?action=next&index=${check}&gender=${gender}&role=${role}&status=${status}" <c:if test="${disable==1}">style="pointer-events: none"</c:if>  class="page-link">Next</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>     


        <%@include file="/Views/Footer.jsp" %>
        <jsp:include page="/Views/LinkFooter.jsp"/>
        <script type="text/javascript">

            $('#GenderFunction').on('change', function () {               
                let link = "Customer?gender=" + $('#GenderFunction').val() + "&&role=" + $('#RoleFunction').val() + "&&status=" + $('#StatusFunction').val();
                window.location.href = link;
            });
            $('#RoleFunction').on('change', function () {
                let link = "Customer?gender=" + $('#GenderFunction').val() + "&&role=" + $('#RoleFunction').val() + "&&status=" + $('#StatusFunction').val();
                window.location.href = link;

            });
            $('#StatusFunction').on('change', function () {
                let role =$('#RoleFunction').val();
                let gender = $('#GenderFunction').val();
                
                if(role === undefined){
                    role = "0";
                }
                if(gender === undefined){
                    gender ="-1";
                }
                
                let link = "Customer?gender=" + gender + "&&role=" + role + "&&status=" + $('#StatusFunction').val();
                window.location.href = link;

            });
            function searchUser(para) {
                var textSearch = para.value;

                $.ajax({
                    url: "/ChildrenCare/SearchUser",
                    type: 'get',
                    data: {
                        txt: textSearch
                    },
                    success: function (response) {
                        console.log(response);
//                var row = document.getElementById("content");
//                row.innerHTML = "<h1>hoang</h1>";
                        response.forEach(item =>{
                            var gender='';
                            var status='';
                            if(item['gender'] === true){
                                gender = 'Male';
                            }else{
                                gender = 'Female';
                            }
                            if(item['status'] === 1){
                                status = "<span class=\"status text-success \">&bull;</span> Active";
                            }else if(item['status'] === 2){
                                status = "<span class=\"status text-warning \">&bull;</span> Inactive";
                            }else{
                                status = " <span class=\"status text-danger \">&bull;</span> Suspended";
                            }
                            $("#content").html("<tr>\n" +
"                                    <td>"+item['id']+"</td>\n" +
"                                    <td><a href=\"CustomerDetail?id="+item['id']+"\"><img style=\"max-width: 2%;\" src=\""+item['image']+"\" class=\"avatar\" alt=\"Avatar\"> "+item['fullName']+"</a></td>\n" +
"                                            <%if (RoleUser == 1) {%>\n" +
"                                    <td>${x.getRole().getName()}</td>\n" +
"                                    <%}%>\n" +
"                                    <td>\n" +gender+"</td>                        \n" +
"                                    <td>"+item['email']+"</td>\n" +
"                                    <td>"+item['mobile']+"</td>\n" +
"                                    <td>"+status+"<td>\n" +
"                                      <td>"+
"                                        <a href=\"CustomerDetail?id="+item['id']+"\" class=\"settings\" title=\"Settings\" data-toggle=\"tooltip\"><i class=\"fa fa-cog\" aria-hidden=\"true\"></i></a>\n" +
"                                        <a href=\"CustomerDetail?id="+item['id']+"&action=delete\" class=\"delete\" title=\"Delete\" data-toggle=\"tooltip\"><i onclick=\"return confirm('are you sure?')\" class=\"fa fa-trash\" aria-hidden=\"true\"></i></a>\n" +
"                                    </td>\n" +
"                                </tr>");
                        });
                       
                    },
                    error: function (xhr) {
                        console.log(xhr);

                    }
                });
            }

        </script>






    </body>
</html>