function setBoardEventModalCookie(name, value, expiredays) { 
	var todayDate = new Date(); 
	todayDate.setDate(todayDate.getDate() + expiredays);
	document.cookie = name + "=" + escape(value) + "; path=/; expires=" + todayDate.toGMTString() + ";"
}

function clickToSetBoardEventModalCookie() { 
	setBoardEventModalCookie("boardEventModalCookie", "done" , 1);	// 쿠키명 , 쿠키값 , 기간(1=>하루)
}

if (document.cookie.indexOf("boardEventModalCookie=done") < 0){ 
	const dialog = document.querySelector(".board_event_modal_dialog");
	dialog.showModal();
}