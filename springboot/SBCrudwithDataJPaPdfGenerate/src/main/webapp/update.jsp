<%@page import="com.cjc.main.model.Student"%>
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
<table border ="3" bgcolor="white">
<input type="hidden" name="rollno" value="${stu.rollno}">
 <br>
<tr><td>Name=<input type="text" name="name" value="${stu.name}"> 

  <br></td></tr>
<tr><td>UN=<input type="text" name="un" value="${stu.un}"> 
  <br></td></tr>
<tr><td>PS=<input type="text" name="ps" value="${stu.ps}"> 
  <br></td></tr>
<tr><td>MNO=<input type="text" name="mno" value="${stu.mno}"> 
  <br></td></tr>
  
<tr><td><input type="submit" value="update"><br></td></tr>
</table>
</form>

</body>
</html>