<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<jsp:useBean id="personne" class="tp1.Personne" scope="request"/>
<c:out value="${personne.getNom()}" default=""/>
<c:out value="${personne.getPrenom()}" default=""/>
<c:out value="${personne.getAge()}" default=""/>
<a href="formBean.html">Retour</a>