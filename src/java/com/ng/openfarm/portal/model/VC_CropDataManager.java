/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.model;


import com.ng.openfarm.portal.dao.FarmerDAO;
import com.ng.openfarm.portal.dao.SessionDAO;
import com.ng.openfarm.portal.dao.VC_CropDataDAO;
import com.ng.openfarm.portal.dto.VC_CropDataModel;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Mutual-Links
 */
public class VC_CropDataManager {
    
    	public String Web_InsertCropData(Connection connection, VC_CropDataModel feedOjects,String vc_user) throws Exception {
		String message = null;
		int status = -1;
		String verification = "";
		try {
                    
                    String authId = SessionDAO.getAuIdBySession(connection, vc_user);
                    verification = FarmerDAO.getFarmerId(connection, authId); 
                                          
                   if(verification.equals(feedOjects.getFarmerId())){ 
                       
                        VC_CropDataDAO dao= new VC_CropDataDAO();
                        status = dao.InsertCropData(connection, feedOjects);

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
        
    
    	public String Web_UpdateCropData(Connection connection, VC_CropDataModel feedOjects,String vc_user) throws Exception {
		String message = null;
		int status = -1;
		String verification = "";
		try {
                    String authId = SessionDAO.getAuIdBySession(connection, vc_user);
                    verification = FarmerDAO.getFarmerId(connection, authId); 
                   if(verification.equals(feedOjects.getFarmerId())){ 
                       
                        VC_CropDataDAO dao= new VC_CropDataDAO();
                        status = dao.UpdateCropData(connection, feedOjects);

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
        
	public ArrayList<VC_CropDataModel> getAllCropData(Connection connection ,String vc_user)throws Exception {
		ArrayList<VC_CropDataModel> feeds = null;
		try {
                    
		VC_CropDataDAO dao= new VC_CropDataDAO();
		feeds=dao.GetAllCropData(connection,vc_user);
                
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}		
        
	   public VC_CropDataModel Web_GetCropById(Connection connection,String recordId)throws Exception {
		VC_CropDataModel feeds = null;
		try {
		VC_CropDataDAO dao= new VC_CropDataDAO();
		// Here you can validate before connecting DAO class, eg. User session condition

		feeds=dao.GetCropById(connection, recordId);
		
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}
        
}
