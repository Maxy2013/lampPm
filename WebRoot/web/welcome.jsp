<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>欢迎</title>
<style type="text/css">
	td, tr {
		width: auto;
		height: 30px;
		font-size: 25px;	
	}
	input{
		height: 30px;
		font-size: 15px;
		border-radius: 3px;
	}
	.button{
		color: fuchsia;
		width: 100px;
	}
</style>
</head>
<body style="background: gray;">
	<h1 align="center" style="margin-top: 190px; color: aqua;">Welcome!欢迎来到路灯管理系统</h1>
	<div align="center"
		style="width: 100%; height: 350px;">
		<form action="/lampPm/LoginServlet" method="post">
			<table>
				<tr align="center">
					<td>用户名：</td>
					<td><input type="text" name = "username" placeholder="请输入用户名" /></td>
				</tr>
				<tr></tr>
				<tr align="center">
					<td>密 码 ：</td>
					<td><input type="password" name="password" placeholder="请输入密码" /></td>
				</tr>
				<tr align="center"><td style="font-size: 10px; color: red;">${tips}</td></tr>
				<tr align="center">
					<td colspan="2">
						<input class="button" type="submit" value="登录" />
						<input class="button" type="reset" value="重置" />
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>