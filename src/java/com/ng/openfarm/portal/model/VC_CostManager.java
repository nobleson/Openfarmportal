/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.model;


import com.ng.openfarm.portal.dao.FarmerDAO;
import com.ng.openfarm.portal.dao.SessionDAO;
import com.ng.openfarm.portal.dao.VC_CostDAO;
import com.ng.openfarm.portal.dto.VC_CostDataModel;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Mutual-Links
 */
public class VC_CostManager {
                
    	public String Web_UpdateCostData(Connection connection, VC_CostDataModel feedOjects,String vc_user) throws Exception {
		String message = null;
		int status = -1;
		String verification = "";
		try {
                    
                    String authId = SessionDAO.getAuIdBySession(connection, vc_user);
                    verification = FarmerDAO.getFarmerId(connection, authId); 
                                          
                   if(verification.equals(feedOjects.getFarmerIdd())){ 
                       
                        VC_CostDAO dao= new VC_CostDAO();
                        status = dao.UpdateCostData(connection, feedOjects);

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
        
                
    	public String Web_InsertCost(Connection connection, VC_CostDataModel feedOjects,String vc_user) throws Exception {
		String message = null;
		int status = -1;
		String verification = "";
		try {
                    
                    String authId = SessionDAO.getAuIdBySession(connection, vc_user);
                    verification = FarmerDAO.getFarmerId(connection, authId); 
                                          
                   if(verification.equals(feedOjects.getFarmerIdd())){ 
                       
                        VC_CostDAO dao= new VC_CostDAO();
                        status = dao.InsertCostData(connection, feedOjects);

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
        
	public ArrayList<VC_CostDataModel> getAllSalesData(Connection connection ,String vc_user)throws Exception {
		ArrayList<VC_CostDataModel> feeds = null;
		try {
                    
		VC_CostDAO dao= new VC_CostDAO();
		feeds=dao.GetAllCostData(connection,vc_user);
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}  
                
	   public VC_CostDataModel Web_GetCostById(Connection connection,String recordId)throws Exception {
		VC_CostDataModel feeds = null;
		try {
		VC_CostDAO dao= new VC_CostDAO();
		// Here you can validate before connecting DAO class, eg. User session condition

		feeds=dao.GetCostById(connection, recordId);
		
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}
}
