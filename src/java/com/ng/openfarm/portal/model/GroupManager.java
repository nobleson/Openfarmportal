/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.model;



import com.ng.openfarm.portal.dao.GroupDAO;
import com.ng.openfarm.portal.dao.OpenfarmConnect;
import com.ng.openfarm.portal.dto.GroupDataModel;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Mutual-Links
 */
public class GroupManager {


	public GroupDataModel Service_GetGroupById(String cropCateId)throws Exception {
		GroupDataModel feeds = null;
		try {
		// Here you can validate before connecting DAO class, eg. User session condition
		Connection connection = OpenfarmConnect.Get_Connection();
		GroupDAO dao= new GroupDAO();
		
		feeds=dao.GetGroupById(connection, cropCateId);
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}	

	public GroupDataModel Web_GetGroupById(Connection connection,String cropCateId)throws Exception {
		GroupDataModel feeds = null;
		try {
	   GroupDAO dao= new GroupDAO();
		// Here you can validate before connecting DAO class, eg. User session condition

		feeds=dao.GetGroupById(connection, cropCateId);
		
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}		
	

	public ArrayList<GroupDataModel> Service_GetAllGroups()throws Exception {
		ArrayList<GroupDataModel> feeds = null;
		try {
			// Here you can validate before connecting DAO class, eg. User session condition
		Connection connection = OpenfarmConnect.Get_Connection();
		GroupDAO dao= new GroupDAO();
		feeds=dao.GetAllGroups(connection);
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}		

	public ArrayList<GroupDataModel> Web_GetAllgroups(Connection connection)throws Exception {
		ArrayList<GroupDataModel> feeds = null;
		try {
			// Here you can validate before connecting DAO class, eg. User session condition

		GroupDAO dao= new GroupDAO();
		feeds=dao.GetAllGroups(connection);
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}
	public String web_InsertGroup(Connection connection, GroupDataModel feedOjects) throws Exception {
		String message = null;
		int status = -1;
		try {
		GroupDAO dao= new GroupDAO();
		status = dao.InsertGroup(connection, feedOjects);

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
	public String Web_UpdatGroup(Connection connection, GroupDataModel feedObject) throws Exception {
		String message = null;
		int status = -1;
		
		try {

		GroupDAO dao= new GroupDAO();
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
	public String Web_DeleteGroup(Connection connection,String groupId ) throws Exception {
		String message = null;
		int status = -1;
		
		try {
		

		GroupDAO dao= new GroupDAO();
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
