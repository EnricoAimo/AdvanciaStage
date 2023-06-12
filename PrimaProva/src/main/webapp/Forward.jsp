<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>forward</title>
</head>
<body>

	<% String nome = request.getParameter("testoO");
		if(nome!=null){	
	%>
	<jsp:forward page="PrimoJsp.jsp">
		<jsp:param name="date" value="<%= new java.util.Date() %>" />
	</jsp:forward>	
	<%}else{ %>
		
		<form action="/PrimaProva/Forward.jsp" method ="post" id="oroligio" >
			<p> <label>Clicca quì 
				<input type="text" name="testoO" />
				<input type="submit" value="Ottieni ora jsp" />
			</label></p>
		</form>
	<%} %>
</body>
</html>