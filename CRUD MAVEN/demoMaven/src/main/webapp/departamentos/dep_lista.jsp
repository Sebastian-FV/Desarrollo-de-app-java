<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		<div>
			<a class="btn btn-primary"
				href="DepartamentoServletController?action=add">Agregar
				departamento</a> <a class="btn btn-primary" href="index.jsp">Regresar</a>
		</div>
		<h1>Lista_De_Departamentos</h1>
		<table class="table">
			<thead class="table-dark">
				<th>id</th>
				<th>Codigo_de_departamento</th>
				<th>Nombre_de_departamento</th>
				<th>Fecha_creada</th>
				<th>Ultima_modificada</th>
				<th>Acciones</th>
			</thead>
		</table>

		<tbody>
			<c:forEach var="departamento" items="${listDep}">
				<tr>
					<td><c:out value="${departamento.id}" /></td>
					<td><c:out value="${departamento.codigo_departamento}" /></td>
					<td><c:out value="${departamento.nombre_departamento}" /></td>
					<td><c:out value="${departamento.fecha_hora_crea}" /></td>
					<td><c:out value="${departamento.fecha_hora_modifica}" /></td>
					<td><a class="btn btn-primary"
						href="DepartamentoServletController?action=edit&id=<c:out value="${departamento.id}"></c:out>">Editar<a />
							<a class="btn btn-primary"
							href="DepartamentoServletController?action=eliminar&id=<c:out value="${departamento.id}"></c:out>">Eliminar<a /></td>
				</tr>
			</c:forEach>
		</tbody>
	</div>

</body>
</html>