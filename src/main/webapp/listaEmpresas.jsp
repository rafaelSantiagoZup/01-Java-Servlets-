<%@page import="java.util.List"%>
<%@page import="br.com.alura.gerenciador.servlet.model.Empresa"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard taglib</title>
</head>
<body>
<h1>Lista de empresas:</h1>
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			 <li>${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
			 <a href="/gerenciador/editarEmpresa?id=${empresa.id}">editar</a>
			 <a href="/gerenciador/deletaEmpresa?id=${empresa.id}" style="cursor:pointer;">deletar</a> </li>
		</c:forEach>
	</ul>
</body>
</html>