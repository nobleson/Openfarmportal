<%-- 
    Document   : next-of-kin-form
    Created on : Aug 26, 2016, 3:14:11 PM
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
                    <h4><i class="fa fa-user-plus fa-3x"></i>Next of Kin Information: Field marked Asterisk (<span class="required">*</span>) are required.</h4><hr>

                             <div class="col-sm-12">
                                            <label class="kin_surname">Surname<span class="required">*</span></label>
                                            <input id="kin_surname" type="text" class="custom-input"/>

                          </div> 	
                                    <div class="col-sm-12">
                                        <label class="kin_othername">Other Names<span class="required">*</span></label>
                                            <input id="kin_othername" type="text" class="custom-input"/>
                                    </div>  
                                    <div class="col-sm-12">
                                            <label class="kin_phone_number">Phone Number<span class="required">*</span></label>
                                            <input id="kin_phone_number" type="text" class="custom-input"/>
                                    </div> 
                                    <div class="col-sm-12">
                                        <label class="kin_contact">Contact Address<span class="required">*</span></label>
                                        <textarea   id="kin_contact" class="styled"></textarea>

                                      </div>    		                                                

                                       <div class="col-sm-12">
                                      <label>Relationship<span class="required">*</span></label>
                                        <select id="kin_relationship" class="custom-combo">
                                            <option value="0">[Select Relationship]</option>
                                            <option value="Father">Father</option>
                                            <option value="Mother">Mother</option>
                                            <option value="Brother">Brother</option>
                                            <option value="Sister">Sister</option>
                                            <option value="Uncle">Uncle</option>
                                            <option value="Aunty">Aunty</option>
                                            <option value="Cousin">Cousin</option>
                                            <option value="Husband">Husband</option>
                                            <option value="Wife">Wife</option>
                                            <option value="Friend">Friend</option>
                                            <option value="Other">Other</option>
                                        </select>
                                    </div>  	                    
                    
                </div>
            </div>
        </section>
    </body>
</html>
