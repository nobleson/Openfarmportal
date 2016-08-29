/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.dao;


import com.ng.openfarm.portal.dto.VC_ProcessingDataModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Mutual-Links
 */
public class VC_ProcessingDAO {
                             
	public VC_ProcessingDataModel GetProcessById(Connection connection,String appId) throws Exception
	{
		PreparedStatement ps = null;
		VC_ProcessingDataModel feedObject = new VC_ProcessingDataModel();
		try
               {
	         ps = connection.prepareStatement("SELECT * FROM vc_processing_data WHERE processing_id=?");
		ps.setString(1,appId);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
                                 
                feedObject.setProcessingId(rs.getString("processing_id")); 
                feedObject.setProcessingDesc(rs.getString("processing_desc")); 
                feedObject.setProcessingTech(rs.getString("processing_tech")); 
                feedObject.setProcessedQty(rs.getString("processedqty")); 
                feedObject.setProcessingFirm(rs.getString("processing_firm")); 
                feedObject.setProductionId(rs.getString("product_id")); 

		}
		}
		catch(Exception e)
		{
		throw e;
		} finally{

	          if(ps!= null){
	        	  
                  ps.close();

	          }
	        }
		return feedObject;

	}
        
        
       public ArrayList<VC_ProcessingDataModel> GetAllProcessingData(Connection connection,String farmerId) throws Exception
	{
		ArrayList<VC_ProcessingDataModel> feedData = new ArrayList<VC_ProcessingDataModel>();
		try
		{
		Statement ps = connection.createStatement();
		ResultSet rs = ps.executeQuery("SELECT * FROM vc_processing_data WHERE farmer_id='"+farmerId+"'");
		while(rs.next())
		{
		
		VC_ProcessingDataModel feedObject = new VC_ProcessingDataModel();
                    
                feedObject.setProcessingId(rs.getString("processing_id")); 
                feedObject.setProcessingDesc(rs.getString("processing_desc")); 
                feedObject.setProcessingTech(rs.getString("processing_tech")); 
                feedObject.setProcessedQty(rs.getString("processedqty")); 
                feedObject.setProcessingFirm(rs.getString("processing_firm")); 
                feedObject.setProductionId(VC_ProductionDAO.getProductionName(connection, rs.getString("product_id"))); 

		
		feedData.add(feedObject);
		}
		return feedData;
		}
		catch(Exception e)
		{
		throw e;
		}
	}
	
	
    
    
    
    public int InsertProcessingData(Connection connection, VC_ProcessingDataModel feedObject) throws Exception {
		int status = -1;
                    PreparedStatement ps = null;
		try {

		 ps = connection.prepareStatement("INSERT INTO vc_processing_data(processing_id ,processing_desc,processing_tech"
                         + ",processedqty,processing_firm,product_id ,group_id,farmer_id,VC_ID,Last_Modified_Date) VALUES(?,?,?,?,?,?,?,?,?,?)");


		ps.setString(1, feedObject.getProcessingId());
		ps.setString(2, feedObject.getProcessingDesc());
		ps.setString(3, feedObject.getProcessingTech());
		ps.setString(4, feedObject.getProcessedQty());
		ps.setString(5, feedObject.getProcessingFirm());
		ps.setString(6, feedObject.getProductionId());
		ps.setString(7, feedObject.getGroupId());
		ps.setString(8, feedObject.getFarmerIdd());
		ps.setString(9, feedObject.getVC_ID());
		ps.setString(10, feedObject.getLastModifiedDate());

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
    
    
    
    public int UpdateProcessingData(Connection connection, VC_ProcessingDataModel feedObject) throws Exception {
		int status = -1;
                    PreparedStatement ps = null;
		try {

		 ps = connection.prepareStatement("UPDATE  vc_processing_data SET processing_desc=?,processing_tech=?"
                         + ",processedqty=?,processing_firm=?,Last_Modified_Date=? WHERE processing_id= ? ");


		ps.setString(1, feedObject.getProcessingDesc());
		ps.setString(2, feedObject.getProcessingTech());
		ps.setString(3, feedObject.getProcessedQty());
		ps.setString(4, feedObject.getProcessingFirm());
		ps.setString(5, feedObject.getLastModifiedDate());
		ps.setString(6, feedObject.getProcessingId());
                
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
    
    	public static ResultSet loadProductionData(String vc_user){
			ResultSet result = null;
			Connection connection = null;
                        String verification = "";
			Statement st = null;
			try {
                        connection = OpenfarmConnect.Get_Connection();
                        String authId = SessionDAO.getAuIdBySession(connection, vc_user);
                        verification = FarmerDAO.getFarmerId(connection, authId);  
                        st = connection.createStatement();
                        result = st.executeQuery("SELECT * FROM vc_production_data WHERE farmer_id  ='"+verification+"'");

                        }catch(Exception e){

                        }		

				
			return result;
	    }      
    
}
