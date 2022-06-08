<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

	<h1 class="">Agregar Empleado</h1>
	<div class="container">
		<form class="form-group" action="EmpleadoServletController?action=agregar" method="post" >
			<label>Tipo documento</label>
				<input class="form-control" type="text" name="tipo_documento"/>
			<label>N° Documento</label>
				<input class="form-control" type="text" name="numero_documento"/> 
			<label>Nombres</label>
				<input class="form-control"  type="text" name="nombres"/>
			<label>Apellidos</label>
				<input class="form-control" type="text" name="apellidos"/>
			<label>Departamento</label>
				<input class="form-control" type="text" name="id_departamento"/>
			<label>Direccion</label>
				<input class="form-control" type="text" name="direccion"/>
			<label>Correo Electronico</label>
				<input class="form-control" type="text" name="correo_electronico"/>
			<label>Telefono</label>
				<input class="form-control" type="text" name="telefono"/>
				<input class="btn btn-primary" type="submit" name="accion" value="Agregar"/> 
				<a class="btn btn-primary" href="EmpleadoServletController?action=regresar">Regresar a lista</a>
				<a class="btn btn-primary" href="index.jsp">Regresar</a>     
		</form>
	</div>
	
	 
</body>
</html>