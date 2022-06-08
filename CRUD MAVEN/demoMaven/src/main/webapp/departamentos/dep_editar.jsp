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

<div>
	<h1>Editar_Departamento</h1>
        <div class="container">
        	<c:set var="departamento" value="${departamento}"/>
	        <form class="form-group" action="DepartamentoServletController?action=actualizar" method="post">
		        <div><label>Id</label>
		        	<input class="form-control" type="text" name="id" readonly="readonly"  value=<c:out value="${departamento.id}" /> />
		        </div>
		        <div><label>Codigo_Departamento</label>
		        	<input class="form-control" type="text" name="codigo_departamento" value=<c:out value="${departamento.codigo_departamento}" /> />
		        </div>
		        <div><label>Nombre_Departamento</label>
		        	<input class="form-control" type="text" name="nombre_departamento" value=<c:out value="${departamento.nombre_departamento}" /> />
		        </div>
		        <div>
			        <input type="submit" value="Guardar Cambios" class="btn btn-primary">   
			        <a class="btn btn-primary" href="DepartamentoServletController?action=regresar">Regresar</a>
		        </div>     
	        </form>
        </div>
</div>

</body>
</html>