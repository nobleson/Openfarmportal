
<%@page import="com.ng.openfarm.portal.dao.ValueChainDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<%!String i;%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>State Page</title>
</head>
<body>
 <select id="member_combo" name="member_combo">
<option value='0'>[ Select Farmer ID ]</option>
<%
String str=request.getParameter("q");

i=str;
ResultSet rs = null;
rs= ValueChainDAO.loadMembersByGroup(i);
while(rs.next()){
String member = rs.getString("farmer_id");
%>
<option value="<%=member%>"><%=member%></option>
<%
}
%>
</select>

</body>
</html> 