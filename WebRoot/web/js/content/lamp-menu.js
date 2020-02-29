$(function(){
	$("#lamp,#roads,#material,#company,#lamp-form").css('display', 'none');
});

function queryRoads(obj){
	//切换菜单
	switchMenu(obj);
	var roads = $("#roads");
	var roadsBody = $("#roads-tbody");
	switchDisplay(roads);
	$.ajax({
		url : "/lampPm/queryRoads",// http://localhost:8080
		type : "get",
		dataType : "json",
		success : function(data) {
			var content = "";
			$.each(data, function(i){
				var item = data[i];
				var row = "<tr class = 'data-tbody'><td>"+(i+1)+"</td>" +
						"<td style='width: 100px;'>"+item.roadSection+"</td>" +
						"<td style='width: 100px;'>"+item.area+"</td>" +
						"<td style='width: 100px;'>"+item.length+"</td>" +
						"<td style='width: 100px;'>"+item.needLightNumber+"</td>" +
						"<td>"+item.installCompany+"</td>"+
						"<td style='width: 100px;'>"+dateFormat(item.createdTime)+"</td>"+
						"<td style='width: 100px;'>"+dateFormat(item.modifiedTime)+"</td></tr>"
				content += row;
			});
			roadsBody.html(content);
		}
	});
}

function switchDisplay(domId){
	$("#lamp,#roads,#material,#company").css('display', 'none');
	domId.css('display', 'block');
}

function queryLamp(obj){
	//切换菜单
	switchMenu(obj);
	var lamp = $("#lamp");
	var lampBody = $("#lamp-tbody");
	switchDisplay(lamp);
	$.ajax({
		url : "/lampPm/queryLamp",// http://localhost:8080
		type : "get",
		dataType : "json",
		success : function(data) {
			var content = "";
			$.each(data, function(i){
				var item = data[i];
				var row = "<tr class = 'data-tbody'><td style='width: 100px;'>"+item.lampWick+"</td>" +
						"<td style='width: 100px;'>"+item.lampshade+"</td>" +
						"<td style='width: 100px;'>"+item.wire+"</td>" +
						"<td style='width: 150px;'>"+item.supportingArm+"</td>" +
						"<td style='width: 100px;'>"+item.screw+"</td>" +
						"<td style='width: 100px;'>"+dateFormat(item.createdTime)+"</td>" +
						"<td style='width: 100px;'>"+dateFormat(item.modifiedTime)+"</td></tr>"
				content += row;
			});
			lampBody.html(content);
		}
	});
}

function queryMaterial(obj){
	//切换菜单
	switchMenu(obj);
	var material = $("#material");
	var materialBody = $("#material-tbody");
	switchDisplay(material);
	$.ajax({
		url : "/lampPm/queryMaterial",// http://localhost:8080
		type : "get",
		dataType : "json",
		success : function(data) {
			var content = "";
			$.each(data, function(i){
				var item = data[i];
				var row = "<tr class = 'data-tbody'><td>"+item.materialNumber+"</td>" +
						"<td style='width: 100px;'>"+item.name+"</td>" +
						"<td>"+item.factory+"</td>" +
						"<td style='width: 80px;'>"+item.price+"</td>" +
						"<td style='width: 80px;'>"+item.unitOfMeasurement+"</td>" +
						"<td style='width: 120px;'>"+dateFormat(item.createdTime)+"</td>"+
						"<td style='width: 120px;'>"+dateFormat(item.modifiedTime)+"</td></tr>"
				content += row;
			});
			materialBody.html(content);
		}
	});
}

function queryCompany(obj){
	//切换菜单
	switchMenu(obj);
	var company = $("#company");
	switchDisplay(company);
	var companyBody = $("#company-tbody");
	$.ajax({
		url : "/lampPm/queryCompany",// http://localhost:8080
		type : "get",
		dataType : "json",
		success : function(data) {
			var content = "";
			$.each(data, function(i){
				var item = data[i];
				var row = "<tr class = 'data-tbody'><td>"+item.id+"</td>" +
						"<td style='width: 100px;'>"+item.companyUnicode+"</td>" +
						"<td>"+item.companyName+"</td>" +
						"<td>"+item.address+"</td>" +
						"<td style='width: 100px;'>"+dateFormat(item.createdTime)+"</td>" +
						"<td style='width: 100px;'>"+dateFormat(item.modifiedTime)+"</td></tr>"
				content += row;
			});
			companyBody.html(content);
		}
	});
}

/**
 * 转换时间
 * @param time 毫秒数
 * @returns yyyy-MM-dd hh:mm:ss
 */
function timeFormat(time){
	var dateee = new Date(time);
	var date = new Date(+new Date(dateee) + 8 * 3600 * 1000).toISOString().replace(/T/g, ' ').replace(/\.[\d]{3}Z/, '');
	return date;
}

/**
 * 转换日期
 * @param time 时间戳
 * @returns yyyy-MM-dd
 */
function dateFormat(time) {
	var date = new Date(time);
	var y = date.getFullYear();
	var m = date.getMonth() + 1;
	var d = date.getDate();
	var H = date.getHours();
	var M = date.getMinutes();
	var S = date.getSeconds();
	function Covering(num) {
		return num >= 10 ? num : '0' + num;
	}
	return y + '-' + Covering(m) + '-' + Covering(d);// + ' ' + Covering(H) + ':'+ Covering(M) + ':' + Covering(S)
}

function switchMenu(obj){
	var className = obj.className;
	var id = obj.id;
	$("."+className).css('color', 'black');
	$("#"+id).css('color', '#fff');
	$(".search").val("");
}