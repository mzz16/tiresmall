$("#datepicker" ).datepicker({
    	dateFormat: 'yy/mm/dd'
   });
    
   $("#datepicker1" ).datepicker({
		dateFormat: 'yy/mm/dd'
});


$('.order_modal_go').click(function() {
	$("#product-table").empty();
	const modal_content_td = document.querySelectorAll(".modal_content_td");
	const tire_content_td = $(this).find('.tire_content_td');
	$('#order_modal').show();
	$('#order_modal').css('z-index', '3');
	// 모달 on
	
	$('#updateModal').click(function() {
		
		$("#o_no").val($('#orderNo_M').val());
		$("#o_step").val($(".modal-label:checked").val());

		if (!confirm('수정 하시겠습니까?')) {
			// 취소
		} else {
			$("#update_modal").submit();
		}
		
	})
	
	/* $("body").css("overflow", 'hidden'); */ // 모달 스크롤 기능 view 합친후에 주석제거 요망

	$('#deleteModal').click(function() {
		var odNo = $("#orderNo_M").val();
		if (!confirm('정말 삭제 하시겠습니까?')) {
			// 취소
		} else {
			$.ajax({
				type: "GET",
				url: "delete.order.do",
				data: {o_no:odNo},
				success: function(result) {
					if (result === 1) {
						location.href = "admin.order.go";
					} else {
						console.log("삭제 실패");
					}
				}
			})
			
		}
	})
	
		
	let inputs = $(this).find('input');
	let arr = [];
	$(inputs).each(function (i, input) {
		arr.push($(input).val());
		// modal_content_td[i].innerText = val;
	});

	// console.log(arr);
	modal_content_td[0].innerText = arr[0];
	modal_content_td[1].innerText = arr[9];
	modal_content_td[2].innerText = arr[2];
	modal_content_td[3].innerText = arr[3];
	modal_content_td[4].innerText = arr[10];
	modal_content_td[6].innerText = arr[11];
	modal_content_td[7].innerText = arr[12] + ' ' + arr[13] + ' ' + arr[14];
	modal_content_td[8].innerText = arr[15];
	modal_content_td[9].innerText = arr[16];
	modal_content_td[10].innerText = arr[18];
	modal_content_td[12].innerText = arr[17];
	modal_content_td[13].innerText = arr[7];
	modal_content_td[14].innerText = arr[8];
	modal_content_td[15].innerText = arr[5];
	
	/*	if(arr[5]!=''){
		modal_content_td[16].innerText = '직영점 방문 예약일입니다. 상품을 준비하고 주문자에게 해피콜해주세요.';		
	}else {
		modal_content_td[16].innerText =  '';
	}*/
	
	let tire_tr = $(this).find('.tire_content_tr');
	let tire_tr2 = $(tire_tr).clone();
	let content = `<tr>
						<th class="tire_th">종류</th>
						<th class="tire_th">브랜드명</th>
						<th class="tire_th">제품명</th>
						<th class="tire_th">스펙</th>
						<th class="tire_th">주문수량</th>
					</tr>`
		$("#product-table").append(content);
		$("#product-table").append(tire_tr2);
	
	
$('.modal-label').each(function(i, rInput) {
	if(arr[1] == rInput.value){
		$(rInput).attr("checked", "checked");
	}
})

// modal_content_td[15].innerText = arr[1];
	
	
	
	
window.addEventListener("keydown", (e) => {
	if(e.keyCode == 27){
		$("#cancleModal").trigger("click");
	}

});
	
	
})

$("#cancleModal").click(function() {
	$('#order_modal').hide();
	// 모달 off
	$("body").css("overflow", 'auto');

});