package com.ng.openfarm.portal.dto;

public class AuthenticationDataModel {
	
	private String authId, roleId ,userId, email, 	password,loginStatus,recordDates;

	public String getAuthId() {
		return authId;
	}

	public void setAuthId(String authId) {
		this.authId = authId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}

	public String getRecordDate() {
		return recordDates;
	}

	public void setRecordDate(String recordDate) {
		this.recordDates = recordDate;
	}
    @Override
    public String toString() {
            return "[authId=" + authId + ", roleId=" + roleId
                            + ", userId=" + userId + ", email=" + email  + ", loginStatus=" + loginStatus+ "]";
    }	

}