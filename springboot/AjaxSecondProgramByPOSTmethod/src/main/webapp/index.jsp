<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script>
function Hello()
{
	var uname=document.getElementById("t1").value;
	alert("Hello")
var req=new XMLHttpRequest();
    req.open("POST","log/",true);
    req.send(uname);
    req.onreadystatechange=function()
    {
    	alert(req.readyState);
    	alert(req.status);
    	
   if(req.readyState==4&&req.status==200)
	   {
	   document.getElementById("t2").innerHTML=req.responseText;
	   }
    	
    }
}
</script>
<meta charset="ISO-8859-1">
<title>Index page</title>
</head>
<body>

<input type="submit" value="ok" onclick="Hello()">
USERNAME:-<input type="text" id="t1" name="uname">
<p id="t2"></p>

</body>
</html>