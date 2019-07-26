window.onload = function(){
	var show = document.getElementById("signal-center");
	setInterval(function(){
		var time = new Date();
		var m = time.getMonth()+1;
		var t = time.getHours()+":"
		    +time.getMinutes()+":"+time.getSeconds();
			show.innerHTML=t;
	},10);
	
};