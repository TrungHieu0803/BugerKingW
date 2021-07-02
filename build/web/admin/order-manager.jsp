<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Order Manage</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet"
              href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <link href="../css/admin.css" rel="stylesheet">
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

                <form class="form-inline" id="searchForm" name="searchObject">

                    <select class="form-control" id="trangThai">
                        <option value="Đang chờ giao">Processing</option>
                        <option value="Đang giao">Shipped</option>

                        <!-- <option value="">Tất cả</option> -->
                    </select>

                    <div class="form-group">
                        <input class="form-control" type="text" id="datepicker"
                               placeholder="Từ ngày">
                    </div>

                    <div class="form-group">
                        <input class="form-control" type="text" id="datepicker"
                               placeholder="Đến ngày">
                    </div>
                    &nbsp;&nbsp; &nbsp;&nbsp;
                    <button onclick="searchByDate()" type="button" class="btn btn-primary" id="btnDuyetDonHang">Duyệt
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
                    <tbody>
                    <c:forEach var="o" items="${listO}">
                        <tr class="rem"  >
                            <td id="cid" class="invert">${o.oid}</td>
                            <td class="invert">${o.date}</td>
                            <td class="invert">${o.status==1?"Shipped":"Processing"} </td>                           
                            <td class="invert">${o.total}</td>
                            <td class="invert">${o.payid==1?"COD":"Internet Banking"}</td>   
                            <td><a href="#" style="text-decoration: none" onclick="orderDetail('${o.oid}', '${o.cname}', '${o.cphone}', '${o.cAddress}','${o.total}')">Detail</a></td>
                        </tr>
                    </c:forEach>
                </tbody>

            </table>


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
            <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

            <script type="text/javascript">
                        $(function () {
                            $("#datepicker").datepicker();
                        });
                        $(function () {

                            if (${param.trangThai != null}) {
                                $("#trangThai").val('${param.trangThai}');
                                console.log('${param.trangThai}');
                            }
                            ;

                            var from = $("#fromDate").datepicker({
                                dateFormat: "dd-mm-yy",
                                changeMonth: true
                            }).on("change", function () {
                                to.datepicker("option", "minDate", getDate(this));
                            }), to = $("#toDate").datepicker({
                                dateFormat: "dd-mm-yy",
                                changeMonth: true
                            }).on("change", function () {
                                from.datepicker("option", "maxDate", getDate(this));
                            });

                            function getDate(element) {
                                var date;
                                var dateFormat = "dd-mm-yy";
                                try {
                                    date = $.datepicker.parseDate(dateFormat, element.value);
                                } catch (error) {
                                    date = null;
                                }

                                return date;
                            }
                        });
                        function orderDetail(oid, name, phone, adrress,totalPrice) {
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

        </script>

        <script src="<c:url value='/js/donHangAjax.js'/>"></script>
    </body>
</html>