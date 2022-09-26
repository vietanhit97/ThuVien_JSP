<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%><%@ page
	language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
		<h3>Thêm Sinh Viên</h3>
		<form action="InsertStudent" method="post">
			<table>
				<tr>
					<td>Tên :</td>
					<td><input type="text" name="name"
						placeholder="nhập tên Sinh viên" required="required"></td>
				</tr>
				<tr>
					<td>Giới Tính :</td>
					<td><input type="radio" name="gender" value="true" />Male <input
						type="radio" name="gender" value="false" />Female</td>
				</tr>
				<tr>
					<td>Ngày - Tháng - Năm sinh :</td>
					<td><input type="date" name="birthday"
						placeholder="nhập tên Sinh viên" required="required"></td>
				</tr>
				<tr>
					<td>Địa Chỉ :</td>
					<td><textarea name="address" required="required"></textarea></td>
				</tr>
				<tr>
					<td>Lớp :</td>
					<td><select name="className">
							<option value="JW2008LM">JW2008LM</option>
							<option value="JW2010LM">JW2010LM</option>
							<option value="JW2002LM">JW2002LM</option>
							<option value="JW2004LM">JW2004LM</option>
							<option value="JW2012LM">JW2012LM</option>
					</select></td>
				</tr>
				<tr>
					<td>Học Bổng :</td>
					<td><input type="text" name="scholarShip"></td>

				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Gửi">
					<input type="reset" value="Hủy"></td>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>