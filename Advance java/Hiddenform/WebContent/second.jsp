<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<h1>Second page</h1>
</head>
<body>
<form action="second">
<input type="hidden" name="t1" value="<%=request.getParameter("t1")%>">
First Data:-<%=request.getAttribute("t1") %>
<br>
Second Data:-<input type="text" name="t2">
<input type="submit">
</form>
</body>
</html>
