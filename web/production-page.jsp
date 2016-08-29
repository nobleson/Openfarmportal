<%-- 
    Document   : production
    Created on : Aug 27, 2016, 5:34:28 PM
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
                         <h5><i class="fa fa-gears fa-2x"></i>Production Data Form</h5>
                       </div>

                       <div class = "panel-body" id="personal_info_body">
			                        <!-- block -->
 			
                                <div class="col-md-12">
                                         <div class="alert-box notice" id="notice2">
                                             <h6>Field marked Asterisk (<span class="required">*</span>) are required.</h6> <p><h6 style="color: red">Note: If the  crop description combo is empty, you have not save any <strong>crop data</strong>.</h6></p>
                                         </div>
                                    <hr>
                                 </div>                                                      

                                 <div class="span12">
                                           		                     
			                <div class="col-sm-6 widget_1_box">
			                <div class="tile-progress bg-success">

			          <div class="content">
                                    <input id="productiondataId" type="hidden" class="span12 m-wrap"/>
                                    <div class="col-sm-12">
                                    <label class="surname">Production Name<span class="required">*</span></label>
                                    <input id="productionName" type="text" class="custom-input"/>
                                    <label class="error" for="prod_desc" id="productionName_error">This field is required.</label>  
                                    </div> 	
                                    <div class="col-sm-12">
                                    <label class="surname">Production Site No.<span class="required"></span></label>
                                    <input id="prod_site_number" type="text" class="custom-input"/>
                                    <label class="error" for="prod_site_number" id="prod_site_number_error">This field is required.</label>  
                                    </div> 	
                                    <div class="col-sm-12">
                                        <label class="firstname">Crop Description:<span class="required">*</span></label>
                                           <select id="prod_crop_desc" class="custom-combo">
                                               <option value='0'>[   Select Crop  ]</option>
                                           </select>
                                               <br />                                        
                                            <label class="error" for="species" id="prod_crop_desc_error">This field is required.</label>  
                                    </div>  
                               <div class="col-sm-12">
                               <br />
                              <label>Total Production Weeks (Number):<span class="required">*</span></label>
                                    <input id="prod_weeks" type="number" class="custom-input"/>
				<label class="error" for="gender" id="prod_weeks_error">This field is required</label>  
                            </div>  	 
                             <div class="col-sm-12">
                                <label class="hectares">Hectares (Number):<span class="required">*</span></label>
                                <input id="hectares" type="number" class="custom-input"/>
                                <label class="error" for="hectares" id="hectares_error">This field is required.</label>  
                              </div>                                                 
                             <div class="col-sm-12">
                                <label class="prod_season">Production Season:<span class="required">*</span></label>
                                <select id="prod_season" class="custom-combo">
                                    <option value="0">[Select Season]</option>
                                    <option value="Dry Season">Dry Season</option>
                                    <option value="Raining Season">Raining Season</option>
                                </select>                                
                                
                                <label class="error" for="prod_season" id="prod_season_error">This field is required.</label>  
                              </div>                                   
                                                
                             <div class="col-sm-12">
                            <label class="prod_tech">Production Type:<span class="required">*</span></label>
                            <select id="prod_tech" class="custom-combo">
                                <option value="0">[Select Production Type]</option>
                                <option value="Local Production">Local Production</option>
                                <option value="Mechanized Production">Mechanized Production</option>
                                <option value="Local And Mechanized">Local And Mechanized</option>
                            </select>                                                                                                                     
                            <label class="error" for="prod_tech" id="prod_tech_error">This field is required.</label>  
                             </div>
                                      
                              </div>
                            </div>
                            </div>
					      
				<div class="col-sm-6 widget_1_box">
			                <div class="tile-progress bg-success">
			                    <div class="content">

  						         <div class="col-sm-12">
                                                        <label class="target_yield">Target Production Yield (tons):<span class="required">*</span></label>
                                                        <input id="target_yield" type="number" class="custom-input"/>
                                                        <label class="error" for="target_yield" id="target_yield_error">This field is required.</label>  

  					              </div> 	
                                                        <div class="col-sm-12">
                                                            <label class="lifespan">Actual Production Yield:<span class="required">*</span></label>
                                                                <input id="actual_yield" type="number" class="custom-input"/>
                                                            <label class="error" for="actual_yield" id="actual_yield_error">This field is required.</label>  
                                                        </div>  
                                                        <div class="col-sm-12">
                                                            <label class="common_pest">Common Pest:<span class="required">*</span></label>
                                                            <select id="common_pest" class="custom-input">
                                                                <option value="0">[Select Common Pest]</option>
                                                                <option value="Birds">Birds</option>
                                                                <option value="Weed">Weed</option>
                                                            </select>                                                                
                                                                
                                                            <label class="error" for="common_pest" id="common_pest_error">This field is required.</label>  
                                                        </div>  
  						   <div class="col-sm-12">
  						   <br />
                                                  <label>Production Year<span class="required">*</span></label>
  					          <input id="prod_year" type="text" placeholder="eg. 2016 or 2016/2017"  class="custom-input"/>

                                                    <label class="error" for="prod_year" id="prod_year_error">Please select input source</label>  
                                                </div>  
                                                             
                                               <div class="col-sm-12">
                                               <br />
                                                  <label>Provider Provider<span class="required"></span></label>
  					          <input id="prod_input_source" type="text"   class="custom-input"/>

                                                    <label class="error" for="prod_input_source" id="prod_input_source_error">Please select Input Provider chain</label>  
                                                </div>                                                  
                                                
                                                     <div class="col-sm-12">
                                                    <label class="surname">Inputs Provided <span class="required"></span></label>
                                                    <textarea   id="prod_inputs" placeholder="eg. Seed,Fertilizer,herbicides"class="styled"></textarea>
  					              </div>  
                                </div>
                                </div>
                                </div>
                               

                                </div>
                                                                        
                       </div>

                      <div class = "panel-footer">
                            <div id="prodresults" style="margin-left:4;width:350;" > 
                                <div class="alert-box errormsgprod" id="errormsgprod"></div>
                                <div class="alert-box successprod" id="successprod"></div>
                            </div>                                      
                           <button type="button" id="submit_productiondata" class="btn btn-success">Save New Record</button>
                           <button type="button" id="update_productiondata" class="btn btn-success">Save Changes</button>
                      </div>
                    </div>    
                    <div class = "panel panel-success">
                       <div class = "panel-heading">
                         <h5><i class="fa fa-gears fa-2x"></i>Production Data Grid</h5>
                       </div>

                       <div class = "panel-body" id="personal_info_body">
                                <div class="table-responsive">   
                                <section>
  
                                    <label>Change Theme:</label>
                                    <select id="prodtheme">
                                        <option value="classic.css">Classic</option>
                                        <option value="clean.css">Clean</option>
                                    </select>
                                    <div id="prod_datagrid"></div> 
                                </section>
                                </div>                                     
                       </div>
                    </div>
                </div>
            </div>
        </section>
    </body>
</html>
