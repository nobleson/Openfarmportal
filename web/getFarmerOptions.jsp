<%-- 
    Document   : getFarmerOptions
    Created on : Apr 30, 2016, 12:36:26 PM
    Author     : Mutual-Links
--%>

<%@page import="com.ng.openfarm.portal.dao.FarmerDAO"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <select name="farmer_combo" id="farmer_combo" >
    <option value='0'>[   Select  Farmer Reg No.   ]</option>
    <%
    ResultSet rs = null;
    rs= FarmerDAO.loadFarmers();

    while(rs.next()){
    %>
    <option value="<%=rs.getString(1)%>"><%=rs.getString(2)%></option>
    <%
    }
    %>
    </select>
    </body>
</html>
