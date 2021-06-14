<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : updateproduct
    Created on : Mar 13, 2021, 1:22:32 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Product</title>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    </head>
    <body>
        <jsp:include page="template/header.jsp"></jsp:include>
        <jsp:include page="template/sidebar.jsp"></jsp:include>
        <form class="form-horizontal" action="/BugerKingW/ProductManager?service=addnew" method="POST">
            <fieldset>
                <!-- Form Name -->
                <h1 style="color: green">${mess}</h1>
                    
                <!-- Text input-->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="product_id">ID</label>
                    <div class="col-md-4">
                        <input id="product_id" name="pid"  class="form-control input-md" required="" type="text">

                    </div>
                </div>

                <!-- Text input-->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="product_name">Product Name</label>  
                    <div class="col-md-4">
                        <input id="product_name" name="pname"  class="form-control input-md" required="" type="text">

                    </div>
                </div>

                <!-- Text input-->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="product_price">Price</label>  
                    <div class="col-md-4">
                        <input id="product_price" name="price"  class="form-control input-md" required="" type="text">

                    </div>
                </div>
                <!-- Select Basic -->



                <!-- Text input-->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="image">Image</label>  
                    <div class="col-md-4">
                        <input id="Description" name="image"  class="form-control input-md" required="" type="text">

                    </div>
                </div>

                <div class="form-group">
                    <label class="col-md-4 control-label" for="product_category">Category</label>
                    <div class="col-md-4">
                        <select id="product_category" name="product_category" class="form-control">
                            <option value="1">
                                Buger
                            </option>
                            <option value="2">
                                Snack
                            </option>
                            <option value="3">
                                Drink
                            </option>
                        </select>
                    </div>
                </div>
                <!-- Textarea -->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="product_description">Description</label>
                    <div class="col-md-4">                     
                        <textarea class="form-control"  id="product_description" name="description" rows="9" cols="70"></textarea>
                    </div>

                </div>
                <!-- Textarea -->

                <div  class="form-group">
                    <label class="col-md-4 control-label" for="percentage_discount">                        
                        <button style="text-align: center" type="submit" class="btn btn-success">Thêm sản phẩm </button>
                    </label>
                </div>
            </fieldset>
        </form>

    </body>
</html>
