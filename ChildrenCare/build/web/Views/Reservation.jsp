<%-- 
    Document   : Doctors
    Created on : May 16, 2022, 10:44:58 PM
    Author     : Nguyen Minh Hoang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">


    <head>
        <meta charset="UTF-8">
        <title>Reservation</title>
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
                                <h2>Reservation</h2>
                            </div>
                            <div class="breadcrumb-menu float-right">
                                <ul class="clearfix">
                                    <li><a href="HomePage">Home</a></li>
                                    <li><i class="fa fa-angle-right" aria-hidden="true"></i></li>
                                    <li class="active">Doctors</li>
                                </ul>    
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!--End breadcrumb area--> 

        <!--Start Doctor area-->
        <section class="doctor-area">
            <div class="container">
                <div class="row">
                    <div class="col-xl-4 col-lg-8">
                        <div class="doctor-sidebar">
                            <!--Start Single Sidebar-->
                            <div class="single-sidebar">
                                <div class="doctor-tab-box tabs-box">
                                    <ul class="tab-btns tab-buttons clearfix">
                                        <li class="tab-btn left"><span>Doctor Name</span></li>
                                    </ul>
                                    <form action="SearchDoctor" method="post">
                                        <div class="tab">
                                            <input class="form-control" type="text" placeholder="Doctor name" name="doctorName" oninput="searchDoctor(this)">
                                        </div>   
                                        <button type="submit" class="btn btn-success">Search</button>
                                    </form>

                                </div>   
                            </div>
                            <!--End Single Sidebar-->
                        </div>    
                    </div>
                    <div class="col-xl-8">
                        <div id="doctors" class="doctor-content">
                            <c:forEach items="${ListDoc}" var="o">
                                <div class="single-doctor-item wow fadeInUp countDoc" data-wow-delay="300ms">
                                    <div class="row">
                                        <div class="col-xl-5">
                                            <div class="img-holder">
                                                <img src="${o.image}" alt="Awesome Image">
                                                <div class="overlay">
                                                    <div class="box">
                                                        <div class="content">
                                                            <a class="btn-one" href="#reservation" data-toggle="modal">Appointment</a>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xl-7">
                                            <div class="text-holder">
                                                <h3>${o.fullName}</h3>
                                                <h6>Contact</h6>
                                                <ul>
                                                    <li><span class="icon-phone"></span>${o.mobile}</li>
                                                    <li><span class="flaticon-e-mail-envelope"></span>${o.email}</li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div id="reservation" class="modal fade">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <form action="BookingReservation?docID=${o.id}" method="post">
                                                <div class="modal-header">						
                                                    <h4 class="modal-title">Edit reservation</h4>
                                                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                                </div>
                                                <div class="modal-body">					
                                                    <div class="form-group">
                                                        <label>Name</label>
                                                        <input type="text" value="${sessionScope.user.fullName} "class="form-control" readonly>
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Phone</label>
                                                        <input type="text" value="${sessionScope.user.mobile} "class="form-control" readonly>
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Email</label>
                                                        <input type="text" value="${sessionScope.user.email} "class="form-control" readonly>
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Number of people</label>
                                                        <input id="NOP" name="numberOfPeople" type="number" class="form-control" required oninput="updateTotal()">
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Check up date</label>
                                                        <input name="CheckUpDate" type="date" class="form-control hasDatepicker" required >
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Price</label>
                                                        <input id="price" type="number" class="form-control" readonly>
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Total cost</label>
                                                        <input name="TotalCost" type="number" id="total" class="form-control" readonly>
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Services</label>
                                                        <select id="service" name="service" class="form-select" aria-label="Default select example" onchange="setNewValue()">
                                                            <c:forEach items="${ListS}" var="p">
                                                                <option value="${p.id}-${p.salePrice}">${p.fullname}</option>
                                                            </c:forEach>
                                                        </select>
                                                    </div>
                                                </div>
                                                <div class="modal-footer">
                                                    <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                                                    <input type="submit" class="btn btn-success" value="Booking">
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>

                            </c:forEach>
                            <!--                            <div>
                                                            <button onclick="loadMore()" class="btn btn-success">Load more</button>
                                                        </div>-->


                            <!--End Single doctor item-->

                        </div>        
                    </div>
                </div>
            </div>
        </section>
        <!--End Doctor area-->
        <%@include file="/Views/Footer.jsp" %>
        <jsp:include page="/Views/LinkFooter.jsp"/>


    </body>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script>
                                                            function updateTotal() {
                                                                var NOP = document.getElementById("NOP").value;
                                                                var price = document.getElementById("price").value;
                                                                document.getElementById("total").value = NOP * price;
                                                            }
                                                            function setNewValue() {
                                                                var NOP = document.getElementById("NOP").value;
                                                                var text = document.getElementById("service").value;
                                                                const myArray = text.split("-");
                                                                var price = myArray[1];
                                                                document.getElementById("price").value = price;
                                                                document.getElementById("total").value = NOP * price;
                                                            }
//                                                            function searchDoctor(param) {
//                                                                alert("aaaaaaaa");
//                                                                var txtSearch = param.value;
//                                                                $.ajax({
//                                                                    url: "/ChildrenCare/SearchDoctor",
//                                                                    type: "get",
//                                                                    data: {
//                                                                        doctorName: txtSearch;
//                                                                    },
//                                                                    success: function (data) {
//                                                                        var row = document.getElementById("doctors");
//                                                                        row.innerHTML = data;
//                                                                    }
//
//                                                                });
//                                                            }
    </script>
    <!--    <script type="text/javascript">
            function loadMore() {
                var amount = document.getElementsByClassName("countDoc").length;
                $.ajax({
                    url: "/ChildrenCare/LoadMoreDoctor",
                    type: "get",
                    data: {
                        numberExist: amount;
                    },
                    success: function (data) {
                        var row = document.getElementById("doctors");
                        row.innerHTML += data;
                    }
    
                });
            }
        </script>-->

    <!-- Mirrored from st.ourhtmldemo.com/new/Dento/doctors.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 05 Jan 2021 02:07:28 GMT -->
</html>