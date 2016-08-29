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
                <ul class="nav navbar-nav">
                    <li ><a rel="leanModal" href="#signup_email_req_block" id="signUpLink"><i class="fa fa-gift fa-1x"></i>&nbsp;Sign Up: for farm jobs</a></li> 
                </ul> 
                <ul class="nav navbar-nav navbar-right">
                    
                    <li id="sign_in"><a href="#" id="signInLink"><i class="fa fa-sign-in fa-1x"></i>&nbsp;Sign In</a></li>
                    <li id="userProfile"  class="dropdown"></li>                    
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
                 <div class="col-sm-3">
                              <h2 class="page-header">Steps</h2>
                              <label class="control" id="profile_photo_step">Profile Photo
                                    </label>                               
                                  <label class="control" id="personal_step">Personal Data
                                    </label>                               
                                    <label class="control" id="contact_step">Contact Data
                                    </label>                               
                                    <label class="control" id="knowledge_base_step">Knowledge Base
                                    </label>                               
                                    <label class="control" id="origin_step">Origin Data
                                    </label>                               
                                    <label class="control" id="next_of_kin_step">Next of Kin
                                    </label>                
                        
                    </div>
                    <div class="col-sm-6">
                    <div class="postwidgets box" id="reg_data_block">
                          <h2>Farmers Registration Form</h2>
                        <div id="forms_section"></div>                            
                            <div  id="profile_section">
                                        <h4><i class="fa fa-male fa-3x"></i>Profile Photo</h4><hr>
                                        <div class="alert alert-info" id="instruction-1">
                                                <button class="close" data-dismiss="alert">&times;</button>
                                                <strong>Info!</strong> Use camera to set your profile picture or upload your passport photograph
                                        </div>
                                 <div id="image_zone"><img src='images/avater2.jpg'></div>   

                                 <div id="camera_zone">    
                                    <div class="actions">
                                    <div class="btn-group" data-toggle="buttons">
                                            <input type="button"  class="btn btn-primary" value="Open Cemera" id="camera_access"></input>                    
                                            <input type="button"  class="btn btn-primary" value="Take Snapshot" id="take_snapshot"></input>                    
                                            <input type="button"  class="btn btn-primary" value="Take Another" id="take_another"></input>                    
                                            <input type="button"  class="btn btn-primary" value="Save Photo" id="save_photo"></input>                    
                                            <input type="button"  class="btn btn-primary" value="Reset Photograph" id="reset_photo"></input>                                                                                                   
                                    </div>

                                    </div>                                       
                                  <div id="my_camera"></div>
                                 </div>
                            </div><br/><!-- /validate -->                                            
                            <span id="validate_form" class="label label-warning"></span>                        
                            
                            <div class="post-footer form-group">
                              <div class="fileUpload btn">
                                    <i class="fa fa-image fa-3x"></i>
                                    <input type="file"  name="datafile"  class="upload" id="uploadProfilePhoto"/>
                                </div>      
                                 <div class="fileUpload btn">
                                    <a href="#" id="use_camera"><span><i class="fa fa-camera fa-3x"></i></span></a>
                                </div>      
                                    <input type="button"  class="btn btn-primary" name="profile_photo" value="Proceed" id="proceed-to-personal-data"></input>                    
                                    <input type="button"  class="btn btn-primary" name="personal_data" value="Save & Proceed" id="proceed-to-contact-data"></input>                    
                                    <input type="button"  class="btn btn-primary" name="contact_data" value="Save & Proceed" id="proceed-to-knowledge-data"></input>                    
                                    <input type="button"  class="btn btn-primary" name="knowlege_base" value="Save & Proceed" id="proceed-to-origin-data"></input>                    
                                    <input type="button"  class="btn btn-primary" name="origin_data" value="Save & Proceed" id="proceed-to-nextofkin-data"></input>                    
                                    <input type="button"  class="btn btn-primary" name="next_ofkin_data"  value="Save & Proceed" id="proceed-to-captcha-data"></input>                    
                                    <input type="button"  class="btn btn-primary" name="submit_data"  value="Submit Finally" id="proceed-to-submit"></input>                    
                                    <input type="button"  class="btn btn-primary" name="submit_data"  value="Reset All" id="reset-form"></input>                    
                                    <span class="label" id="photoUploadmsg" style="display:none;color: red;">Uploading..</span>
                                    
                                    
                        </div> 
                    </div>
                        
                        <div id="signup_email_req_block">
                            <h5>Provide your valid email address</h5>
                            <span class="validateMail" style="color: red;"></span>
                            <br>  
                            <input type="email" placeholder="Email Address" id="req-mail"></input><br />
                            <input type="button"  class="btn btn-primary" value="Submit" id="submit-req"></input>                              
                        </div>
                        <div id="signin_form_block">
                             <form>
                                 <fieldset>
                                    <input type="radio" name="signin" id="rbFarmer" value="Farmer"><strong>&nbsp;Sign In as farmer.</strong>
                                    <br>
                                     <input type="radio" name="signin" id="rbFarmManager" value="Farm Manager"><strong>&nbsp;Sign In as farm manager.</strong>
                                    <br>
                                 </fieldset>
                             </form>                             
                           <div id="pin_phone_block">
                               <div class="form-group">
                                <input  type="text" id="farmer_pin" class=" custom-input" placeholder="Registration pin"/>
                                <input  type="text" id="farmer_mobile_number" class="custom-input" placeholder="Phone number"/>
                               </div>
                               <div class="form-group">
                                 <input  type="button" id="submit_signup_req" class="btn btn-primary" value="Submit"/>                                    
                                 <label><a href="#">Forgot Pin?</a></label>
                               </div>
                           </div>
                        </div>
                    </div>
                    <div class="col-sm-3">
                        <script type="text/javascript">
                        new pausescroller(pausecontent, "pscroller1", "", 3000);
                        </script>   
                    </div>

                </div>
                </div>
                <div class="col-lg-3" id="contaner-right">

                </div>

    </div>   
   
</div>   
    <script src="js/portal.init.js"></script> 
<script src="js/bootstrap.min.js"></script>  
<script src="js/dropzone.js"></script> 
    </body>
</html>
