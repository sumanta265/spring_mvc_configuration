<%@ page language="java" contentType="text/html;  charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
 "http://www.w3.org/TR/html4/loose.dtd"> 
 <%@ page import ="java.util.*" %>
<html>

<body>
	<h2>Spring MVC and List Example</h2>
<%
String name=(String)request.getAttribute("name");

List<String> a1=(List<String>)request.getAttribute("lists");

%>


<h1>

<%=name %>

</h1>
<%

for (String s:a1)
{
	
	out.println(s);
	
}

%>




</body>
</html>
