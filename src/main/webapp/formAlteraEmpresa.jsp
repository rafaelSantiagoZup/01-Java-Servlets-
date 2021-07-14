<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Empresa</title>
</head>
<body>
	<form action="/gerenciador/alteraEmpresa" method="post">
		Nome: <input value="${empresa.nome}" type="text" name="nome"/>
		Data de abertura: <input value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" />" type="text" name="dataAbertura"/>
		<input type="text" name="id" value="${empresa.id}" hidden="true" />
		<input type="submit" />
	</form>
</body>
</html>