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
