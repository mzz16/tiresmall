
function updateNotice(id,sortation,title,txt,date) {
	$('#notice_modal').show();
	$("body").css("overflow", 'hidden');
	$("#n_id").val(id);
	$("#n_title").val(title);
	$("#n_sortation").val(sortation);
	$("#n_txt").val(txt);
	$("#n_date").val(date);
	$("#reg_modal").attr("action", "update.notice.do");
}

function deleteNotice(id) {
	let ok = confirm('공지사항을 삭제 하시겠습니까?')
	
	if (ok) {
		location.href='delete.notice.do?n_id='+id;
	}else {
		location.href='admin.notice.go';
	}
	
	
}

$('#notice_reg_modal').click(function() {
	
	$('#notice_modal').show();
	$("#n_id").val('');
	$("#n_title").val('');
	$("#n_sortation").val('');
	$("#n_txt").val('');
	$("#n_date").val('');
	//모달 on
	$("body").css("overflow", 'hidden');
	
})

$("#cancleModal").click(function() {
	$('#notice_modal').hide();
	// 모달 off
	$("body").css("overflow", 'auto');
	
});


