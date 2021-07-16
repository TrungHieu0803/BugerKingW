<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Order Manage</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <link rel="stylesheet"
              href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <link href="../css/admin.css" rel="stylesheet">
        <link href="../css/style.css" rel="stylesheet">

        <script src="../js/admin_main.js"></script>
        <style>
            .form-chiTiet input {
                border: 0;
            }
        </style>
    </head>
    <body>
        <jsp:include page="template/header.jsp"></jsp:include>
        <jsp:include page="template/sidebar.jsp"></jsp:include>

            <div class="col-md-9 animated bounce">
                <h3 class="page-header form-inline">Quản lý Đơn hàng</h3>

                <form method="post" action="/BugerKingW/OrderManager?service=searchByStatus" class="form-inline" id="searchForm" name="searchObject">

                    <select class="form-control" id="trangThai" name="status">
                        <option ${checkStatus == 3?"selected":""} value="3">All</option>
                    <option ${checkStatus == 0?"selected":""} value="0">Processing</option>
                    <option ${checkStatus == 1?"selected":""} value="1">Delivering</option>
                    <option ${checkStatus == 2?"selected":""} value="2">Delivered</option>                     
                </select>


                &nbsp;&nbsp; &nbsp;&nbsp;
                <button  type="submit" class="btn btn-primary" id="btnDuyetDonHang">Duyệt
                    Đơn</button>
                <div class="form-group" style="float: right; margin-right: 20px">
                    <input class="form-control" type="number" id="searchById"
                           placeholder="Nhập mã để tìm nhanh"> <span
                           class="glyphicon glyphicon-search" aria-hidden="true"
                           style="left: -30px; top: 4px"></span>
                </div>
            </form>

            <hr />
            <table class="table table-hover donHangTable"
                   style="text-align: center">
                <thead>
                    <tr>
                        <th>Order ID</th>
                        <th>Date</th>
                        <th>Status</th>
                        <th>Total</th>                           
                        <th>Payment</th>
                        <th>Detail</th>
                    </tr>
                </thead>
                <tbody id="table-order">
                    <jsp:include page="template/order-pagination.jsp"></jsp:include>
                    </tbody>

                </table>
                <p id="show_paginator"></p>


            </div>
            <div  id="modal-order-detail" class="modal1" style="display: none" >
                <div onclick="hideList()" id="modal_overlay" class="modal_overlay"></div>
                <div class="modal_body">
                    <div class="modal_inner">
                        <button onclick="hideList()" type="button" class="close" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                        <div>
                            <ul>
                                <li >Customer name: <a id="customer-name"></a> </li>
                                <li >Phone: <strong id="customer-phone"></strong></li>
                                <li >Address: <strong id="customer-adrress"></strong></li>
                                <li>Total Price:<strong id="totalPrice"></strong></li>
                            </ul>
                        </div>

                        <table class="table table-hover donHangTable"
                               style="text-align: center">
                            <thead>
                                <tr>
                                    <th>Product</th>
                                    <th>Amount</th>
                                    <th>Price</th>
                                    <th>Total</th>                           
                                </tr>
                            </thead>                           
                            <tbody id="list-order-detail">                                                      
                            </tbody>                           
                        </table>


                    </div>
                </div>
            </div>

        <jsp:include page="template/footer.jsp"></jsp:include>


            <script src="http://code.jquery.com/jquery-2.1.3.min.js"></script>
            <script src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
            <script type="text/javascript" src="http://botmonster.com/jquery-bootpag/jquery.bootpag.js"></script>

            <script type="text/javascript">

                            function orderDetail(oid, name, phone, adrress, totalPrice) {
                                document.getElementById("modal-order-detail").style.display = "block";
                                document.getElementById("list-order-detail").innerHTML = "";
                                console.log(name + phone + adrress);
                                document.getElementById("customer-name").innerHTML = name;
                                document.getElementById("customer-phone").innerHTML = phone;
                                document.getElementById("customer-adrress").innerHTML = adrress;
                                document.getElementById("totalPrice").innerHTML = totalPrice;
                                jQuery.ajax({
                                    url: "/BugerKingW/OrderManager",
                                    type: "GET",
                                    data: {oid: oid,
                                        service: "orderDetail"},
                                    success: function (result) {
                                        document.getElementById("list-order-detail").innerHTML += result;
                                        console.log(result);
                                    }, error: function () {
                                    }

                                });
                            }
                            function hideList() {
                                document.getElementById("modal-order-detail").style.display = "none";
                            }
                            function searchByDate() {
                                var from = document.getElementById("fromDate").value;
                                var to = document.getElementById("toDate").value;
                                console.log(from + to);
                            }
                            $('#show_paginator').bootpag({
                                total: $('#totalPage').val(),
                                page: 1,
                                maxVisible: 7
                            }).on('page', function (event, num)
                            {
                                var status = document.getElementById("trangThai").value;
                                console.log(status);
                                jQuery.ajax({
                                    url: "/BugerKingW/OrderManager",
                                    type: "GET",
                                    data: {currentPage: num,
                                        status: status,
                                        service: "pagination"},
                                    success: function (result) {
                                        document.getElementById("table-order").innerHTML = result;
                                    }, error: function () {
                                    }

                                });
                            });
                            function changeStatus(oid,s) {
                                var status = $(s).val();
//                                var status = document.getElementById(oid).value;
                                console.log(status);
                                if(status != 0){
                                    document.getElementById(oid).disabled="true";
                                }else{
                                    document.getElementById(oid).disabled="";
                                }
                                jQuery.ajax({
                                    url: "/BugerKingW/OrderManager",
                                    type: "GET",
                                    data: {oid: oid,
                                        status: status,
                                        service: "changeStatus"},
                                    success: function () {

                                    }, error: function () {
                                    }

                                });
                            }
                            function deleteOrder(oid,btn) {
                                var r = confirm("Do you want delete this order?");
                                if (r === true) {
                                    btn.parentElement.parentElement.style.display="none";
                                    jQuery.ajax({
                                        url: "/BugerKingW/OrderManager",
                                        type: "GET",
                                        data: {oid: oid,
                                            service: "deleteOrder"},
                                        success: function (result) {
                                            document.getElementById("table-order").innerHTML = result;
                                        }, error: function () {
                                        }

                                    });
                                }
                                    
                            }


            </script>

            <script src="<c:url value='/js/donHangAjax.js'/>"></script>
    </body>
</html>