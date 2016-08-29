<%-- 
    Document   : market-page
    Created on : Aug 27, 2016, 6:12:53 PM
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
                         <h5><i class="fa fa-map-marker fa-2x"></i>Market Data Form</h5>
                       </div>

                       <div class = "panel-body" id="personal_info_body">
			         <div class="col-md-12">
                                             <div class="alert-box notice" id="notice2">
                                                 <h6>Field marked Asterisk (<span class="required">*</span>) are required.</h6>
                                             </div>
                                     <hr>
                                     </div>   	                     
								
			                     
			                <div class="col-sm-6 widget_1_box">
			                <div class="tile-progress bg-success">

			                    <div class="content">
                                                
                                          <input id="productionsalesId" type="hidden" class="span12 m-wrap"/>
	  				 <div class="col-sm-12">
                                        <label>Production Name<span class="required">*</span></label>
                                        <select id="sales_production_id" class="custom-combo">
                                               <option value='0'>[   Select Production  ]</option>
                                           </select>
                                               <br />                                        
                                            <label class="error" for="species" id="sales_production_id_error">This field is required.</label>  
	                                   </div>  

                                                 <div class="col-sm-12">
                                                <label>Sales Description:<a title="Describe the sales that you have made from this production"><i class="fa fa-question-circle fa-1x"></i></a><span class="required">*</span></label>
                                                <textarea   id="sales_desc" placeholder=""class="styled"></textarea>
                                                <label class="error" for="surname" id="sales_desc_error">This field is required.</label>  

                                              </div> 	
                                                    
  						   <div class="col-sm-12">
  						   <br />
                                                   <label>Production Form:<span class="required">*</span></label>
                                                   <select id="production_form" class="custom-combo">
                                                        <option value="0">[Select Form]</option>
                                                        <option value="Processed">Processed</option>
                                                        <option value="Unprocessed">Unprocessed</option>
                                                    </select>
						    <label class="error" for="gender" id="production_form_error">Please select production form</label>  
                                                    </div>  
                                                  <div class="col-sm-12">
  						   <br />
                                                   <label>Buyer:<span class="required">*</span></label>
                                                   <select id="buyer" class="custom-combo">
                                                        <option value="0">[Select Buyer]</option>
                                                        <option value="Mikap">Mikap</option>
                                                        <option value="OLAM">OLAM</option>
                                                        <option value="Other Firm">Other Firm</option>
                                                        <option value="Individuals">Individuals</option>
                                                    </select>
                                                  <br />
                                                  <br />
						    <label class="error" for="gender" id="buyer_error">Please select buyer</label>  
                                                    <input id="other_firm" type="text" class="custom-input"/>
                                                   <label class="error" for="firstname" id="other_firm_error">The buyer name is required.</label> 
                                                    
                                                    </div>  
                                                
                                             
                                                
					                  
                            </div>
                            </div>
                            </div>

                            <div class="col-sm-6 widget_1_box">
                            <div class="tile-progress bg-success">

                                <div class="content">
                                                   
                                                    <div class="col-sm-12">
                                                        <label>Quantity Sold (tons):<span class="required">*</span></label>
                                                            <input id="quantity_sold" type="number" class="custom-input"/>
                                                        <label class="error" for="firstname" id="quantity_sold_error">This field is required.</label>  
                                                    </div>  
                                                
                                                   
                                                  <div class="col-sm-12">
	  						   <br />
                                                           <label>Unit Measurement:<span class="required">*</span></label>
                                                           <select id="unit_measurement" class="custom-combo">
                                                               <option value="0">[Select Unit Measurement]</option>
                                                                <option value="Kg">Kilograms (Kg)</option>
                                                                <option value="Tons">Tons</option>
                                                            </select>
                                                           <label class="error" for="gender" id="unit_measurement_error">Please select unit measurement</label>  
                                                        </div>  
                                                
                                                   
                                                <div class="col-sm-12">
                                                    <label>Unit Cost:<strong class="form-font"> &#x20A6;</strong><span class="required">*</span></label>
                                                            <input id="unit_cost" type="number" class="custom-input"/>
                                                        <label class="error" for="firstname" id="unit_cost_error">This field is required.</label>  
                                                    </div>  
                                                
                                                <div class="col-sm-12">
                                                        <label>Total Cost:<strong class="form-font"> &#x20A6;</strong><span class="required">*</span></label>
                                                            <input id="total_cost" type="number" class="custom-input"/>
                                                        <label class="error" for="firstname" id="total_cost_error">This field is required.</label>  
                                                    </div>  
                                                
                                                <div class="col-sm-12">
                                                        <label>Sales Date:<span class="required">*</span></label>
                                                            <input id="datepicker" type="text" class="span12 custom-input"/>
                                                            <input id="salse_date" type="text" class="span12 custom-input" disabled/>
                                                        <label class="error" for="firstname" id="salse_date_error">This field is required.</label>  
                                                    </div>  
                                                	
  								 
  			                  
                            </div>
                            </div>
                            </div>                                          
                       </div>

                      <div class = "panel-footer">
                            <div id="salesresults" style="margin-left:4;width:350;" > 
                                <div class="alert-box errormsgsales" id="errormsgsales"></div>
                                <div class="alert-box successmsgsales" id="successmsgsales"></div>
                            </div>  

                           <button type="button" id="submit_salesdata" class="btn btn-success">Save New Record</button>
                           <button type="button" id="update_salesdata" class="btn btn-success">Save Changes</button>                  
                      </div>
                    </div>                    
                    <div class = "panel panel-success">
                       <div class = "panel-heading">
                         <h5><i class="fa fa-map-marker-o fa-2x"></i>Market Data Grid</h5>
                       </div>

                       <div class = "panel-body" id="personal_info_body">
  
                                    <label>Change Theme:</label>
                                    <select id="salestheme">
                                        <option value="classic.css">Classic</option>
                                        <option value="clean.css">Clean</option>
                                    </select>
                                    <div id="sales_datagrid"></div> 
                                         
                       </div>

                    </div>                    
                </div>
            </div>
        </section>
    </body>
</html>
