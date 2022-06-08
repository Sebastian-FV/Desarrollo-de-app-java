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

	<h1 class="">Agregar_Departamento</h1>
       <div class="container">
	       <form class="form-group" action="DepartamentoServletController?action=agregar" method="post" >
		       <label>Codigo_departamento</label>
		       	<input class="form-control" type="text" name="departamento_codigo"/>
		       <label>Nombre_Departamento</label>
		       	<input class="form-control" type="text" name="nombre_departamento"/>
		       <input class="btn btn-primary" type="submit" name="accion" value="Agregar"/>
			       <a class="btn btn-primary" href="EmpleadoServletController?action=regresar">Regresar</a>
			       <a class="btn btn-primary" href="index.jsp">Regresar</a>
	       </form>
       </div>

</body>
</html>