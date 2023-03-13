const orderNumber = $('#ordernumber_M')
const orderDate = $('#orderDate_M')
const orderName = $('#orderName_M')
const orderPhone = $('#userPhoneNum_M')
const UserName = $('#userName_M')




$("#datepicker" ).datepicker({
    	dateFormat: 'yy/mm/dd'
   });
    
   $("#datepicker1" ).datepicker({
		dateFormat: 'yy/mm/dd'
});



$('.order_modal_go').click(function() {

	$('#order_modal').show();
	$('#order_modal').css('z-index', '3');
	// 모달 on
	
	$("#update_modal").attr("action", "")
	$("body").css("overflow", 'hidden');

	
	let inputs = $(this).find('input');
	$(inputs).each(function (i, input) {
		let val = $(input).val();
		console.log(val);
	});
	
	
	
	
	
	
	
	
	
	
	
	
	
	
})

$("#cancleModal").click(function() {
	$('#order_modal').hide();
	// 모달 off
	$("body").css("overflow", 'auto');

});