$(function() {

	
	//tire-reg 이미지 등록 
	var fileTarget1 = $('.filebox1 .upload-hidden1');
	fileTarget1.on('change', function(){
		if(window.FileReader){
			var filename1 = $(this)[0].files[0].name;
		}else {
			var filename1 = $(this).val().split('/').pop().split('\\').pop();	
		}
		$(this).siblings('.upload-name1').val(filename1);
	});
	
	var fileTarget2 = $('.filebox2 .upload-hidden2');
	fileTarget2.on('change', function(){
		if(window.FileReader){
			var filename2 = $(this)[0].files[0].name;
		}else {
			var filename2 = $(this).val().split('/').pop().split('\\').pop();	
		}
		$(this).siblings('.upload-name2').val(filename2);
	});
	

})



//타이어 그룹 삭제
function tireDelete(tireID) {
	var ok = confirm("정말 삭제하시겠습니까?");
	if (ok) {
		location.href = "admin.tireGroup.delete.go?tg_id="+tireID;
	}
}

//타이어브랜드 삭제
function tireBrandDelete(name) {
	var ok = confirm("정말 삭제하시겠습니까?");
	if (ok) {
		location.href = "admin.tire.brand.delete.go?tb_name="+name;
	}
}