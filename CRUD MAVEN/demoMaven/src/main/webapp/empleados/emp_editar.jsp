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

	<div>
		<h1>Editar Empleados</h1>
		<div class="container">
			<c:set var="empleado" value="${empleado}" />
			<form class="form-group"
				action="EmpleadoServletController?action=actualizar" method="post">
				<div>
					<label>Id</label> <input class="form-control" type="text" name="id"
						readonly="readonly" value=<c:out value="${empleado.id}" /> />
				</div>
				<div>
					<label>Tipo Documento</label> <input class="form-control"
						type="text" name="tipo_documento"
						value=<c:out value="${empleado.tipo_documento}" /> />
				</div>
				<div>
					<label>Numero Documento</label> <input class="form-control"
						type="text" name="numero_documento"
						value=<c:out value="${empleado.numero_documento}" /> />
				</div>
				<div>
					<label>Nombres</label> <input class="form-control" type="text"
						name="nombres" value=<c:out value="${empleado.nombres}" /> />
				</div>
				<div>
					<label>Apellidos</label> <input class="form-control" type="text"
						name="apellidos" value=<c:out value="${empleado.apellidos}" /> />
				</div>
				<div>
					<label>Id departamento</label> <input class="form-control"
						type="text" name="departamento_id"
						value=<c:out value="${empleado.id_departamento}" /> />
				</div>
				<div>
					<label>Direccion</label> <input class="form-control" type="text"
						name="direccion" value=<c:out value="${empleado.direccion}" /> />
				</div>
				<div>
					<label>Correo electronico</label> <input class="form-control"
						type="text" name="correo_electronico"
						value=<c:out value="${empleado.correo_electronico}" /> />
				</div>
				<div>
					<label>Telefono</label> <input class="form-control" type="text"
						name="telefono" value=<c:out value="${empleado.telefono}" /> />
				</div>
				<div>
					<input type="submit" value="Guardar Cambios"
						class="btn btn-primary"> <a class="btn btn-primary"
						href="EmpleadoServletController?action=regresar">Regresar</a>
				</div>
			</form>
		</div>
	</div>

</body>
</html>