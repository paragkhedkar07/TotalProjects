<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script>
function Hello()
{
	alert("Hello")
var req=new XMLHttpRequest();
    req.open("GET","log/",true);
    req.send();
    req.onreadystatechange=function()
    {
    	alert(req.readyState);
    	alert(req.status);
    	
   if(req.readyState==4&&req.status==200)
	   {
	   document.getElementById("t1").innerHTML=req.responseText;
	   }
    	
    }
}
</script>
<meta charset="ISO-8859-1">
<title>Index page</title>
</head>
<body>

<input type="submit" value="ok" onclick="Hello()">
<p id="t1"></p>

</body>
</html>