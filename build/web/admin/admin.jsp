<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang Quản Trị </title>
        <link rel="stylesheet" href="../css/admin.css" />
    </head>
    <body> 
        <c:if test="${sessionScope.accountAdmin==null}">
            <jsp:include page="template/404error.jsp"></jsp:include>
        </c:if>
        <c:if test="${sessionScope.accountAdmin!=null}">
            <jsp:include page="template/header.jsp"></jsp:include>
            <jsp:include page="template/sidebar.jsp"></jsp:include>          
            <jsp:include page="template/content.jsp"></jsp:include>
            <jsp:include page="template/footer.jsp"></jsp:include>
        </c:if>




    </body>

</html>
