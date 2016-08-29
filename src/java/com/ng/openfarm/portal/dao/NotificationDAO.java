package com.ng.openfarm.portal.dao;

import com.ng.openfarm.portal.dto.NotificationDataModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class NotificationDAO {
	public ArrayList<NotificationDataModel> GetAllNotification(Connection connection) throws Exception
	{
		ArrayList<NotificationDataModel> feedData = new ArrayList<NotificationDataModel>();
		try
		{
		Statement ps = connection.createStatement();
		ResultSet rs = ps.executeQuery("SELECT * FROM notifications");
		while(rs.next())
		{
		
	    NotificationDataModel feedObject = new NotificationDataModel();
		
		feedObject.setNotification_id(rs.getString("notification_id"));
		feedObject.setNotification(rs.getString("notification"));
		feedObject.setSenderId(rs.getString("senderId"));
		feedObject.setTartget_receivers(rs.getString("tartget_receivers"));
		feedObject.setDate_notified(rs.getString("date_notified"));

		
		feedData.add(feedObject);
		}
		return feedData;
		}
		catch(Exception e)
		{
		throw e;
		}
	}
	
	public NotificationDataModel GetNotificationById(Connection connection,String targetId) throws Exception
	{
            PreparedStatement ps = null;
            String query = "SELECT * FROM notifications WHERE tartget_receivers=?";

		try
		{
		 ps = connection.prepareStatement(query);
		ps.setString(1,targetId);
		ResultSet rs = ps.executeQuery();
		NotificationDataModel feedObject = new NotificationDataModel();
		while(rs.next())
		{

			feedObject.setNotification_id(rs.getString("notification_id"));
			feedObject.setNotification(rs.getString("notification"));
			feedObject.setSenderId(rs.getString("senderId"));
			feedObject.setTartget_receivers(rs.getString("tartget_receivers"));
			feedObject.setDate_notified(rs.getString("date_notified"));
			
			 
		}
		return feedObject;
		}
		catch(Exception e)
		{
		throw e;
		}

	}

public int InsertNotification(Connection connection,NotificationDataModel notify) throws Exception {
		int status = -1;
                    PreparedStatement ps = null;
		try {

		 ps = connection.prepareStatement("INSERT INTO notifications(notification_id,notification,senderId,tartget_receivers,date_notified) VALUES(?,?,?,?,?)");


		ps.setString(1, notify.getNotification_id());
		ps.setString(2, notify.getNotification());
		ps.setString(3, notify.getSenderId());
		ps.setString(4, notify.getTartget_receivers());
		ps.setString(5, notify.getDate_notified());

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
		public static ResultSet loadAllNotification(Connection connection)
		{
			ResultSet rs = null;
			try
			{
			Statement ps = connection.createStatement();
		    rs = ps.executeQuery("SELECT * FROM notifications ORDER BY date_notified DESC  LIMIT 10");

			}
			catch(Exception e)
			{
			e.printStackTrace();
			}
			return rs;

		}
	
}
