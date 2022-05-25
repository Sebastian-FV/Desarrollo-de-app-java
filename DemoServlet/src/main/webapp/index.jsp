<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="modelo.Persona" %>
<%@ page import="java.util.Iterator" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
	<div class="container">
		<form action="ServletPersonaController" method="get">
			<div>
				<label>Nombre : </label>
				<input type="text" name="nombre">
			</div>
			<div>
				<label>Apellido : </label>
				<input type="text" name="apellido">
			</div>
			<div>
				<label>Edad : </label>
				<input type="number" name="edad">
			</div>
			<div>
				<input type="submit" value="Enviar">
			</div>
		</form>
	</div>
	<%! List<Persona> listaPersona; %>
	<%
	 try{
		listaPersona=(List<Persona>) request.getAttribute("lista");
		Iterator<Persona> item = listaPersona.iterator();
	%>
	<table class="table">
		<thead class="table-dark">
			<th>Nombre</th>
			<th>Apellido</th>
			<th>Acciones</th>
		</thead>
		<tbody>
		<%	while(item.hasNext()){
			Persona persona=item.next();
			%>
			<tr>
				<td><%= persona.getNombre() %></td>
				<td><%= persona.getApellido() %></td>
				<td><a href="#">Editar</a></td>
			</tr>
			<% }
		}catch(Exception e){}
			%>
		</tbody>
	</table>
</body>
</html>