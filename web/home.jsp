<%-- 
    Document   : index
    Created on : Jun 28, 2016, 6:20:44 AM
    Author     : Mutual-Links
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <title>Openfarm | Portal</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Openfarm,Openfarm Portal,Farm,Nigeria Farm" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all" />
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" media="all">
    <link href="css/stylesheet.css" rel="stylesheet" type="text/css" media="all"/>
    <link href="css/custom-b.css" rel="stylesheet" type="text/css" media="all">
    <link href="css/custom-a.css" rel="stylesheet" type="text/css" media="all">
    <link href="css/formstyle.css" rel="stylesheet" type="text/css" media="all">
    <link href="css/blogaccountstyle.css" rel="stylesheet" type="text/css" media="all">
    <link href="css/blogloginstyle.css" rel="stylesheet" type="text/css" media="all">    
    <link href="css/custom-hidden-styles.css" rel="stylesheet" type="text/css" media="all">    
    <link href="js/prettify/prettify.css" type="text/css" rel="stylesheet" />
    <script  type="text/javascript" src="js/jquery-2.1.4.js"></script>
    <script src="js/modernizr.js"></script> 
    <script src="js/animate-marquee.js"></script> 
    <script src="js/custom-1.js"></script> 
    <script type="text/javascript" src="js/jquery.ajaxfileupload.js"></script>
    <script type="text/javascript" src="js/prettify/prettify.js"></script>
    <script type="text/javascript" src="js/prettify/jquery.slimscroll.js"></script>    
    <script type="text/javascript" src="js/jquery.leanModal.min.js"></script>
    <script src="js/portal.init.js"></script> 
    <style>
        body{
                padding:0;
                margin:0;
                background:#e7e7e7;
                overflow-x: hidden;        
        } 
        body a{
              color:  #000;
        } 
        #userLink{
            background: #00A902;
        }
        .slack{
            margin-top: 5px;
        }
    </style>
    
    </head>
    <body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60">
            <!-- Fixed navbar -->
    <nav class="navbar navbar-default navbar-fixed-top nav.offset" role="navigation">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
         <a class="navbar-brand hidden-xs" href="#">Openfarm.Portal
        <img src="images/favicon.ico" alt="" />
         </a>
         <a class="navbar-brand visible-xs" href="#">
             Portal<img src="images/favicon.ico" alt="" />
           </a>            
        </div>
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">           
                <ul class="nav navbar-nav navbar-right">
                 <li id="notification"  class="dropdown">
                    <a href='#' id='userLink' class='dropdown-toggle' data-toggle='dropdown'>
                    <i class='fa fa-bell-o fa-1x'></i><span class='badge'>3</span></a>
                    <ul class='dropdown-menu' id='userDropDown'>
                        <li class='divider'></li>
                    </ul> 
                   </li> 
                   
                    <li id="userProfile"  class="dropdown">
                    <a href='#' id='userLink' class='dropdown-toggle' data-toggle='dropdown'>
                    <i class='fa fa-user fa-1x'></i><b class='caret'></b></a>
                    <ul class='dropdown-menu' id='userDropDown'>
                        <li><a href='#'></a></li>
                        <li class='divider'></li>
                        <li><a href='#' id='logoutLink'>Logout</a></li>
                    </ul> 
                   </li> 
                </ul>                                                    
        </div>
    </nav>
    <div id="head_slack"></div>
    <div id="cookiecheck"></div>
<!-- /Fixed navbar -->	 
    <div class="grid_3 grid_5">   
            <div class="container">
            <div class="col-lg-12 col-lg-12">
                <div class=" slack col-lg-9" id="main_page_wraper"> 
                <div class="row">
                    <div class="col-sm-3" id="menu_content">
                        <hr>
                        <ul class="">
                        <li class="openfarm menu"><a href="#" id="home_menu"><i class="fa fa-home fa-1x"></i>&nbsp;Home</a></li>
                        <li class="openfarm menu"><a href="#" id="verify_menu"><i class="fa fa-check-circle-o fa-1x"></i>&nbsp;Verification</a></li>
                        <li class="openfarm menu"><a href="#" id="value_chain_menu"><i class="fa fa-chain fa-1x"></i>&nbsp;Value Chain</a></li>
                        <li class="openfarm menu"><a href="#" id="group_menu"><i class="fa fa-group fa-1x"></i>&nbsp;Group</a></li>
                        <li class="openfarm menu"><a href="#" id="crop_menu"><i class="fa fa-crop fa-1x"></i>&nbsp;Crop</a></li>
                        <li class="openfarm menu"><a href="#" id="production_menu"><i class="fa fa-gears fa-1x"></i>&nbsp;Production</a></li>
                        <li class="openfarm menu"><a href="#" id="application_menu"><i class="fa fa-support fa-1x"></i>&nbsp;Application</a></li>
                        <li class="openfarm menu"><a href="#" id="process_menu"><i class="fa fa-industry fa-1x"></i>&nbsp;Processing</a></li>
                        <li class="openfarm menu"><a href="#" id="market_menu"><i class="fa fa-map-marker fa-1x"></i>&nbsp;Market</a></li>
                        <li class="openfarm menu"><a href="#" id="revenue_menu"><i class="fa fa-money fa-1x"></i>&nbsp;Revenue</a></li>
                        <li class="openfarm menu"><a href="#" id="survey_menu"><i class="fa fa-bar-chart-o fa-1x"></i>&nbsp;Survey</a></li>
                        </ul>                        
                        
                    </div>
                    <div class="col-sm-9" id="main_content">
                        
                        
                    </div>
                </div>                    
                    
                </div>
                <div class="col-lg-3" id="contaner-right">

                </div>
            </div>
    </div>   
   
</div>   
    <!-- js files -->
<script src="js/bootstrap.min.js"></script>  
<script src="js/dropzone.js"></script> 
    </body>
</html>
