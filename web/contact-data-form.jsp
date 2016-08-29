<%-- 
    Document   : contact-data-form
    Created on : Aug 26, 2016, 3:12:35 PM
    Author     : Mutual-Links
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <section>
            <div class="container-fluid">
                <div class="row">
                    <h4><i class="fa fa-phone nav_icon fa-3x"></i>Contact Information:Field marked Asterisk (<span class="required">*</span>) are required.</h4><hr>
                     <div class="col-sm-12">
                        <label class="phonenubmber">Mobile Number<span class="required">*</span></label>
                            <input id="phonenubmber" type="text" class="custom-input"/>
                      </div>  
                     <div class="col-sm-12">
                        <label class="email">Email Address</label>
                            <input id="email" type="text" class="custom-input"/>
                      </div>   					  
                     <div class="col-sm-12">
                        <label class="contact">Contact Address<span class="required">*</span></label>
                            <textarea   id="contact" class="styled"></textarea>
                      </div>    					    					    					    
                     <div class="col-sm-12">
                        <label class="city">Village<span class="required">*</span></label>
                            <input id="city" type="text" class="custom-input"/>
                      </div> 	                    
                </div>
            </div>
        </section>
    </body>
</html>
