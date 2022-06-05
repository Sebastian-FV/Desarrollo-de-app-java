<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link 
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
	rel="stylesheet" 
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1><c:out value="${titulo }"></c:out></h1>
		<div>
		<c:set var="dept" value="${departamento}"/>
			<form action="/DepartamentoServletController?action=update" method="post">
				<div class="form-group">
					<label>id</label>
					<input class="form-control" type="text" readonly="readonly" name="id" disabled="disabled" value="<c:out value="${dept.id}" />"/>
				</div>
				<div>
					<label>Nombre</label>
					<input class="form-control" type="text" name="nombre" value="<c:out value="${dept.nombre_departamento}" />"/>
				</div>
				<div>
					<label>Codigo</label>
					<input class="form-control" type="text" name="codigo" value="${dept.codigo_departamento}" />
				</div>
				<div>
					<label>Fecha_Creada</label>
					<input class="form-control" type="datetime" name="fecha_crea" value="${dept.fecha_hora_crea}" />
				</div>
				<div>
					<label>Fecha_Modificada</label>
					<input class="form-control" type="datetime" name="fecha_midifica" value="${dept.fecha_hora_modifica}" />
				</div>
				<br>
				<div>
					<input type="submit" value="guardar" class="btn btn-primary"/>
				</div>
			</form>
		</div>
	</div>
	
</body>
</html>