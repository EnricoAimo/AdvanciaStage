<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Primo jsp orologio</title>
	</head>
	<body>
		<h1>Orologio jsp</h1>
		<h2>Ciao  <%=  request.getParameter("testoO") %> </h2><br>
		<p> <% 
				out.print(new Date().toString());
				//response.getWriter().print("<br>è lo stesso ma lo mette prima"); 
				String orario = request.getParameter("date");
				if(orario!=null){
					out.print("<br> ora presa come parametro "+orario);
				}
				
		%> </p>
			<%= "ciao"%>  
	</body>
</html>