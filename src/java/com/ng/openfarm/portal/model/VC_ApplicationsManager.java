/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.model;


import com.ng.openfarm.portal.dao.FarmerDAO;
import com.ng.openfarm.portal.dao.SessionDAO;
import com.ng.openfarm.portal.dao.VC_ApplicationsDAO;
import com.ng.openfarm.portal.dto.ApplicationDataModel;
import com.ng.openfarm.portal.dto.VC_ApplicationDataModel;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Mutual-Links
 */
public class VC_ApplicationsManager {

    	public String Web_InsertApplications(Connection connection, VC_ApplicationDataModel feedOjects,String vc_user) throws Exception {
		String message = null;
		int status = -1;
		String verification = "";
		try {
                    
                    String authId = SessionDAO.getAuIdBySession(connection, vc_user);
                    verification = FarmerDAO.getFarmerId(connection, authId); 
                                          
                   if(verification.equals(feedOjects.getFarmerIdd())){ 
                       
                        VC_ApplicationsDAO dao= new VC_ApplicationsDAO();
                        status = dao.InsertApplicationData(connection, feedOjects);

                        if(status==0){

                                message = "Success";
                        }else{
                                message = "Fail";

                        }  
                        
                   }else{
                       
                            message = "Invalid";
                   }
                 
                    

		
		} catch (Exception e) {
		throw e;
		}
		return message;
		}
                

    	public String Web_UpdateApplications(Connection connection, VC_ApplicationDataModel feedOjects,String vc_user) throws Exception {
		String message = null;
		int status = -1;
		String verification = "";
		try {
                    
                    String authId = SessionDAO.getAuIdBySession(connection, vc_user);
                    verification = FarmerDAO.getFarmerId(connection, authId); 
                                          
                   if(verification.equals(feedOjects.getFarmerIdd())){ 
                       
                        VC_ApplicationsDAO dao= new VC_ApplicationsDAO();
                        status = dao.UpdateApplicationData(connection, feedOjects);

                        if(status==0){

                                message = "Success";
                        }else{
                                message = "Fail";

                        }  
                        
                   }else{
                       
                            message = "Invalid";
                   }
                 
                    

		
		} catch (Exception e) {
		throw e;
		}
		return message;
		}
                
                public VC_ApplicationDataModel Web_GetProductionById(Connection connection,String recordId)throws Exception {
                    
		VC_ApplicationDataModel feeds = null;
		try {
		VC_ApplicationsDAO dao= new VC_ApplicationsDAO();
		// Here you can validate before connecting DAO class, eg. User session condition

		feeds=dao.GetApplicationById(connection, recordId);
		
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}
	public static ArrayList<ApplicationDataModel> getAllApplicationData(Connection connection ,String vc_user){
		ArrayList<ApplicationDataModel> feeds = null;
		try {
                    
		VC_ApplicationsDAO dao= new VC_ApplicationsDAO();
		feeds=dao.GetAllApplicationsData(connection,vc_user.trim());
                
		}
		catch (Exception e) {
		}
		return feeds;
		}   
}
