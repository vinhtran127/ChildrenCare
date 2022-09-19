<%-- 
    Document   : CustomerDetail
    Created on : May 25, 2022, 3:34:27 PM
    Author     : Nguyen Minh Hoang
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <link href="./css/MyReservation.css" rel="stylesheet" type="text/css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </head>

    <body>
        <%@include file="/Views/Header.jsp" %>   

        <!--Start breadcrumb area-->     
        <section class="breadcrumb-area " style="background-image: url(./images/resources/breadcrumb-bg.jpg); margin-bottom: 30px;">
            <div class="container">
                <div class="row">
                    <div class="col-xl-12">
                        <div class="inner-content clearfix">
                            <div class="title float-left">
                                <h2>My Reservation</h2>
                            </div>
                            <div class="breadcrumb-menu float-right">
                                <ul class="clearfix">
                                    <li><a href="Homepage.jsp">Home</a></li>
                                    <li><i class="fa fa-angle-right" aria-hidden="true"></i></li>
                                    <li class="active">My Reservation</li>
                                </ul>    
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <div class="container">
            <div class="row">
                <div class="col-md-8">
                    <div class="card card-white mb-5">
                        <div class="card-heading clearfix border-bottom mb-4">
                            <h4 class="card-title">Booking Requests</h4>
                        </div>
                        <div class="card-body">
                            <ul class="list-unstyled">
                                <c:forEach items="${listRS}" var="o">
                                    <li class="position-relative booking">
                                        <div class="media">
                                            <div class="msg-img">
                                                <img src="${sessionScope.user.image}" alt="">
                                            </div>
                                            <div class="media-body">
                                                <c:if test="${o.status ==1}">
                                                    <h5  class="mb-4">${o.reservation.customer.fullName} <span id="status${o.id}" class="badge badge-success ml-3">Approved</span></h5>
                                                </c:if>
                                                <c:if test="${o.status ==2}">
                                                    <h5  class="mb-4">${o.reservation.customer.fullName} <span id="status${o.id}" class="badge badge-danger ml-3">Cancel</span></h5>
                                                </c:if>
                                                <c:if test="${o.status ==3}">
                                                    <h5  class="mb-4">${o.reservation.customer.fullName} <span id="status${o.id}" class="badge badge-dark ml-3">Complete</span></h5>
                                                </c:if>
                                                <c:if test="${o.status ==4}">
                                                    <h5  class="mb-4">${o.reservation.customer.fullName} <span id="status${o.id}" class="badge badge-danger ml-3">Reject</span></h5>
                                                </c:if>
                                                <div class="mb-3">
                                                    <span class="mr-2 d-block d-sm-inline-block mb-2 mb-sm-0">Reservation on: </span>
                                                    <span class="bg-light-blue">${o.reservation.reservationDate}</span>
                                                </div>
                                                <div class="mb-3">
                                                    <span class="mr-2 d-block d-sm-inline-block mb-2 mb-sm-0">Booking Details:</span>
                                                    <span class="bg-light-blue">${o.numberOfPeople} people</span>
                                                </div>
                                                <div class="mb-3">
                                                    <span class="mr-2 d-block d-sm-inline-block mb-2 mb-sm-0">Price:</span>
                                                    <span class="bg-light-blue">${o.reservation.totalCost}$</span>
                                                </div>
                                                <div class="mb-5">
                                                    <span class="mr-2 d-block d-sm-inline-block mb-1 mb-sm-0">Doctor:</span>
                                                    <span class="border-right pr-2 mr-2">${o.reservation.doctor}</span>
                                                    <span class="border-right pr-2 mr-2"> ${o.reservation.email}</span>
                                                    <span>${o.reservation.phone}</span>
                                                </div>

                                                <a href="#" class="btn-gray">Send Message</a>
                                            </div>
                                        </div>
                                        <c:if test="${sessionScope.user.role.id == 3 && o.status != 2}">
                                            <div class="buttons-to-right">
                                                <a onclick="CancelReservation(${o.id})" class="btn-gray mr-2 btn"><i class="far fa-times-circle mr-2"></i> Cancel</a>
                                                <!--<button id="btn" onclick="CancelReservation(${o.id})" class="btn-gray mr-2" ><i class="far fa-times-circle mr-2"></i>Cancel</button>-->
                                                <a href="#editReservation${o.id}" class="btn-gray" data-toggle="modal" ><i class="far fa-check-circle mr-2"></i> Edit</a>
                                            </div>
                                        </c:if>
                                        <div id="editReservation${o.id}" class="modal fade">
                                            <div class="modal-dialog">
                                                <div class="modal-content">
                                                    <form action="EditReservation?rID=${o.reservation.id}" method="post">
                                                        <div class="modal-header">						
                                                            <h4 class="modal-title">Edit reservation</h4>
                                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                                        </div>
                                                        <div class="modal-body">					

                                                            <div class="form-group">
                                                                <label>Number of people</label>
                                                                <input id="NOP${o.id}" oninput="updateTotal(${o.id})" name="numberOfPeople" type="number" class="form-control" required value="${o.numberOfPeople}">
                                                            </div>
                                                            <div class="form-group">
                                                                <label>Check up date</label>
                                                                <input name="CheckUpDate" type="date" class="form-control hasDatepicker" required value="${o.checkUpDate}">
                                                            </div>
                                                            <div class="form-group">
                                                                <label>Price</label>
                                                                <input id="price${o.id}" name="Price" type="number" class="form-control" readonly value="${o.service.salePrice}">
                                                            </div>
                                                            <div class="form-group">
                                                                <label>Total cost</label>
                                                                <input name="Total" type="number" id="total${o.id}" class="form-control" readonly value="${o.reservation.totalCost}">
                                                            </div>
                                                            <div class="form-group">
                                                                <label>Services</label>
                                                                <select id="select${o.id}" name="service" class="form-select" aria-label="Default select example" onchange="setNewValue(${o.id})">
                                                                    <c:forEach items="${listS}" var="p">
                                                                        <c:if test="${o.service.id != p.id}">
                                                                            <option value="${p.id}-${p.salePrice}">${p.fullname}</option>
                                                                        </c:if>
                                                                        <c:if test="${o.service.id == p.id}">
                                                                            <option value="${p.id}-${p.salePrice}" selected>${p.fullname} </option>
                                                                        </c:if>
                                                                    </c:forEach>
                                                                </select>
                                                            </div>
                                                        </div>
                                                        <div class="modal-footer">
                                                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                                                            <input type="submit" class="btn btn-success" value="Save">
                                                        </div>
                                                    </form>
                                                </div>
                                            </div>
                                        </div>
                                    </li>
                                </c:forEach>
                            </ul>

                        </div>

                    </div>

                </div>
                <div class="col-md-4">
                    <div class="sidebar-wrapper">
                        <!--Start single sidebar-->
                        <div class="single-sidebar">
                            <form class="search-form" action="#">
                                <input placeholder="Search" type="text">
                                <button type="submit"><i class="fa fa-search" aria-hidden="true"></i></button>
                            </form>
                        </div>
                        <!--End single sidebar-->
                        <!--Start single sidebar-->
                        <div class="single-sidebar">
                            <div class="sidebar-title">
                                <h3>Categories</h3>
                            </div>
                            <ul class="categories clearfix">
                                <li><a href="#">Healthy Teeth <span>(4)</span></a></li>
                                <li><a href="#">Technology <span>(2)</span></a></li>
                                <li><a href="#">Dental Care <span>(2)</span></a></li>
                                <li><a href="#">General Dentistry <span>(5)</span></a></li>
                                <li><a href="#">Cosmetic Dentistry <span>(4)</span></a></li>
                                <li><a href="#">Uncategorized <span>(1)</span></a></li>
                            </ul>
                        </div>


                        <!--End single-sidebar-->
                        <!--Start single-sidebar-->
                        <div class="single-sidebar">
                            <div class="sidebar-title">
                                <h3>Archives</h3>
                            </div>
                            <ul class="archives">
                                <li><a href="#">August 2018 <span>(4)</span></a></li>
                                <li><a href="#">July 2018 <span>(2)</span></a></li>
                                <li><a href="#">March 2018 <span>(2)</span></a></li>
                                <li><a href="#">February 2018 <span>(3)</span></a></li>
                                <li><a href="#">December 2017 <span>(1)</span></a></li>
                            </ul>
                        </div> 

                    </div>    
                </div>


                <div class="clearfix">
                    <c:if test="${pageIndex<endPage}">
                        <div class="hint-text">Show out <b>4</b> in <b>${totalRecord}</b></div>
                    </c:if>
                    <c:if test="${pageIndex>= endPage}">
                        <div class="hint-text">Show out <b>${totalRecord % 4}</b> in <b>${totalRecord}</b></div>
                    </c:if>

                    <nav aria-label="Page navigation">
                        <ul class="pagination justify-content-center mb-3">
                            <li class="pagfootere-item disabled">
                                <a class="page-link" href="MyReservation?pageIndex=${pageIndex!=1?(pageIndex-1):(pageIndex)}" aria-label="Previous">
                                    <span aria-hidden="true">&laquo;</span>
                                    <span class="sr-only">Previous</span>
                                </a>
                            </li>
                            <c:forEach begin="1" end="${endPage}" var="i">
                                <li class="page-item "><a class=" ${pageIndex == i ?"active":""} page-link btn btn-default" href="MyReservation?pageIndex=${i}">${i}</a></li>
                                </c:forEach>
                            <li class="page-item">
                                <a class="page-link" href="MyReservation?pageIndex=${pageIndex!=endPage?(pageIndex+1):(pageIndex)}" aria-label="Next">
                                    <span aria-hidden="true">&raquo;</span>
                                    <span class="sr-only">Next</span>
                                </a>
                            </li>
                        </ul>
                    </nav>
                </div>
            </div>

        </div>
        <%@include file="/Views/Footer.jsp" %>
        <!-- /.End Of Color Palate -->
        <jsp:include page="/Views/LinkFooter.jsp"/>
        <script src="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/alertify.min.js"></script>
        <script>

                                                                    function updateTotal(id) {
                                                                        var NOP = document.getElementById("NOP" + id).value;
                                                                        var price = document.getElementById("price" + id).value;
                                                                        document.getElementById("total" + id).value = NOP * price;
                                                                    }
                                                                    function setNewValue(id) {
                                                                        var NOP = document.getElementById("NOP" + id).value;
                                                                        var text = document.getElementById("select" + id).value;
                                                                        const myArray = text.split("-");
                                                                        var price = myArray[1];
                                                                        document.getElementById("price" + id).value = price;
                                                                        document.getElementById("total" + id).value = NOP * price;
                                                                    }


        </script>
        <script type="text/javascript">
            function CancelReservation(id) {
                $.ajax({
                    url: "/ChildrenCare/CancelReservation",
                    type: "get",
                    data: {
                        ID: id
                    },
                    success: function () {
                        alertify.success('Edit successfully');
                        var x = document.getElementById("status" + id);
                        x.innerHTML = "Cancel";
                        x.className = "badge badge-danger ml-3";
                    }

                });
            }
        </script>

    </body>
</html>
