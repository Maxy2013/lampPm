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
<body style="background-image: url(./img/welcome-background.jpg);">
	<h1 align="center" style="margin-top: 18px; margin-bottom: 5px;">欢迎登录路灯管理系统</h1>
	<div align="center"	style="width: 100%; height: 580px;">
		<div style="width: 80%; height: 50px;">
			<ul class="menu-bar">
				<li class="menu-name" onclick="queryRoads(this)" id="id-query-roads">道路信息</li>
				<li class="menu-name" onclick="queryLamp(this)" id="id-query-lamp">路灯信息</li>
				<li class="menu-name" onclick="queryMaterial(this)" id="id-query-material">材料信息</li>
				<li class="menu-name" onclick="queryCompany(this)" id="id-query-company">公司信息</li>
			</ul>
		</div>
		<div id="roads">
			<div style="padding: 10px; padding-left: 90px;" align="left">
				<span>路段名称</span>
				<input type="text" class="search" id="road-name-search-input" placeholder="请输入路段名称"/>
				<input type="button" id="road-name-search" onclick="roadNameSearch()" value="搜索"/>
			</div>
			<table border="1" cellspacing="0" cellpadding="0" id="roads-tbale" class="data-table">
				<thead align="center">
					<tr>
						<td>序号</td>
						<td>路段</td>
						<td>所属区域</td>
						<td>长度</td>
						<td>所需路灯数量</td>
						<td>安装公司</td>
						<td>创建时间</td>
						<td>修改时间</td>
					</tr>
				</thead>
				<tbody id="roads-tbody" align="center"></tbody>
			</table>
		</div>
		<div id="lamp">
			<div style="padding: 10px; padding-left: 90px;" align="left">
				<span>路段名称</span>
				<input type="text" class="search" id="lamp-name-search-input" placeholder="请输入路段名称"/>
				<input type="button" id="lamp-name-search" onclick="lampNameSearch()" value="搜索"/>
			</div>
			<table border="1" cellspacing="0" cellpadding="0" id="lamp-tbale" class="data-table">
				<thead align="center">
					<tr>
						<td>灯罩</td>
						<td>灯柱</td>
						<td>线缆</td>
						<td>支撑臂</td>
						<td>螺钉</td>
						<td>创建时间</td>
					</tr>
				</thead>
				<tbody id="lamp-tbody" align="center"></tbody>
			</table>
		</div>
		<div id="material">
			<div style="padding: 10px; padding-left: 90px;" align="left">
				<span>路段名称</span>
				<input type="text" class="search" id="material-name-search-input" placeholder="请输入路段名称"/>
				<input type="button" id="material-name-search" onclick="materialNameSearch()" value="搜索"/>
			</div>
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
			<div style="padding: 10px; padding-left: 90px;" align="left">
				<span>路段名称</span>
				<input type="text" class="search" id="company-name-search-input" placeholder="请输入路段名称"/>
				<input type="button" id="company-name-search" onclick="companyNameSearch()" value="搜索"/>
			</div>
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