<%@page import="com.wcs.mvccrud.model.Student"%>
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
<th>Rollno</th>
<th>Name</th>
<th>Addr</th>
<th>Un</th>
<th>Ps</th>

</tr>
<tr>
<%List<Student>su=(List)request.getAttribute("data");
  for(Student stu:su)
	  
  {%>
  <td><input type="radio" name="Rollno" value="<%=stu.getRollno()%>"><%=stu.getRollno()%></td>
 
  <td><%=stu.getName()%></td>
  <td><%=stu.getAddr()%></td>
  <td><%=stu.getUn()%></td>
  <td><%=stu.getPs()%></td>
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