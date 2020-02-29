function roadNameSearch(){
	var searchInput = $('#road-name-search-input').val();
	var roadsBody = $("#roads-tbody");
	$.ajax({
		url : "/lampPm/queryRoadWithRoadSection",// http://localhost:8080
		type : "get",
		data : {"roadSection":searchInput},
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
				"<td>"+item.installCompany+"</td>" +
				"<td style='width: 100px;'>"+dateFormat(item.createdTime)+"</td>" +
				"<td style='width: 100px;'>"+dateFormat(item.modifiedTime)+"</td></tr>";
				content += row;
			});
			roadsBody.html(content);
		}
	});
}

function lampNameSearch(){
	var searchInput = $('#lamp-name-search-input').val();
	var roadsBody = $("#lamp-tbody");
	$.ajax({
		url : "/lampPm/queryStreetlightWithLampWick",// http://localhost:8080
		type : "get",
		data : {"lampWick":searchInput},
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
				"<td style='width: 100px;'>"+dateFormat(item.modifiedTime)+"</td></tr>";
				content += row;
			});
			roadsBody.html(content);
		}
	});
}



function materialNameSearch(){
	var searchInput = $('#material-name-search-input').val();
	var roadsBody = $("#material-tbody");
	$.ajax({
		url : "/lampPm/queryMaterialWithMaterialNumber",// http://localhost:8080
		type : "get",
		data : {"materialNumber": searchInput},
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
				"<td style='width: 120px;'>"+dateFormat(item.modifiedTime)+"</td></tr>";
				content += row;
			});
			roadsBody.html(content);
		}
	});
}

function companyNameSearch(){
	var searchInput = $('#company-name-search-input').val();
	var roadsBody = $("#company-tbody");
	$.ajax({
		url : "/lampPm/queryCompanyWithCompanyUnicode",// http://localhost:8080
		type : "get",
		data : {'companyUnicode':searchInput},
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
				"<td style='width: 100px;'>"+dateFormat(item.modifiedTime)+"</td></tr>";
				content += row;
			});
			roadsBody.html(content);
		}
	});
}

function lampNameAdd(){
	$("#lamp-form").css('display', 'block');
	$("#lamp-tbale").css('display', 'none');
	$("#wick").val("");
	$("#shape").val("");
	$("#wire").val("");
	$("#support-arm").val("");
	$("#screw").val("");
}

function saveLamp(){
	$("#lamp-tbale").css('display', 'inline-block');
	$("#lamp-form").css('display', 'none');
	var wick = $("#wick").val();//灯罩
	var shape = $("#shape").val();//灯柱
	var wire = $("#wire").val();//线缆
	var supportArm = $("#support-arm").val();//支撑臂
	var screw = $("#screw").val();//螺钉
	$.ajax({
		url : "/lampPm/saveLamp",// http://localhost:8080
		type : "get",
		data : {
			'wick':wick,
			'shape':shape,
			'wire':wire,
			'supportArm':supportArm,
			'screw':screw
			},
		dataType : "text",
		success : function(data) {
			if(data > 0){
				alert("保存成功！");
				lampNameSearch();
			}else{
				alert("保存失败！");
			}
		}
	});
}

function backLamp(){
	$("#lamp-tbale").css('display', 'inline-block');
	$("#lamp-form").css('display', 'none');
}