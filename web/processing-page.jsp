<%-- 
    Document   : porcessing-page
    Created on : Aug 27, 2016, 6:01:50 PM
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
                         <h5><i class="fa fa-industry fa-2x"></i>Processing Data Form</h5>
                       </div>

                       <div class = "panel-body" id="personal_info_body">
	                         <div class="col-md-12">
                                             <div class="alert-box notice" id="notice2">
                                                 <h6>Field marked Asterisk (<span class="required">*</span>) are required.</h6> <p><h6 style="color: red">Note: If the  production combo is empty, you have not save any <strong>production data</strong>.</h6></p>
                                             </div>
                                     <hr>
                                     </div>   
	
                              			                     
                                       
			                     <div class="span12">
			                <div class="col-sm-6 widget_1_box">
			                <div class="tile-progress bg-success">

			                    <div class="content">
                                                
                                               <input id="processingdataId" type="hidden" class="span12 m-wrap"/>
                                                <div class="col-sm-12">
                                                    <label class="firstname">Production Name<span class="required">*</span></label>
                                                       <select id="processing_production_id" class="custom-combo">
                                                           <option value='0'>[   Select Production  ]</option>
                                                       </select>
                                                           <br />                                        
                                                        <label class="error" for="species" id="processing_production_id_error">This field is required.</label>  
                                                </div>    
                                                
                                                   <div class="col-sm-12">
                                                   <br />
                                                      <label>Processing Method<span class="required">*</span></label>
                                                      <textarea   id="processing_method" placeholder=""class="styled"></textarea>

                                                   <label class="error" for="gender" id="processing_method_error">Please select value chain</label>  
                                                    </div>  
                                                    <div class="col-sm-12">
                                                       <br />
                                                      <label>Processing Technology<span class="required">*</span></label>
                                                        <select id="processing_tech" class="custom-combo">
                                                            <option value="0">[Select Technology Applied]</option>
                                                            <option value="Local">Local</option>
                                                            <option value="Machines">Machines</option>
                                                            <option value="Local and Machines">Local and Machines</option>
                                                        </select>
                                                       <label class="error" for="gender" id="processing_tech_error">Please select value chain</label>  
                                                    </div>                                                  
                                              
                                        </div>
                                        </div>
                                        </div>
			                <div class="col-sm-6 widget_1_box">
			                <div class="tile-progress bg-success">

			                    <div class="content">
	  				 	
                                               <div class="col-sm-12">
                                                     <label class="surname">Quantity Processed (kg):<span class="required">*</span></label>
                                                    <input id="quantity_processed" type="number" class="custom-input"/>
                                                    <label class="error" for="surname" id="quantity_processed_error">This field is required.</label>  
                                              </div> 	
                                               <div class="col-sm-12">
                                                
                                                    <label class="surname">Processing Firm:<span class="required">*</span></label>
                                                    <input id="processing_firm" type="text" class="custom-input"/>
                                                    <label class="error" for="surname" id="processing_firm_error">This field is required.</label>  

                                              </div> 
                                                </div>
                                                </div>
                                                </div>                            
                                                </div>                                        
                       </div>

                          <div class = "panel-footer">
                            <div id="aprocessedresults" style="margin-left:4;width:350;" > 
                                <div class="alert-box errormsgprocessing" id="errormsgprocessing"></div>
                                <div class="alert-box successprocessing" id="successprocessing"></div>
                            </div>  

                           <button type="button" id="submit_processeddata" class="btn btn-success">Save New Record</button>
                           <button type="button" id="update_processeddata" class="btn btn-success">Save Changes</button>                 
                      </div>
                    </div>                    
                    <div class = "panel panel-success">
                       <div class = "panel-heading">
                         <h5><i class="fa fa-industry fa-2x"></i>Processing Data Grid</h5>
                       </div>

                       <div class = "panel-body" id="personal_info_body">
                        <label>Change Theme:</label>
                        <select id="processedtheme">
                            <option value="classic.css">Classic</option>
                            <option value="clean.css">Clean</option>
                        </select>
                        <div id="processing_datagrid"></div> 
                           
                       </div>

                    </div>                    
                    
                </div>
            </div>
        </section>
    </body>
</html>
