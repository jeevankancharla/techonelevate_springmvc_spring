<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp" %>
    <% String msg = (String)request.getAttribute("msg");
    String errmsg = (String)request.getAttribute("errmsg");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddEmployee</title>
</head>
<body>

	<%
	if (msg != null && !msg.isEmpty()) {
	%>
	<h1> <%= msg %> </h1>	
		
		<%
		}
		%>
		
			<%
	if (errmsg != null && !errmsg.isEmpty()) {
	%>
	<h1> <%= errmsg %> </h1>	
		
		<%
		}
		%>


<form action="./add" method="post">

<label>Emp_Id</label>
<label>:</label>
<input type = "text" name ="id" >

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
<input type = "password" name ="password" >

<br>

<input type = "submit">


</form>

</body>
</html>