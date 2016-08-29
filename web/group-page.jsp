<%-- 
    Document   : group-page
    Created on : Aug 27, 2016, 4:02:35 PM
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
                            <h5><i class="fa fa-group fa-2x"></i>Farmers Group</h5>
                            <div class="inputs">
                                    <div class="portlet-input input-inline input-medium">
                                            <div class="input-group">
                                                    <input type="text" class="form-control input-circle-left" placeholder="search group...">
                                                    <span class="input-group-btn">
                                                    <button class="btn btn-circle-right btn-default" type="submit">Go!</button>
                                                    </span>
                                            </div>
                                    </div>
                            </div>                            
                           </div>
                           <div class = "panel-body">
                               <div>
                                     <p class="bold" id="group_search_result">Group Members</p>
                                        <div class="list-group">
                                                <a href="#" class="list-group-item">Ityav Shagbaor<span class="badge">Leader</span>
                                                </a>
                                                <a href="#" class="list-group-item">Laptops & Desktops <span class="badge">Member</span>
                                                </a>
                                                <a href="#" class="list-group-item">Tablets <span class="badge">Member</span>
                                                </a>  
                                                <a href="#" class="list-group-item">Audio & Video Players <span class="badge">Member</span>
                                                </a>
                                                <a href="#" class="list-group-item">Camera <span class="badge">Member</span>
                                                </a>
                                        </div>                                        
                                     
                               </div>
                           </div>

                          <div class = "panel-footer">
                               <button class="btn btn-success" id="buttonAddFarmer"><i class="fa fa-plus fa-2x"></i>Join Group</button>
                          </div>
                        </div>                        
                     
                        <div class = "panel panel-success">
                           <div class = "panel-heading">
                            <h5><i class="fa fa-group fa-2x"></i>Waiting List</h5>                          
                           </div>
                           <div class = "panel-body">
                               <div>
                                     <p class="bold" id="group_search_result">Group Request</p>
                                        <div class="list-group">
                                                <a href="#" class="list-group-item">
                                                    <div class='container2'>

                                                            <div>
                                                                    <img src='images/ann.jpg' class='iconDetails'>
                                                            </div>	
                                                            <div style='margin-left:60px;'>
                                                            <h4>Mercy Ann</h4>
                                                            <div style="font-size:.6em">fine location, GPS, coarse location</div>
                                                            <div style="float:right;font-size:.8em"><button class="btn btn-primary" type="button">Accept</button></div>
                                                            </div>
                                                    </div>  
                                                </a>
                                                <a href="#" class="list-group-item">

                                                    <div class='container2'>

                                                            <div>
                                                                    <img src='images/ann.jpg' class='iconDetails'>
                                                            </div>	
                                                            <div style='margin-left:60px;'>
                                                            <h4>Mercy Ann</h4>
                                                            <div style="font-size:.6em">fine location, GPS, coarse location</div>
                                                            <div style="float:right;font-size:.8em"><button class="btn btn-primary" type="button">Accept</button></div>
                                                            </div>
                                                    </div> 
                                                </a>
                                                <a href="#" class="list-group-item">

                                                    <div class='container2'>

                                                            <div>
                                                                    <img src='images/ann.jpg' class='iconDetails'>
                                                            </div>	
                                                            <div style='margin-left:60px;'>
                                                            <h4>Mercy Ann</h4>
                                                            <div style="font-size:.6em">fine location, GPS, coarse location</div>
                                                            <div style="float:right;font-size:.8em"><button class="btn btn-primary" type="button">Accept</button></div>
                                                            </div>
                                                    </div>  
                                                </a>
                                        </div>                                        
                                     
                               </div>
                           </div>
                        </div>                        
                        <div class = "panel panel-success">
                           <div class = "panel-heading">
                            <h5><i class="fa fa-group fa-2x"></i>Your Groups</h5>                          
                           </div>
                           <div class = "panel-body">
                            <div class="table-responsive">   
                                <section>

                                    <label>Change Theme:</label>
                                    <select id="groupheme">
                                        <option value="classic.css">Classic</option>
                                        <option value="clean.css">Clean</option>
                                    </select>
                                    <div id="group_datagrid"></div> 

                                </section>
                                </div>  
                           </div>
                        </div>                       
                </div>
            </div>
        </section>

    </body>
</html>
