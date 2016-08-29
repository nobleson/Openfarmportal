
<%@page import="com.ng.openfarm.portal.dao.VC_CropDataDAO"%>
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
 <select id="prod_crop_desc" name="prod_crop_desc">
<option value='0'>[ Select Crop ]</option>
<%
String str=request.getParameter("q");

i=str;
ResultSet rs = null;
rs= VC_CropDataDAO.loadCropData(i);

while(rs.next()){
%>
<option value="<%=rs.getString("crop_id")%>"><%=rs.getString("crop_name")%></option>
<%
}
%>
</select>

</body>
</html> 