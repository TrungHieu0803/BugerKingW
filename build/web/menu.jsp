<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Burger King - Food Website Template</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="Free Website Template" name="keywords">
        <meta content="Free Website Template" name="description">

        <!-- Favicon -->
        <link href="img/favicon.ico" rel="icon">

        <!-- Google Font -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400|Nunito:600,700" rel="stylesheet"> 

        <!-- CSS Libraries -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
        <link href="lib/animate/animate.min.css" rel="stylesheet">
        <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
        <link href="lib/flaticon/font/flaticon.css" rel="stylesheet">
        <link href="lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />

        <!-- Template Stylesheet -->
        <link href="css/style.css" rel="stylesheet">
    </head>

    <body>
        <!-- Nav Bar Start -->
        <jsp:include page="components/navbar.jsp"></jsp:include>
            <!-- Nav Bar End -->


            <!-- Page Header Start -->
            <div class="page-header mb-0">
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <h2>Food Menu</h2>
                        </div>
                        <div class="col-12">
                            <a href="">Home</a>
                            <a href="">Menu</a>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Page Header End -->


            <!-- Food Start -->
            <div class="food mt-0">
                <div class="container">
                    <div class="row align-items-center">
                        <div class="col-md-4">
                            <div class="food-item">
                                <i class="flaticon-burger"></i>
                                <h2>Burgers</h2>
                                <p>
                                    Lorem ipsum dolor sit amet elit. Phasel nec pretium mi. Curabit facilis ornare velit non vulputa. Aliquam metus tortor auctor quis sem. 
                                </p>
                                <a href="">View Menu</a>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="food-item">
                                <i class="flaticon-snack"></i>
                                <h2>Snacks</h2>
                                <p>
                                    Lorem ipsum dolor sit amet elit. Phasel nec pretium mi. Curabit facilis ornare velit non vulputa. Aliquam metus tortor auctor quis sem. 
                                </p>
                                <a href="">View Menu</a>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="food-item">
                                <i class="flaticon-cocktail"></i>
                                <h2>Beverages</h2>
                                <p>
                                    Lorem ipsum dolor sit amet elit. Phasel nec pretium mi. Curabit facilis ornare velit non vulputa. Aliquam metus tortor auctor quis sem. 
                                </p>
                                <a href="">View Menu</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Food End -->


            <!-- Menu Start -->
            <div class="menu">
                <div class="container">
                    <div class="section-header text-center">
                        <p>Food Menu</p>
                        <h2>Delicious Food Menu</h2>
                    </div>
                    <div class="menu-tab">
                        <ul class="nav nav-pills justify-content-center">
                            <li class="nav-item">
                                <a class="nav-link active" data-toggle="pill" href="#burgers">Burgers</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" data-toggle="pill" href="#snacks">Snacks</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" data-toggle="pill" href="#drinks">Drinks</a>
                            </li>
                        </ul>
                        <div class="tab-content">
                            <div id="burgers" class="container tab-pane active">
                                <div class="row">
                                    <div class="col-lg-7 col-md-12">
                                    <c:forEach items="${listPB}" var="p">
                                        <div class="menu-item">
                                            <a  class="cart-item" onclick="addToCart('${p.pid}')" style="display: ${sessionScope.account==null?"none":"block"}">
                                               <i class="fa fa-shopping-cart" style="font-size:25px" ></i> 
                                            </a>
                                            
                                            <div class="menu-img">
                                                <img onmouseover="displayPicture(this)" src= ${p.image} alt="Image">
                                            </div>
                                            <div class="menu-text">
                                                <h3><span>${p.pname}</span> <strong>$${p.price}</strong></h3>
                                                <p>${p.description}</p>
                                            </div>
                                        </div>
                                    </c:forEach>  
                                </div>
                                <div class="col-lg-5 d-none d-lg-block contain">
                                    <div style="top:6rem; " class="position-sticky image-shadow">
                                        <img  class="image" id="changePicture" src="img/buger1.jpg" alt="Image">                                      
                                    </div>

                                </div>
                            </div>
                        </div>
                        <div id="snacks" class="container tab-pane fade">
                            <div class="row">
                                <div class="col-lg-7 col-md-12">
                                    <c:forEach items="${listPS}" var="p">
                                        <div class="menu-item">
                                            <a class="cart-item" onclick="addToCart('${p.pid}')" style="display: ${sessionScope.account==null?"none":"block"}">
                                               <i class="fa fa-shopping-cart" style="font-size:25px" ></i> 
                                            </a>
                                            <div class="menu-img">
                                                <img onmouseover="displayPicture1(this)" src= ${p.image} alt="Image">
                                            </div>
                                            <div class="menu-text">
                                                <h3><span>${p.pname}</span> <strong>$${p.price}</strong></h3>
                                                <p>${p.description}</p>
                                            </div>
                                        </div>
                                    </c:forEach>                          
                                </div>
                                <div class="col-lg-5 d-none d-lg-block contain">
                                    <div style="top:6rem; " class="position-sticky image-shadow">
                                        <img  class="image" id="changePicture1" src="img/snack1.jpg" alt="Image">
                                        
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div id="drinks" class="container tab-pane fade">
                            <div class="row">
                                <div class="col-lg-7 col-md-12">
                                    <c:forEach items="${listPD}" var="p">
                                        <div class="menu-item">
                                            <a class="cart-item" onclick="addToCart('${p.pid}')" style="display: ${sessionScope.account==null?"none":"block"}">
                                               <i class="fa fa-shopping-cart" style="font-size:25px" ></i> 
                                            </a>
                                            <div class="menu-img">
                                                <img onmouseover="displayPicture2(this)" src= ${p.image} alt="Image">
                                            </div>
                                            <div class="menu-text">
                                                <h3><span>${p.pname}</span> <strong>$${p.price}</strong></h3>
                                                <p>${p.description}</p>
                                            </div>
                                        </div>
                                    </c:forEach>  
                                </div>
                                <div class="col-lg-5 d-none d-lg-block contain">
                                    <div style="top:6rem; " class="position-sticky image-shadow">
                                        <img  class="image" id="changePicture2" src="img/drink1.jpg" alt="Image">
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Menu End -->


        <!-- Footer Start -->
        <jsp:include page="components/footer.jsp"></jsp:include>
            <!-- Footer End -->

        <jsp:include page="components/login-register.jsp"></jsp:include>
        <a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>

        <!-- JavaScript Libraries -->
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
        <script src="lib/easing/easing.min.js"></script>
        <script src="lib/owlcarousel/owl.carousel.min.js"></script>
        <script src="lib/tempusdominus/js/moment.min.js"></script>
        <script src="lib/tempusdominus/js/moment-timezone.min.js"></script>
        <script src="lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>

        <!-- Contact Javascript File -->
        <script src="mail/jqBootstrapValidation.min.js"></script>
        <script src="mail/contact.js"></script>

        <!-- Template Javascript -->
        <script src="js/main.js"></script>
    </body>
</html>
