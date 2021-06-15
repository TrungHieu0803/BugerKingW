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
    console.log(number);
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
function reduceAmount(pid,price) {
    var totalPrice = parseFloat(document.getElementById("totoalPrice").innerHTML);
    
    var number = parseInt(document.getElementById(pid).innerHTML);
    if (number !== 1) {
        document.getElementById(pid).innerHTML = number - 1;
        document.getElementById("totoalPrice").innerHTML = totalPrice - parseFloat(price);
    } else
        return;
    var totalNumber = parseInt(document.getElementById('itemInCart').innerHTML);
    if (totalNumber !== 1) {
        document.getElementById('itemInCart').innerHTML = totalNumber - 1;
    }
    jQuery.ajax({
        url: "/BugerKingW/CartControl",
        type: "POST",
        data: {pid: pid,
            service: "reduceAmount"},
        success: function () {
        }, error: function () {
        }

    });
}
function increaseAmount(pid,price) {
    var totalPrice = parseFloat(document.getElementById("totoalPrice").innerHTML);
    var totalNumber = parseInt(document.getElementById('itemInCart').innerHTML) + 1;
    document.getElementById('itemInCart').innerHTML = totalNumber;
    var number = parseInt(document.getElementById(pid).innerHTML) + 1;
    document.getElementById(pid).innerHTML = number;
    document.getElementById("totoalPrice").innerHTML = totalPrice + parseFloat(price);
    jQuery.ajax({
        url: "/BugerKingW/CartControl",
        type: "POST",
        data: {pid: pid,
            service: "increaseAmount"},
        success: function () {
        }, error: function () {
        }

    });
}
function removeProduct(pid, btn,price) {
    var r = confirm("Do you want remove this product?");
    if (r === true) {
        var totalPrice = parseFloat(document.getElementById("totoalPrice").innerHTML);
        var number = parseInt(document.getElementById(pid).innerHTML);
        var totalNumber = parseInt(document.getElementById('itemInCart').innerHTML);
        document.getElementById('itemInCart').innerHTML=totalNumber-number;
        document.getElementById("totoalPrice").innerHTML= totalPrice - parseFloat(price)*number;
        btn.parentElement.parentElement.parentElement.style.display = "none";
        jQuery.ajax({
            url: "/BugerKingW/CartControl",
            type: "POST",
            data: {pid: pid,
                service: "removeProduct"},
            success: function () {
                console.log("deleted");
            }, error: function () {

            }
        });
    }
}



