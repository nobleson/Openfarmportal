package com.ng.openfarm.portal.dao;

import com.ng.openfarm.portal.dto.FarmConsultantDataModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class FarmConsultantDAO {


    

	public FarmConsultantDataModel GetFarmMagrById(Connection connection,String authId) throws Exception
	{
		FarmConsultantDataModel feedObject = new FarmConsultantDataModel();
		try
		{
		PreparedStatement ps = connection.prepareStatement("SELECT * FROM farm_managers WHERE auth_id=?");
		ps.setString(1,authId);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
                    
                feedObject.setManagerId(rs.getString("farm_manager_id")); 
                feedObject.setNationalId(rs.getString("national_reg_id")); 
                feedObject.setSurname(rs.getString("surname")); 
                feedObject.setFirstName(rs.getString("first_name")); 
                feedObject.setMiddleName(rs.getString("last_name")); 
                feedObject.setGender(rs.getString("gender")); 
                feedObject.setPhoneNumber(rs.getString("phone_number")); 
                feedObject.setTelephone_type(rs.getString("telephone_type")); 
                feedObject.setContact(rs.getString("contact_address")); 
                feedObject.setCity(rs.getString("city")); 
                feedObject.setWard(rs.getString("ward_id")); 
                feedObject.setLgAreaId(rs.getString("lgas_id")); 
                feedObject.setStateId(rs.getString("state_id")); 
                feedObject.setCountry(rs.getString("country")); 
                feedObject.setPrefered_language(rs.getString("prefered_language")); 
                feedObject.setEductionLevel(rs.getString("education_level")); 
                feedObject.setAgricultureExperience(rs.getString("agriculture_experience"));  
                feedObject.setAuthId(rs.getString("auth_id")); 		
                feedObject.setLastModifyDate(rs.getString("last_modify_date")); 

		
		}
		return feedObject;
		}
		catch(Exception e)
		{
		throw e;
		}
	}
	public ArrayList<FarmConsultantDataModel> GetAllFarmManagers(Connection connection) throws Exception
	{
		ArrayList<FarmConsultantDataModel> feedData = new ArrayList<FarmConsultantDataModel>();
		try
		{
		Statement ps = connection.createStatement();
		ResultSet rs = ps.executeQuery("SELECT * FROM farmers");
		while(rs.next())
		{
                 FarmConsultantDataModel feedObject = new FarmConsultantDataModel();
		
                feedObject.setManagerId(rs.getString("farm_manager_id")); 
                feedObject.setNationalId(rs.getString("national_reg_id")); 
                feedObject.setSurname(rs.getString("surname")); 
                feedObject.setFirstName(rs.getString("first_name")); 
                feedObject.setMiddleName(rs.getString("last_name")); 
                feedObject.setGender(rs.getString("gender")); 
                feedObject.setPhoneNumber(rs.getString("phone_number")); 
                feedObject.setTelephone_type(rs.getString("telephone_type")); 
                feedObject.setContact(rs.getString("contact_address")); 
                feedObject.setCity(rs.getString("city")); 
                feedObject.setWard(rs.getString("ward_id")); 
                feedObject.setLgAreaId(rs.getString("lgas_id")); 
                feedObject.setStateId(rs.getString("state_id")); 
                feedObject.setCountry(rs.getString("country")); 
                feedObject.setPrefered_language(rs.getString("prefered_language")); 
                feedObject.setEductionLevel(rs.getString("education_level")); 
                feedObject.setAgricultureExperience(rs.getString("agriculture_experience"));  
                feedObject.setAuthId(rs.getString("auth_id")); 		
                feedObject.setLastModifyDate(rs.getString("last_modify_date")); 

		
		feedData.add(feedObject);
		}
		return feedData;
		}
		catch(Exception e)
		{
		throw e;
		}
	}
	
	
	public int InsertFarmManager(Connection connection,FarmConsultantDataModel feedObject ) throws Exception {
			int status = -1;
			try { 

			PreparedStatement ps = connection.prepareStatement("INSERT INTO farm_managers(farm_manager_id ,	national_reg_id ,surname 	,first_name ,	last_name ,	gender ,"
				+ "	phone_number ,telephone_type,	contact_address ,	city ,ward_id,	lgas_id ,	state_id ,	country ,prefered_language,education_level,	"
				+ "agriculture_experience,profile_photo ,	auth_id,last_modify_date ) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1, feedObject.getManagerId());
			ps.setString(2, feedObject.getNationalId());
			ps.setString(3, feedObject.getSurname());
			ps.setString(4, feedObject.getFirstName());
			ps.setString(5, feedObject.getMiddleName());
			ps.setString(6, feedObject.getGender());
			ps.setString(7, feedObject.getPhoneNumber());
			ps.setString(8, feedObject.getTelephone_type());
			ps.setString(9, feedObject.getContact());
			ps.setString(10, feedObject.getCity());
			ps.setString(11, feedObject.getWard());
			ps.setString(12, feedObject.getLgAreaId());
			ps.setString(13, feedObject.getStateId());
			ps.setString(14, feedObject.getCountry());
			ps.setString(15, feedObject.getPrefered_language());
			ps.setString(16, feedObject.getEductionLevel());
			ps.setString(17, feedObject.getAgricultureExperience());
			ps.setString(18, feedObject.getProfile_photo());
			ps.setString(19, feedObject.getAuthId());
			ps.setString(20, feedObject.getLastModifyDate());
			

			
			int rs = ps.executeUpdate();
			if (rs > -1) {
			return status = 0;
			} else {
			return status;
			}

			} catch (Exception e) {
			throw e;
			}
			
			}	

	public int updateFarmManager(Connection connection,FarmConsultantDataModel feedObject ) throws Exception {
			int status = -1;
			try {

			PreparedStatement ps = connection.prepareStatement("UPDATE farm_managers set	surname =?,first_name =?,	middle_name =?,	gender =?, "
				+ "	phone_number =?,telephone_type=?,contact_address =?,	city =?,ward_id=?	lgas_id =?,	state_id =?, prefered_language=?,education_level=?,agriculture_experience=?,"
				+ "last_modify_date =? "
				+ " WHERE farm_manager_id=?");
			


			ps.setString(1, feedObject.getSurname());
			ps.setString(2, feedObject.getFirstName());
			ps.setString(3, feedObject.getMiddleName());
			ps.setString(4, feedObject.getGender());
			ps.setString(5, feedObject.getPhoneNumber());
			ps.setString(6, feedObject.getTelephone_type());
			ps.setString(7, feedObject.getContact());
			ps.setString(8, feedObject.getCity());
			ps.setString(9, feedObject.getWard());
			ps.setString(10, feedObject.getLgAreaId());
			ps.setString(11, feedObject.getStateId());
			ps.setString(12, feedObject.getPrefered_language());
			ps.setString(13, feedObject.getEductionLevel());
			ps.setString(14, feedObject.getAgricultureExperience());
			ps.setString(15, feedObject.getLastModifyDate());
			ps.setString(16, feedObject.getManagerId());
			
			int rs = ps.executeUpdate();
			if (rs > -1) {
			return status = 0;
			} else {
			return status;
			}

			} catch (Exception e) {
			throw e;
			}
			
			}	
		
	
	
	public int updateCustomFarmManager(Connection connection,String attribute,String attributeValue,String farmerId) throws Exception {
			int status = -1;
			try {

			PreparedStatement ps = connection.prepareStatement("UPDATE farm_managers set "+attribute+"=? WHERE farm_manager_id=?");
			ps.setString(1, attributeValue);
			ps.setString(2, farmerId);
			
			int rs = ps.executeUpdate();
			if (rs>0) {
			return status = 0;
			} else {
			return status;
			}

			} catch (Exception e) {
			throw e;
			}
			
			}	
	
	
	
	public int deleteFarmManager(Connection connection,String farmerId ) throws Exception {
			int status = -1;
			try {
			
			PreparedStatement ps = connection.prepareStatement("Delete farm_managers WHERE farm_manager_id=?");
			ps.setString(1, farmerId);
			
			int rs = ps.executeUpdate();
			if (rs > -1) {
			return status = 0;
			} else {
			return status;
			}

			} catch (Exception e) {
			throw e;
			}
			
			}	
	
	public static ResultSet loadFarmManager(){
			ResultSet result = null;
			try {
				
				OpenfarmConnect oLAPConnect= new OpenfarmConnect();
				Connection connection = oLAPConnect.Get_Connection();
				Statement st = connection.createStatement();
				result = st.executeQuery("SELECT * FROM farm_managers");

				}catch(Exception e){
					
				}
			return result;
	    }
}
