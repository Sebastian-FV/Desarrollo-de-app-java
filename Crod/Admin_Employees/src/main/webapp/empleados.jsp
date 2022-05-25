<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="modelo.Empleados" %>
<%@ page import="java.util.Iterator" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>

	<div class="container1">
		<form action="ServletPersonaController" method="get">
			<div>
				<label>ID : </label>
				<input type="text" name="id">
			</div>
			
			<div>
				<label for="browser">Tipo_Documento: </label>
				<input list="browsers" name="tipo_documento" id="tipo_documento">
				
				<datalist id="browsers">
				  <option value="RC">
				  <option value="TI">
				  <option value="CC">
				  <option value="CE">
				</datalist>
			</div>
			<div>
				<label>Numero_Documento : </label>
				<input type="number" name="numero_documento">
			</div>
			<div>
				<label>Nombres : </label>
				<input type="text" name="nombres">
			</div>
			<div>
				<label>Apellidos : </label>
				<input type="text" name="apellidos">
			</div>
			<div>
				<label>Departamentos : </label>
				<input type="text" name="departamentos">
			</div>
			<div>
				<label>Dirección : </label>
				<input type="text" name="dirección">
			</div>
			<div>
				<label>Correo_Electrónico : </label>
				<input type="text" name="correo_electrónico">
			</div>
			<div>
				<label>Teléfono : </label>
				<input type="number" name="teléfono">
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
	<%! List<Empleados> listaEmpleados; %>
	<%
	 try{
		 listaEmpleados=(List<Empleados>) request.getAttribute("lista");
		 Iterator<Empleados> item = listaEmpleados.iterator();
	%>
	<table class="table">
		<thead class="table table-dark table-striped">
			<th>ID</th>
			<th>Tipo_documento</th>
			<th>Numero_documento</th>
			<th>Nombre</th>
			<th>Apellido</th>
			<th>Departamentos</th>
			<th>Dirección</th>
			<th>Correo_electrónico</th>
			<th>Teléfono</th>
			<th>Apellido</th>
			<th>FechaC</th>
			<th>FechaM</th>
		</thead>
		<tbody>
		<%	while(item.hasNext()){
			Empleados empleados=item.next();
			%>
			<tr>
				<td><%= empleados.getId() %></td>
				<td><%= empleados.getTipo_documento() %></td>
				<td><%= empleados.getNumero_documento() %></td>
				<td><%= empleados.getNombres() %></td>
				<td><%= empleados.getApellidos() %></td>
				<td><%= empleados.getDepartamentos() %></td>
				<td><%= empleados.getDirección() %></td>
				<td><%= empleados.getCorreo_electrónico() %></td>
				<td><%= empleados.getTeléfono() %></td>
				<td><%= empleados.getFechaC() %></td>
				<td><%= empleados.getFechaM() %></td>
				<td><a href="#">Editar</a></td>
			</tr>
			<% }
		}catch(Exception e){}
			%>
		</tbody>
	</table>
	
</body>
</html>