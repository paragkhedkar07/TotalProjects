<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<h1>display page</h1>
</head>
<body>

First Data:-<%=session.getAttribute("fd") %><br>

Second Data:-<%=session.getAttribute("sd") %><br>

Third Data:-<%=request.getParameter("t3") %><br>

</body>
</html>
