<%-- 
    Document   : groupOptions
    Created on : Apr 30, 2016, 11:59:46 AM
    Author     : Mutual-Links
--%>

<%@page import="com.ng.openfarm.portal.dao.ValueChainDAO"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
<select name="group_combo" id="group_combo" >
<option value='0'>[    Select  Group ID   ]</option>
<%
ResultSet rs = null;
rs= ValueChainDAO.loadGroups();

while(rs.next()){
%>
<option value="<%=rs.getString(1)%>"><%=rs.getString(1)%></option>
<%
}
%>
</select>
    </body>
</html>
