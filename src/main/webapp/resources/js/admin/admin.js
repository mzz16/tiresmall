$(function() {
	let sub = $('#whatMenu').val();
	if(sub == 'order'){
		subMenu()
		$("#subMenu").css("display","none");
		$("#adminContent").css("margin-top","90px");		
	}else if(sub == 'tire'){
		subMenu()
		$("#subMenu").css("display","fiex");
		$("#adminContent").css("margin-top","140px");
	}else if(sub == 'car'){
		subMenu()
		$("#subMenu").css("display","fiex");
		$("#adminContent").css("margin-top","140px");
	}else if(sub == 'auth'){
		subMenu()
		$("#subMenu").css("display","none");
		$("#adminContent").css("margin-top","90px");
	}else if(sub == 'store'){
		subMenu()
		$("#subMenu").css("display","none");
		$("#adminContent").css("margin-top","90px");
	}else if(sub == 'notice'){
		subMenu()
		$("#subMenu").css("display","fiex");
		$("#adminContent").css("margin-top","140px");
	}
});


function subMenu() {
	$("#menuTitle").css("border-top-left-radius","20px");
	$("#menuTitle").css("border-top-right-radius","20px");
	$("#menuTitle").css("border-color","white");
	
	
}


