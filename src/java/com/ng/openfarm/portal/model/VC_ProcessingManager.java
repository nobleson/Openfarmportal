/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.model;


import com.ng.openfarm.portal.dao.FarmerDAO;
import com.ng.openfarm.portal.dao.OpenfarmConnect;
import com.ng.openfarm.portal.dao.SessionDAO;
import com.ng.openfarm.portal.dao.VC_ProcessingDAO;
import com.ng.openfarm.portal.dto.VC_ProcessingDataModel;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Mutual-Links
 */
public class VC_ProcessingManager {
    
             
    	public String Web_InsertProcessing(Connection connection, VC_ProcessingDataModel feedOjects,String vc_user) throws Exception {
		String message = null;
		int status = -1;
		String verification = "";
		try {
                    
                    String authId = SessionDAO.getAuIdBySession(connection, vc_user);
                    verification = FarmerDAO.getFarmerId(connection, authId); 
                                          
                   if(verification.equals(feedOjects.getFarmerIdd())){ 
                       
                        VC_ProcessingDAO dao= new VC_ProcessingDAO();
                        status = dao.InsertProcessingData(connection, feedOjects);

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
                       
             
    	public String Web_UpdateProcessing(Connection connection, VC_ProcessingDataModel feedOjects,String vc_user) throws Exception {
		String message = null;
		int status = -1;
		String verification = "";
		try {
                    
                    String authId = SessionDAO.getAuIdBySession(connection, vc_user);
                    verification = FarmerDAO.getFarmerId(connection, authId); 
                                          
                   if(verification.equals(feedOjects.getFarmerIdd())){ 
                       
                        VC_ProcessingDAO dao= new VC_ProcessingDAO();
                        status = dao.UpdateProcessingData(connection, feedOjects);

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
                       
                public VC_ProcessingDataModel Web_GetProcessById(Connection connection,String recordId)throws Exception {
                    
		VC_ProcessingDataModel feeds = null;
		try {
		VC_ProcessingDAO dao= new VC_ProcessingDAO();
		// Here you can validate before connecting DAO class, eg. User session condition

		feeds=dao.GetProcessById(connection, recordId);
		
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}
                
	public ArrayList<VC_ProcessingDataModel> getAllProcessingData(Connection connection ,String vc_user)throws Exception {
		ArrayList<VC_ProcessingDataModel> feeds = null;
		try {
                    
                String authId = SessionDAO.getAuIdBySession(connection, vc_user);
                String verification = FarmerDAO.getFarmerId(connection, authId); 
                connection = OpenfarmConnect.Get_Connection();
                VC_ProcessingDAO dao= new VC_ProcessingDAO();
		feeds=dao.GetAllProcessingData(connection,verification);
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}   
}
