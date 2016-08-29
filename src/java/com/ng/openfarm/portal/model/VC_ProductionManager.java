/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.model;


import com.ng.openfarm.portal.dao.FarmerDAO;
import com.ng.openfarm.portal.dao.SessionDAO;
import com.ng.openfarm.portal.dao.VC_ProductionDAO;
import com.ng.openfarm.portal.dto.VC_ProductionDataModel;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Mutual-Links
 */
public class VC_ProductionManager {
      
    	public String Web_InsertProduction(Connection connection, VC_ProductionDataModel feedOjects,String vc_user) throws Exception {
		String message = null;
		int status = -1;
		String verification = "";
		try {
                    
                    String authId = SessionDAO.getAuIdBySession(connection, vc_user);
                    verification = FarmerDAO.getFarmerId(connection, authId); 
                                          
                   if(verification.equals(feedOjects.getFarmerIdd())){ 
                       
                        VC_ProductionDAO dao= new VC_ProductionDAO();
                        status = dao.InsertProductionData(connection, feedOjects);

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
        
      
    	public String Web_UpdateProduction(Connection connection, VC_ProductionDataModel feedOjects,String vc_user) throws Exception {
		String message = null;
		int status = -1;
		String verification = "";
		try {
                    
                    String authId = SessionDAO.getAuIdBySession(connection, vc_user);
                    verification = FarmerDAO.getFarmerId(connection, authId); 
                                          
                   if(verification.equals(feedOjects.getFarmerIdd())){ 
                       
                        VC_ProductionDAO dao= new VC_ProductionDAO();
                        status = dao.UpdateProductionData(connection, feedOjects);

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
        
	public ArrayList<VC_ProductionDataModel> getAllProductionData(Connection connection ,String vc_user)throws Exception {
		ArrayList<VC_ProductionDataModel> feeds = null;
		try {
                    
                String authId = SessionDAO.getAuIdBySession(connection, vc_user);
                String verification = FarmerDAO.getFarmerId(connection, authId); 
		VC_ProductionDAO dao= new VC_ProductionDAO();
		feeds=dao.GetAllProductionData(connection,verification);
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}  
        
                public VC_ProductionDataModel Web_GetProductionById(Connection connection,String recordId)throws Exception {
                    
		VC_ProductionDataModel feeds = null;
		try {
		VC_ProductionDAO dao= new VC_ProductionDAO();
		// Here you can validate before connecting DAO class, eg. User session condition

		feeds=dao.GetProductionById(connection, recordId);
		
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}
}
