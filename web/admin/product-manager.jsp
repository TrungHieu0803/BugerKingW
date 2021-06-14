<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Product Manage</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style type="text/css">
            .modal-open {
                overflow: scroll;
            }
            .image{
                height: 200px;
                width: 200px;
            }

        </style>
        <link rel="stylesheet" href="../css/admin.css" />


    </head>
    <body>
        <c:if test="${sessionScope.accountAdmin==null}">
            <jsp:include page="template/404error.jsp"></jsp:include>
        </c:if>
        <c:if test="${sessionScope.accountAdmin!=null}">
            <jsp:include page="template/header.jsp"></jsp:include>
            <jsp:include page="template/sidebar.jsp"></jsp:include>

                <div class="col-md-9 animated bounce">
                    <h3 class="page-header">Quản lý Sản Phẩm</h3>
                    <h4 class="mb-sm-4 mb-3">
                        <button  type="button" onclick="location.href = 'admin/add-product.jsp'" class="btn btn-success">Thêm Sản Phẩm</button>
                    </h4>


                    <table class="table table-hover sanPhamTable"
                           style="text-align: center; border:">
                        <thead>
                            <tr>
                                <th >ID</th>
                                <th>Name</th>
                                <th>Image</th>
                                <th>Price</th>
                                <th>Update/Delete</th>
                                <th>Status</th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="o" items="${listP}">
                            <tr class="rem1" id="${o.pid}" >
                                <td id="pid" class="invert">${o.pid}</td>
                                <td class="invert">${o.pname}</td>
                                <td  class="invert-image image">
                                    <img  src="${o.image}" alt=" " class="img-responsive">
                                </td>                           
                                <td class="invert">$${o.price}</td>
                                <td>
                                    <button type="button" onclick="location.href = 'ProductManager?pid=${o.pid}&service=dataforupdate'" class="btn btn-primary"> UPDATE</button>
                                    <br>
                                    <br>

                                    <button type="button" onclick="deleteProduct('${o.pid}', this)"  class="btn btn-danger">DELETE</button>

                                </td>
                                <td>
                                    <label class="switch"  >
                                        <input onclick="changeStatus('${o.pid}', this)"  type='checkbox' <c:if test="${o.status==1}">checked ="checked"</c:if> >

                                            <span class="slider round"></span>
                                        </label>
                                    </td>
                                </tr>
                        </c:forEach>
                    </tbody>

                </table>


                <ul class="pagination">
                </ul>
            </div>




            <jsp:include page="template/footer.jsp"></jsp:include>
                <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.serializeJSON/2.9.0/jquery.serializejson.js"></script>
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script> 
                <!--        <script src="../js/admin_main.js"></script>-->
                <script type="text/javascript">

                                                function deleteProduct(pid, btn) {
                                                    var r = confirm("Do you want delete this product?");
                                                    if (r === true) {
                                                        btn.parentElement.parentElement.style.display = "none";
                                                        jQuery.ajax({
                                                            url: "/BugerKingW/ProductManager",
                                                            type: "GET",
                                                            data: {pid: pid,
                                                                service: "delete"},
                                                            success: function () {
                                                                console.log("deleted");
                                                            }, error: function () {

                                                            }
                                                        });
                                                    }
                                                }
                                                function changeStatus(pid, value) {
                                                    var status;
                                                    if ($(value).prop("checked") == true) {
                                                        status = "1";
                                                    } else if ($(value).prop("checked") == false) {
                                                        status = "0";
                                                    }
                                                    jQuery.ajax({
                                                        url: "/BugerKingW/ProductManager",
                                                        type: "GET",
                                                        data: {pid: pid,
                                                            status: status,
                                                            service: "changeStatus"},
                                                        success: function () {
                                                        }, error: function () {

                                                        }
                                                    });
                                                }

                </script>
        </c:if>



    </body>
</html>