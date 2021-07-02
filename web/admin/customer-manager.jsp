<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Customer Manage</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <c:if test="${sessionScope.accountAdmin==null}">
            <jsp:include page="template/404error.jsp"></jsp:include>
        </c:if>
        <c:if test="${sessionScope.accountAdmin!=null}">
            <jsp:include page="template/header.jsp"></jsp:include>
            <jsp:include page="template/sidebar.jsp"></jsp:include>

                <div class="col-md-9 animated bounce">
                    <h3 class="page-header">Customer Manage</h3>

                    
                    <hr>
                    <div class="form-group form-inline">
                        <label for="sel1"><strong>Lọc tài khoản:</strong> </label> <select
                            id="vaiTro" class="form-control">
                        <c:forEach var="vaiTro" items="${listVaiTro}">
                            <option value="${vaiTro.tenVaiTro }">${vaiTro.tenVaiTro }</option>
                        </c:forEach>
                    </select>
                </div>
                <hr>


                <table class="table table-hover taiKhoanTable"
                       style="text-align: center;">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Full name</th>
                            <th>Phone</th>
                            <th>Address</th>
                            <th>Email</th>
                            <th>User name</th>
                            <th>Status</th>
                        </tr>

                    </thead>
                    <tbody>

                        <c:forEach var="o" items="${listC}">
                            <tr class="rem"  >
                                <td id="cid" class="invert">${o.cid}</td>
                                <td class="invert">${o.cname}</td>
                                <td class="invert">${o.cphone} </td>                           
                                <td class="invert">${o.cAddress}</td>
                                <td class="invert">${o.cEmail}</td>
                                <td class="invert">${o.username}</td>
                                <td class="invert" style="color: ${o.status==1?"green":"red"}">
                                    <c:if test="${o.status==0}">Offline</c:if>
                                    <c:if test="${o.status==1}">Online</c:if>
                                    </td>
                                </tr>
                        </c:forEach>
                    </tbody>

                </table>
            </div>

            <jsp:include page="template/footer.jsp"></jsp:include>
        </c:if>

        <script
        src="https://cdnjs.cloudflare.com/ajax/libs/jquery.serializeJSON/2.9.0/jquery.serializejson.js"></script>
        <script src="<c:url value='/js/taiKhoanAjax.js'/>"></script>
    </body>
</html>