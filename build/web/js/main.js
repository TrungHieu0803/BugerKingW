(function ($) {
    "use strict";

    // Back to top button
    $(window).scroll(function () {
        if ($(this).scrollTop() > 200) {
            $('.back-to-top').fadeIn('slow');
        } else {
            $('.back-to-top').fadeOut('slow');
        }
    });
    $('.back-to-top').click(function () {
        $('html, body').animate({scrollTop: 0}, 1500, 'easeInOutExpo');
        return false;
    });


    // Sticky Navbar
    $(window).scroll(function () {
        if ($(this).scrollTop() > 0) {
            $('.navbar').addClass('nav-sticky');
        } else {
            $('.navbar').removeClass('nav-sticky');
        }
    });


    // Dropdown on mouse hover
    $(document).ready(function () {
        function toggleNavbarMethod() {
            if ($(window).width() > 992) {
                $('.navbar .dropdown').on('mouseover', function () {
                    $('.dropdown-toggle', this).trigger('click');
                }).on('mouseout', function () {
                    $('.dropdown-toggle', this).trigger('click').blur();
                });
            } else {
                $('.navbar .dropdown').off('mouseover').off('mouseout');
            }
        }
        toggleNavbarMethod();
        $(window).resize(toggleNavbarMethod);
    });


    // Main carousel
    $(".carousel .owl-carousel").owlCarousel({
        autoplay: true,
        animateOut: 'fadeOut',
        animateIn: 'fadeIn',
        items: 1,
        smartSpeed: 300,
        dots: false,
        loop: true,
        nav: false
    });

    // Modal Video
    $(document).ready(function () {
        var $videoSrc;
        $('.btn-play').click(function () {
            $videoSrc = $(this).data("src");
        });
        console.log($videoSrc);

        $('#videoModal').on('shown.bs.modal', function (e) {
            $("#video").attr('src', $videoSrc + "?autoplay=1&amp;modestbranding=1&amp;showinfo=0");
        })

        $('#videoModal').on('hide.bs.modal', function (e) {
            $("#video").attr('src', $videoSrc);
        })
    });


    // Date and time picker
    $('#date').datetimepicker({
        format: 'L'
    });
    $('#time').datetimepicker({
        format: 'LT'
    });


    // Testimonials carousel
    $(".testimonials-carousel").owlCarousel({
        center: true,
        autoplay: true,
        dots: true,
        loop: true,
        responsive: {
            0: {
                items: 1
            },
            576: {
                items: 1
            },
            768: {
                items: 2
            },
            992: {
                items: 3
            }
        }
    });


    // Related post carousel
    $(".related-slider").owlCarousel({
        autoplay: true,
        dots: false,
        loop: true,
        nav: true,
        navText: [
            '<i class="fa fa-angle-left" aria-hidden="true"></i>',
            '<i class="fa fa-angle-right" aria-hidden="true"></i>'
        ],
        responsive: {
            0: {
                items: 1
            },
            576: {
                items: 1
            },
            768: {
                items: 2
            }
        }
    });

})(jQuery);

function registerDisplay() {
    if (document.getElementById("modal-register").style.display === "none") {
        document.getElementById("modal-register").style.display = "block";
    }
}
function registerHide() {
    document.getElementById("modal-register").style.display = "none";
}
function loginFormDisplay() {
    if (document.getElementById("modal-login").style.display === "none") {
        document.getElementById("modal-login").style.display = "block";
    }
}
function loginFormHide() {
    document.getElementById("modal-login").style.display = "none";
}
function displayPicture(pic) {
    document.getElementById('changePicture').src = pic.src;
}
function displayPicture1(pic) {
    document.getElementById('changePicture1').src = pic.src;
}
function displayPicture2(pic) {
    document.getElementById('changePicture2').src = pic.src;
}
function checkPass() {
    var pass = document.getElementById('pass').value;
    var confirm = document.getElementById('confirm').value;
    if (pass == confirm && pass !== "" && confirm !== "") {
        document.getElementById('colorConfirm').style.border = '3px solid green';
    } else if (pass != confirm && confirm !== "") {
        document.getElementById('colorConfirm').style.border = '3px solid red';
    }
}
function hideCheck() {
    document.getElementById('colorConfirm').style.border = 'none';
}
function CheckUserName() {

    var user = document.getElementById('username1').value;
    console.log("user: ", user);
    jQuery.ajax({
        url: "/BugerKingW/CheckUserName",
        type: "POST",
        //       data:'username ='+$("username1").val(),
        data: {username: user},
        success: function (result) {
            console.log(result);
            $("#Checking").html(result);
        }, error: function () {
            $("#Checking").html("");
        }

    });
    if (document.getElementById('username1').value == "") {
        document.getElementById('Checking').style.display = "none";

    } else
        document.getElementById('Checking').style.display = "block";


}
window.setTimeout(function () {
    $(".alert").fadeTo(500, 0).slideUp(500, function () {
        $(this).remove();
    });
}, 2000);

function addToCart(pid) {
    var number = parseInt(document.getElementById('itemInCart').innerHTML) + 1;
    document.getElementById('itemInCart').innerHTML = number;
    console.log(pid);
    jQuery.ajax({
        url: "/BugerKingW/CartControl",
        type: "POST",
        data: {pid: pid,
            service: "addToCart"},
        success: function () {
        }, error: function () {
        }

    });

}
//function addToCart(pid){
//    
//    jQuery.ajax({
//        url: "/BugerKingW/CartControl",
//        type: "POST",
//        data: {pid: pid,
//               service:"reduceAmount"},
//        success: function () {
//        }, error: function () {
//        }
//
//    });
//    
//}

function increaseValue() {
    var value = parseInt(document.getElementById('number').value, 10);
    value = isNaN(value) ? 0 : value;
    value++;
    document.getElementById('number').value = value;
}

function decreaseValue() {
    var value = parseInt(document.getElementById('number').value, 10);
    value = isNaN(value) ? 0 : value;
    value < 1 ? value = 1 : '';
    value--;
    document.getElementById('number').value = value;
}



