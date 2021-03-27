<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
  function login()
  {
	  alert("hello");
  var uid=document.getElementById("uid").value;
  var pid=document.getElementById("pid").value;
 
  var req=new XMLHttpRequest();
  var url="http://localhost:8082/log/"+uid+"/"+pid;
      req.open("POST", url, true);
      req.send();
      
      req.onreadystatechange=function()
      {
      	alert(req.readyState);
      	alert(req.status);
      	
     if(req.readyState==4&&req.status==200)
  	   {
  	     alert(req.responseText);
  	   document.getElementById("t1").innerHTML=req.responseText;
  	   }
      	
      }
  }
      
  </script>
  
<body>
<form name="f">
UserName:<input type="text" name="uname" id="uid"><br>
password:<input type="password" name="pass" id="pid"><br>
<input type="button" value="login" onclick="login()">
<p id="t1"></p>
</form>

</body>
</html>