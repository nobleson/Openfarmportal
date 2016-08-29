 $(document).ready(function(){  
          
  if(getPortalCookie('_id')==null){
  setPortalCookie('_id',sessionStorage.getItem('_id'),1);
  }
  if(getPortalCookie('_mail')==null){
  setPortalCookie('_mail',sessionStorage.getItem('_mail'),1);
  }
  if(getPortalCookie('_password')==null){
  setPortalCookie('_password',sessionStorage.getItem('_password'),1);
  }
  if(getPortalCookie('_role_id')==null){
  setPortalCookie('_role_id',sessionStorage.getItem('_role_id'),1);
  }
  if(getPortalCookie('_role_type')==null){
  setPortalCookie('_role_type',sessionStorage.getItem('_role_type'),1);
  }
  
 $('#contaner-right').load('farmers-page.jsp'); 
  
 if(getPortalCookie('_role_type')=="Farm Manager"){
    $('#main_content').load('manager-profile.jsp'); 
 }
 if(getPortalCookie('_role_type')=="Farmer"){
      $('#main_content').load('farmer-profile.jsp'); 

 }  

$('#logoutLink').click(function(){
    deletePortalCookie('_id');          
    deletePortalCookie('_mail');          
    deletePortalCookie('_password');          
    deletePortalCookie('_role_id');          
    deletePortalCookie('_role_type');  
    window.open("http://localhost:8084/Openfarmportal","_self");
});



$('#home_menu').click(function(){
     if(getPortalCookie('_role_type')=="Farm Manager"){
        $('#main_content').load('manager-profile.jsp'); 
     }
     if(getPortalCookie('_role_type')=="Farmer"){
          $('#main_content').load('farmer-profile.jsp'); 
     }      
});

$('#verify_menu').click(function(){
    $('#main_content').load('verification-page.jsp');          
});
$('#value_chain_menu').click(function(){
    $('#main_content').load('value-chain-page.jsp');          
});
$('#group_menu').click(function(){
    $('#main_content').load('group-page.jsp');          
});
$('#crop_menu').click(function(){
    $('#main_content').load('crop-page.jsp');          
});
$('#production_menu').click(function(){
    $('#main_content').load('production-page.jsp');          
});
$('#application_menu').click(function(){
    $('#main_content').load('application-page.jsp');          
});
$('#process_menu').click(function(){
    $('#main_content').load('processing-page.jsp');          
});
$('#market_menu').click(function(){
    $('#main_content').load('market-page.jsp');          
});
$('#revenue_menu').click(function(){
    $('#main_content').load('revenue-page.jsp');          
});


 });
  
  
//   var clientId = "";
//
//    var cookie  = navigator.cookieEnabled;
//   
//   if(cookie==true){
//       
//       clientId = getCookie('console_id');
//       
//       if(!clientId.length==0){
//            $('#main_page_wraper').load('home-page.jsp');         
//       }else{
//            $('#main_page_wraper').load('registration-page.jsp');         
//       }
//       
//    }else{
//       
//       var go = "";
//       
//        $('#cookiecheck').html("<div class='alert alert-warning alert-block'><a class='close' data-dismiss='alert' href='#'>&times;</a><h4 class='alert-heading'>Cookies Disabled!</h4>You need to enable cookies on your browser to have a better performance on this site</div>");
//   }
function loadFarmerProfile(clientId,roleType) {
    
     var json;
     var dataString = ["loadfarmer",clientId,roleType];
        $.ajax({
         type: "POST",
         url: "user.profile",
         data: {dataString:dataString},
         dataType:"json",
         success: function(data)
         {     
           json = JSON.stringify(data);
            var obj = $.parseJSON(json);
            
            var fullname = obj['surname']+" "+obj['firstName']+" "+obj['lastName']; 
            
            $('#coverTitle').text(fullname);	
            $('#surname_data').text(obj['surname']);	
            $('#firstname_data').text(obj['firstName']);	
            $('#middlename_data').text(obj['lastName']);	
            $('#gender_data').text(obj['gender']);	
            $('#phone_data').text(obj['phoneNumber']);	
            $('#email_data').text(obj['email']);	
            $('#contact_data').text(obj['contact']);	
            $('#village_data').text(obj['city']);	
            $('#language_data').text(obj['preferredLanguage']);	
            $('#education_data').text(obj['educationLevel']);	
            $('#phonetype_data').text(obj['phoneType']);	
            $('#state_data').text(obj['state']);	
            $('#localgvt_data').text(obj['lgArea']);	
            $('#ward_data').text(obj['ward']);	
            $('#kinsurname_data').text(obj['kinSurnam']);	
            $('#kinname_data').text(obj['kinName']);	
            $('#kinphone_data').text(obj['kinphone']);	
            $('#kincontact_data').text(obj['kinContact']);	
            $('#kinrelationship_data').text(obj['kinRelationShip']);	
            
            $('#profile_image').html("<img src='imageserv/"+ obj['profilePhoto']+"'>");
            
	}
	});
}

   function showState(){
       var xmlhttp;

       if (window.XMLHttpRequest)
       {// code for IE7+, Firefox, Chrome, Opera, Safari
       xmlhttp=new XMLHttpRequest();
       }
       else
       {// code for IE6, IE5
       xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
       }
       xmlhttp.onreadystatechange=function()         {
       if (xmlhttp.readyState==4 && xmlhttp.status==200)
       {
       document.getElementById("state_combo").innerHTML=xmlhttp.responseText;
       }
       };
       xmlhttp.open("GET","getStateOption.jsp",true);
       xmlhttp.send();
       }	 


    function setPortalCookie(cname, cvalue, exdays) {
        var d = new Date();
        d.setTime(d.getTime() + (exdays*24*60*60*1000));
        var expires = "expires="+ d.toUTCString();
        document.cookie = cname + "=" + cvalue + "; " + expires;
    } 
    function getPortalCookie(cname) {
        var name = cname + "=";
        var ca = document.cookie.split(';');
        for(var i = 0; i <ca.length; i++) {
            var c = ca[i];
            while (c.charAt(0)==' ') {
                c = c.substring(1);
            }
            if (c.indexOf(name) == 0) {
                return c.substring(name.length,c.length);
            }
        }
        return "";
    } 
    function deletePortalCookie(c) {
      document.cookie = c+"=; expires=Thu, 01 Jan 1970 00:00:00 UTC"; 
    } 

