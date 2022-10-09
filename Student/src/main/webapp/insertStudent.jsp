<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">

		<div class="alert alert-danger">
			<button type="button" class="close" data-dismiss="alert"
				aria-hidden="true">&times;</button>
			<strong>${err}</strong> 
		</div>
		<form action="InsertStudent" method="POST" role="form">
			<div class="form-group">
				<label for="">ID :</label> <input type="text" class="form-control"
					id="" name="id" required="required" placeholder="Input field">
			</div>
			<div class="form-group">
				<label for="">Tên :</label> <input type="text" class="form-control"
					id=""  name="name" required="required"
					placeholder="Input field">
			</div>
			<div class="form-group">
				<label for="">Trạng Thái :</label>
				<div class="radio">
					<label> <input type="radio" name="status" id="input"
						value="1"> Hiển Thị <input type="radio" name="status"
						id="input" value="0"> Tạm Ẩn
					</label>
				</div>
			</div>
			<div class="form-group">
				<label for="">Ngày Sinh :</label> <input type="date"
					class="form-control" id="" name="brithday"
					required="required" placeholder="Input field">
			</div>
			<div class="form-group">
				<label for="">Giớ Tính :</label>
				<div class="radio">
					<label> <input type="radio" name="sex" id="input"
						value="true"> Nam <input type="radio" name="sex"
						id="input" value="false"> Nữ
					</label>
				</div>
			</div>


			<button type="submit" class="btn btn-primary">Thêm mới</button>
		</form>
	</div>

</body>
</html>