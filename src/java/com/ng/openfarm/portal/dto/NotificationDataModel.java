package com.ng.openfarm.portal.dto;

public class NotificationDataModel {
	
	private String notification_id,notification,senderId,tartget_receivers,date_notified;

	public String getNotification_id() {
		return notification_id;
	}

	public void setNotification_id(String notification_id) {
		this.notification_id = notification_id;
	}

	public String getNotification() {
		return notification;
	}

	public void setNotification(String notification) {
		this.notification = notification;
	}

	public String getSenderId() {
		return senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	public String getTartget_receivers() {
		return tartget_receivers;
	}

	public void setTartget_receivers(String tartget_receivers) {
		this.tartget_receivers = tartget_receivers;
	}

	public String getDate_notified() {
		return date_notified;
	}

	public void setDate_notified(String date_notified) {
		this.date_notified = date_notified;
	}
    @Override
    public String toString() {
            return "NotificationDataModel [notificationId=" + notification_id + ", notification=" + notification
                            + ", sender=" + senderId + ", targetReceiver=" + tartget_receivers  + ", dateNotified=" + date_notified + "]";
    }
}
