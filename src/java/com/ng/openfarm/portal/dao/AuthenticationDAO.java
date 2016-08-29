package com.ng.openfarm.portal.dao;

import com.ng.openfarm.portal.dto.AuthenticationDataModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AuthenticationDAO {
    
    public static int checkPhoneNumber(Connection connect,String userId){
         int status = -1;
         String query = "SELECT * FROM authentication WHERE userId=?";
         PreparedStatement ps = null;
         ResultSet result = null;
         try {

            ps = connect.prepareStatement(query);
            ps.setString(1, userId);

             result = ps.executeQuery();
             if(result.next()){
                 return 0;
             }else{
                 return status;
             }            

         }catch (Exception ex) {
             Logger.getLogger(AuthenticationDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
         return status;
     }
    
    public static int checkUser(Connection connect,String userId){
         int status = -1;
         String query = "SELECT  email_address FROM authentication WHERE userId=?";
         PreparedStatement ps = null;
         ResultSet result = null;
         try {

            ps = connect.prepareStatement(query);
            ps.setString(1, userId);

             result = ps.executeQuery();
             if(result.next()){
                 return 0;
             }else{
                 return status;
             }            

         }catch (Exception ex) {
             Logger.getLogger(AuthenticationDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
         return status;
     }
    
    public static String getAuthenticateId(Connection connect,String userId){
         String authId = "";
         String query = "SELECT  auth_id FROM authentication WHERE userId=?";
         PreparedStatement ps = null;
         ResultSet result = null;
         try {

            ps = connect.prepareStatement(query);
            ps.setString(1, userId);

             result = ps.executeQuery();
             if(result.next()){
                 
                authId = result.getString("auth_id");
            	 
             }            

         }catch (Exception ex) {
             Logger.getLogger(AuthenticationDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
         return authId;
     }
    
    public static String getUserEmail(Connection connect,String authId){
         String mail = "";
         String query = "SELECT  email_address FROM authentication WHERE auth_id=?";
         PreparedStatement ps = null;
         ResultSet result = null;
         try {

            ps = connect.prepareStatement(query);
            ps.setString(1, authId);

             result = ps.executeQuery();
             if(result.next()){
                 
                mail = result.getString("email_address");
            	 
             }            

         }catch (Exception ex) {
             Logger.getLogger(AuthenticationDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
         return mail;
     }

    public static int checkEmail(Connection connect,String email){
         int status = -1;
         String query = "SELECT*FROM authentication WHERE email_address=?";
         PreparedStatement ps = null;
         ResultSet result = null;
         try {

            ps = connect.prepareStatement(query);
            ps.setString(1, email);

             result = ps.executeQuery();
             if(result.next()){
                 return 0;
             }else{
                 return status;
             }            

         }catch (Exception ex) {
             Logger.getLogger(AuthenticationDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
         return status;
     }

public AuthenticationDataModel GetAuthenticationById(Connection connection,String userId) throws Exception
	{
            PreparedStatement ps = null;
            String query = "SELECT * FROM authentication WHERE auth_id=?";

		try
		{
		 ps = connection.prepareStatement(query);
		ps.setString(1,userId);
		ResultSet rs = ps.executeQuery();
		AuthenticationDataModel feedObject = new AuthenticationDataModel();
		while(rs.next())
		{

			feedObject.setAuthId(rs.getString("auth_id"));
			feedObject.setRoleId(rs.getString("role_id"));
			feedObject.setUserId(rs.getString("userId"));
			feedObject.setEmail(rs.getString("email_address"));
			feedObject.setLoginStatus(rs.getString("login_status"));
			feedObject.setRecordDate(rs.getString("record_date"));
			
			 
		}
		return feedObject;
		}
		catch(Exception e)
		{
		throw e;
		}

	}

public int InsertAuthentication(Connection connection,AuthenticationDataModel auths) throws Exception {
		int status = -1;
                    PreparedStatement ps = null;
		try {

		 ps = connection.prepareStatement("INSERT INTO authentication(auth_id,role_id,userId,email_address,password,login_status,record_date) VALUES(?,?,?,?,?,?,?)");


		ps.setString(1, auths.getAuthId());
		ps.setString(2, auths.getRoleId());
		ps.setString(3, auths.getUserId());
		ps.setString(4, auths.getEmail());
		ps.setString(5, auths.getPassword());
		ps.setString(6, auths.getLoginStatus());
		ps.setString(7, auths.getRecordDate());

		int rs = ps.executeUpdate();
		if (rs > -1) {
		return status = 0;
		} else {
		return status;
		}

		} catch (Exception e) {
		throw e;
		}finally{

	          if(ps!= null){
	        	  
                    ps.close();

	          }
	        }
		
		}	
public static String getFarmerRoleCode(){
	
	String roleId = "";
	ResultSet result = null;
	Connection connection = null;
	Statement st = null;
	try {
		
	   	OpenfarmConnect oLAPConnect= new OpenfarmConnect();
		 connection = oLAPConnect.Get_Connection();
		 st = connection.createStatement();
		 result = st.executeQuery("SELECT role_id FROM user_role WHERE role_type='Farmer'");

		 if(result.next()){
			 
			 roleId = result.getString("role_id"); 
		 }
		 
		 
		}catch(Exception e){
			
		}	
	return roleId;
}	
public static String getFarmConsultantRoleCode(){
	
	String roleId = "";
	ResultSet result = null;
	Connection connection = null;
	Statement st = null;
	try {
		
	   	OpenfarmConnect oLAPConnect= new OpenfarmConnect();
		 connection = oLAPConnect.Get_Connection();
		 st = connection.createStatement();
		 result = st.executeQuery("SELECT role_id FROM user_role WHERE role_type='Farm Manager'");

		 if(result.next()){
			 
			 roleId = result.getString("role_id"); 
		 }
		 
		 
		}catch(Exception e){
			
		}	
	return roleId;
}	
public static String getUserRoleType(Connection connection ,String roleId){
	
	String roleType = "";
	ResultSet result = null;
	PreparedStatement ps = null;
	try {
		
		 ps = connection.prepareStatement("SELECT role_type FROM user_role WHERE role_id=?");
		 ps.setString(1, roleId);	 	 
		 result = ps.executeQuery();

		 if(result.next()){
			 
			 roleType = result.getString("role_type"); 
		 }
		 
		 
		}catch(Exception e){
			
		}	
	return roleType;
}	
public static String getLGarea(Connection connection ,String lgAreaId){
	
	String lgArea = "";
	ResultSet result = null;
	PreparedStatement ps = null;
	try {
		
		 ps = connection.prepareStatement("SELECT lga FROM lgas  WHERE lgas_id=?");
		 ps.setString(1, lgAreaId);	 	 
		 result = ps.executeQuery();

		 if(result.next()){
			 
			 lgArea = result.getString("lga"); 
		 }
		 
		 
		}catch(Exception e){
			
		}	
	return lgArea;
}	
public static String getState(Connection connection ,String stateId){
	
	String state = "";
	ResultSet result = null;
	PreparedStatement ps = null;
	try {
		
		 ps = connection.prepareStatement("SELECT state FROM states WHERE state_id=?");
		 ps.setString(1, stateId);	 	 
		 result = ps.executeQuery();

		 if(result.next()){
			 
			 state = result.getString("state"); 
		 }
		 
		 
		}catch(Exception e){
			
		}	
	return state;
}	
 
}
