<%-- 
    Document   : profile-page
    Created on : Aug 27, 2016, 12:01:31 PM
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
                <div id="timelineContainer">
                    <div class="page-banner top" id="page_cover">     
                        <h2 id="coverTitle">Ityav Shagbaor Luke</h2>
                        

                    </div>      
                <div id="timelineShade"> 
                </div>            
            
                <div id="timelineProfilePic" class="">

                    <a href="#" title="" class="image" id="profile_image"><img src="images/passport.jpg" alt=""></a>                        
                    
                </div>                    

                    <div id="pageTab3" class="">	
                      <div id="timelineNav">
                        <ul  class="nav nav-pills"  style="margin-left: 25%">
                            <li class="active">
                                <a  href="#1b" data-toggle="tab">My Profile</a>
                            </li>
                            <li>
                                <a  href="#2b" data-toggle="tab">History</a>
                            </li>
                            <li><a href="#3b" data-toggle="tab">Status</a>
                            </li>
                            <li><a href="#4b" data-toggle="tab">Client</a>
                            </li>
                        </ul>
                          <a href="#"><span style="float: right; font-size:1em" class="label badge">Print slip</span></a>
                      </div>
                        <div class="tab-content clearfix">
                               <div class="tab-pane active" id="1b">  
                               <div class="row profile-tab">  
                                    <div class = "panel panel-success">
                                       <div class = "panel-heading">
                                         <h5><i class="fa fa-user fa-2x"></i>Personal Information</h5>
                                       </div>

                                       <div class = "panel-body table-responsive" id="personal_info_body">
                                            <table class="table">
                                                    <tbody>
                                                        <tr><td class="bold">Surname</td><td id="surname_data">Ityav</td></tr>
                                                        <tr><td class="bold">First Name</td><td id="firstname_data">Ityav</td></tr>
                                                        <tr><td class="bold">Middle Name</td><td id="middlename_data">Ityav</td></tr>
                                                        <tr><td class="bold">Gender</td><td id="gender_data">Ityav</td></tr>
                                                    </tbody> 
                                            </table>                                           
                                       </div>
                                        
                                      <div class = "panel-footer">
                                            <label class="btn btn-success"><input type="checkbox" name="options" class="toggle" id="option1">Edit</label>
                                            <input type="button"  class="btn btn-success" value="Save Changes" id="save_personal_data_changes"></input>                    
                                      </div>
                                    </div>
                                   
                                    <div class = "panel panel-success">
                                       <div class = "panel-heading">
                                        <h5><i class="fa fa-phone fa-2x"></i>Contact Information</h5>
                                       </div>

                                       <div class = "panel-body table-responsive">
                                            <table class="table">
                                                    <tbody>
                                                        <tr><td class="bold">Phone Number</td><td id="phone_data">Ityav</td></tr>
                                                        <tr><td class="bold">Email Address</td><td id="email_data">Ityav</td></tr>
                                                        <tr><td class="bold">Contact Address</td><td id="contact_data">Ityav</td></tr>
                                                        <tr><td class="bold">Village</td><td id="village_data">Ityav</td></tr>

                                                    </tbody> 
                                            </table>
                                       </div>
                                        
                                      <div class = "panel-footer">
                                            <label class="btn btn-success"><input type="checkbox" name="options" class="toggle" id="option1">Edit</label>
                                            <input type="button"  class="btn btn-success" value="Save Changes" id="save_personal_data_changes"></input>                    
                                      </div>
                                    </div>
                                   
                                    <div class = "panel panel-success">
                                       <div class = "panel-heading">
                                        <h5><i class="fa fa-question fa-2x"></i>Knowledge Base</h5>
                                       </div>

                                       <div class = "panel-body table-responsive">
                                            <table class="table">
                                                    <tbody>
                                                        <tr><td class="bold">Preferred Language</td><td id="language_data">Ityav</td></tr>
                                                        <tr><td class="bold">Education Level</td><td id="education_data">Ityav</td></tr>
                                                        <tr><td class="bold">Phone Used</td><td id="phonetype_data">Ityav</td></tr>

                                                    </tbody> 
                                            </table>
                                       </div>
                                        
                                      <div class = "panel-footer">
                                            <label class="btn btn-success"><input type="checkbox" name="options" class="toggle" id="option1">Edit</label>
                                            <input type="button"  class="btn btn-success" value="Save Changes" id="save_personal_data_changes"></input>                  
                                      </div>
                                    </div>
                                   
                                    <div class = "panel panel-success">
                                       <div class = "panel-heading">
                                            <h5><i class="fa fa-map fa-2x"></i>Origin Data</h5>
                                       </div>

                                       <div class = "panel-body table-responsive">
                                            <table class="table">
                                                    <tbody>
                                                        <tr><td class="bold">State</td><td id="state_data">Ityav</td></tr>
                                                        <tr><td class="bold">Local Government</td><td id="localgvt_data">Ityav</td></tr>
                                                        <tr><td class="bold">Council Ward</td><td id="ward_data">Ityav</td></tr>

                                                    </tbody> 
                                            </table>
                                       </div>
                                        
                                      <div class = "panel-footer">
                                            <label class="btn btn-success"><input type="checkbox" name="options" class="toggle" id="option1">Edit</label>
                                            <input type="button"  class="btn btn-success" value="Save Changes" id="save_personal_data_changes"></input>                    
                                      </div>
                                    </div>
                                   
                                    <div class = "panel panel-success">
                                       <div class = "panel-heading">
                                        <h5><i class="fa fa-user-plus fa-2x"></i>Next of Kin Information</h5>
                                       </div>

                                       <div class = "panel-body table-responsive">
                                         <table class="table">
                                            <tbody>
                                                <tr><td class="bold">Surname</td><td id="kinsurname_data">Ityav</td></tr>
                                                <tr><td class="bold">Name</td><td id="kinname_data">Ityav</td></tr>
                                                <tr><td class="bold">Phone Number</td><td id="kinphone_data">Ityav</td></tr>
                                                <tr><td class="bold">Contact Address</td><td id="kincontact_data">Ityav</td></tr>
                                                <tr><td class="bold">Relationship</td><td id="kinrelationship_data">Ityav</td></tr>
                                            </tbody>
                                         </table>
                                       </div>
                                        
                                      <div class = "panel-footer">
                                            <label class="btn btn-success"><input type="checkbox" name="options" class="toggle" id="option1">Edit</label>
                                            <input type="button"  class="btn btn-success" value="Save Changes" id="save_personal_data_changes"></input>                    
                                      </div>
                                    </div>
                                   
                               </div>
                               </div>
                                <div class="tab-pane" id="2b">
                                <div class="container-fluid">
                                        <div class = "panel panel-success">
                                           <div class = "panel-heading">
                                             <h5><i class="fa fa-history fa-2x"></i>Production History</h5>
                                           </div>

                                           <div class = "panel-body table-responsive" id="personal_info_body">
                                            <div class="list-group">
                                                    <a href="#" class="list-group-item">Surname:<span class="badge">Ityav</span>
                                                    </a>
                                                    <a href="#" class="list-group-item">Laptops & Desktops <span class="badge">145</span>
                                                    </a>
                                                    <a href="#" class="list-group-item">Tablets <span class="badge">30</span>
                                                    </a>  
                                                    <a href="#" class="list-group-item">Audio & Video Players <span class="badge">65</span>
                                                    </a>
                                                    <a href="#" class="list-group-item">Camera <span class="badge">8</span>
                                                    </a>
                                            </div>                                          
                                           </div>
                                        </div>                                    
                                    
                                    
                                  
                                </div>
                                </div>
                                <div class="tab-pane" id="3b">                               
                                    
                                <div class="content">
                                    <div class="panel panel-warning">
                                        <div class="panel-heading">
                                            <h2><i class="fa fa-warning fa-3x"></i>You are not yet verified!</h2>
                                        </div>
                                            <div class="panel-body table-responsive">
                                                <div class="row">
                                                     <div class="col-sm-12 widget_1_box">
                                                        <div class="tile-progress bg-warning">
                                                            <div class="content">
                                                                <span>Scan and upload your INEC Voters Card or National ID Card. Submit for verification which may take two (2) working days.<br /><br /></span>
                                                            </div>
                                                        </div>
                                                     </div> 
                                                  </div>
                                              </div>
                                        <div class="panel-footer">
                                             <button id="farmeverification" class="btn btn-warning" >Click To Verify</button>                        
                                        </div>
                                    </div>                                    
                                    
                                </div><!-- content -->                                    
                                </div>
                                <div class="tab-pane" id="4b">                               
                                    
                                    <div class="panel panel-success">
                                        <div class="panel-heading">
                                            <h2><i class="fa fa-briefcase fa-3x"></i>My Clients</h2>
                                        </div>
                                            <div class="panel-body table-responsive">
                                                <div class="row">
                                                    <div class="list-group">
                                                            <a href="#" class="list-group-item">Surname:<span class="badge">Ityav</span>
                                                            </a>
                                                            <a href="#" class="list-group-item">Laptops & Desktops <span class="badge">145</span>
                                                            </a>
                                                            <a href="#" class="list-group-item">Tablets <span class="badge">30</span>
                                                            </a>  
                                                            <a href="#" class="list-group-item">Audio & Video Players <span class="badge">65</span>
                                                            </a>
                                                            <a href="#" class="list-group-item">Camera <span class="badge">8</span>
                                                            </a>
                                                    </div>     
                                                  </div>
                                              </div>
                                    </div>                                    
                                    
                                    <div class="panel panel-success">
                                        <div class="panel-heading">
                                            <h2><i class="fa fa-briefcase fa-3x"></i>Suggested Clients</h2>
                                        </div>
                                            <div class="panel-body table-responsive">
                                                <div class="row">
                                                    <div class="list-group">
                                                            <a href="#" class="list-group-item">Surname:<span class="badge">Ityav</span>
                                                            </a>
                                                            <a href="#" class="list-group-item">Laptops & Desktops <span class="badge">145</span>
                                                            </a>
                                                            <a href="#" class="list-group-item">Tablets <span class="badge">30</span>
                                                            </a>  
                                                            <a href="#" class="list-group-item">Audio & Video Players <span class="badge">65</span>
                                                            </a>
                                                            <a href="#" class="list-group-item">Camera <span class="badge">8</span>
                                                            </a>
                                                    </div>     
                                                  </div>
                                              </div>
       
                                    </div>                                    
                                    
                                </div>

                    </div>
                </div>
                </div>
                </div>
            </div>
        </section>
    </body>
</html>
