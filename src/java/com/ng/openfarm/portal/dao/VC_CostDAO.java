/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.dao;


import com.ng.openfarm.portal.dto.VC_CostDataModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Mutual-Links
 */
public class VC_CostDAO {
                
	public VC_CostDataModel GetCostById(Connection connection,String costId) throws Exception
	{
		PreparedStatement ps = null;
		VC_CostDataModel feedObject = new VC_CostDataModel();
		try
               {
	         ps = connection.prepareStatement("SELECT * FROM vc_cost_data WHERE cost_id=?");
		ps.setString(1,costId);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
                feedObject.setCostId(rs.getString("cost_id")); 
                feedObject.setCostType(rs.getString("cost_type")); 
                feedObject.setCostDesc(rs.getString("cost_desc")); 
                feedObject.setQuantity(rs.getString("quantity")); 
                feedObject.setUnitCost(rs.getString("unit_cost")); 
                feedObject.setTotalCost(rs.getString("total_cost"));
                feedObject.setProductionId(rs.getString("product_id"));  
                feedObject.setProductionStage(rs.getString("product_stage")); 
             
		
			
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
        public ArrayList<VC_CostDataModel> GetAllCostData(Connection connection,String farmerId) throws Exception
	{
		PreparedStatement ps = null;
		ArrayList<VC_CostDataModel> feedData = new ArrayList<VC_CostDataModel>();
		try
		{
	        ps = connection.prepareStatement("SELECT * FROM vc_cost_data WHERE farmer_id=?");
		ps.setString(1,farmerId);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
		
		VC_CostDataModel feedObject = new VC_CostDataModel();
                    
                feedObject.setCostId(rs.getString("cost_id")); 
                feedObject.setCostType(rs.getString("cost_type")); 
                feedObject.setCostDesc(rs.getString("cost_desc")); 
                feedObject.setQuantity(rs.getString("quantity")); 
                feedObject.setUnitCost(rs.getString("unit_cost")); 
                feedObject.setTotalCost(rs.getString("total_cost"));
                feedObject.setProductionId(VC_ProductionDAO.getProductionName(connection, rs.getString("product_id")));  
                feedObject.setProductionStage(rs.getString("product_stage")); 
             
		
		feedData.add(feedObject);
		}
		return feedData;
		}
		catch(Exception e)
		{
		throw e;
		}
	}
	
	
    
    
    
    public int InsertCostData(Connection connection, VC_CostDataModel feedObject) throws Exception {
		int status = -1;
                    PreparedStatement ps = null;
		try {

		 ps = connection.prepareStatement("INSERT INTO vc_cost_data(cost_id ,cost_type "
                         + ",cost_desc ,quantity,unit_cost ,total_cost,product_id,product_stage,group_id,farmer_id"
                         + ",VC_ID,Last_Modified_Date) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");


		ps.setString(1, feedObject.getCostId());
		ps.setString(2, feedObject.getCostType());
		ps.setString(3, feedObject.getCostDesc());
		ps.setString(4, feedObject.getQuantity());
		ps.setString(5, feedObject.getUnitCost());
		ps.setString(6, feedObject.getTotalCost());
		ps.setString(7, feedObject.getProductionId());
		ps.setString(8, feedObject.getProductionStage());
		ps.setString(9, feedObject.getGroupId());
		ps.setString(10, feedObject.getFarmerIdd());
		ps.setString(11, feedObject.getVC_ID());
		ps.setString(12, feedObject.getLastModifiedDate());

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
    
    
    public int UpdateCostData(Connection connection, VC_CostDataModel feedObject) throws Exception {
		int status = -1;
                    PreparedStatement ps = null;
		try {

		 ps = connection.prepareStatement("UPDATE vc_cost_data SET cost_type=?"
                         + ",cost_desc=? ,quantity=?,unit_cost=? ,total_cost=?"
                         + ",Last_Modified_Date=? WHERE cost_id=?");

		ps.setString(1, feedObject.getCostType());
		ps.setString(2, feedObject.getCostDesc());
		ps.setString(3, feedObject.getQuantity());
		ps.setString(4, feedObject.getUnitCost());
		ps.setString(5, feedObject.getTotalCost());
		ps.setString(6, feedObject.getLastModifiedDate());
		ps.setString(7, feedObject.getCostId());
                
                
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
