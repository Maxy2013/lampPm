function queryRoads(){
	
	var roads = $("#roads");
	$.ajax({
		url : "/lampPm/queryRoads",// http://localhost:8080
		type : "get",
		dataType : "json",
		success : function(data) {
			var content = "<table border='1'>";
			$.each(data, function(i){
				var item = data[i];
				var row = "<tr><td>"+item.name+"</td><td>"+item.legth+"</td><td>"+item.area+"</td><td>"+item.lampNum+"</td><td>"+item.status+"</td></tr>"
				content += row;
			});
			content += "</table>";
			roads.html(content);
		}
	});
}