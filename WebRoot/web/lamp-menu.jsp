<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="./js/jquery/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="./js/content/lamp-menu.js"></script>
<meta charset="UTF-8">
<style type="text/css">
	*{
		padding:0;
		margin: auto;
	}
	.menu-bar{
		height: 30px;
		font-size: 25px;
		margin:0;
		padding:0;
	}
	.menu-bar li{
		float: left;
		list-style:none;
		margin-left: 30px;
		margin-top: 5px;
		cursor: pointer;
	}
	.menu-name{
		background-color: red;
	}
	#company,#roads,#lamp,#material{
		height: 50px;
		border: 1px;
		border-color: red;
	}
</style>
<title>路灯管理系统</title>
</head>
<body style="background-color: white;">
	<h1 align="center" style="background-color: red;">欢迎登录路灯管理系统</h1>
	<div align="center" style="width: 100%; height: 580px; background-color: lime;">
		<div style="width: 80%; height: 50px; background-color: yellow;">
			<ul class="menu-bar">
				<li class="menu-name" onclick="queryRoads()">道路信息</li>
				<li class="menu-name">路灯信息</li>
				<li class="menu-name">材料信息</li>
				<li class="menu-name">公司信息</li>
			</ul>
		</div>
		<div id="roads">
					
		</div>
		<!-- <div id="lamp">
				lamp			
		</div>
		<div id="material">
				material			
		</div>
		<div id="company">
				company			
		</div> -->
	</div>
</body>
</html>