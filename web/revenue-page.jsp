<%-- 
    Document   : revenue-page
    Created on : Aug 27, 2016, 6:28:24 PM
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
                         <h5><i class="fa fa-money fa-2x"></i>Revenue Data Form</h5>
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
                                        <input id="productioncostId" type="hidden" class="span12 m-wrap"/>
                                        <div class="col-sm-12">
                                        <label>Production Description:<span class="required">*</span></label>
                                        <select id="cost_production_id" class="custom-combo">
                                               <option value='0'>[   Select Production  ]</option>
                                           </select>
                                               <br />                                        
                                            <label class="error" for="species" id="cost_production_id_error">This field is required.</label>  
	                                   </div>  
                                                  <div class="col-sm-12">
  						   <br />
                                                      <label>Production Stage<span class="required">*</span></label>
                                                        <select id="production_stage" class="custom-combo">
                                                            <option value="0">[Select Production Stage]</option>
                                                            <option value="Planing">Planing</option>
                                                            <option value="Site Clearing">Site Clearing</option>
                                                            <option value="Cultivating">Cultivating</option>
                                                            <option value="Maintenance">Maintenance</option>
                                                            <option value="Harvesting">Harvesting</option>
                                                            <option value="Transporting">Transporting</option>
                                                        </select>
                                                        <label class="error" for="gender" id="production_stage_error">Please select value chain</label>  
                                                    </div>  	
                                                  <div class="col-sm-12">
  						   <br />
                                                      <label>Cost Type<span class="required">*</span></label>
                                                        <select id="cost_type" class="custom-combo">
                                                            <option value="0">[Select Cost Type]</option>
                                                            <option value="Seeds">Seeds</option>
                                                            <option value="Fertilizers">Fertilizers</option>
                                                            <option value="Sprays">Sprays</option>
                                                            <option value="Tree Crops Depreciation">Tree Crops Depreciation</option>
                                                            <option value="Harvesting">Fuel for Machines</option>
                                                            <option value="Implements Depreciations">Implements Depreciations</option>
                                                            <option value="Equipment Maintenance And Repairs">Equipment Maintenance And Repairs</option>
                                                            <option value="Labour Wages">Labour Wages</option>
                                                            <option value="Borrowed Capital Interest">Borrowed Capital Interest</option>
                                                        </select>
                                                        <label class="error" for="gender" id="cost_type_error">Please select value chain</label>  
                                                    </div>  	

					                  
                            </div>
                            </div>
                            </div>
			                <div class="col-sm-6 widget_1_box">
			                <div class="tile-progress bg-success">

			                    <div class="content">
	  				    
                                             <div class="col-sm-12">
                                                 <label class="surname">Cost Description: <a title="Describe the item that you are inputing the cost"><i class="fa fa-question-circle fa-1x"></i></a><span class="required">*</span></label>
                                                 <textarea   id="cost_desc" placeholder=""class="styled"></textarea>
                                                <label class="error" for="surname" id="cost_desc_error">This field is required.</label>  
                                              </div> 	 
  						  
                                              <div class="col-sm-12">
                                                  <label class="quantity_data">Quantity: <strong class="form-font"></strong><span class="required"></span></label>
                                                <input id="quantity_data" type="text" class="custom-input"/>
                                                <label class="error" for="quantity_data" id="quantity_data_error">This field is required.</label>  
                                              </div> 	
                                              <div class="col-sm-12">
                                                  <label class="unit_cost_data">Unit Cost: <strong class="form-font"> &#x20A6;</strong><span class="required"></span></label>
                                                <input id="unit_cost_data" type="number" class="custom-input"/>
                                                <label class="error" for="unit_cost_data" id="unit_cost_data_error">This field is required.</label>  
                                              </div> 	
                                                <div class="col-sm-12">
                                                    <label class="cost_total">Total Cost:<strong class="form-font"> &#x20A6;</strong><span class="required">*</span></label>
                                                        <input id="cost_total" type="number" class="custom-input"/>
                                                    <label class="error" for="total_cost" id="cost_total_error">This field is required.</label>  
                                                </div> 
              	  
                            </div>
                            </div>
                            </div>                                                 
                       </div>

                      <div class = "panel-footer">
                            <div id="costresults" style="margin-left:4;width:350;" > 
                                <div class="alert-box errormsgcost" id="errormsgcost"></div>
                                <div class="alert-box successmsgcost" id="successmsgcost"></div>
                            </div>  

                           <button type="button" id="submit_costdata" class="btn btn-success">Save New Record</button>
                           <button type="button" id="update_costdata" class="btn btn-success">Save Changes</button>
                  
                      </div>
                    </div>                    
                        <div class = "panel panel-success">
                           <div class = "panel-heading">
                             <h5><i class="fa fa-money fa-2x"></i>Revenue Data Grid</h5>
                           </div>

                           <div class = "panel-body" id="personal_info_body">
  
                                    <label>Change Theme:</label>
                                    <select id="costtheme">
                                        <option value="classic.css">Classic</option>
                                        <option value="clean.css">Clean</option>
                                    </select>
                                    <div id="cost_datagrid"></div>                                          
                           </div>
                        </div>
                </div>
            </div>
        </section>
    </body>
</html>
