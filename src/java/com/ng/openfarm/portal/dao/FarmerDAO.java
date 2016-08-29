package com.ng.openfarm.portal.dao;

import com.ng.openfarm.portal.dto.FarmersDataModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.SQLException;
import utility.DateFormat;


public class FarmerDAO {
	
    
    public static String getFarmerId(Connection connect,String authId){
         String farmerId = "";
         String query = "SELECT famer_id FROM farmers WHERE auth_id =?";
         PreparedStatement ps = null;
         ResultSet result = null;
         try {

            ps = connect.prepareStatement(query);
            ps.setString(1, authId);

             result = ps.executeQuery();
             if(result.next()){
                 farmerId =  result.getString("famer_id");
             }else{
                 return farmerId;
             }            

         }catch (Exception ex) {
             Logger.getLogger(AuthenticationDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
         return farmerId;
     }
    	
	public FarmersDataModel GetFarmerByFarmerReg(Connection connection,String authId) throws Exception
	{
		FarmersDataModel feedObject = new FarmersDataModel();
		try
		{
		PreparedStatement ps = connection.prepareStatement("SELECT * FROM farmers WHERE famer_id=?");
		ps.setString(1,authId);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{	 	 	 	 	 	 	 	 	                     
                    
			feedObject.setFarmerId(rs.getString("famer_id")); 
			feedObject.setNationalId(rs.getString("national_reg_id")); 
			feedObject.setIdCardType(rs.getString("id_cardtype")); 
			feedObject.setVerificationStatus(rs.getString("verification_status")); 
			feedObject.setSurname(rs.getString("surname")); 
			feedObject.setFirstName(rs.getString("first_name")); 
			feedObject.setMiddleName(rs.getString("last_name")); 
			feedObject.setGender(rs.getString("gender")); 
			feedObject.setAge(rs.getString("age")); 
			feedObject.setPhoneNumber(rs.getString("phone_number")); 
			feedObject.setTelephone_type(rs.getString("telephone_type")); 
			feedObject.setContact(rs.getString("contact_address")); 
			feedObject.setCity(rs.getString("city")); 
			feedObject.setWard(rs.getString("ward_id")); 
			feedObject.setLgAreaId(rs.getString("lgas_id")); 
			feedObject.setStateId(rs.getString("state_id")); 
			feedObject.setCountry(rs.getString("country")); 
			feedObject.setPrefered_language(rs.getString("prefered_language")); 
			feedObject.setEduction_level(rs.getString("education_level")); 
			feedObject.setProfilePhoto(rs.getString("profile_photo")); 
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
    	
	public FarmersDataModel GetFarmerById(Connection connection,String authId) throws Exception
	{
		FarmersDataModel feedObject = new FarmersDataModel();

		try
		{
		PreparedStatement ps = connection.prepareStatement("SELECT * FROM farmers WHERE auth_id=?");
		ps.setString(1,authId);
		ResultSet rs = ps.executeQuery();
		if(rs.next())
		{	 	 	 	 	 	 	 	 	                     
                    
			feedObject.setFarmerId(rs.getString("famer_id")); 
			feedObject.setNationalId(rs.getString("national_reg_id")); 
			feedObject.setIdCardType(rs.getString("id_cardtype")); 
			feedObject.setVerificationStatus(rs.getString("verification_status")); 
			feedObject.setSurname(rs.getString("surname")); 
			feedObject.setFirstName(rs.getString("first_name")); 
			feedObject.setMiddleName(rs.getString("last_name")); 
			feedObject.setGender(rs.getString("gender")); 
			feedObject.setPhoneNumber(rs.getString("phone_number")); 
			feedObject.setTelephone_type(rs.getString("telephone_type")); 
			feedObject.setContact(rs.getString("contact_address")); 
			feedObject.setCity(rs.getString("city")); 
			feedObject.setWard(StateDAO.getWardName(connection, rs.getString("ward_id"))); 
			feedObject.setLgAreaId(StateDAO.getLgvtName(connection, rs.getString("lgas_id"))); 
			feedObject.setStateId(StateDAO.getStateName(connection, rs.getString("state_id"))); 
			feedObject.setCountry(rs.getString("country")); 
			feedObject.setPrefered_language(rs.getString("prefered_language")); 
			feedObject.setEduction_level(rs.getString("education_level")); 
			feedObject.setTelephone_type(rs.getString("telephone_type")); 
			feedObject.setProfilePhoto(rs.getString("profile_photo")); 
			feedObject.setAuthId(rs.getString("auth_id")); 		
			feedObject.setKinSurname(rs.getString("kin_surname")); 		
			feedObject.setKinOtherName(rs.getString("kin_other_name")); 		
			feedObject.setKinPhoneNumber(rs.getString("kin_phone_number")); 		
			feedObject.setKinConactAddress(rs.getString("kin_contact_address")); 		
			feedObject.setKinRelationShip(rs.getString("kin_relationship")); 		                        
			feedObject.setLastModifyDate(rs.getString("last_modify_date")); 
			feedObject.setEmail(AuthenticationDAO.getUserEmail(connection, rs.getString("auth_id"))); 
		}
		return feedObject;
		}
		catch(Exception e)
		{
		throw e;
		}
	}
	public ArrayList<FarmersDataModel> GetAllFarmers(Connection connection) throws Exception
	{
		ArrayList<FarmersDataModel> feedData = new ArrayList<FarmersDataModel>();
		try
		{
		Statement ps = connection.createStatement();
		ResultSet rs = ps.executeQuery("SELECT * FROM farmers");
		while(rs.next())
		{
		
		FarmersDataModel feedObject = new FarmersDataModel();
                    
                feedObject.setSurname(rs.getString("surname")); 
                feedObject.setFirstName(rs.getString("first_name")); 
                feedObject.setStateId(StateDAO.getStateName(connection, rs.getString("state_id"))); 
                feedObject.setLgAreaId(StateDAO.getLgvtName(connection, rs.getString("lgas_id"))); 	                
                feedObject.setWard(StateDAO.getWardName(connection, rs.getString("ward_id"))); 	
                feedObject.setProfilePhoto(rs.getString("profile_photo")); 
                feedObject.setLastModifyDate(DateFormat.formatDate(rs.getLong("last_modify_date")));  
                
		
		feedData.add(feedObject);
		}
		return feedData;
		}
		catch(Exception e)
		{
		throw e;
		}
	}
	
	
	public int InsertFarmer(Connection connection,FarmersDataModel feedObject ) throws Exception {
			int status = -1;
                        PreparedStatement ps = null;
			try { 

			 ps = connection.prepareStatement("INSERT INTO farmers(famer_id ,	national_reg_id ,surname 	,first_name ,	last_name ,	gender ,"
				+ "age,	phone_number ,telephone_type,	contact_address ,	city ,ward_id,	lgas_id ,	state_id ,	country ,prefered_language,education_level,	"
				+ "profile_photo ,	auth_id,kin_surname,kin_other_name,kin_phone_number,kin_contact_address,kin_relationship,last_modify_date ) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1, feedObject.getFarmerId());
			ps.setString(2, feedObject.getNationalId());
			ps.setString(3, feedObject.getSurname());
			ps.setString(4, feedObject.getFirstName());
			ps.setString(5, feedObject.getMiddleName());
			ps.setString(6, feedObject.getGender());
			ps.setString(7, feedObject.getAge());
			ps.setString(8, feedObject.getPhoneNumber());
			ps.setString(9, feedObject.getTelephone_type());
			ps.setString(10, feedObject.getContact());
			ps.setString(11, feedObject.getCity());
			ps.setString(12, feedObject.getWard());
			ps.setString(13, feedObject.getLgAreaId());
			ps.setString(14, feedObject.getStateId());
			ps.setString(15, feedObject.getCountry());
			ps.setString(16, feedObject.getPrefered_language());
			ps.setString(17, feedObject.getEduction_level());
			ps.setString(18, feedObject.getProfilePhoto());
			ps.setString(19, feedObject.getAuthId());
			ps.setString(20, feedObject.getKinSurname());
			ps.setString(21, feedObject.getKinOtherName());
			ps.setString(22, feedObject.getKinPhoneNumber());
			ps.setString(23, feedObject.getKinConactAddress());
			ps.setString(24, feedObject.getKinRelationShip());
			ps.setString(25, feedObject.getLastModifyDate());
			

			
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
                                try {
                                    ps.close();
                                } catch (SQLException ex) {
                                    Logger.getLogger(FarmerDAO.class.getName()).log(Level.SEVERE, null, ex);
                                }

                            }
                            if(connection!=null){
                                try {
                                    connection.close();
                                } catch (SQLException ex) {
                                    Logger.getLogger(FarmerDAO.class.getName()).log(Level.SEVERE, null, ex);
                                }

                            }

                                      }
			
			}	

	public int updateFarmer(Connection connection,FarmersDataModel feedObject ) throws Exception {
			int status = -1;
                        PreparedStatement ps = null;
			try {

		         ps = connection.prepareStatement("UPDATE farmers set	surname =?,first_name =?,	middle_name =?,	gender =?, "
				+ "	phone_number =?,telephone_type=?,contact_address =?,	city =?,ward_id=?	lgas_id =?,	state_id =?, prefered_language=?,education_level=?,"
				+ "last_modify_date =? "
				+ " WHERE famer_id=?");
			


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
			ps.setString(13, feedObject.getEduction_level());
			ps.setString(14, feedObject.getLastModifyDate());
			ps.setString(15, feedObject.getFarmerId());
			
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
                  try {
                      ps.close();
                  } catch (SQLException ex) {
                      Logger.getLogger(FarmerDAO.class.getName()).log(Level.SEVERE, null, ex);
                  }

              }
              if(connection!=null){
                  try {
                      connection.close();
                  } catch (SQLException ex) {
                      Logger.getLogger(FarmerDAO.class.getName()).log(Level.SEVERE, null, ex);
                  }

              }
			
			}
        }
		

	public int updateFarmerToVerify(Connection connection,FarmersDataModel feedObject ) throws Exception {
			int status = -1;
                        PreparedStatement ps = null;
			try {

		         ps = connection.prepareStatement("UPDATE farmers set	id_cardtype =?,national_reg_id =?,idcard_image =?, "
				+ "last_modify_date =? "
				+ " WHERE famer_id=?");
			


			ps.setString(1, feedObject.getIdCardType());
			ps.setString(2, feedObject.getNationalId());
			ps.setString(3, feedObject.getIdCardImages());
			ps.setString(4, feedObject.getLastModifyDate());
			ps.setString(5, feedObject.getFarmerId());
			
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
                  try {
                      ps.close();
                  } catch (SQLException ex) {
                      Logger.getLogger(FarmerDAO.class.getName()).log(Level.SEVERE, null, ex);
                  }

              }
              if(connection!=null){
                  try {
                      connection.close();
                  } catch (SQLException ex) {
                      Logger.getLogger(FarmerDAO.class.getName()).log(Level.SEVERE, null, ex);
                  }

              }
			
			}
        }
		
	
	
	public int updateCustomFarmer(Connection connection,String attribute,String attributeValue,String farmerId) throws Exception {
			int status = -1;
                        PreparedStatement ps = null;
			try {

		       ps = connection.prepareStatement("UPDATE farmers set "+attribute+"=? WHERE famer_id=?");
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
			}finally{

              if(ps!= null){
                  try {
                      ps.close();
                  } catch (SQLException ex) {
                      Logger.getLogger(FarmerDAO.class.getName()).log(Level.SEVERE, null, ex);
                  }

              }
              if(connection!=null){
                  try {
                      connection.close();
                  } catch (SQLException ex) {
                      Logger.getLogger(FarmerDAO.class.getName()).log(Level.SEVERE, null, ex);
                  }

              }
			
			}
        }
	
	
	
	public int deleteFarmer(Connection connection,String farmerId ) throws Exception {
			int status = -1;
                        PreparedStatement ps = null;
			try {
			
			 ps = connection.prepareStatement("Delete farmers WHERE famer_id=?");
			ps.setString(1, farmerId);
			
			int rs = ps.executeUpdate();
			if (rs>0) {
			return status = 0;
			} else {
			return status;
			}

			} catch (Exception e) {
			throw e;
			}finally{

              if(ps!= null){
                  try {
                      ps.close();
                  } catch (SQLException ex) {
                      Logger.getLogger(FarmerDAO.class.getName()).log(Level.SEVERE, null, ex);
                  }

              }
              if(connection!=null){
                  try {
                      connection.close();
                  } catch (SQLException ex) {
                      Logger.getLogger(FarmerDAO.class.getName()).log(Level.SEVERE, null, ex);
                  }

              }

        }
			
			}	
	
	public static ResultSet loadFarmers(){
                ResultSet result = null;
                try {

                        Connection connection = OpenfarmConnect.Get_Connection();
                        Statement st = connection.createStatement();
                        result = st.executeQuery("SELECT * FROM farmers");

                        }catch(Exception e){

                        }
                return result;
	    }
}
