<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<jsp:useBean id="name" class="tp1.FormNom" scope="request"/>
Nom: <c:out value="${name.nom}" default=""/>
