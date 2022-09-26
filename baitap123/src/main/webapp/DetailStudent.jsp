<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
	<tr>
		<th>ID</th>
		<td>${s.stuId}</td>
	</tr>
	<tr>
		<th>Name</th>
		<td>${s.fullName }</td>
	</tr>
	<tr>
		<th>Gender</th>
		<td>${s.gender?"Male":"Female" }</td>
	</tr>
	<tr>
		<th>Gender</th>
		<td><fmt:formatDate value="${s.birthday }"
							pattern="dd/MM/yyyy" /></td>
	<tr>
		<th>Address</th>
		<td>${s.address }</td>
	</tr>
	<tr>
		<th>Class Name</th>
		<td>${s.className }</td>
	</tr>
	<tr>
		<th>ScholarShip</th>
		<td><fmt:formatNumber value="${s.scholarShip }" /></td>
	</tr>
	</table>
</body>
</html>