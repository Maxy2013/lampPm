function roadNameSearch(){
	var searchInput = $('#road-name-search-input').val();
	if(searchInput.length == 0){
		alert("请输入搜索内容");
		return;
	}
	var roadsBody = $("#roads-tbody");
	$.ajax({
		url : "/lampPm/queryRoads",// http://localhost:8080
		type : "get",
		data : {searchInput},
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
						"<td style='width: 100px;'>"+item.status+"</td>"+
						"<td style='width: 100px;'>未"+searchInput+"知</td>"+
						"<td style='width: 100px;'>未知</td></tr>"
				content += row;
			});
			roadsBody.html(content);
		}
	});
}

function lampNameSearch(){
	var searchInput = $('#lamp-name-search-input').val();
	if(searchInput.length == 0){
		alert("请输入搜索内容");
		return;
	}
	var roadsBody = $("#lamp-tbody");
	$.ajax({
		url : "/lampPm/queryRoads",// http://localhost:8080
		type : "get",
		data : {searchInput},
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
				"<td style='width: 100px;'>"+item.status+"</td>"+
				"<td style='width: 100px;'>未"+searchInput+"知</td>"+
				"<td style='width: 100px;'>未知</td></tr>"
				content += row;
			});
			roadsBody.html(content);
		}
	});
}



function materialNameSearch(){
	var searchInput = $('#material-name-search-input').val();
	if(searchInput.length == 0){
		alert("请输入搜索内容");
		return;
	}
	var roadsBody = $("#material-tbody");
	$.ajax({
		url : "/lampPm/queryRoads",// http://localhost:8080
		type : "get",
		data : {searchInput},
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
				"<td style='width: 100px;'>"+item.status+"</td>"+
				"<td style='width: 100px;'>未"+searchInput+"知</td>"+
				"<td style='width: 100px;'>未知</td></tr>"
				content += row;
			});
			roadsBody.html(content);
		}
	});
}

function companyNameSearch(){
	var searchInput = $('#company-name-search-input').val();
	if(searchInput.length == 0){
		alert("请输入搜索内容");
		return;
	}
	var roadsBody = $("#company-tbody");
	$.ajax({
		url : "/lampPm/queryRoads",// http://localhost:8080
		type : "get",
		data : {searchInput},
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
				"<td style='width: 100px;'>"+item.status+"</td>"+
				"<td style='width: 100px;'>未"+searchInput+"知</td>"+
				"<td style='width: 100px;'>未知</td></tr>"
				content += row;
			});
			roadsBody.html(content);
		}
	});
}