<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="modelo.Departamentos" %>
<%@ page import="java.util.Iterator" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
	
	<div class="container2">
		<form action="ServletDepartamentoController" method="get">
			<div>
				<label>ID : </label>
				<input type="text" name="id">
			</div>
			<div>
				<label>Codigo_Departamento : </label>
				<input type="text" name="codigo_departamento">
			</div>
			<div>
				<label>Nombre_Departamento : </label>
				<input type="text" name="nombre_departamento">
			</div>
			<div>
				<label>Fecha_Hora_Creada : </label>
				<input type="date" name="fechaC">
			</div>
			<div>
				<label>Fecha_Hora_Modificada : </label>
				<input type="date" name="fechaM">
			</div>
			<div>
				<input type="submit" value="Enviar">
			</div>
		</form>
	</div>
	<%! List<Departamentos> listaDepartamentos; %>
	<%
	 try{
		 listaDepartamentos=(List<Departamentos>) request.getAttribute("lista");
		 Iterator<Departamentos> item = listaDepartamentos.iterator();
	%>
	<table class="table">
		<thead class="table table-dark table-striped">
			<th>ID</th>
			<th>Codigo_Departamento</th>
			<th>Nombre_Departamento</th>
			<th>FechaC</th>
			<th>FechaM</th>
		</thead>
		<tbody>
		<%	while(item.hasNext()){
			Departamentos departamentos=item.next();
			%>
			<tr>
				<td><%= departamentos.getId() %></td>
				<td><%= departamentos.getCodigo_departamento() %></td>
				<td><%= departamentos.getNombre_departamento() %></td>
				<td><%= departamentos.getFechaC() %></td>
				<td><%= departamentos.getFechaM() %></td>
			</tr>
			<% }
		}catch(Exception e){}
			%>
		</tbody>
	</table>
	
</body>
</html>