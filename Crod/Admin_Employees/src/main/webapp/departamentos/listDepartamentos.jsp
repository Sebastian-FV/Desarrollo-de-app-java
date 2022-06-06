<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<div>
		<div>
			<nav>
				<a href="">Empleados</a>
				<a href="">Departamentos</a>
			</nav>
		</div>
		
		<a class="btn btn-success" href="">Crear</a>
		<h2>Lista DEpartamentos</h2>
		<div>
			<table class="table">
				<thead class="table-dark">
					<th>ID</th>
					<th>Codigo_Departamento</th>
					<th>Nombre_Departamento</th>
					<th>FechaC</th>
					<th>FechaM</th>
				</thead>
				<tbody>
					<c:forEach var="departamento" item="${departamentos}">
						<tr>
							<td><c:aot values="${departamento.id}"></td>
							<td><c:aot values="${departamento.codigo_departamento}"></td>
							<td><c:aot values="${departamento.nombre_departamento}"></td>
							<td><c:aot values="${departamento.fechaC}"></td>
							<td><c:aot values="${departamento.fechaM}"></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>