<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Experte en Chimie pour les nanosciences et l'Energie, je suis actuellement � la recherche d'un m�tier porteur
de sens et surtout d'avenir. En voie pour int�grer le monde du num�rique afin d'�tre actrice de cette nouvelle
r�volution digitale.
<%="Eh ouais j'ai de la classe !" %></p>

<%@ include file= "cacahuete.jsp" %>
<%@ include file= "footer.jsp" %>

<% 
           
String name = request.getParameter("name");
            out.println(name);
            %>
<c:if test="${name==null}">
<p>mon 1er test jstl</p>

</c:if>

</body> 
</html>