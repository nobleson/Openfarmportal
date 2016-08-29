/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.model;



import com.ng.openfarm.portal.dao.GroupMemberDAO;
import com.ng.openfarm.portal.dto.GroupMemberDataModel;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Mutual-Links
 */
public class GroupMemberManager {


//	public GroupMemberDataModel Web_GetGroupById(Connection connection,String cropCateId)throws Exception {
//		GroupMemberDataModel feeds = null;
//		try {
//	           GroupMemberDAO dao= new GroupMemberDAO();
//		// Here you can validate before connecting DAO class, eg. User session condition
//
//		feeds=dao.GetGroupMemberById(connection, cropCateId);
//		
//		}
//		catch (Exception e) {
//		throw e;
//		}
//		return feeds;
//		}		
//
//	public ArrayList<GroupMemberDataModel> Web_GetAllgroupMembers(Connection connection)throws Exception {
//		ArrayList<GroupMemberDataModel> feeds = null;
//		try {
//			// Here you can validate before connecting DAO class, eg. User session condition
//
//		GroupMemberDAO dao= new GroupMemberDAO();
//		feeds=dao.GetAllGroupsMenbers(connection);
//		}
//		catch (Exception e) {
//		throw e;
//		}
//		return feeds;
//		}

	public ArrayList<GroupMemberDataModel> Web_GetGroupById(Connection connection,String cropCateId)throws Exception {
		ArrayList<GroupMemberDataModel> feeds = null;
		try {
			// Here you can validate before connecting DAO class, eg. User session condition

		GroupMemberDAO dao= new GroupMemberDAO();
		feeds=dao.GetGroupMemberById(connection, cropCateId);
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}
	public String web_InsertGroupMember(Connection connection, GroupMemberDataModel feedOjects) throws Exception {
		String message = null;
		int status = -1;
		try {
		GroupMemberDAO dao= new GroupMemberDAO();
		status = dao.InsertGroupMembers(connection, feedOjects);

		if(status==0){
			
			message = "Success";
		}else{
			message = "Fail";
		}

		} catch (Exception e) {
		throw e;
		}
		return message;
		}	
	public String Web_UpdatGroupMember(Connection connection, GroupMemberDataModel feedObject) throws Exception {
		String message = null;
		int status = -1;
		
		try {

		GroupMemberDAO dao= new GroupMemberDAO();
		status = dao.updateGroups(connection, feedObject);

		if(status==0){
			
			message = "Success";
		}else{
			message = "Fail";
		}

		
		} catch (Exception e) {
		throw e;
		}
		return message;
		}	
	public String Web_DeleteGroupMember(Connection connection,String groupId ) throws Exception {
		String message = null;
		int status = -1;
		
		try {
		

		GroupMemberDAO dao= new GroupMemberDAO();
		status = dao.deleteGroup(connection, groupId);

		if(status==0){
			
			message = "Success";
		}else{
			message = "Fail";
		}

		
		} catch (Exception e) {
		throw e;
		}
		return message;
		}
}
