<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ include file="header.jsp" %>
    
     <% String msg = (String)request.getAttribute("msg");
     String errmsg = (String)request.getAttribute("errmsg");
     int id = (int)request.getAttribute("id");
     %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Emp Form</title>
</head>
<body>

<%if(msg !=null && !msg.isEmpty())  {
	%>
	<h1> <%= msg %></h1>
	<%} %>
	<%if(errmsg !=null && !errmsg.isEmpty())  {
	%>
	<h1> <%= errmsg %></h1>
	<%} %>

<form action="./update" method="post">

<label>Emp_Id</label>
<label>:<%=id %></label>
<input type = "text" name = "id" value = "<%=id %>" hidden="true" >

<br>

<label>Emp_Name</label>
<label>:</label>
<input type = "text" name ="name" >

<br>

<label>Emp_Dob</label>
<label>:</label>
<input type = "date" name ="dob" >

<br>

<label>Emp_Password</label>
<label>:</label>
<input type = "password" name ="pwd" > <br>

<input type = "submit" value ="update" >


<br>



</form>

</body>
</html>