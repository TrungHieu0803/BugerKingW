

<!DOCTYPE html>
<html>
    <head>

        <script src="http://code.jquery.com/jquery-2.1.3.min.js"></script>
<script src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<script type="text/javascript" src="http://botmonster.com/jquery-bootpag/jquery.bootpag.js"></script>
<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <style>
            .wrapper{
                margin: 60px auto;
                text-align: center;
            }
            h1{
                margin-bottom: 1.25em;
            }

            /*Specific styling*/
            #content{
                padding: 15px;
                border: solid 1px #eee;
                max-width: 660px;
                margin: auto;
                border-radius: 4px;
            }
        </style>
    </head>
    <body>
        <div class="wrapper">
            <div class="container">

                <div class="row">
                    <div class="col-sm-12">
                        <h1>jQuery Bootpag Pagination Example</h1>
                        <p>Showcaes the jQueyr Bootpag pagination JS library for creating simple, quick JS based pagination.</p>
                        <p id="show_paginator"></p>
                        <p id="content">Dynamic page content</p>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript">
            $('#show_paginator').bootpag({
                total: 23,
                page: 3,
                maxVisible: 10
            }).on('page', function (event, num)
            {
                $("#content").html("Page " + num); // or some ajax content loading...
            });
        </script>
        
    </body>

</html>
