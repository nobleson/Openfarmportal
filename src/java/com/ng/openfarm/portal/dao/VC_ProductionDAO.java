/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.dao;

import com.ng.openfarm.portal.dto.VC_ProductionDataModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Mutual-Links
 */
public class VC_ProductionDAO {
        
	public VC_ProductionDataModel GetProductionById(Connection connection,String productionCateId) throws Exception
	{
		PreparedStatement ps = null;
		VC_ProductionDataModel feedObject = new VC_ProductionDataModel();
		try
               {
	         ps = connection.prepareStatement("SELECT * FROM vc_production_data WHERE production_id=?");
		ps.setString(1,productionCateId);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
                feedObject.setProductionId(rs.getString("production_id")); 
                feedObject.setProductionDescription(rs.getString("production_description")); 
                feedObject.setVC_ID(rs.getString("VC_ID")); 
                feedObject.setCropId(rs.getString("crop_id"));  
                feedObject.setProductionWeeks(rs.getString("production_weeks")); 
                feedObject.setHectares(rs.getString("hectares")); 
                feedObject.setProductionSeason(rs.getString("production_season")); 
                feedObject.setTechnology(rs.getString("technology"));
                feedObject.setTargetYield(rs.getString("target_yield")); 
                feedObject.setActualYield(rs.getString("actual_yield")); 
                feedObject.setProductionYear(rs.getString("production_year")); 
                feedObject.setCommonPest(rs.getString("common_pest")); 
                feedObject.setInputProvider(rs.getString("input_provider")); 
                feedObject.setInputs(rs.getString("inputs")); 
                feedObject.setSiteNumber(rs.getString("site_number"));
			
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
    	public ArrayList<VC_ProductionDataModel> GetAllProductionData(Connection connection,String farmerId) throws Exception
	{
		ArrayList<VC_ProductionDataModel> feedData = new ArrayList<VC_ProductionDataModel>();
		try
		{
		Statement ps = connection.createStatement();
		ResultSet rs = ps.executeQuery("SELECT * FROM vc_production_data WHERE farmer_id='"+farmerId+"'");
		while(rs.next())
		{
		
		VC_ProductionDataModel feedObject = new VC_ProductionDataModel();
                    
                feedObject.setProductionId(rs.getString("production_id")); 
                feedObject.setProductionDescription(rs.getString("production_description")); 
                feedObject.setVC_ID(rs.getString("VC_ID")); 
                feedObject.setCropId(VC_CropDataDAO.getCropDesc(connection, rs.getString("crop_id")));  
                feedObject.setProductionWeeks(rs.getString("production_weeks")); 
                feedObject.setHectares(rs.getString("hectares")); 
                feedObject.setProductionSeason(rs.getString("production_season")); 
                feedObject.setTechnology(rs.getString("technology"));
                feedObject.setActualYield(rs.getString("actual_yield")); 
                feedObject.setProductionYear(rs.getString("production_year")); 
                feedObject.setSiteNumber(rs.getString("site_number"));
		
		feedData.add(feedObject);
		}
		return feedData;
		}
		catch(Exception e)
		{
		throw e;
		}
	}
              public static String getProductionName(Connection connection,String cropId){
		
		String stateName = "";
		ResultSet result = null;
		PreparedStatement ps = null;
		try {
			
			 ps = connection.prepareStatement("SELECT * FROM vc_production_data WHERE production_id=?");
			 ps.setString(1, cropId); 
			 
			 result = ps.executeQuery();

			 if(result.next()){
				 
				 stateName = result.getString("production_description"); 

			 }
			 
			 
			}catch(Exception e){
				
			}	
		return stateName;
	} 
	    
    
	
	
    
    
    
    public int InsertProductionData(Connection connection, VC_ProductionDataModel feedObject) throws Exception {
		int status = -1;
                    PreparedStatement ps = null;
		try {

		 ps = connection.prepareStatement("INSERT INTO vc_production_data(production_id,production_description,crop_id "
                         + ",production_weeks,hectares,production_season,technology,target_yield,actual_yield,common_pest,group_id,farmer_id"
                         + ",VC_ID,site_number,production_year,input_provider,inputs,production_status,Last_Modified_Date) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");


		ps.setString(1, feedObject.getProductionId());
		ps.setString(2, feedObject.getProductionDescription());
		ps.setString(3, feedObject.getCropId());
		ps.setString(4, feedObject.getProductionWeeks());
		ps.setString(5, feedObject.getHectares());
		ps.setString(6, feedObject.getProductionSeason());
		ps.setString(7, feedObject.getTechnology());
		ps.setString(8, feedObject.getTargetYield());
		ps.setString(9, feedObject.getActualYield());
		ps.setString(10, feedObject.getCommonPest());
		ps.setString(11, feedObject.getGroupId());
		ps.setString(12, feedObject.getFarmerIdd());
		ps.setString(13, feedObject.getVC_ID());
		ps.setString(14, feedObject.getSiteNumber());
		ps.setString(15, feedObject.getProductionYear());
		ps.setString(16, feedObject.getInputProvider());
		ps.setString(17, feedObject.getInputs());
		ps.setString(18, feedObject.getProductionStatus());
		ps.setString(19, feedObject.getLastModifiedDate());

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
    
    
    
    public int UpdateProductionData(Connection connection, VC_ProductionDataModel feedObject) throws Exception {
		int status = -1;
                    PreparedStatement ps = null;
		try {

		 ps = connection.prepareStatement("UPDATE vc_production_data SET production_description=?,crop_id=? "
                         + ",production_weeks=?,hectares=?,production_season=?,technology=?,target_yield=?,actual_yield=?,common_pest=? "
                         + ",site_number=?,production_year=?,input_provider=?,inputs=?,Last_Modified_Date=? WHERE production_id=? ");


		ps.setString(1, feedObject.getProductionDescription());
		ps.setString(2, feedObject.getCropId());
		ps.setString(3, feedObject.getProductionWeeks());
		ps.setString(4, feedObject.getHectares());
		ps.setString(5, feedObject.getProductionSeason());
		ps.setString(6, feedObject.getTechnology());
		ps.setString(7, feedObject.getTargetYield());
		ps.setString(8, feedObject.getActualYield());
		ps.setString(9, feedObject.getCommonPest());
		ps.setString(10, feedObject.getSiteNumber());
		ps.setString(11, feedObject.getProductionYear());
		ps.setString(12, feedObject.getInputProvider());
		ps.setString(13, feedObject.getInputs());
		ps.setString(14, feedObject.getLastModifiedDate());
		ps.setString(15, feedObject.getProductionId());
                
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
