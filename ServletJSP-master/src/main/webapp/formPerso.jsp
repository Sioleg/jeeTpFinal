<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
	<jsp:useBean id="nbRestant" class="Integer" scope="session" />
	
	<c:choose>
    <c:when test="${nbRestant}<'1'">
        <form action="table" method="post">
    </c:when>    
    <c:otherwise>
        <form action="formPerso" method="post">
    </c:otherwise>
	</c:choose>
	
		<input type="text" name="nom">
		<input type="text" name="prenom">
		<input type="number" name="age">
		<input type="submit">
	</form>