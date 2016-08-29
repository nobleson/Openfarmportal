
<%@page import="com.ng.openfarm.portal.dao.StateDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>State Page</title>
</head>
<body>
<select name="state_combo" id="state_combo" >
<option value='0'>====State  Origin====</option>
<%
ResultSet rs = null;
rs= StateDAO.loadState();

while(rs.next()){
%>
<option value="<%=rs.getString(1)%>"><%=rs.getString(2)%></option>
<%
}
%>
</select>

</body>
</html> 