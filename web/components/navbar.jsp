<%-- 
    Document   : navbar
    Created on : Jun 11, 2021, 1:41:00 PM
    Author     : Administrator
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="navbar navbar-expand-lg bg-light navbar-light">
    <div class="container-fluid">
        <a href="index.html" class="navbar-brand">Burger <span>King</span></a>
        <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse justify-content-between" id="navbarCollapse">
            <div class="navbar-nav ml-auto">
                <a href="/BugerKingW/page?service=home" class="nav-item nav-link ">Home</a>
                <a href="/BugerKingW/page?service=menu" class="nav-item nav-link">Menu</a>
                <a href="booking.jsp" class="nav-item nav-link">Booking</a>
                <div class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Pages</a>
                    <div class="dropdown-menu">
                        <a href="blog.html" class="dropdown-item">Blog Grid</a>
                        <a href="single.html" class="dropdown-item">Blog Detail</a>
                    </div>
                </div>
                <a href="#" onclick="registerDisplay()" class="nav-item nav-link" style="display: ${sessionScope.account==null?"block":"none"}">Register</a>
                <a href="#" onclick="loginFormDisplay()" class="nav-item nav-link" style="display: ${sessionScope.account==null?"block":"none"}">Login</a>
                <div class="nav-item dropdown"  style="display: ${sessionScope.account==null?"none":"block"}">
                    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">${sessionScope.account.username}</a>
                    <div class="dropdown-menu">
                        <a href="/BugerKingW/profile.jsp" class="dropdown-item">Profile</a>
                        <a href="/BugerKingW/CustomerPage?service=history" class="dropdown-item">History</a>
                        <a href="/BugerKingW/logout?service=forCustomer" class="dropdown-item">Logout</a>
                    </div>
                </div>
                    <a  href="../BugerKingW/cart.jsp" class="nav-item nav-link  btn btn-default btn-sm" style="display: ${sessionScope.account==null?"none":"block"}">
                        <span  id="itemInCart" class=" fa fa-shopping-cart"> 
                            <c:if test="${sessionScope.totalAmount==null}">0</c:if>
                            <c:if test="${sessionScope.totalAmount!=null}">${sessionScope.totalAmount}</c:if>
                        </span>         
                </a>
            </div>
        </div>
    </div>
</div>
