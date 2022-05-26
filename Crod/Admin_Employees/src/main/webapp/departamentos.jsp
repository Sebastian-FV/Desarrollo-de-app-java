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
			<br>
			<div>
				<label>ID : </label>
				<input placeholder="ID" type="text" name="id">
			</div>
			<div>
				  <label for="codigo_departamento">Codigo_departamento : </label>
				  <select placeholder="ID" class="form-select" id="codigo_departamento" name="codigo_departamento">
				  <option selected>Codigo</option>
				  <option selected> 1 </option>
				  <option selected> 2 </option>
				  </select>
			</div>
			<div>
				<label for="nombre_departamento">Tipo_Documento: </label>
				<select class="form-select" id="nombre_departamento" name="nombre_departamento">
				  <option selected>Antioquia</option>
				  <option selected>Atlántico</option>
				  <option selected>Barranquilla D.E</option>
				  <option selected>Bogotá D.C.</option>
				  <option selected>Bolívar</option>
				  <option selected>Cartagena D.E.</option>
				  <option selected>Boyaca</option>
				  <option selected>Caldas</option>
				  <option selected>Caquetá</option>
				  <option selected>Cauca</option>
				  <option selected>Cesar</option>
				  <option selected>Córdova</option>
				  <option selected>Cundinamarca</option>
				  <option selected>Chocó</option>
				  <option selected>Huila</option>
				  <option selected>La Guajira</option>
				  <option selected>Magdalena</option>
				  <option selected>Santamarta D.E</option>
				  <option selected>Meta</option>
				  <option selected>Nariño</option>
				  <option selected>Norte de Santander</option>
				  <option selected>Quindio</option>
				  <option selected>Risaralda</option>
				  <option selected>Santander</option>
				  <option selected>Sucre</option>
				  <option selected>Tolima</option>
				  <option selected>Valle</option>
				  <option selected>Arauca</option>
				  <option selected>Casanare</option>
				  <option selected>Putumayo</option>
				  <option selected>San Andrés</option>
				  <option selected>Amazonas</option>
				  <option selected>Guainía</option>
				  <option selected>Guaviare</option>
				  <option selected>Vaupés</option>
				  <option selected>Vichada</option>
				</select>
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
				<input class="btn btn-dark" type="submit" value="Enviar">
			</div>
		</form>
	</div>
	<br>
	<%! List<Departamentos> listaDepartamentos; %>
	<%
	 try{
		 listaDepartamentos=(List<Departamentos>) request.getAttribute("lista");
		 Iterator<Departamentos> item = listaDepartamentos.iterator();
	%>
	<table class="table">
		<thead class="table table-striped">
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
				<td><a class="btn btn-info" href="#">Editar</a></td>
				<td><a class="btn btn-danger" href="#">Eliminar</a></td>
			</tr>
			
			<% }
		}catch(Exception e){}
			%>
		</tbody>
	</table>
	
</body>
</html>