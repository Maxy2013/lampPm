<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="./js/jquery/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="./js/content/lamp-menu.js"></script>
<script type="text/javascript" src="./js/content/data-handle.js"></script>
<meta charset="UTF-8">
<style type="text/css">
* {
	padding: 0;
	margin: auto;
}

.menu-bar {
	height: 30px;
	font-size: 25px;
	margin: 0;
	padding: 0;
}

.menu-bar li {
	float: left;
	list-style: none;
	margin-left: 30px;
	margin-top: 5px;
	cursor: pointer;
}

.menu-name {
	background-color: red;
}

#company, #roads, #lamp, #material {
	height: 80%;
	width: 80%;
	background-color: buttonhighlight;
}

.data-table {
	border: 1px solid blue;
}
</style>
<title>路灯管理系统</title>
</head>
<body style="background-color: white;">
	<h1 align="center" style="background-color: red;">欢迎登录路灯管理系统</h1>
	<div align="center"
		style="width: 100%; height: 580px; background-color: lime;">
		<div style="width: 80%; height: 50px; background-color: yellow;">
			<ul class="menu-bar">
				<li class="menu-name" onclick="queryRoads()">道路信息</li>
				<li class="menu-name" onclick="queryLamp()">路灯信息</li>
				<li class="menu-name" onclick="queryMaterial()">材料信息</li>
				<li class="menu-name" onclick="queryCompany()">公司信息</li>
			</ul>
		</div>
		<div id="roads">
			<div style="display: none;">
				<button onclick="newRoads()">新建路段项目</button>
				<div style="border: 1px solid; width: 60%;">
					<form id="newRoads">
						<table border="1">
							<tr>
								<td>道路名</td>
								<td><input type="text" name="roadName" size="20" /></td>
							</tr>
							<tr>
								<td>道路长度</td>
								<td><input type="text" name="roadName" size="20" /></td>
							</tr>
							<tr>
								<td>所属区域</td>
								<td><input type="text" name="roadName" size="20" /></td>
							</tr>
							<tr>
								<td>需要路灯数量</td>
								<td><input type="text" name="roadName" size="20" /></td>
							</tr>
							<tr>
								<td>开工状态</td>
								<td><input type="text" name="roadName" size="20" /></td>
							</tr>
							<tr>
								<td rowspan="2"><input type="button" value="保存"
									name="roadName" size="20" /></td>
							</tr>
						</table>
					</form>
				</div>
			</div>
			<div>
				<table border="1" cellspacing="0" cellpadding="0" id="roads-tbale" class="data-table">
					<thead align="center">
						<tr>
							<td>序号</td>
							<td>路名</td>
							<td>长度</td>
							<td>所属区域</td>
							<td>所需路灯数量</td>
							<td>开工状态</td>
						</tr>
					</thead>
					<tbody id="roads-tbody" align="center"></tbody>
				</table>
			</div>
		</div>
		<div id="lamp">
			<table border="1" cellspacing="0" cellpadding="0" id="lamp-tbale" class="data-table">
				<thead align="center">
					<tr>
						<td>灯罩</td>
						<td>灯柱</td>
						<td>灯柱</td>
						<td>支撑臂</td>
						<td>螺钉</td>
						<td>创建时间</td>
					</tr>
				</thead>
				<tbody id="lamp-tbody" align="center"></tbody>
			</table>
		</div>
		<div id="material">
			<table border="1" cellspacing="0" cellpadding="0" id="material-tbale" class="data-table">
				<thead align="center">
					<tr>
						<td>材料编号</td>
						<td>名称</td>
						<td>生产厂家</td>
						<td>单价</td>
						<td>计量单位</td>
						<td>创建时间</td>
					</tr>
				</thead>
				<tbody id="material-tbody" align="center"></tbody>
			</table>
		</div>
		<div id="company">
			<table border="1" cellspacing="0" cellpadding="0" id="company-tbale"
				class="data-table">
				<thead align="center">
					<tr>
						<td>编号</td>
						<td>公司编码</td>
						<td>公司名称</td>
						<td>地址</td>
						<td>创建时间</td>
						<td>修改时间</td>
					</tr>
				</thead>
				<tbody id="company-tbody" align="center"></tbody>
			</table>
		</div>
	</div>
</body>
</html>