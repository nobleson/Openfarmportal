/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.dao;


import com.ng.openfarm.portal.dto.VC_SalsesDataModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import utility.DateFormat;

/**
 *
 * @author Mutual-Links
 */
public class VC_SalesDAO {
            
	public VC_SalsesDataModel GetSalesById(Connection connection,String cropCateId) throws Exception
	{
		PreparedStatement ps = null;
		VC_SalsesDataModel feedObject = new VC_SalsesDataModel();
		try
               {
	         ps = connection.prepareStatement("SELECT * FROM vc_marketing_data WHERE sales_id=?");
		ps.setString(1,cropCateId);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
                feedObject.setSalesId(rs.getString("sales_id")); 
                feedObject.setSalesDesc(rs.getString("sales_desc")); 
                feedObject.setProductionForm(rs.getString("production_form")); 
                feedObject.setBuyer(rs.getString("buyer")); 
                feedObject.setQuantity(rs.getString("quantity")); 
                feedObject.setUnitMeasurement(rs.getString("unit_measurement"));
                feedObject.setUnitCost(rs.getString("unit_cost")); 
                feedObject.setTotalCost(rs.getString("total_cost")); 
                feedObject.setSalesDate(DateFormat.formatDate(rs.getLong("sales_date")));  
                feedObject.setProductionId(rs.getString("production_id"));
		
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
        public ArrayList<VC_SalsesDataModel> GetAllSalesData(Connection connection,String farmerId) throws Exception
	{
		PreparedStatement ps = null;
		ArrayList<VC_SalsesDataModel> feedData = new ArrayList<VC_SalsesDataModel>();
		try
		{
	         ps = connection.prepareStatement("SELECT * FROM vc_marketing_data WHERE farmer_id=?");
		ps.setString(1,farmerId);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
		
		VC_SalsesDataModel feedObject = new VC_SalsesDataModel();
                    
                feedObject.setSalesId(rs.getString("sales_id")); 
                feedObject.setSalesDesc(rs.getString("sales_desc")); 
                feedObject.setProductionForm(rs.getString("production_form")); 
                feedObject.setBuyer(rs.getString("buyer")); 
                feedObject.setQuantity(rs.getString("quantity")); 
                feedObject.setUnitMeasurement(rs.getString("unit_measurement"));
                feedObject.setUnitCost(rs.getString("unit_cost")); 
                feedObject.setTotalCost(rs.getString("total_cost")); 
                feedObject.setSalesDate(DateFormat.formatDate(rs.getLong("sales_date")));  
                feedObject.setProductionId(VC_ProductionDAO.getProductionName(connection, rs.getString("production_id")));
		
		feedData.add(feedObject);
		}
		return feedData;
		}
		catch(Exception e)
		{
		throw e;
		}
	}
	
	
    
    
    
    public int InsertSalesData(Connection connection, VC_SalsesDataModel feedObject) throws Exception {
		int status = -1;
                    PreparedStatement ps = null;
		try {

		 ps = connection.prepareStatement("INSERT INTO vc_marketing_data(sales_id ,sales_desc ,production_form "
                         + ",buyer ,quantity,unit_measurement ,unit_cost,total_cost,sales_date,production_id,group_id,farmer_id"
                         + ",VC_ID,Last_Modified_Date) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");


		ps.setString(1, feedObject.getSalesId());
		ps.setString(2, feedObject.getSalesDesc());
		ps.setString(3, feedObject.getProductionForm());
		ps.setString(4, feedObject.getBuyer());
		ps.setString(5, feedObject.getQuantity());
		ps.setString(6, feedObject.getUnitMeasurement());
		ps.setString(7, feedObject.getUnitCost());
		ps.setString(8, feedObject.getTotalCost());
		ps.setString(9, feedObject.getSalesDate());
		ps.setString(10, feedObject.getProductionId());
		ps.setString(11, feedObject.getGroupId());
		ps.setString(12, feedObject.getFarmerIdd());
		ps.setString(13, feedObject.getVC_ID());
		ps.setString(14, feedObject.getLastModifiedDate());

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
    
    public int UpdateSalesData(Connection connection, VC_SalsesDataModel feedObject) throws Exception {
		int status = -1;
                    PreparedStatement ps = null;
		try {

		 ps = connection.prepareStatement("UPDATE vc_marketing_data SET  sales_desc=?,production_form=? "
                         + ",buyer=? ,quantity=?,unit_measurement=? ,unit_cost=?,total_cost=?,sales_date=?"
                         + ",Last_Modified_Date=? WHERE sales_id=?");


		ps.setString(1, feedObject.getSalesDesc());
		ps.setString(2, feedObject.getProductionForm());
		ps.setString(3, feedObject.getBuyer());
		ps.setString(4, feedObject.getQuantity());
		ps.setString(5, feedObject.getUnitMeasurement());
		ps.setString(6, feedObject.getUnitCost());
		ps.setString(7, feedObject.getTotalCost());
		ps.setString(8, feedObject.getSalesDate());
		ps.setString(9, feedObject.getLastModifiedDate());
		ps.setString(10, feedObject.getSalesId());
                
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
