<%-- 
    Document   : crop-page
    Created on : Aug 27, 2016, 5:17:11 PM
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
                    <div class="panel panel-success">
                        <div class="panel-heading">
                            <h2><i class="fa fa-crop fa-3x"></i>Crop Data Form</h2>
                        </div>
                            <div class="panel-body">
			                        <!-- block -->
 			
                                        <div class="col-md-12">
                                                 <div class="alert-box notice" id="notice2">
                                                     <h6>Field marked Asterisk (<span class="required">*</span>) are required.</h6><hr>
                                                 </div>
                                         </div>                                                      
                                                
			                     <div class="span12">
                                            <form action="/" class="form-horizontal">
                                            <fieldset> 			                     
			                <div class="col-sm-6 widget_1_box">
			                <div class="tile-progress bg-success">

			                    <div class="content">
                                    <input id="cropdataId" type="hidden" class="span12 m-wrap"/>
                                    <div class="col-sm-12">
                                    <label class="surname">Crop Description<span class="required">*</span></label>
                                    <input id="crop_desc" type="text" class="custom-input"/>
                                    <label class="error" for="crop_desc" id="crop_desc_error">This field is required.</label>  
                                    </div> 	
                                    <div class="col-sm-12">
                                        <label class="firstname">Species:<span class="required">*</span></label>
                                            <input id="species" type="text" class="custom-input"/>
                                        <label class="error" for="species" id="species_error">This field is required.</label>  
                                    </div>  
                                           <div class="col-sm-12">
                                           <br />
                              <label>Quality<span class="required">*</span></label>
                                <select id="crop_quality" class="custom-combo">
                                    <option value="0">[ Select Quality ]</option>
                                    <option value="Hybrid">Hybrid</option>
                                    <option value="Moderate">Moderate</option>
                                    <option value="Low">Low</option>
                                </select>
				<label class="error" for="gender" id="crop_quality_error">Please select value chain</label>  
                            </div>  	 
					                  
                            </div>
                            </div>
                            </div>
					      
				<div class="col-sm-6 widget_1_box">
			                <div class="tile-progress bg-success">
			                    <div class="content">
			                        
  						         <div class="col-sm-12">
                                                        <label class="crop_quantity">Quantity (kg):<span class="required">*</span></label>
                                                        <input id="crop_quantity" type="number" class="custom-input"/>
                                                        <label class="error" for="crop_quantity" id="crop_quantity_error">This field is required.</label>  

  					              </div> 	
                                                        <div class="col-sm-12">
                                                            <label class="lifespan">Life span (years):<span class="required">*</span></label>
                                                                <input id="lifespan" type="number" class="custom-input"/>
                                                            <label class="error" for="lifespan" id="lifespan_error">This field is required.</label>  
                                                        </div>  
  						   <div class="col-sm-12">
  						   <br />
                                          <label>Input Provider<span class="required">*</span></label>
                                            <select id="input_source" class="custom-combo">
                                                <option value="0">[Select Provider]</option>
                                                <option value="Government">Government</option>
                                                <option value="INGO">INGO</option>
                                                <option value="NGO">NGO</option>
                                                <option value="Market">Market</option>
                                                <option value="Other Firm">Other Firm</option>
                                                <option value="None">None</option>
                                            </select>
                                            <label class="error" for="gender" id="input_source_error">Please select input source</label>  
                                        </div>  	

                                </div>
                                </div>
                                </div>
                               
                                </fieldset>
                                </form>
                                </div>
                              </div>
                            <div class="panel-footer">
                                        <div id="results" style="margin-left:4;width:350;" > 
                                            <div class="alert-box errormsgcrop" id="errormsgcrop"></div>
                                            <div class="alert-box successcrop" id="successcrop"></div>
                                        </div>                                      
                                       <button type="button" id="submit_cropdata" class="btn btn-success">Save New Record</button>
                                       <button type="button" id="update_cropdata" class="btn btn-success">Save Changes</button>                       
                            </div>
                    </div> 
                    <div class="panel panel-success">
                        <div class="panel-heading">
                            <h2><i class="fa fa-crop fa-3x"></i>Crop Data Grid</h2>
                        </div>
                            <div class="panel-body">
                               <label>Change Theme:</label>
                                    <select id="croptheme">
                                        <option value="classic.css">Classic</option>
                                        <option value="clean.css">Clean</option>
                                    </select>
                                    <div id="crop_datagrid"></div> 
                              </div>
                    </div>   
                </div>
            </div>
        </section>
    </body>
</html>
