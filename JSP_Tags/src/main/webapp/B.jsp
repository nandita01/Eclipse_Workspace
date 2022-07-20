<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b> From B.jsp </b> <br>
<jsp:forward page="fordemo.jsp" >
   <jsp:param name="n" value = "Neeraj" />  
</jsp:forward>
<%= new java.util.Date() %>
<br>
<b> End of B.jsp </b> 
</body>
</html>