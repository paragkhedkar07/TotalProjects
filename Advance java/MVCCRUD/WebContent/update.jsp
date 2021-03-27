<%@page import="com.wcs.mvccrud.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update page</title>
</head>
<body bgcolor="powderblue">

<form action="update">

<input type="hidden" name="Rollno" value="${emp.rollno}">
  <br>
Name=<input type="text" name="Name" value="${emp.name}"> 
  <br>
Addr=<input type="text" name="Addr" value="${emp.addr}"> 
  <br>
UN=<input type="text" name="Un" value="${emp.un}"> 
  <br>
PS=<input type="text" name="Ps" value="${emp.ps}"> 
  <br>
<input type="submit" value="update">

</form>  
</body>
</html>