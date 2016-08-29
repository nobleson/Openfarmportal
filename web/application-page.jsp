<%-- 
    Document   : application-page
    Created on : Aug 27, 2016, 5:48:15 PM
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
            <div class="container-fluid">   
                <div class="row">
                    <div class = "panel panel-success">
                       <div class = "panel-heading">
                         <h5><i class="fa fa-support fa-2x"></i>Application Data Form</h5>
                       </div>

                       <div class = "panel-body" id="personal_info_body">
                             <div class="col-md-12">
                                 <div class="alert-box notice" id="notice2">
                                     <h6>Field marked Asterisk (<span class="required">*</span>) are required.</h6> 
                                     <p><h6 style="color: red">Note: If the  production combo is empty, you have not save any <strong>production data</strong>.</h6></p>
                                 </div>
                                 <hr>
                             </div>   

                           
                             <div class="span12">
			                <div class="col-sm-6 widget_1_box">
			                <div class="tile-progress bg-success">

			          <div class="content">
                                      
                                    <input id="applicationdataId" type="hidden" class="span12 m-wrap"/>
                                   <div class="col-sm-12">
                                        <label class="firstname">Production Name<span class="required">*</span></label>
                                           <select id="app_production_id" class="custom-combo">
                                               <option value='0'>[   Select Production  ]</option>
                                           </select>
                                               <br />                                        
                                            <label class="error" for="species" id="app_production_id_error">This field is required.</label>  
                                    </div>                                                  
                                                
                                       <div class="col-sm-12">
                                       <br />
	                              <label >Fertilizers<span class="required">*</span></label>
	                               <textarea   id="fertilizer" placeholder="eg. NPK,Urea,Animal Feeds" class="styled"></textarea>

					<label class="error" for="gender" id="fertilizer_error">Please select value chain</label>  
	                                 </div>  

                                         <div class="col-sm-12">
                                        <label class="surname">Total Fertilizer Qty (kg):<span class="required">*</span></label>
                                        <input id="fertilizerqty" type="number" class="custom-input"/>
                                        <label class="error" for="surname" id="fertilizerqty_error">This field is required.</label>  

                                          </div> 	
                                            <div class="col-sm-12">
                                                <label class="firstname">Herbicides:<span class="required">*</span></label>
	                                          <textarea   id="herbicides" placeholder="eg. 24D,Propanil" class="styled"></textarea>
                                                <label class="error" for="firstname" id="herbicides_error">This field is required.</label>  
                                            </div>  
			              <div class="col-sm-12">
                                    <label class="surname">Total Herbicides Qty (Litres):<span class="required">*</span></label>
                                    <input id="herbicidesqty" type="number" class="custom-input"/>
                                    <label class="error" for="surname" id="herbicidesqty_error">This field is required.</label>  

                                      </div> 					                  
                                    </div>
                                    </div>
                                    </div>
			                <div class="col-sm-6 widget_1_box">
			                <div class="tile-progress bg-success">

			                    <div class="content">
	  	
  						         <div class="col-sm-12">
                                                        <label class="surname">Pesticides:<span class="required">*</span></label>
	                                                <textarea   id="pesticides" placeholder=""class="styled"></textarea>
                                                        <label class="error" for="surname" id="pesticides_error">This field is required.</label>  
  					                 </div> 	
                                                        <div class="col-sm-12">
                                                            <label class="firstname">Pesticides Qty (Litres):<span class="required">*</span></label>
                                                             <input id="pesticidesqty" type="number" class="custom-input"/>
                                                            <label class="error" for="firstname" id="pesticidesqty_error">This field is required.</label>  
                                                        </div>  
  						         <div class="col-sm-12">
                                                        <label class="surname">Other Applications:<span class="required"></span></label>
	                                                <textarea   id="other_applications" placeholder=""class="styled"></textarea>
                                                        <label class="error" for="surname" id="other_applications_error">This field is required.</label>  
  					                 </div> 	
                                                        <div class="col-sm-12">
                                                            <label class="firstname">Other Applications Qty :<span class="required"></span></label>
                                                             <input id="other_applicationsqty" type="number" class="custom-input"/>
                                                            <label class="error" for="firstname" id="other_applicationsqty_error">This field is required.</label>  
                                                        </div>  
  			 
					                  
                                            </div>
                                            </div>
                                            </div>                            
			                     </div>                                           
                       </div>

                          <div class = "panel-footer">
                            <div id="prodresults" style="margin-left:4;width:350;" > 
                                <div class="alert-box errormsgapplication" id="errormsgapplication"></div>
                                <div class="alert-box successapplication" id="successapplication"></div>
                            </div>  

                           <button type="button" id="submit_applicationdata" class="btn btn-success">Save New Record</button>
                           <button type="button" id="update_applicationdata" class="btn btn-success">Save Changes</button>                          
                          
                      </div>
                    </div>  
                    <div class = "panel panel-success">
                       <div class = "panel-heading">
                         <h5><i class="fa fa-support fa-2x"></i>Application Data Grid</h5>
                       </div>

                       <div class = "panel-body" id="personal_info_body">
                            <label>Change Theme:</label>
                            <select id="apptheme">
                                <option value="classic.css">Classic</option>
                                <option value="clean.css">Clean</option>
                            </select>
                            <div id="applications_datagrid">
                            </div>                                          
                       </div>
                    </div>                    
                    
                </div>
            </div>
        </section>
    </body>
</html>
