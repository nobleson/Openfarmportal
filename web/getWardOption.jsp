<%@page import="com.ng.openfarm.portal.dao.StateDAO"%>
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
 <select id="ward_combo" name="ward_combo">
<option value='0'>==Ward==</option>
<%
String str=request.getParameter("q");

i=str;
ResultSet rs = null;
rs= StateDAO.loadWards(i);

while(rs.next()){
%>
<option value="<%=rs.getString("ward_id")%>"><%=rs.getString("ward")%></option>
<%
}
%>
</select>

</body>
</html> 