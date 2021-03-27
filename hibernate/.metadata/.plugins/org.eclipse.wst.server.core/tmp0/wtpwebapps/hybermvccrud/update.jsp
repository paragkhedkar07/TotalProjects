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

<input type="hidden" name="rollno" value="${stu.rollno}">
  <br>
Name=<input type="text" name="name" value="${stu.name}"> 
  <br>
Addr=<input type="text" name="addr" value="${stu.addr}"> 
  <br>
UN=<input type="text" name="un" value="${stu.un}"> 
  <br>
PS=<input type="text" name="ps" value="${stu.ps}"> 
  <br>
<input type="submit" value="update">

</form>  
</body>
</html>