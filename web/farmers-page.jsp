<%-- 
    Document   : farmers-page
    Created on : Aug 27, 2016, 7:52:12 PM
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
            <script src="js/jquery.timeago.js"></script> 
           <script>
              $(document).ready(function(){

                $('#reg-farmers').slimscroll({});    
                 loadRegisteredFarmers();
              });
              //Refresh auto_load() function after 10000 milliseconds
              setInterval(loadRegisteredFarmers,10000);

           </script>            
                <div class="row">        
                  <div class="box"><h2 id="total_farmers"></h2></div>
                    <div class="inputs">
                        <div class="portlet-input input-inline input-medium">
                            <div class="input-group">
                                    <input type="text" class="form-control input-circle-left" placeholder="search name, phone number...">
                                    <span class="input-group-btn">
                                    <button class="btn btn-circle-right btn-default" type="submit">Go!</button>
                                    </span>
                            </div>
                        </div>
                    </div>                  
                  <div class="container-fluid" id="reg-farmers">
 
                      
                </div> 
            </div>
        </section>
    </body>
</html>
