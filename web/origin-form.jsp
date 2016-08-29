<%-- 
    Document   : origin-form
    Created on : Aug 26, 2016, 3:13:36 PM
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
<script type="text/javascript" charset="utf-8">
            showState();
            function showWards(str){
                var xmlhttp;

                if (window.XMLHttpRequest)
                {// code for IE7+, Firefox, Chrome, Opera, Safari
                xmlhttp=new XMLHttpRequest();
                }
                else
                {// code for IE6, IE5
                xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
                }
                xmlhttp.onreadystatechange=function()         {
                if (xmlhttp.readyState==4 && xmlhttp.status==200)
                {
                document.getElementById("ward_combo").innerHTML=xmlhttp.responseText;
                }
                }
                xmlhttp.open("GET","getWardOption.jsp?q="+str,true);
                xmlhttp.send();
                }	 
            </script>
            <script type="text/javascript" charset="utf-8">
            function showLGArea(str){
                var xmlhttp;

                if (window.XMLHttpRequest)
                {// code for IE7+, Firefox, Chrome, Opera, Safari
                xmlhttp=new XMLHttpRequest();
                }
                else
                {// code for IE6, IE5
                xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
                }
                xmlhttp.onreadystatechange=function()         {
                if (xmlhttp.readyState==4 && xmlhttp.status==200)
                {
                document.getElementById("lgarea_combo").innerHTML=xmlhttp.responseText;
                }
                }
                xmlhttp.open("GET","getLGAreaComboOption.jsp?q="+str,true);
                xmlhttp.send();
                }	 
            </script>            
            <div class="container-fluid">
                <div class="row">
                        <h4><i class="fa fa-map fa-3x"></i>Origin Data: Field marked Asterisk (<span class="required">*</span>) are required.</h4><hr>
                         <div class="col-md-12">
                      <label>State of Origin<span class="required">*</span></label>
                        <select id="state_combo" class="custom-combo" onchange="showLGArea(this.value);">
                            <option value='0'>=== State of Origin===</option>
                        </select>

                    </div>  						
                    <div class="col-md-12">
                      <label>Local Government<span class="required">*</span></label>
                        <select id="lgarea_combo" class="custom-combo" onchange="showWards(this.value);">
                      <option value='0'>=== Local Government===</option>
                        </select>
                    </div>   
                    <div class="col-md-12">
                      <label>Ward<span class="required">*</span></label>
                        <select id="ward_combo" class="custom-combo">
                      <option value='0'>===Select Ward===</option>
                        </select>
                    </div>                             
                    
                </div>
            </div>
        </section>
    </body>
</html>
