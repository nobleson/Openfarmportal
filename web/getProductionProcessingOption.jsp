
<%@page import="com.ng.openfarm.portal.dao.VC_ProcessingDAO"%>
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
 <select id="processing_production_id" name="processing_production_id">
<option value='0'>[ Select production ]</option>
<%
String str=request.getParameter("q");

i=str;
ResultSet rs = null;
rs= VC_ProcessingDAO.loadProductionData(i);

while(rs.next()){
    
String productiondesc = rs.getString("production_description")+"      [ "+rs.getString("production_year")+" ]";
%>
<option value="<%=rs.getString("production_id")%>"><%=productiondesc%></option>
<%
}
%>
</select>

</body>
</html> 