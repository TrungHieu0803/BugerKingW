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
        <div class="alert alert-success set-alert" role="alert" style="display: ${alert}">
            <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <strong>Success!</strong> The password was changed! 
        </div>
        <!-- Nav Bar Start -->
        <jsp:include page="components/navbar.jsp"></jsp:include>
            <!-- Nav Bar End -->


            <!-- Page Header Start -->
            <div class="page-header">
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <h2>Profile</h2>
                        </div>

                    </div>
                </div>
            </div>
            <!-- Page Header End -->
            <div class="container_profile">
                <div class="customer_profile">

                    <div class="row">
                        <div class="col-sm-3">
                            <h6 class="mb-0">Name</h6>
                        </div>
                        <div class="col-sm-9 text-secondary">
                        ${sessionScope.account.cname}
                    </div>
                </div>
                <hr>
                <div class="row">
                    <div class="col-sm-3">
                        <h6 class="mb-0">Email</h6>
                    </div>
                    <div class="col-sm-9 text-secondary">
                        ${sessionScope.account.cEmail}
                    </div>
                </div>
                <hr>
                <div class="row">
                    <div class="col-sm-3">
                        <h6 class="mb-0">Phone</h6>
                    </div>
                    <div class="col-sm-9 text-secondary">
                        ${sessionScope.account.cphone}
                    </div>
                </div>
                <hr>

                <div class="row">
                    <div class="col-sm-3">
                        <h6 class="mb-0">Address</h6>
                    </div>
                    <div class="col-sm-9 text-secondary">
                        ${sessionScope.account.cAddress}
                    </div>
                </div>
                <hr>
                <div class="row">
                    <div class="col-sm-3">
                        <div >
                            <a style="color: white" onclick="updateFormDisplay()" class="btn btn-info btn-confirm" target="__blank" >Edit</a>
                        </div>
                    </div>

                    <div class="col-sm-3">
                        <div >
                            <a style="color: white" onclick="changePwFormDisplay()" class="btn btn-info btn-confirm" target="__blank" >Change password</a>
                        </div>
                    </div>
                </div>

            </div>
        </div>

        <div  id="modal_update_information" class="modal1" style="display: ${loginForm==null?"none":"block"}"  >
            <div onclick="updateFormHide()" id="modal_overlay" class="modal_overlay"></div>
            <div class="modal_body">
                <div class="modal_inner">
                    <div class="card bg-light">
                        <article class="card-body mx-auto" style="max-width: 400px;">
                            <button onclick="updateFormHide()" type="button" class="close" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                            <h4 class="card-title mt-3 text-center">Update information</h4>                           
                            <hr>
                            <form action="/BugerKingW/CustomerPage?service=update" method="post">    

                                <div class="form-group">
                                    <label for="name">Name</label> <input value="${sessionScope.account.cname}" type="text"
                                                                          class="form-control" name="name" required="required" />
                                </div>
                                <div class="form-group">
                                    <label for="name">Phone</label> <input value="${sessionScope.account.cphone}" type="text"
                                                                           class="form-control" name="phone" required="required" />
                                </div>
                                <div class="form-group">
                                    <label for="name">Email</label> <input value="${sessionScope.account.cEmail}" type="text"
                                                                           class="form-control" name="email" required="required" />
                                </div>
                                <div class="form-group">
                                    <label for="name">Address</label> <input value="${sessionScope.account.cAddress}" type="text"
                                                                             class="form-control" name="address" required="required" />
                                </div>

                                <div class="modal-footer">

                                    <input class="btn btn-primary btn-confirm" id="btnSubmit" type="submit"
                                           value="Update" />
                                </div>
                            </form>
                        </article>
                    </div> <!-- card.// -->
                </div>
            </div>
        </div>

        <div  id="modal_change_password" class="modal1" style="display: ${changePwForm==null?"none":"block"}"  >
            <div onclick="changePwFormHide()" id="modal_overlay" class="modal_overlay"></div>
            <div class="modal_body">
                <div class="modal_inner">
                    <div class="card bg-light">
                        <article class="card-body mx-auto" style="max-width: 400px;">
                            <button onclick="changePwFormHide()" type="button" class="close" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                            <h4 class="card-title mt-3 text-center">Update information</h4>                           
                            <hr>
                            <form action="/BugerKingW/CustomerPage?service=changePassWord" method="post">    
                                <div class="form-group">
                                    <label for="name">Old password</label> <input type="password"
                                                                                  class="form-control" name="oldPassword" required="required" />
                                </div>
                                <div class="form-group">
                                    <label for="name">New password</label> <input type="password"
                                                                                  class="form-control" name="newPassword" required="required" />
                                </div>
                                <div class="form-group">
                                    <label for="name">R-enter password</label> <input
                                        type="password" class="form-control" name="confirmNewPassword"
                                        required="required" />
                                </div>

                                <div class="modal-footer">
                                    <p class="text-danger">${messForChangePw}</p>
                                    <input class="btn btn-primary btn-confirm" type="submit"
                                           id="btnXacNhanDoiMK" value="Change" />
                                </div>
                            </form>
                        </article>
                    </div> <!-- card.// -->
                </div>
            </div>
        </div>





        <!-- Footer Start -->
        <div class="footer">
            <div class="container">
                <div class="row">
                    <div class="col-lg-7">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="footer-contact">
                                    <h2>Our Address</h2>
                                    <p><i class="fa fa-map-marker-alt"></i>123 Street, New York, USA</p>
                                    <p><i class="fa fa-phone-alt"></i>+012 345 67890</p>
                                    <p><i class="fa fa-envelope"></i>info@example.com</p>
                                    <div class="footer-social">
                                        <a href=""><i class="fab fa-twitter"></i></a>
                                        <a href=""><i class="fab fa-facebook-f"></i></a>
                                        <a href=""><i class="fab fa-youtube"></i></a>
                                        <a href=""><i class="fab fa-instagram"></i></a>
                                        <a href=""><i class="fab fa-linkedin-in"></i></a>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="footer-link">
                                    <h2>Quick Links</h2>
                                    <a href="">Terms of use</a>
                                    <a href="">Privacy policy</a>
                                    <a href="">Cookies</a>
                                    <a href="">Help</a>
                                    <a href="">FQAs</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-5">
                        <div class="footer-newsletter">
                            <h2>Newsletter</h2>
                            <p>
                                Lorem ipsum dolor sit amet elit. Quisque eu lectus a leo dictum nec non quam. Tortor eu placerat rhoncus, lorem quam iaculis felis, sed lacus neque id eros.
                            </p>
                            <div class="form">
                                <input class="form-control" placeholder="Email goes here">
                                <button class="btn custom-btn">Submit</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="copyright">
                <div class="container">
                    <p>Copyright &copy; <a href="#">Your Site Name</a>, All Right Reserved.</p>
                    <p>Designed By <a href="https://htmlcodex.com">HTML Codex</a></p>
                </div>
            </div>
        </div>
        <!-- Footer End -->

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
