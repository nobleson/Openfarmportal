/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.dao;

//import dto.GroupDataModel;
import com.ng.openfarm.portal.dto.GroupDataModel;
import utility.DateFormat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
//import utility.DateFormat;

/**
 *
 * @author Mutual-Links
 */

public class GroupDAO {
	
	public GroupDataModel GetGroupById(Connection connection,String cropCateId) throws Exception
	{
		PreparedStatement ps = null;
		GroupDataModel feedObject = new GroupDataModel(); 
		try
		{
	        ps = connection.prepareStatement("SELECT * FROM groups WHERE group_head=?");
		ps.setString(1,cropCateId);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			 	 	 	 	 	 	 	 	 	 	 
			
		feedObject.setGroupName(rs.getString("groupName"));
		feedObject.setValueChain(rs.getString("value_chain"));
		feedObject.setRegNumber(rs.getString("reg_number"));
		feedObject.setMembers(rs.getString("members"));
		feedObject.setGroupHead(rs.getString("group_head"));
                
		feedObject.setLastModifiedDate(DateFormat.formatDate(Long.parseLong(rs.getString("Last_Modified_Date"))));
		
			
		}
		}
		catch(Exception e)
		{
		throw e;
		} finally{

	          if(ps!= null){
	        	  
                  ps.close();

	          }
	          if(connection!=null){
	        	  
	        	  connection.close();

	          }
	        }
		return feedObject;

	}
	public ArrayList<GroupDataModel> GetAllGroups(Connection connection) throws Exception
	{
		Statement ps = null;

		ArrayList<GroupDataModel> feedData = new ArrayList<GroupDataModel>();
		try
		{
	    ps = connection.createStatement();
		ResultSet rs = ps.executeQuery("SELECT * FROM groups");
		while(rs.next())
		{
		
		GroupDataModel feedObject = new GroupDataModel(); 
		
		feedObject.setGroupId(rs.getString("group_id"));
		feedObject.setGroupName(rs.getString("groupName"));
		feedObject.setValueChain(rs.getString("value_chain"));
		feedObject.setRegNumber(rs.getString("reg_number"));
		feedObject.setCertficate(rs.getString("certificate_image"));
		feedObject.setMembers(rs.getString("members"));
		feedObject.setGroupHead(rs.getString("group_head"));
		feedObject.setGroupPhone(rs.getString("group_phone"));
		feedObject.setGroupVenue(rs.getString("group_venue"));
		feedObject.setStateId(rs.getString("state_id"));
		feedObject.setLgaId(rs.getString("lga_id"));
		feedObject.setWardId(rs.getString("ward_id"));
		feedObject.setLastModifiedDate(DateFormat.formatDate(Long.parseLong(rs.getString("Last_Modified_Date"))));
		
		feedData.add(feedObject);
		}
		}
		catch(Exception e)
		{
		throw e;
		}
		finally{

	          if(ps!= null){
	        	  
                ps.close();

	          }
	          if(connection!=null){
	        	  
	        	  connection.close();

	          }
	        }
		return feedData;

	}
	
	
	public int InsertGroup(Connection connection,GroupDataModel feedObject) throws Exception {
			int status = -1;
			PreparedStatement ps = null;
			try {
				 	 	 	 	 	 	 	 	 	 	 
		    ps = connection.prepareStatement("INSERT INTO groups (group_id,groupName,value_chain,reg_number,certificate_image,members,group_head,group_phone,group_venue,state_id,lga_id,ward_id,registral,last_modified_date) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,feedObject.getGroupId());
			ps.setString(2, feedObject.getGroupName());
			ps.setString(3, feedObject.getValueChain());
			ps.setString(4, feedObject.getRegNumber());
			ps.setString(5, feedObject.getCertficate());
			ps.setString(6, feedObject.getMembers()); 
			ps.setString(7, feedObject.getGroupHead()); 
			ps.setString(8, feedObject.getGroupPhone()); 
			ps.setString(9, feedObject.getGroupVenue()); 
			ps.setString(10, feedObject.getStateId()); 
			ps.setString(11, feedObject.getLgaId()); 
			ps.setString(12, feedObject.getWardId()); 
			ps.setString(13, feedObject.getRegistral()); 
			ps.setString(14, feedObject.getLastModifiedDate()); 

			
			int rs = ps.executeUpdate();
			if (rs>-1) {
			return status = 0;
			
			} else {
			return status;
			}

			} catch (Exception e) {
			throw e;
			}		
			finally{

		          if(ps!= null){
		        	  
	                ps.close();

		          }
		          if(connection!=null){
		        	  
		        	  connection.close();

		          }
		        }
			
			}	

	
	public int updateGroups(Connection connection, GroupDataModel feedObject) throws Exception {
			int status = -1;
			PreparedStatement ps = null;
			try {
			 ps = connection.prepareStatement("UPDATE groups set groupName=?,value_chain=?,reg_number=?,members=?,group_head=?,group_phone=?,group_venue=?,state_id=? ,lga_id=? ,ward_id=? ,last_modified_date=?  WHERE group_id=?");
			
				ps.setString(1, feedObject.getGroupName());
				ps.setString(2, feedObject.getValueChain());
				ps.setString(3, feedObject.getRegNumber());
				ps.setString(4, feedObject.getMembers()); 
				ps.setString(5, feedObject.getGroupHead()); 
				ps.setString(6, feedObject.getGroupPhone()); 
				ps.setString(7, feedObject.getGroupVenue()); 
				ps.setString(8, feedObject.getStateId()); 
				ps.setString(9, feedObject.getLgaId()); 
				ps.setString(10, feedObject.getWardId()); 
				ps.setString(11, feedObject.getLastModifiedDate()); 
				ps.setString(12,feedObject.getGroupId());
				
			int rs = ps.executeUpdate();
			
			if (rs > -1) {
			return status = 0;
			} else {
			return status;
			}

			} catch (Exception e) {
			throw e;
			}
			finally{

		          if(ps!= null){
		        	  
	                ps.close();

		          }
		          if(connection!=null){
		        	  
		        	  connection.close();

		          }
		        }
			
			
			}	
	
	public int deleteGroup(Connection connection,String groupId ) throws Exception {
			int status = -1;
			PreparedStatement ps = null;
			try {
			
		    ps = connection.prepareStatement("DELETE FROM groups  WHERE group_id=?");
			ps.setString(1, groupId);
			
			int rs = ps.executeUpdate();
			if (rs > -1) {
			return status = 0;
			} else {
			return status;
			}

			} catch (Exception e) {
			throw e;
			}			
			finally{

		          if(ps!= null){
		        	  
	                ps.close();

		          }
		          if(connection!=null){
		        	  
		        	  connection.close();

		          }
		        }
			
			}	
	
	public static ResultSet loadGroup(){
			ResultSet result = null;
			Connection connection = null;
			Statement st = null;
			try {
				
				 connection = OpenfarmConnect.Get_Connection();
				 st = connection.createStatement();
				result = st.executeQuery("SELECT * FROM groups");

				}catch(Exception e){
					
				}
			return result;
	    }
	
	public static ResultSet loadGroupMembers(){
			ResultSet result = null;
			Connection connection = null;
			Statement st = null;
			try {
				
				 connection = OpenfarmConnect.Get_Connection();
				 st = connection.createStatement();
				result = st.executeQuery("SELECT DESCTINCT group_member_id,group_id,farmer_id FROM group_members");

				}catch(Exception e){
					
				}
			return result;
	    }
	
	public static String getGroupHead(Connection connection,String groupId){
			ResultSet result = null;
			Statement st = null;
                        String grouphead = "";
			try {
				
				 st = connection.createStatement();
                                 
				result = st.executeQuery("SELECT DESCTINCT group_member_id,group_id,farmer_id FROM group_members");
                                if(result.next()){
                                    
                                    grouphead = result.getString("group_head");
                                    
                                }
				}catch(Exception e){
					
				}
			return grouphead;
	    }
}
