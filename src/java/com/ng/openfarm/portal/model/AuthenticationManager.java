package com.ng.openfarm.portal.model;

import com.ng.openfarm.portal.dao.AuthenticationDAO;
import com.ng.openfarm.portal.dto.AuthenticationDataModel;
import java.sql.Connection;


public class AuthenticationManager {
	
	public AuthenticationDataModel Web_GetAuthenticationById(Connection connection,String userId)throws Exception {
		AuthenticationDataModel feeds = null;
		try {
		AuthenticationDAO dao= new AuthenticationDAO();
		// Here you can validate before connecting DAO class, eg. User session condition

		feeds=dao.GetAuthenticationById(connection,userId);
		
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}		
	public String Web_InsertAuthentication(Connection connection, AuthenticationDataModel feedOjects) throws Exception {
		String message = null;
		int status = -1;
		try {

		AuthenticationDAO dao= new AuthenticationDAO();
		status = dao.InsertAuthentication(connection, feedOjects);

		if(status==0){
			
			message = "Congratulations!!";
		}else{
			message = "fail";

		}
		
		} catch (Exception e) {
		throw e;
		}
		return message;
		}	
}
