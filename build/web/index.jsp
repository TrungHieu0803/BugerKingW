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
        <!--        <link href="img/favicon.ico" rel="icon">-->

        <link rel='icon' href='favicon_buger.ico' type='image/x-icon' />
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
        <!--get jQuery-->
        <style>
            #modal{
                display: none;
            }
        </style>


    </head>

    <body>
        <div class="alert alert-success set-alert" role="alert" style="display: ${alert}">
            <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <strong>Success!</strong> You have been ${action} in successfully! 
        </div>
        <!--         Nav Bar Start -->
        <jsp:include page="components/navbar.jsp"></jsp:include>



            <!-- Carousel Start -->
            <div class="carousel">
                <div class="container-fluid">
                    <div class="owl-carousel">
                        <div class="carousel-item">
                            <div class="carousel-img">
                                <img src="img/carousel-1.jpg" alt="Image">
                            </div>
                            <div class="carousel-text">
                                <h1>Best <span>Quality</span> Ingredients</h1>
                                <p>
                                    Lorem ipsum dolor sit amet elit. Phasellus ut mollis mauris. Vivamus egestas eleifend dui ac consequat at lectus in malesuada
                                </p>
                                <div class="carousel-btn">
                                    <a class="btn custom-btn" href="">View Menu</a>
                                    <a class="btn custom-btn" href="">Book Table</a>
                                </div>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <div class="carousel-img">
                                <img src="img/carousel-2.jpg" alt="Image">
                            </div>
                            <div class="carousel-text">
                                <h1>World <span>Best</span> Chef</h1>
                                <p>
                                    Morbi sagittis turpis id suscipit feugiat. Suspendisse eu augue urna. Morbi sagittis, orci sodales varius fermentum, tortor
                                </p>
                                <div class="carousel-btn">
                                    <a class="btn custom-btn" href="">View Menu</a>
                                    <a class="btn custom-btn" href="">Book Table</a>
                                </div>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <div class="carousel-img">
                                <img src="img/carousel-3.jpg" alt="Image">
                            </div>
                            <div class="carousel-text">
                                <h1>Fastest Order <span>Delivery</span></h1>
                                <p>
                                    Sed ultrices, est eget feugiat accumsan, dui nibh egestas tortor, ut rhoncus nibh ligula euismod quam. Proin pellentesque odio
                                </p>
                                <div class="carousel-btn">
                                    <a class="btn custom-btn" href="">View Menu</a>
                                    <a class="btn custom-btn" href="">Book Table</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Carousel End -->


            <!-- Booking Start -->
            <div class="booking">
                <div class="container">
                    <div class="row align-items-center">
                        <div class="col-lg-7">
                            <div class="booking-content">
                                <div class="section-header">
                                    <p>Book A Table</p>
                                    <h2>Book Your Table For Private Dinners & Happy Hours</h2>
                                </div>
                                <div class="about-text">
                                    <p>
                                        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus nec pretium mi. Curabitur facilisis ornare velit non vulputate. Aliquam metus tortor, auctor id gravida condimentum, viverra quis sem.
                                    </p>
                                    <p>
                                        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus nec pretium mi. Curabitur facilisis ornare velit non vulputate. Aliquam metus tortor, auctor id gravida condimentum, viverra quis sem. Curabitur non nisl nec nisi scelerisque maximus. Aenean consectetur convallis porttitor. Aliquam interdum at lacus non blandit.
                                    </p>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-5">
                            <div class="booking-form">
                                <form>
                                    <div class="control-group">
                                        <div class="input-group">
                                            <input type="text" class="form-control" placeholder="Name" required="required" />
                                            <div class="input-group-append">
                                                <div class="input-group-text"><i class="far fa-user"></i></div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <div class="input-group">
                                            <input type="email" class="form-control" placeholder="Email" required="required" />
                                            <div class="input-group-append">
                                                <div class="input-group-text"><i class="far fa-envelope"></i></div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <div class="input-group">
                                            <input type="text" class="form-control" placeholder="Mobile" required="required" />
                                            <div class="input-group-append">
                                                <div class="input-group-text"><i class="fa fa-mobile-alt"></i></div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <div class="input-group date" id="date" data-target-input="nearest">
                                            <input type="text" class="form-control datetimepicker-input" placeholder="Date" data-target="#date" data-toggle="datetimepicker"/>
                                            <div class="input-group-append" data-target="#date" data-toggle="datetimepicker">
                                                <div class="input-group-text"><i class="far fa-calendar-alt"></i></div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <div class="input-group time" id="time" data-target-input="nearest">
                                            <input type="text" class="form-control datetimepicker-input" placeholder="Time" data-target="#time" data-toggle="datetimepicker"/>
                                            <div class="input-group-append" data-target="#time" data-toggle="datetimepicker">
                                                <div class="input-group-text"><i class="far fa-clock"></i></div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <div class="input-group">
                                            <select class="custom-select form-control">
                                                <option selected>Guest</option>
                                                <option value="1">1 Guest</option>
                                                <option value="2">2 Guest</option>
                                                <option value="3">3 Guest</option>
                                                <option value="4">4 Guest</option>
                                                <option value="5">5 Guest</option>
                                                <option value="6">6 Guest</option>
                                                <option value="7">7 Guest</option>
                                                <option value="8">8 Guest</option>
                                                <option value="9">9 Guest</option>
                                                <option value="10">10 Guest</option>
                                            </select>
                                            <div class="input-group-append">
                                                <div class="input-group-text"><i class="fa fa-chevron-down"></i></div>
                                            </div>
                                        </div>
                                    </div>
                                    <div>
                                        <button class="btn custom-btn" type="submit">Book Now</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Booking End -->


            <!-- About Start -->
            <div class="about">
                <div class="container">
                    <div class="row align-items-center">
                        <div class="col-lg-6">
                            <div class="about-img">
                                <img src="img/about.jpg" alt="Image">
                                <button type="button" class="btn-play" data-toggle="modal" data-src="https://www.youtube.com/embed/DWRcNpR6Kdc" data-target="#videoModal">
                                    <span></span>
                                </button>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="about-content">
                                <div class="section-header">
                                    <p>About Us</p>
                                    <h2>Cooking Since 1990</h2>
                                </div>
                                <div class="about-text">
                                    <p>
                                        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus nec pretium mi. Curabitur facilisis ornare velit non vulputate. Aliquam metus tortor, auctor id gravida condimentum, viverra quis sem.
                                    </p>
                                    <p>
                                        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus nec pretium mi. Curabitur facilisis ornare velit non vulputate. Aliquam metus tortor, auctor id gravida condimentum, viverra quis sem. Curabitur non nisl nec nisi scelerisque maximus. Aenean consectetur convallis porttitor. Aliquam interdum at lacus non blandit.
                                    </p>
                                    <a class="btn custom-btn" href="">Book A Table</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- About End -->


            <!-- Video Modal Start-->
            <div class="modal fade" id="videoModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-body">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>        
                            <!-- 16:9 aspect ratio -->
                            <div class="embed-responsive embed-responsive-16by9">
                                <iframe class="embed-responsive-item" src="" id="video"  allowscriptaccess="always" allow="autoplay"></iframe>
                            </div>
                        </div>
                    </div>
                </div>
            </div> 
            <!-- Video Modal End -->


            <!-- Feature Start -->
            <div class="feature">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-5">
                            <div class="section-header">
                                <p>Why Choose Us</p>
                                <h2>Our Key Features</h2>
                            </div>
                            <div class="feature-text">
                                <div class="feature-img">
                                    <div class="row">
                                        <div class="col-6">
                                            <img src="img/feature-1.jpg" alt="Image">
                                        </div>
                                        <div class="col-6">
                                            <img src="img/feature-2.jpg" alt="Image">
                                        </div>
                                        <div class="col-6">
                                            <img src="img/feature-3.jpg" alt="Image">
                                        </div>
                                        <div class="col-6">
                                            <img src="img/feature-4.jpg" alt="Image">
                                        </div>
                                    </div>
                                </div>
                                <p>
                                    Lorem ipsum dolor sit amet consec adipis elit. Phasel nec preti mi. Curabit facilis ornare velit non vulputa. Aliquam metus tortor, auctor id gravida condime, viverra quis sem. Curabit non nisl nec nisi sceleri maximus 
                                </p>
                                <a class="btn custom-btn" href="">Book A Table</a>
                            </div>
                        </div>
                        <div class="col-lg-7">
                            <div class="row">
                                <div class="col-sm-6">
                                    <div class="feature-item">
                                        <i class="flaticon-cooking"></i>
                                        <h3>World’s best Chef</h3>
                                        <p>
                                            Lorem ipsum dolor sit amet elit. Phasel nec preti mi. Curabit facilis ornare velit non vulput metus tortor
                                        </p>
                                    </div>
                                </div>
                                <div class="col-sm-6">
                                    <div class="feature-item">
                                        <i class="flaticon-vegetable"></i>
                                        <h3>Natural ingredients</h3>
                                        <p>
                                            Lorem ipsum dolor sit amet elit. Phasel nec preti mi. Curabit facilis ornare velit non vulput metus tortor
                                        </p>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-6">
                                    <div class="feature-item">
                                        <i class="flaticon-medal"></i>
                                        <h3>Best quality products</h3>
                                        <p>
                                            Lorem ipsum dolor sit amet elit. Phasel nec preti mi. Curabit facilis ornare velit non vulput metus tortor
                                        </p>
                                    </div>
                                </div>
                                <div class="col-sm-6">
                                    <div class="feature-item">
                                        <i class="flaticon-meat"></i>
                                        <h3>Fresh vegetables & Meet</h3>
                                        <p>
                                            Lorem ipsum dolor sit amet elit. Phasel nec preti mi. Curabit facilis ornare velit non vulput metus tortor
                                        </p>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-6">
                                    <div class="feature-item">
                                        <i class="flaticon-courier"></i>
                                        <h3>Fastest door delivery</h3>
                                        <p>
                                            Lorem ipsum dolor sit amet elit. Phasel nec preti mi. Curabit facilis ornare velit non vulput metus tortor
                                        </p>
                                    </div>
                                </div>
                                <div class="col-sm-6">
                                    <div class="feature-item">
                                        <i class="flaticon-fruits-and-vegetables"></i>
                                        <h3>Ground beef & Low fat</h3>
                                        <p>
                                            Lorem ipsum dolor sit amet elit. Phasel nec preti mi. Curabit facilis ornare velit non vulput metus tortor
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Feature End -->


            <!-- Food Start -->
            <div class="food">
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

            <!-- Menu End -->


            <!-- Team Start -->
            <div class="team">
                <div class="container">
                    <div class="section-header text-center">
                        <p>Our Team</p>
                        <h2>Our Master Chef</h2>
                    </div>
                    <div class="row">
                        <div class="col-lg-3 col-md-6">
                            <div class="team-item">
                                <div class="team-img">
                                    <img src="img/team-1.jpg" alt="Image">
                                    <div class="team-social">
                                        <a href=""><i class="fab fa-twitter"></i></a>
                                        <a href=""><i class="fab fa-facebook-f"></i></a>
                                        <a href=""><i class="fab fa-linkedin-in"></i></a>
                                        <a href=""><i class="fab fa-instagram"></i></a>
                                    </div>
                                </div>
                                <div class="team-text">
                                    <h2>Adam Phillips</h2>
                                    <p>CEO, Co Founder</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-6">
                            <div class="team-item">
                                <div class="team-img">
                                    <img src="img/team-2.jpg" alt="Image">
                                    <div class="team-social">
                                        <a href=""><i class="fab fa-twitter"></i></a>
                                        <a href=""><i class="fab fa-facebook-f"></i></a>
                                        <a href=""><i class="fab fa-linkedin-in"></i></a>
                                        <a href=""><i class="fab fa-instagram"></i></a>
                                    </div>
                                </div>
                                <div class="team-text">
                                    <h2>Dylan Adams</h2>
                                    <p>Master Chef</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-6">
                            <div class="team-item">
                                <div class="team-img">
                                    <img src="img/team-3.jpg" alt="Image">
                                    <div class="team-social">
                                        <a href=""><i class="fab fa-twitter"></i></a>
                                        <a href=""><i class="fab fa-facebook-f"></i></a>
                                        <a href=""><i class="fab fa-linkedin-in"></i></a>
                                        <a href=""><i class="fab fa-instagram"></i></a>
                                    </div>
                                </div>
                                <div class="team-text">
                                    <h2>Jhon Doe</h2>
                                    <p>Master Chef</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-6">
                            <div class="team-item">
                                <div class="team-img">
                                    <img src="img/team-4.jpg" alt="Image">
                                    <div class="team-social">
                                        <a href=""><i class="fab fa-twitter"></i></a>
                                        <a href=""><i class="fab fa-facebook-f"></i></a>
                                        <a href=""><i class="fab fa-linkedin-in"></i></a>
                                        <a href=""><i class="fab fa-instagram"></i></a>
                                    </div>
                                </div>
                                <div class="team-text">
                                    <h2>Josh Dunn</h2>
                                    <p>Master Chef</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Team End -->


            <!-- Testimonial Start -->
            <div class="testimonial">
                <div class="container">
                    <div class="owl-carousel testimonials-carousel">
                        <div class="testimonial-item">
                            <div class="testimonial-img">
                                <img src="img/testimonial-1.jpg" alt="Image">
                            </div>
                            <p>
                                Lorem ipsum dolor sit amet elit. Phasel nec preti mi. Curabit facilis ornare velit non vulput
                            </p>
                            <h2>Client Name</h2>
                            <h3>Profession</h3>
                        </div>
                        <div class="testimonial-item">
                            <div class="testimonial-img">
                                <img src="img/testimonial-2.jpg" alt="Image">
                            </div>
                            <p>
                                Lorem ipsum dolor sit amet elit. Phasel nec preti mi. Curabit facilis ornare velit non vulput
                            </p>
                            <h2>Client Name</h2>
                            <h3>Profession</h3>
                        </div>
                        <div class="testimonial-item">
                            <div class="testimonial-img">
                                <img src="img/testimonial-3.jpg" alt="Image">
                            </div>
                            <p>
                                Lorem ipsum dolor sit amet elit. Phasel nec preti mi. Curabit facilis ornare velit non vulput
                            </p>
                            <h2>Client Name</h2>
                            <h3>Profession</h3>
                        </div>
                        <div class="testimonial-item">
                            <div class="testimonial-img">
                                <img src="img/testimonial-4.jpg" alt="Image">
                            </div>
                            <p>
                                Lorem ipsum dolor sit amet elit. Phasel nec preti mi. Curabit facilis ornare velit non vulput
                            </p>
                            <h2>Client Name</h2>
                            <h3>Profession</h3>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Testimonial End -->


            <!-- Contact Start -->
            <div class="contact">
                <div class="container">
                    <div class="section-header text-center">
                        <p>Contact Us</p>
                        <h2>Contact For Any Query</h2>
                    </div>
                    <div class="row align-items-center contact-information">
                        <div class="col-md-6 col-lg-3">
                            <div class="contact-info">
                                <div class="contact-icon">
                                    <i class="fa fa-map-marker-alt"></i>
                                </div>
                                <div class="contact-text">
                                    <h3>Address</h3>
                                    <p>123 Street, NY, USA</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 col-lg-3">
                            <div class="contact-info">
                                <div class="contact-icon">
                                    <i class="fa fa-phone-alt"></i>
                                </div>
                                <div class="contact-text">
                                    <h3>Call Us</h3>
                                    <p>+012 345 6789</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 col-lg-3">
                            <div class="contact-info">
                                <div class="contact-icon">
                                    <i class="fa fa-envelope"></i>
                                </div>
                                <div class="contact-text">
                                    <h3>Email Us</h3>
                                    <p>info@example.com</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 col-lg-3">
                            <div class="contact-info">
                                <div class="contact-icon">
                                    <i class="fa fa-share"></i>
                                </div>
                                <div class="contact-text">
                                    <h3>Follow Us</h3>
                                    <div class="contact-social">
                                        <a href=""><i class="fab fa-twitter"></i></a>
                                        <a href=""><i class="fab fa-facebook-f"></i></a>
                                        <a href=""><i class="fab fa-youtube"></i></a>
                                        <a href=""><i class="fab fa-instagram"></i></a>
                                        <a href=""><i class="fab fa-linkedin-in"></i></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row contact-form">
                        <div class="col-md-6">
                            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3001156.4288297426!2d-78.01371936852176!3d42.72876761954724!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x4ccc4bf0f123a5a9%3A0xddcfc6c1de189567!2sNew%20York%2C%20USA!5e0!3m2!1sen!2sbd!4v1600663868074!5m2!1sen!2sbd" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
                        </div>
                        <div class="col-md-6">
                            <div id="success"></div>
                            <form name="sentMessage" id="contactForm" novalidate="novalidate">
                                <div class="control-group">
                                    <input type="text" class="form-control" id="name" placeholder="Your Name" required="required" data-validation-required-message="Please enter your name" />
                                    <p class="help-block text-danger"></p>
                                </div>
                                <div class="control-group">
                                    <input type="email" class="form-control" id="email" placeholder="Your Email" required="required" data-validation-required-message="Please enter your email" />
                                    <p class="help-block text-danger"></p>
                                </div>
                                <div class="control-group">
                                    <input type="text" class="form-control" id="subject" placeholder="Subject" required="required" data-validation-required-message="Please enter a subject" />
                                    <p class="help-block text-danger"></p>
                                </div>
                                <div class="control-group">
                                    <textarea class="form-control" id="message" placeholder="Message" required="required" data-validation-required-message="Please enter your message"></textarea>
                                    <p class="help-block text-danger"></p>
                                </div>
                                <div>
                                    <button class="btn custom-btn" type="submit" id="sendMessageButton">Send Message</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Contact End -->


            <!-- Blog Start -->
            <div class="blog">
                <div class="container">
                    <div class="section-header text-center">
                        <p>Food Blog</p>
                        <h2>Latest From Food Blog</h2>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <div class="blog-item">
                                <div class="blog-img">
                                    <img src="img/blog-1.jpg" alt="Blog">
                                </div>
                                <div class="blog-content">
                                    <h2 class="blog-title">Lorem ipsum dolor sit amet</h2>
                                    <div class="blog-meta">
                                        <p><i class="far fa-user"></i>Admin</p>
                                        <p><i class="far fa-list-alt"></i>Food</p>
                                        <p><i class="far fa-calendar-alt"></i>01-Jan-2045</p>
                                        <p><i class="far fa-comments"></i>10</p>
                                    </div>
                                    <div class="blog-text">
                                        <p>
                                            Lorem ipsum dolor sit amet elit. Neca pretim miura bitur facili ornare velit non vulpte liqum metus tortor. Lorem ipsum dolor sit amet elit. Neca pretim miura bitur facili ornare velit non vulpte
                                        </p>
                                        <a class="btn custom-btn" href="">Read More</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="blog-item">
                                <div class="blog-img">
                                    <img src="img/blog-2.jpg" alt="Blog">
                                </div>
                                <div class="blog-content">
                                    <h2 class="blog-title">Lorem ipsum dolor sit amet</h2>
                                    <div class="blog-meta">
                                        <p><i class="far fa-user"></i>Admin</p>
                                        <p><i class="far fa-list-alt"></i>Food</p>
                                        <p><i class="far fa-calendar-alt"></i>01-Jan-2045</p>
                                        <p><i class="far fa-comments"></i>10</p>
                                    </div>
                                    <div class="blog-text">
                                        <p>
                                            Lorem ipsum dolor sit amet elit. Neca pretim miura bitur facili ornare velit non vulpte liqum metus tortor. Lorem ipsum dolor sit amet elit. Neca pretim miura bitur facili ornare velit non vulpte
                                        </p>
                                        <a class="btn custom-btn" href="">Read More</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Blog End -->


            <!-- Footer Start -->
        <jsp:include page="components/footer.jsp"></jsp:include>
            <!-- Footer End -->


            <!---- Register form -->
            <div  id="modal-register" class="modal1" style="display: none"  >
                <div onclick="registerHide()" id="modal_overlay" class="modal_overlay"></div>
                <div class="modal_body">
                    <div class="modal_inner">
                        <div class="card bg-light">
                            <article class="card-body mx-auto" style="max-width: 400px;">
                                <button onclick="registerHide()" type="button" class="close" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                                <h4 class="card-title mt-3 text-center">Create Account</h4>
                                <p class="text-center">Get started with your free account</p>
                                <p>
                                    <a href="" class="btn btn-block btn-twitter"> <i class="fab fa-twitter"></i>Login with Twitter</a>
                                    <a href="" class="btn btn-block btn-facebook"> <i class="fab fa-facebook-f"></i>Login with Facebook</a>
                                </p>
                                <p class="divider-text">
                                    <span class="bg-light">OR</span>
                                </p>
                                <form action="/BugerKingW/Register" method="post">
                                    <div class="form-group input-group">
                                        <div class="input-group-prepend">
                                            <span class="input-group-text"> <i class="fa fa-user"></i> </span>
                                        </div>
                                        <input name="cname" class="form-control" placeholder="Full name" type="text">
                                    </div> <!-- form-group// -->
                                    <div class="form-group input-group">
                                        <div class="input-group-prepend">
                                            <span class="input-group-text"> <i class="fa fa-envelope"></i> </span>
                                        </div>
                                        <input name="cemail" class="form-control" placeholder="Email address" type="email">
                                    </div> <!-- form-group// -->
                                    <div class="form-group input-group">
                                        <div class="input-group-prepend">
                                            <span class="input-group-text"> <i class="fa fa-phone"></i> </span>
                                        </div>
                                        <select class="custom-select" style="max-width: 120px;">
                                            <option selected="">+971</option>
                                            <option value="1">+972</option>
                                            <option value="2">+198</option>
                                            <option value="3">+701</option>
                                        </select>
                                        <input name="cphone" class="form-control" placeholder="Phone number" type="text">
                                    </div> <!-- form-group// -->
                                    <div class="form-group input-group">
                                        <div class="input-group-prepend">
                                            <span class="input-group-text"> <i class="fa fa-building"></i> </span>
                                        </div>
                                        <input name="caddress" class="form-control" placeholder="Address" type="text">
                                    </div>
                                    <!--     check username-->
                                    <span id="Checking"></span>
                                    <div id="hieu" class="form-group input-group">
                                        <div class="input-group-prepend">
                                            <span class="input-group-text"> <i class="fa fa-user"></i> </span>
                                        </div>
                                        <input oninput="CheckUserName()" id="username1"   name="username" class="form-control" placeholder="User name" type="text">
                                    </div>
                                    <!--   check username end-->
                                    <div class="form-group input-group">
                                        <div class="input-group-prepend">
                                            <span class="input-group-text"> <i class="fa fa-lock"></i> </span>
                                        </div>
                                        <input id="pass" name="password" onkeyup="checkPass()" class="form-control" placeholder="Create password" type="password">
                                    </div> <!-- form-group// -->
                                    <div id="colorConfirm" class="form-group input-group">
                                        <div class="input-group-prepend">
                                            <span class="input-group-text"> <i class="fa fa-lock"></i> </span>
                                        </div>
                                        <input id="confirm" name="repass" onblur="hideCheck()" onkeyup="checkPass()" class="form-control" placeholder="Repeat password" type="password">
                                    </div>                                   
                                    <div class="form-group">
                                        <button type="submit" class="btn btn-primary btn-block"> Create Account  </button>
                                    </div> <!-- form-group// -->      
                                    <p class="text-center">Have an account? <a href="">Log In</a> </p>                                                                 
                                </form>
                            </article>
                        </div> <!-- card.// -->
                    </div>
                </div>
            </div>

            <!-- Login form-->
            <div  id="modal-login" class="modal1" style="display: ${loginForm==null?"none":"block"}"  >
            <div onclick="loginFormHide()" id="modal_overlay" class="modal_overlay"></div>
            <div class="modal_body">
                <div class="modal_inner">
                    <div class="card bg-light">
                        <article class="card-body mx-auto" style="max-width: 400px;">
                            <button onclick="loginFormHide()" type="button" class="close" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                            <h4 class="card-title mt-3 text-center">LOGIN WITH</h4>
                            <p>
                                <a href="" class="btn btn-block btn-twitter"> <i class="fab fa-twitter"></i>Login with Twitter</a>
                                <a href="" class="btn btn-block btn-facebook"> <i class="fab fa-facebook-f"></i>Login with Facebook</a>
                            </p>
                            <p class="divider-text">
                                <span class="bg-light">OR</span>
                            </p>
                            <form action="/BugerKingW/login" method="post">    
                                <p class="text-danger">${messForLogin}</p>
                                <div  class="form-group input-group">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text"> <i class="fa fa-user"></i> </span>
                                    </div>
                                    <input  name="userNameForLogin" class="form-control" placeholder="User name" type="text">
                                </div>                             
                                <div class="form-group input-group">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text"> <i class="fa fa-lock"></i> </span>
                                    </div>
                                    <input  name="passwordForLogin"  class="form-control" placeholder="Password" type="password">
                                </div> <!-- form-group// -->

                                <div class="form-group">
                                    <button type="submit" class="btn btn-primary btn-block"> Login  </button>
                                </div> <!-- form-group// -->                                                                       
                            </form>
                        </article>
                    </div> <!-- card.// -->
                </div>
            </div>
        </div>
        <!-- Login form end--!>

        <a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>

        <!-- JavaScript Libraries -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script> 
        <!--        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>-->
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

