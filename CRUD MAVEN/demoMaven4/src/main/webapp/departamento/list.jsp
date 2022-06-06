<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <%@page isELIgnored="false" %> 
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
	
	<div class="contairner">
			
		<a class="btn btn-success" href="ciudades/crearCiudad.jsp">Crear</a>
		<h2>Lista Departamentos</h2>
		<c:out value="${titulo} "/>
		<div>
			<table class="table">
				<thead>
					<th>id</th>
					<th>Nombre</th>
					<th>Codigo</th>
					<th>Fecha_Creada</th>
					<th>Fecha_Modificada</th>
					<th>Acciones</th>
					
				</thead>
				<tbody>
					<c:forEach var="departamento" items="$ (ListDepart)">
					<tr>
						<td><c:out value="$ (departamento.id)"></c:out></td>
						<td><c:out value="$ (departamento.nombre_departamento)"></c:out></td>
						<td><c:out value="$ (departamento.codigo_departamento)"></c:out></td>
						<td><c:out value="$ (departamento.fecha_hora_crea)"></c:out></td>
						<td><c:out value="$ (departamento.fecha_hora_modificada)"></c:out></td>
						<td><a class="btn btn-primary" 
								href="DepartamentoServletController?action=edit&id=<c:out value="${depar.id}"></c:out>">Editar</a></td>
					</tr>	
					</c:forEach>
				</tbody>
			</table>
		</div>
			
	</div>
	
</body>
</html>