/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.dao;

import com.ng.openfarm.portal.dto.VC_CropDataModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Mutual-Links
 */
public class VC_CropDataDAO {
    
	public VC_CropDataModel GetCropById(Connection connection,String cropCateId) throws Exception
	{
		PreparedStatement ps = null;
		VC_CropDataModel feedObject = new VC_CropDataModel();
		try
               {
	         ps = connection.prepareStatement("SELECT * FROM vc_crop_data WHERE crop_id=?");
		ps.setString(1,cropCateId);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
                feedObject.setCropId(rs.getString("crop_id")); 
                feedObject.setCropName(rs.getString("crop_name")); 
                feedObject.setSpecies(rs.getString("crop_speciese")); 
                feedObject.setQuality(rs.getString("quality")); 
                feedObject.setQuantity(rs.getString("quantity")); 
                feedObject.setLifeSpan(rs.getString("life_span"));
                feedObject.setInputSource(rs.getString("source")); 
			
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
    	public ArrayList<VC_CropDataModel> GetAllCropData(Connection connection,String farmerId) throws Exception
	{
		ArrayList<VC_CropDataModel> feedData = new ArrayList<VC_CropDataModel>();
		try
		{
		Statement ps = connection.createStatement();
		ResultSet rs = ps.executeQuery("SELECT * FROM vc_crop_data WHERE farmer_id='"+farmerId+"'");
		while(rs.next())
		{
		
		VC_CropDataModel feedObject = new VC_CropDataModel();
                    
                feedObject.setCropId(rs.getString("crop_id")); 
                feedObject.setValueChian(rs.getString("VC_ID")); 
                feedObject.setCropName(rs.getString("crop_name")); 
                feedObject.setSpecies(rs.getString("crop_speciese")); 
                feedObject.setQuality(rs.getString("quality")); 
                feedObject.setQuantity(rs.getString("quantity")); 
                feedObject.setLifeSpan(rs.getString("life_span"));
                feedObject.setInputSource(rs.getString("source")); 
                feedObject.setGroupId(ValueChainDAO.getGroupName(connection, rs.getString("group_id")));  

		
		feedData.add(feedObject);
		}
		return feedData;
		}
		catch(Exception e)
		{
		throw e;
		}
	}
	
	
    
    
    
    public int InsertCropData(Connection connection, VC_CropDataModel feedObject) throws Exception {
		int status = -1;
                    PreparedStatement ps = null;
		try {

		 ps = connection.prepareStatement("INSERT INTO vc_crop_data(crop_id,crop_name,crop_speciese,quality,quantity,life_span,source,group_id,farmer_id,VC_ID,Last_Modified_Date) VALUES(?,?,?,?,?,?,?,?,?,?,?)");


		ps.setString(1, feedObject.getCropId());
		ps.setString(2, feedObject.getCropName());
		ps.setString(3, feedObject.getSpecies());
		ps.setString(4, feedObject.getQuality());
		ps.setString(5, feedObject.getQuantity());
		ps.setString(6, feedObject.getLifeSpan());
		ps.setString(7, feedObject.getInputSource());
		ps.setString(8, feedObject.getGroupId());
		ps.setString(9, feedObject.getFarmerId());
		ps.setString(10, feedObject.getValueChain());
		ps.setString(11, feedObject.getLastDateMidified());

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
    
    public int UpdateCropData(Connection connection, VC_CropDataModel feedObject) throws Exception {
		int status = -1;
                    PreparedStatement ps = null;
		try {

		 ps = connection.prepareStatement("UPDATE vc_crop_data SET crop_name=?,crop_speciese=?,quality=?,quantity=?,life_span=?,source=?,Last_Modified_Date=?  WHERE crop_id=?");


		ps.setString(1, feedObject.getCropName());
		ps.setString(2, feedObject.getSpecies());
		ps.setString(3, feedObject.getQuality());
		ps.setString(4, feedObject.getQuantity());
		ps.setString(5, feedObject.getLifeSpan());
		ps.setString(6, feedObject.getInputSource());
		ps.setString(7, feedObject.getLastDateMidified());
		ps.setString(8, feedObject.getCropId());

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
      public static String getCropDesc(Connection connection,String cropId){
		
		String stateName = "";
		ResultSet result = null;
		PreparedStatement ps = null;
		try {
			
			 ps = connection.prepareStatement("SELECT * FROM vc_crop_data WHERE crop_id=?");
			 ps.setString(1, cropId); 
			 
			 result = ps.executeQuery();

			 if(result.next()){
				 
				 stateName = result.getString("crop_name"); 

			 }
			 
			 
			}catch(Exception e){
				
			}	
		return stateName;
	} 
	    
    
	public static ResultSet loadCropData(String vc_user){
			ResultSet result = null;
			Connection connection = null;
                        String verification = "";
			Statement st = null;
			try {
                        connection = OpenfarmConnect.Get_Connection();
                        String authId = SessionDAO.getAuIdBySession(connection, vc_user);
                        verification = FarmerDAO.getFarmerId(connection, authId);    
                        st = connection.createStatement();
                        result = st.executeQuery("SELECT * FROM vc_crop_data WHERE farmer_id  ='"+verification+"'");

                        }catch(Exception e){

                        }		

				
			return result;
	    }      
}
