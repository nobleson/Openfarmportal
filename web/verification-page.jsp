<%-- 
    Document   : verification-page
    Created on : Aug 27, 2016, 2:45:25 PM
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
            <link href="css/custom-c.css" rel="stylesheet" type="text/css" media="all">
            <link rel="stylesheet" href="css/dropzone.css">
            <script src="js/custom-2.js"></script> 
            <div class="container-fluid">   
                <div class="row">    
                    <div class="panel panel-success">
                        <div class="panel-heading">
                           <h2><i class="fa fa-check-circle-o fa-2x"></i>Verification Requirements</h2>
                        </div>
                        <div class="panel-body">
				<div class="row">
                                <div class="col-sm-6">
                                 <img class="img-responsive name-in" src="images/verify.jpg" title="name" />              
				</div>
                                    <div class="col-sm-6">
                                        <p class="bold">Scan the front and back and upload either of the following:</p>
                                   <br />
                                    <ul>
                                        <ol><strong class="required">National ID Card</strong></ol>
                                        <ol><strong class="required">INEC Voters Card</strong></ol>
                                    </ul>
                                   <br />
			      </div>
			   </div>
                            <div class="row">
                                  <form 
                                  class="dropzone"
                                  id="mydropzone"><img class="" src="images/drag.png" style="margin-left: 50%; "/>
                                  </form>                                  
                            </div>                            
                            
                            <div class="row" id="processblock">
                                <div class="col-sm-12">
                                    <form>
                                        <div class="form-group">
                                            <select class="custom-combo" id="idcardType">
                                                <option value="0">ID Card Type:</option>
                                                <option value="National ID Card">National ID Card</option>
                                                <option value="INEC Voters Card">INEC Voters Card</option>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <input class="custom-input" placeholder="ID Card Number" id="idcardNumber">
                                        </div>                                           
                                        
                                   </form>                                       
                                </div>   
                            </div>
                         </div>
                            <div class="panel-footer">
                                <button class="btn btn-success"  id="saveupload">Submit<i class="fa fa-save fa-2x"></i></button>                                           
                            </div>                        
                    </div>
                </div>
            </div>
        </section>
    </body>
</html>
