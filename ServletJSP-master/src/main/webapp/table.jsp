<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
	<jsp:useBean id="liste" class="java.util.ArrayList" scope="session" />
	
	<table>
		<tr>
			<th>Nom</th>
			<th>Prenom</th>
			<th>Age</th>
		</tr>

		<c:forEach var="i" begin="0" end="${liste.size()-1}" step="1">
			<tr>
				<th><c:out value="${liste[i].getNom()}"/></th>
				<th><c:out value="${liste[i].getPrenom()}"/></th>
				<th><c:out value="${liste[i].getAge()}"/></th>
			</tr>
			<c:set var="cpt" value="${i}"/>
		</c:forEach>
				
	</table>
	
	<br/>
	<br/>
	
	<div>
		Nombre de personne :
		<c:out value="${cpt}"/>
	</div>