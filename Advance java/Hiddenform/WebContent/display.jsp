<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<h1>display page</h1>
</head>
<body>
<input type="hidden" name="t1" value="<%=request.getParameter("t1")%>">
First Data:-<%=request.getParameter("t1") %><br>

<input type="hidden" name="t2" value="<%=request.getParameter("t2")%>">
Second Data:-<%=request.getParameter("t2") %><br>

<input type="hidden" name="t3" value="<%=request.getParameter("t3")%>">
Second Data:-<%=request.getParameter("t3") %><br>



</body>
</html>
