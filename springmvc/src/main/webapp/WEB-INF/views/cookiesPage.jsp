<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <% String msg = (String)request.getAttribute("msg"); %>
    <% String cookie = (String)request.getAttribute("cookie"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
	if (cookie != null && !cookie.isEmpty()) {
	%>
	<h1>  Employee_name : <%= cookie %> </h1>	
		
		<%
		}
		%>

<h3><a  href="./createCookie">create cookie</a></h3>
<h3><a  href="./showCookie">Show cookie</a></h3>

</body>
</html>