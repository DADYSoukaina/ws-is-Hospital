<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- 	<table> -->
	<%-- 		<c:forEach var="patient" items="${firstName}"> --%>
	<!-- 			<tr> -->
	<%-- 				<td>${patient}</td> --%>
	<%-- 				<td>${patient.getLastName}</td> --%>
	<%-- 				<td>${patient.getPhone}</td> --%>
	<%-- 				<td>${patient.getAddress}</td> --%>

	<!-- 			</tr> -->

	<!-- 			 -->
	<%-- 		</c:forEach> --%>
	<!-- 	</table> -->

	<h1>List of patients</h1>

	<table border="1">
		<thead>
			<tr>
				<th>First name</th>
				<th>Last name</th>
				<th>Phone</th>
				<th>Address</th>
			</tr>

		</thead>
		<tbody>
			<c:forEach items="${listPatient}" var="patient">
				<tr>
					<td><c:out value="${patient.get(0).getFirstName()}" /></td>
					<td><c:out value="${patient.get(1)}" /></td>
					<td><c:out value="${patient.get(2)}" /></td>
					<td><c:out value="${patient.get(3)}" /></td>

				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>