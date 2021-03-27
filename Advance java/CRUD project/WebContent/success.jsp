
<%@page import="com.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>success page</title>
</head>
<body>
<table border ="3" bgcolor="orange">
<form name="myform">
<tr>
<th>Eid</th>
<th>Name</th>
<th>Addr</th>
<th>Un</th>
<th>Ps</th>

</tr>
<tr>
<%List<Employee>el=(List)request.getAttribute("data");
  for(Employee emp:el)
	  
  {%>
  <td><%=emp.getEid()%></td>
  <td><%=emp.getName()%></td>
  <td><%=emp.getAddr()%></td>
  <td><%=emp.getUn()%></td>
  <td><%=emp.getPs()%></td>
   </tr>
   <td><input type="radio" name="Eid" value="<%=emp.getEid()%>"><%=emp.getEid()%></td>
   <td><%=emp.getName()%></td>
   </tr>
   <%} %>
   <tr>
   <td><input type="button" value="Delete" onclick="deleterecord()"></td>
    <td><input type="button" value="Edit" onclick="editrecord()"></td>
   </tr>
   <script type/javascript>
   function deleterecord()
   {
	   alert("delete")
	   document.myform.action="delete";
	   document.myform.submit();
	   
}
   </script>  
    <script type/javascript>
   function editrecord()
   {
	   alert("edit")
	   document.myform.action="edit";
	   document.myform.submit();
	   
}
   </script>  
   </form> 
   </table>
   </body>
   </html>