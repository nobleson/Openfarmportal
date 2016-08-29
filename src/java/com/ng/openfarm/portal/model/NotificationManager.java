package com.ng.openfarm.portal.model;

import com.ng.openfarm.portal.dao.NotificationDAO;
import com.ng.openfarm.portal.dto.NotificationDataModel;
import java.sql.Connection;
import java.util.ArrayList;


public class NotificationManager {

	public ArrayList<NotificationDataModel> Web_GetAllNotification(Connection connection)throws Exception {
		ArrayList<NotificationDataModel> feeds = null;
		try {
			// Here you can validate before connecting DAO class, eg. User session condition
		NotificationDAO dao= new NotificationDAO();
		feeds=dao.GetAllNotification(connection);
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}		
	
	public NotificationDataModel Web_GetNotificationById(Connection connection,String targetId)throws Exception {
		NotificationDataModel feeds = null;
		try {
		NotificationDAO dao= new NotificationDAO();
		// Here you can validate before connecting DAO class, eg. User session condition

		feeds=dao.GetNotificationById(connection, targetId);
		
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}		
	public String Web_InsertNotification(Connection connection, NotificationDataModel feedOjects) throws Exception {
		String message = null;
		int status = -1;
		try {

		NotificationDAO dao= new NotificationDAO();
		status = dao.InsertNotification(connection, feedOjects);

		if(status==0){
			
			message = "success";
		}else{
			message = "fail";

		}
		
		} catch (Exception e) {
		throw e;
		}
		return message;
		}	
}
