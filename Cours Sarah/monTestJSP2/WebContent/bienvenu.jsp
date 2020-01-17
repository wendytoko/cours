<%@page import="Modele.Personne"%>
<%@page import="service.PersonneService"%>
<%@page import="javax.security.auth.kerberos.ServicePermission"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  import="Connection.MyConnection,java.sql.PreparedStatement,java.sql.SQLException,java.sql.ResultSet" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

PersonneService service=new PersonneService();


Personne p=new Personne(request.getParameter("nom"),request.getParameter("prenom"));
Personne PersonneAffichage=service.afficherPersonne(p);

%>
<h1>Bienvenu</h1>
<h1><%=PersonneAffichage.getNom()%></h1> 
<h1> <%=PersonneAffichage.getPrenom() %> </h1>
</body>
</html>