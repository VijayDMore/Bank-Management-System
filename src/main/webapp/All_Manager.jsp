<%@page import="com.jsp.service.AdminService"%>
<%@page import="com.jsp.dto.Manager"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%AdminService adminServices=new AdminService(); %>
<% List<Manager> managers=adminServices.getAllManagerDetails(); %>

<table border="2px">

<tr >
<th>MANAGER ID</th>
<th>NAME</th>
<th>EMAIL</th>



</tr>

<%
for(Manager m: managers){%>
<tr>
<td><%=m.getId() %></td>
<td><%= m.getName() %></td>
<td><%= m.getEmail() %></td>
 


</tr>

<%} %>
</table>
</body>
</html>