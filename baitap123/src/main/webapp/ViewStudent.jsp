<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sach sinh viên</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<style>
.center {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
}
</style>
</head>
<body>
	<div class="center">
		<table border="1">
			<tr>
				<th>StuId</th>
				<th>FullName</th>
				<th>Gender</th>
				<th>Birthday</th>
				<th>Address</th>
				<th>ClassName</th>
				<th>ScholarShip</th>
				<th></th>
			</tr>
			<c:forEach items="${list}" var="s">
				<tr>
					<td>${s.stuId}</td>
					<td>${s.fullName }</td>
					<td>${s.gender?"Male":"Female" }</td>
					<td><fmt:formatDate value="${s.birthday }"
							pattern="dd/MM/yyyy" /></td>
					<td>${s.address }</td>
					<td>${s.className }</td>
					<td><fmt:formatNumber value="${s.scholarShip }" /></td>
					<td><a href="deleteStudent?id=${s.stuId}"
						class="btn btn-sm btn-danger">Xóa</a> <a
						href="DetailStudent?id=${s.stuId}" class="btn btn-sm btn-primary">Chi
							tiet</a>
						<a href="PreUpdateStudent?id=${s.stuId }" class="btn btn-sm btn-success">Sua</a></td>
				</tr>
			</c:forEach>
		</table>
		<a class="btn btn-primary" href="insertStudent.jsp">Thêm mới</a>
	</div>

</body>
</html>