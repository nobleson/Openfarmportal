/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.dao;



import com.ng.openfarm.portal.dto.ApplicationDataModel;
import com.ng.openfarm.portal.dto.VC_ApplicationDataModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Mutual-Links
 */
public class VC_ApplicationsDAO {
                     
	public VC_ApplicationDataModel GetApplicationById(Connection connection,String appId) throws Exception
	{
		PreparedStatement ps = null;
		VC_ApplicationDataModel appObject = new VC_ApplicationDataModel();
		try
               {
	         ps = connection.prepareStatement("SELECT * FROM vc_application_data WHERE application_id=?");
		ps.setString(1,appId);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
                                 
                appObject.setApplicationId(rs.getString("application_id")); 
                appObject.setFertilizer(rs.getString("feterlizer")); 
                appObject.setFertilizerQty(rs.getString("feterlizer_qty")); 
                appObject.setHerbicides(rs.getString("herbicides")); 
                appObject.setHerbicidesQty(rs.getString("herbicides_qty")); 
                appObject.setPesticides(rs.getString("pesticides"));
                appObject.setPesticidesQty(rs.getString("pesticides_qty")); 
                appObject.setOtherApplication(rs.getString("other_application")); 
                appObject.setOtherApplicationQty(rs.getString("other_application_qty")); 
                appObject.setProductionId(rs.getString("production_id"));
		
			
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
		return appObject;

	}
        	public ArrayList<ApplicationDataModel> GetAllApplicationsData(Connection connection,String farmerId) throws Exception
	{
		ArrayList<ApplicationDataModel> feedData = new ArrayList<ApplicationDataModel>();
                PreparedStatement ps = null;
                ResultSet rs = null;
		try
		{
		String query = "SELECT * FROM `vc_application_data` WHERE farmer_id=?"; 
	        ps = connection.prepareStatement(query);
                ps.setString(1, farmerId);
                rs = ps.executeQuery();
                int count = 0;
                System.out.println("feedData 1:"+feedData.size()); 

                while(rs.next())
		{
                
                ApplicationDataModel appObject = new ApplicationDataModel();  
                                 
                appObject.setApplicationId(rs.getString("application_id")); 
                appObject.setFertilizer(rs.getString("feterlizer")); 
                appObject.setFertilizerQty(rs.getString("feterlizer_qty")); 
                appObject.setHerbicides(rs.getString("herbicides")); 
                appObject.setHerbicidesQty(rs.getString("herbicides_qty")); 
                appObject.setPesticides(rs.getString("pesticides"));
                appObject.setPesticideQty(rs.getString("pesticides_qty")); 
                appObject.setOtherApplication(rs.getString("other_application")); 
                appObject.setOtherApplicationQty(rs.getString("other_application_qty")); 
                appObject.setProductionId(VC_ProductionDAO.getProductionName(connection, rs.getString("production_id")));
		
		feedData.add(appObject);
                

		}
		return feedData;
		}
		catch(Exception e)
		{
		throw e;
		}
	}
	
	
    
    
    
    public int InsertApplicationData(Connection connection, VC_ApplicationDataModel feedObject) throws Exception {
		int status = -1;
                    PreparedStatement ps = null;
		try {

		 ps = connection.prepareStatement("INSERT INTO vc_application_data(application_id ,feterlizer ,feterlizer_qty "
                         + ",herbicides ,herbicides_qty,pesticides ,pesticides_qty,other_application,other_application_qty ,production_id,group_id,farmer_id"
                         + ",VC_ID,Last_Modified_Date) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");


		ps.setString(1, feedObject.getApplicationId());
		ps.setString(2, feedObject.getFertilizer());
		ps.setString(3, feedObject.getFertilizerQty());
		ps.setString(4, feedObject.getHerbicides());
		ps.setString(5, feedObject.getHerbicidesQty());
		ps.setString(6, feedObject.getPesticides());
		ps.setString(7, feedObject.getPesticidesQty());
		ps.setString(8, feedObject.getOtherApplication());
		ps.setString(9, feedObject.getOtherApplicationQty());
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
    
    
    
    public int UpdateApplicationData(Connection connection, VC_ApplicationDataModel feedObject) throws Exception {
		int status = -1;
                    PreparedStatement ps = null;
		try {

		 ps = connection.prepareStatement("UPDATE vc_application_data SET feterlizer=? ,feterlizer_qty=? "
                         + ",herbicides=?,herbicides_qty=?,pesticides=? ,pesticides_qty=?,other_application=?,other_application_qty=?"
                         + ",Last_Modified_Date=? WHERE application_id=? ");


		ps.setString(1, feedObject.getFertilizer());
		ps.setString(2, feedObject.getFertilizerQty());
		ps.setString(3, feedObject.getHerbicides());
		ps.setString(4, feedObject.getHerbicidesQty());
		ps.setString(5, feedObject.getPesticides());
		ps.setString(6, feedObject.getPesticidesQty());
		ps.setString(7, feedObject.getOtherApplication());
		ps.setString(8, feedObject.getOtherApplicationQty());
		ps.setString(9, feedObject.getLastModifiedDate());
		ps.setString(10, feedObject.getApplicationId());
                
                
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
    
	  	
       
}
