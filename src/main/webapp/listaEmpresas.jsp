<%@page import="java.util.List"%>
<%@page import="br.com.alura.gerenciador.servlet.model.Empresa"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<ul>
	<%
		for(Empresa empresa:lista){ 
	%>
	<li>
		<%= empresa.getNome() %>
	</li>
	<% } %>
	</ul>
</body>
</html>