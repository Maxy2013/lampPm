$(function(){
	$("#lamp,#roads,#material,#company").css('display', 'none');
});

function queryRoads(){
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
				var row = "<tr><td>"+(i+1)+"</td>" +
						"<td style='width: 100px;'>"+item.name+"</td>" +
						"<td style='width: 100px;'>"+item.legth+"</td>" +
						"<td style='width: 100px;'>"+item.area+"</td>" +
						"<td style='width: 100px;'>"+item.lampNum+"</td>" +
						"<td style='width: 100px;'>"+item.status+"</td></tr>"
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

function queryLamp(){
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
				var row = "<tr><td>"+item.lampWick+"</td><td>"+item.lampshade+"</td><td>"+item.wire+"</td><td>"+item.supportingArm+"</td><td>"+item.screw+"</td><td>"+item.createTime+"</td></tr>"
				content += row;
			});
			lampBody.html(content);
		}
	});
}

function queryMaterial(){
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
				var row = "<tr><td>"+item.materialNumber+"</td>" +
						"<td>"+item.name+"</td>" +
						"<td>"+item.factory+"</td>" +
						"<td>"+item.price+"</td>" +
						"<td>"+item.unitOfMeasurement+"</td>" +
						"<td>"+item.createdTime+"</td></tr>"
				content += row;
			});
			materialBody.html(content);
		}
	});
}

function queryCompany(){
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
				var row = "<tr><td>"+item.id+"</td>" +
						"<td>"+item.companyUnicode+"</td>" +
						"<td>"+item.companyName+"</td>" +
						"<td>"+item.address+"</td>" +
						"<td>"+item.createdTime+"</td>" +
						"<td>"+item.modifiedTime+"</td></tr>"
				content += row;
			});
			companyBody.html(content);
		}
	});
}