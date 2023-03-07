$(function(){
	let curPage = $('#product_curPage').val();
	let pageCount = $('#product_pageCount').val();
	let n = 0;
	for (var i = 0; i < 10000; i++) {
		if(curPage>3*i && curPage<=3*(i+1)){
			n=i+1;
			break;
		}
	}
	
	$('#product_paging_num').append("<a href='javascript:movePage("+ (3*n-2) +")'>"+ (3*n-2) +"</a>")
	$('#product_paging_num').append("<a href='javascript:movePage("+ (3*n-1) +")'>"+ (3*n-1) +"</a>")
	$('#product_paging_num').append("<a href='javascript:movePage("+ 3*n +")'>"+ 3*n +"</a>")
	$('#product_paging_num').find('a:contains('+curPage+')').addClass('present_page')
	
	for (var i = 2; i >=0; i--) {
		if($('#product_paging_num a:eq('+i+')').text()> pageCount){
			$('#product_paging_num a:eq('+i+')').remove();
		}
	}
	
	
$('.product_item_text').ready(function(){
	$('.product_size_min').text('16');
	$('.product_size_max').text('19');
})
	
	
	
	
})

function movePage(pageNumber){
	location.href=location.href.substring(0,location.href.lastIndexOf('p')+2) + pageNumber
}


