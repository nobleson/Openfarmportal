/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.model;


import com.ng.openfarm.portal.dao.FarmerDAO;
import com.ng.openfarm.portal.dao.SessionDAO;
import com.ng.openfarm.portal.dao.VC_SalesDAO;
import com.ng.openfarm.portal.dto.VC_SalsesDataModel;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Mutual-Links
 */
public class VC_SalesManager {
            
    	public String Web_InsertSales(Connection connection, VC_SalsesDataModel feedOjects,String vc_user) throws Exception {
		String message = null;
		int status = -1;
		String verification = "";
		try {
                    
                    String authId = SessionDAO.getAuIdBySession(connection, vc_user);
                    verification = FarmerDAO.getFarmerId(connection, authId); 
                                          
                   if(verification.equals(feedOjects.getFarmerIdd())){ 
                       
                        VC_SalesDAO dao= new VC_SalesDAO();
                        status = dao.InsertSalesData(connection, feedOjects);

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
        
            
    	public String Web_UpdateSales(Connection connection, VC_SalsesDataModel feedOjects,String vc_user) throws Exception {
		String message = null;
		int status = -1;
		String verification = "";
		try {
                    
                    String authId = SessionDAO.getAuIdBySession(connection, vc_user);
                    verification = FarmerDAO.getFarmerId(connection, authId); 
                                          
                   if(verification.equals(feedOjects.getFarmerIdd())){ 
                       
                        VC_SalesDAO dao= new VC_SalesDAO();
                        status = dao.UpdateSalesData(connection, feedOjects);

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
        
	public ArrayList<VC_SalsesDataModel> getAllSalesData(Connection connection ,String vc_user)throws Exception {
		ArrayList<VC_SalsesDataModel> feeds = null;
		try {
                    
		VC_SalesDAO dao= new VC_SalesDAO();
		feeds=dao.GetAllSalesData(connection,vc_user);
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}    
        
                
	   public VC_SalsesDataModel Web_GetSalesById(Connection connection,String recordId)throws Exception {
		VC_SalsesDataModel feeds = null;
		try {
		VC_SalesDAO dao= new VC_SalesDAO();
		// Here you can validate before connecting DAO class, eg. User session condition

		feeds=dao.GetSalesById(connection, recordId);
		
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}
}
