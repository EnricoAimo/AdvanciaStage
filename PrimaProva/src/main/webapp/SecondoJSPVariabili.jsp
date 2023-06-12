<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="Banner.html" flush="true"/>
	
	<%! String ovunque= "sono var di istanza"; %>
	<% 
		int soloqui=1;
		out.print("var istanza "+ovunque+" var locale"+soloqui) ;
	%>
	
	<br>
	
	
	
</body>
</html>