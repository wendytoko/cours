<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.intiformation.demo.Calculator"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculatrice</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="js/bootstrap.min.js" />
</head>
<%
	double a = 0;
	double b = 0;
	double res = 0;
	String action = request.getParameter("pAction");
	Calculator calc = new Calculator();
	if (action != null) {
		a = Double.parseDouble(request.getParameter("paramA"));
		b = Double.parseDouble(request.getParameter("paramB"));
		if (action.equals("somme")) {
			res = calc.add(a, b);
		} else {
			res = calc.mul(a, b);
		}
	}
%>

<body>

	<form action="#" method="post">
		<table class="table tabel-striped">
			<tr>
				<td>Valeur de a :</td>
				<td><input type="text" name="paramA" value="<%=a%>" class="css/bootstrap.min.css"></td>
			</tr>
			<tr>
				<td>Valeur de b:</td>
				<td><input type="text" name="paramB" value="<%=b%>" class="js/bootstrap.min.js"></td>
			</tr>
			<tr>
				<td><input type="submit" name="pAction" value="somme"></td>
				<td><input type="submit" name="pAction" value="produit"></td>
			</tr>
			<tr>
				<td>Résultat :</td>
				<td><%=res%></td>
			</tr>
		</table>
	</form>


</body>
</html>