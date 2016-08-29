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
 <select id="lgarea_combo" name="lgarea_combo">
<option value='0'>==Local Government Area==</option>
<%
String str=request.getParameter("q");

i=str;
ResultSet rs = null;
rs= StateDAO.loadLGArea(i);

while(rs.next()){
%>
<option value="<%=rs.getString("lgas_id")%>"><%=rs.getString("lga")%></option>
<%
}
%>
</select>

</body>
</html> 