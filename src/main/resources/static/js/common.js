var basicPath = "http://localhost:8081/che168_admin"

function GetRequest() {
	var url = location.search; //获取url中"?"符后的字串(get方式)
	var theRequest = new Object();
	if(url.indexOf("?") != -1) {
		var str = url.substr(1);
		strs = str.split("&");
		for(var i = 0; i < strs.length; i++) {
			theRequest[strs[i].split("=")[0]] = /*unescape*/ decodeURI(strs[i].split("=")[1]);
		}
	}
	return theRequest;
}

// var 参数1,参数2,参数3,参数N;
// 参数1 = Request['参数1'];
// 参数2 = Request['参数2'];
// 参数3 = Request['参数3'];
// 参数N = Request['参数N'];