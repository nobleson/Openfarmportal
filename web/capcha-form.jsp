<%-- 
    Document   : capcha-form
    Created on : Aug 26, 2016, 6:56:16 PM
    Author     : Mutual-Links
--%>

<%@page import="botdetect.web.Captcha"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <section>
            <script type="text/javascript">
            var a = Math.ceil(Math.random() * 10);
            var b = Math.ceil(Math.random() * 10);       
            var c = a + b;    
               $('#question').html("<span>What is "+ a + " + " + b +"? </span>");
               
               $( "#validate_captcha" ).click(function() {
                    var d = $('#BotBootInput').val();

                  if (d == c){
                        $('#capcha_block').append("<div><input type='radio' id='rbPolicy' value='agree'><label for='rbPolicy'><strong>&nbsp;I have read and agreed to Openfarm Privacy Policy.  </strong></label></div>");
                        $('#rbPolicy_error').text('');
                    }else{
                        $('#rbPolicy_error').text('Incorrect Answer!');
                   } 


                });        
    
            </script>            
            <div class="container-fluid">
                <div class="row">
                    <h4><i class="fa fa-warning fa-3x"></i>Spam Test</h4><hr>
                  <div class="table-responsive" id="capcha_block">
                      <p>Help to reduce spam!</p>
                        <label id="question"></label>
                        <input  type="text" id="BotBootInput" maxlength="2" size="2"/>
                        <input  type="button" id="validate_captcha" class="btn btn-primary" value="Check"/> 
                    </div>   
                    <div class="col-md-12">
                        
                     <label class="required" for="rbPolicy" id="rbPolicy_error"></label><br/>  
                     <div id="reg_feedback">
                      <div class="alert alert-success" id="servermsg">
                          <button class="close" data-dismiss="alert">&times;</button>
                          <div class="notification"></div>                      
                      </div>	                         
                         
                         
                         
                     </div>
                               
                          <a href="#" onclick="javascript:void window.open('policy.jsp','1461164921372','width=400,height=500,toolbar=0,menubar=0,location=0,status=1,scrollbars=1,resizable=1,left=0,top=0');return false;">Privacy Policy</a>
                    </div>                                                
                        
                </div>
            </div>
        </section>
    </body>
</html>
