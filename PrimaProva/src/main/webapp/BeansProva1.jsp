<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

	<jsp:useBean id="rotatore"
			scope="application"
			class = "controller.Ruota"
	/>
	
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		
		<%@ include file = "Banner.html" %>
		<%-- avanza nel rotatore --%>
		<% rotatore.avanza(); %>
		<p><b>Esempio java bean rotatore</b></p>
		<p>
			<a href='<jsp:getProperty property="link" name="rotatore"/>' >link </a>
			<br>
			<a href="<%= rotatore.getLink() %>"> link2 </a>
			
		</p>
		
</body>
</html>