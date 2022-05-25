<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Calculadora</h1>
	<form action="#" method="get">
		<div>
			<label>Nemero_1</label>
			<input type="text" name="n1">
		</div>
		<div>
			<label>Nemero_2</label>
			<input type="text" name="n2">
		</div>
		<div>
			<label>Nemero_3</label>
			<input type="text" name="n3">
		</div>
		<div>
			<label>Nemero_4</label>
			<input type="text" name="n4">
		</div>
		<input type="submit" name="btn" value="=">
	</form>
	<%
		int n1=0;
		int n2=0;
		int n3=0;
		int n4=0;
		int suma=0;
		int resta=0;
		int multiplicacion=0;
		int divicion=0;
		try{
			n1 = Integer.parseInt(request.getParameter("n1"));
			n2 = Integer.parseInt(request.getParameter("n2"));
			n3 = Integer.parseInt(request.getParameter("n3"));
			n4 = Integer.parseInt(request.getParameter("n4"));
			suma = n1 + n2 + n3 + n3;
			resta = n1 - n2 - n3 - n3;
			multiplicacion = n1 * n2 * n3 * n3;
			divicion = n1 / n2 / n3 / n3;
		}catch (Exception e){}
	%>
	<p>La Suma es: <%=suma %></p>
	<p>La Resta es: <%=resta %></p>
	<p>La Multiplicacion es: <%=multiplicacion %></p>
	<p>La Divicion es: <%=divicion %></p>
	
</body>
</html>