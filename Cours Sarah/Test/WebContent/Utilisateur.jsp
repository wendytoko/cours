<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   import="connexion.Connexion" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String nom = request.getParameter("nom");
out.println(nom);

String prenom = request.getParameter("prenom");
out.println(prenom);
%>


</body>
</html>