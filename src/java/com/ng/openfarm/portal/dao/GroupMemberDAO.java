/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.dao;

import com.ng.openfarm.portal.dto.GroupMemberDataModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Mutual-Links
 */
public class GroupMemberDAO {
	
	public ArrayList<GroupMemberDataModel> GetGroupMemberById(Connection connection,String cropCateId) throws Exception
	{
		PreparedStatement ps = null;
		ArrayList<GroupMemberDataModel> feedData = new ArrayList<GroupMemberDataModel>();
		try
		{
                    
	        ps = connection.prepareStatement("SELECT * FROM group_members WHERE group_head_auth_id=?");
		ps.setString(1,cropCateId);
		ResultSet rs = ps.executeQuery();
                
		while(rs.next())
		{
		        GroupMemberDataModel feedObject = new GroupMemberDataModel(); 
                        
			feedObject.setGroupMemberId(rs.getString("group_member_id"));
			feedObject.setGroupId(rs.getString("group_id"));
			feedObject.setFarmerId(rs.getString("farmer_id"));
			feedObject.setGroupHeadId(rs.getString("group_head_auth_id"));
			feedObject.setStatus(rs.getString("status"));
			feedObject.setLastMofied(rs.getString("last_modified"));
                        
		   feedData.add(feedObject);
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
		return feedData;

	}
        
	public ArrayList<GroupMemberDataModel> GetGroupMemberById(Connection connection) throws Exception
	{
		Statement ps = null;

		ArrayList<GroupMemberDataModel> feedData = new ArrayList<GroupMemberDataModel>();
		try
		{
	    ps = connection.createStatement();
		ResultSet rs = ps.executeQuery("SELECT * FROM group_members");
		while(rs.next())
		{
		
		 GroupMemberDataModel feedObject = new GroupMemberDataModel(); 
                
                
                feedObject.setGroupMemberId(rs.getString("group_member_id"));
                feedObject.setGroupId(rs.getString("group_id"));
                feedObject.setFarmerId(rs.getString("farmer_id"));
                feedObject.setGroupHeadId(rs.getString("group_head_auth_id"));
                feedObject.setStatus(rs.getString("status"));
                feedObject.setLastMofied(rs.getString("last_modified"));
                        
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
	
//        
//	public ArrayList<GroupMemberDataModel> GetAllGroupsMenbers(Connection connection) throws Exception
//	{
//		Statement ps = null;
//
//		ArrayList<GroupMemberDataModel> feedData = new ArrayList<GroupMemberDataModel>();
//		try
//		{
//	    ps = connection.createStatement();
//		ResultSet rs = ps.executeQuery("SELECT * FROM group_members");
//		while(rs.next())
//		{
//		
//		 GroupMemberDataModel feedObject = new GroupMemberDataModel(); 
//                
//                
//                feedObject.setGroupMemberId(rs.getString("group_member_id"));
//                feedObject.setGroupId(rs.getString("group_id"));
//                feedObject.setFarmerId(rs.getString("farmer_id"));
//                feedObject.setGroupHeadId(rs.getString("group_head_auth_id"));
//                feedObject.setStatus(rs.getString("status"));
//                feedObject.setLastMofied(rs.getString("last_modified"));
//                        
//		feedData.add(feedObject);
//		}
//		}
//		catch(Exception e)
//		{
//		throw e;
//		}
//		finally{
//
//	          if(ps!= null){
//	        	  
//                ps.close();
//
//	          }
//	          if(connection!=null){
//	        	  
//	        	  connection.close();
//
//	          }
//	        }
//		return feedData;
//
//	}
//	
	
	public int InsertGroupMembers(Connection connection, GroupMemberDataModel feedObject) throws Exception {
			int status = -1;
			PreparedStatement ps = null;
			try {
				 	 	 	 	 	 	 	 	 	 	 
		        ps = connection.prepareStatement("INSERT INTO group_members (group_member_id,group_id,farmer_id,group_head_auth_id,status,last_modified) VALUES(?,?,?,?,?,?)");
			ps.setString(1,feedObject.getGroupMemberId());
			ps.setString(2, feedObject.getGroupId());
			ps.setString(3, feedObject.getFarmerId()); 
			ps.setString(4, feedObject.getGroupHeadId()); 
			ps.setString(5, feedObject.getStatus()); 
			ps.setString(6, feedObject.getLastMofied()); 

			
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

	
	public int updateGroups(Connection connection, GroupMemberDataModel feedObject) throws Exception {
			int status = -1;
			PreparedStatement ps = null;
			try {
			 ps = connection.prepareStatement("UPDATE group_members set group_id=?,farmer_id=?,group_head_auth_id=?,status=?,last_modified=? WHERE group_member_id=?");

			ps.setString(1, feedObject.getGroupId());
			ps.setString(2, feedObject.getFarmerId()); 
			ps.setString(3, feedObject.getGroupHeadId()); 
			ps.setString(4, feedObject.getStatus()); 
			ps.setString(5, feedObject.getLastMofied()); 
			ps.setString(6,feedObject.getGroupMemberId());

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
			
		    ps = connection.prepareStatement("DELETE FROM group_members  WHERE group_member_id=?");
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
				result = st.executeQuery("SELECT DESCTINCT group_member_id,group_id,farmer_id FROM group_members");

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
}

