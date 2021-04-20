<%@page import="com.te.springmvc.bean.EmployeeBean"%>
<%@page import="com.te.springmvc.dao.EmployeeDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ include file="header.jsp" %>
    
    <%String msg =(String) request.getAttribute("msg");
    List<EmployeeBean> beans = (List)request.getAttribute("data");
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%if(msg !=null && !msg.isEmpty())  {
	%>
	<h1> <%= msg %></h1>
	<%} %>


<form action="./getAllEmp"  method="get" >


<table borber = "1" style = "width : 50px">
<tr style=" background-color: hotpink; color : blue; height : 30px">
<th style="font-size: 20px">Employee_Id</th>
<th style="font-size: 20px">Employee_Name</th>
<th style="font-size: 20px">Employee_DoB</th>

</tr>
<%if(beans!=null){ %>
<% 
for (EmployeeBean  bean : beans ) {
%>

<tr style=" background-color: green; color : orange; height : 30px"  >
<td style="font-size: 20px" ><%= bean.getId() %></td>
<td style="font-size: 20px" ><%= bean.getName() %></td>
<td style="font-size: 20px" ><%= bean.getDob() %></td>
</tr>


<%} %>

</table>
<%} %>
</form>

</body>
</html>