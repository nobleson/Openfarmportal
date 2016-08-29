<%-- 
    Document   : knowledge-base-form
    Created on : Aug 26, 2016, 3:13:08 PM
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
                    <h4><i class="fa fa-question fa-3x"></i>Knowledge Base: Field marked Asterisk (<span class="required">*</span>) are required.</h4><hr>
                     <div class="col-md-12">
                                         <label class="city">Your Preferred Language<span class="required">*</span></label>
                      <select name="language_combo" id="language_combo" class="custom-combo">
                                   <option selected="selected" value="0">[Select Preferred Language]</option>
                                    <option value="Bassa">Bassa</option>
                                    <option value="Ebira">Ebira</option>
                                    <option value="English">English</option>
                                    <option value="Hausa">Hausa</option>
                                    <option value="Ibibio">Ibibio</option>
                                    <option value="Igala">Igala</option>
                                    <option value="Igbo">Igbo</option>
                                    <option value="Kanda">Kanda</option>
                                    <option value="Kanuri">Kanuri</option>
                                    <option value="Pigin">Pigin</option>
                                    <option value="Yoruba">Yoruba</option>	
                                    <option value="Tiv">Tiv</option>	
                                    </select>

                      </div>   
                     <div class="col-md-12">
                                            <label class="city">Level of Education<span class="required">*</span></label>
                            <select id="education_combo" name="education_combo" class="custom-combo">
                                                <option selected="selected" value="0">[Select Education Level]</option> 
                                                <option value="None">None</option>
                                                <option value="Primary">Primary</option>
                                                <option value="Secondary">Secondary</option>
                                                <option value="Tertiary">Tertiary</option>
                                                <option value="Post Graduate">Post Graduate</option>
                                                <option value="Certification">Certification</option>
                                        </select>

                      </div>   					  
                    <div class="col-md-12">
                            <label class="city">Phone Type(Manufacturer)<span class="required">*</span></label>
                        <select name="phonetype_combo" id="phonetype_combo" class="custom-combo">
                                <option selected="selected" value="0">[Select Phone Type]</option>
                                <option value="BlackBerry">BlackBerry</option>
                                <option value="HTC">HTC</option>
                                <option value="LG">LG</option>
                                <option value="Nokia">Nokia</option>
                                <option value="Samsung">Samsung</option>
                                <option value="Tecno">Tecno</option>
                                <option value="Other">Other</option>			
                                </select>

                        </div>   	                    
                    
                </div>
            </div>
        </section>
    </body>
</html>
