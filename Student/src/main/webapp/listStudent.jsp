<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Student</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Danh Sách Sinh Viên</h1>
		<a class="btn btn-sm btn-success" href="insertStudent.jsp">Thêm
			mới</a> <br> <br>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>id</th>
					<th>Tên</th>
					<th>Trạng Thái</th>
					<th>Giới Tính</th>
					<th>Ngày Sinh</th>
					<th>Chức Năng</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list }" var="s">
					<tr>
						<td>${s.id }</td>
						<td>${s.name }</td>
						<td><c:choose>
								<c:when test="${p.status == 0}">
									<span class="label label-danger">Ẩn </span>
								</c:when>
								<c:otherwise>
									<span class="label label-success">Hiện</span>
								</c:otherwise>
							</c:choose></td>
						<td><c:choose>
								<c:when test="${p.bit == true}">
									<span class="label label-danger">Name </span>
								</c:when>
								<c:otherwise>
									<span class="label label-success">Nữ</span>
								</c:otherwise>
							</c:choose></td>
						<td><fmt:formatDate pattern="dd-mm-yyyy"
								value="${s.birthday}" /></td>
						<td><a class="btn btn-sm btn-danger" onclick="return confirm('Bạn có muốn xóa không ?')"
							href="DeleteStudent?id=${s.id }">Xóa </a> <a
							class="btn btn-sm btn-success" href="DeleteStudent?id=${s.id }">Sửa
						</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>