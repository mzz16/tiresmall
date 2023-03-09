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
	
	$('input[name="carType"]').removeAttr("checked");
	if($('input[name="carType"]').eq(0).val()==getParameter('t')){
		$('input[name="carType"]').eq(0).attr("checked","checked");
	}
	if($('input[name="carType"]').eq(1).val()==getParameter('t')){
		$('input[name="carType"]').eq(1).attr("checked","checked");
	}
	
	
	
	
	
	$('input[name="carType"]').click(function(){
		let url = location.href;
		let params = url.substring(url.lastIndexOf('?'))
		url=url.substring(0,url.lastIndexOf('?'))
		if(url.lastIndexOf('type')==-1){
			url+='.type'
		} 
		if(params.lastIndexOf('t=')==-1){
			params+='&t='+ $('input[name="carType"]:checked').val();
			url+=params;
		} else{
			url = location.href.substring(0,location.href.length-1) + $('input[name="carType"]:checked').val()
		}
		location.href=url
	})
	$('input[name="carTypeA"]').click(function getProductJSON(ppppp){
		ppppp=1;
		$.getJSON("product.brand.type.ajax?b="+getParameter('b')+"&p="+ppppp+"&t="+$('input[name="carTypeA"]:checked').val(),function(j){
			console.log(JSON.stringify(j));
			
			const pageCount = j.pageCount;
			const theNumber = j.theNumber;
			const curPage = j.curPage;
			
			$('#product_search span').empty();
			$('#product_search span').text('총 '+theNumber+'개 상품이 검색되었습니다.');
			
			$('#product_container a').remove();
			$.each(j.pGroups, function(i, s){
				$('#product_container').append('<a href="detail.test?item='+ s.tg_id + '"><div class="product_item"><div class="product_item_hidden"></div>'+
						'<div class="product_item_img"><img src="resources/web/main/product/no-tire-image.jpg"></div>'+
						'<div class="product_item_title"><p>'+ s.tg_brand +'</p><p>'+ s.tg_name +'</p></div>'+
						'<div class="product_item_text">'+ s.tg_text +'</div><div class="product_item_size">'+ s.minInch +'인치  ~ '+ s.maxInch +'인치</div>'+
						'<div class="product_item_price"><fmt:formatNumber type="currency">'+s.minPrice+'</fmt:formatNumber> ~ '+
						'<fmt:formatNumber type="currency">'+s.maxPrice+'</fmt:formatNumber></div><div class="product_item_detail"><i class="fa-solid fa-magnifying-glass"></i>상세보기</div></div></a>')
				
			
			})
			$('#product_wrap_paging').empty();
			
			if(curPage!=1){
				$('#product_wrap_paging').append('<div class="product_paging_firstLast"><a href="javascript:movePage(1)">1</a> . . .</div>')
			}
			if(curPage==1){
				$('#product_wrap_paging').append('<div class="product_paging_prevNext" style="color:lightgray">이전</div>')
			} else{
				$('#product_wrap_paging').append('<div class="product_paging_prevNext"><a href="javascript:movePage('+ (curPage-1) +')">이전</a></div>')
			}
			$('#product_wrap_paging').append('<div id="product_paging_num></div>');
			$('#product_paging_num').text('111111');
			if(curPage == pageCount){
				$('#product_wrap_paging').append('<div class="product_paging_prevNext" style="color:lightgray">다음</div>')
			}
			
			if(curPage!=pageCount){
				$('#product_wrap_paging').append('<div class="product_paging_firstLast">. . . <a href="javascript:getProductJSON('+ pageCount +')">'+ pageCount +'</a></div>')
			}
			
			
			
			
			
			
			
			
		})
	})
	
	
	
})

function movePage(pageNumber){
	location.href=location.href.substring(0,location.href.lastIndexOf('p')+2) + pageNumber + location.href.substring(location.href.lastIndexOf('p')+3)
}
function getParameter(param) {
    param = param.replace(/[\[]/, "\\[").replace(/[\]]/, "\\]");
    let regex = new RegExp("[\\?&]" + param + "=([^&#]*)"),
        results = regex.exec(location.search);
    return results === null ? "" : decodeURIComponent(results[1].replace(/\+/g, " "));
}

function getProductJSON(ppppp){
	ppppp=1;
	$.getJSON("product.brand.type.ajax?b="+getParameter('b')+"&p="+ppppp+"&t="+$('input[name="carTypeA"]:checked').val(),function(j){
		console.log(JSON.stringify(j));
		
		const pageCount = j.pageCount;
		const theNumber = j.theNumber;
		const curPage = j.curPage;
		
		$('#product_search span').empty();
		$('#product_search span').text('총 '+theNumber+'개 상품이 검색되었습니다.');
		
		$('#product_container a').remove();
		$.each(j.pGroups, function(i, s){
			$('#product_container').append('<a href="detail.test?item='+ s.tg_id + '"><div class="product_item"><div class="product_item_hidden"></div>'+
					'<div class="product_item_img"><img src="resources/web/main/product/no-tire-image.jpg"></div>'+
					'<div class="product_item_title"><p>'+ s.tg_brand +'</p><p>'+ s.tg_name +'</p></div>'+
					'<div class="product_item_text">'+ s.tg_text +'</div><div class="product_item_size">'+ s.minInch +'인치  ~ '+ s.maxInch +'인치</div>'+
					'<div class="product_item_price"><fmt:formatNumber type="currency">'+s.minPrice+'</fmt:formatNumber> ~ '+
					'<fmt:formatNumber type="currency">'+s.maxPrice+'</fmt:formatNumber></div><div class="product_item_detail"><i class="fa-solid fa-magnifying-glass"></i>상세보기</div></div></a>')
			
		
		})
		$('#product_wrap_paging').empty();
		
		if(curPage!=1){
			$('#product_wrap_paging').append('<div class="product_paging_firstLast"><a href="javascript:movePage(1)">1</a> . . .</div>')
		}
		if(curPage==1){
			$('#product_wrap_paging').append('<div class="product_paging_prevNext" style="color:lightgray">이전</div>')
		} else{
			$('#product_wrap_paging').append('<div class="product_paging_prevNext"><a href="javascript:movePage('+ (curPage-1) +')">이전</a></div>')
		}
		$('#product_wrap_paging').append('<div id="product_paging_num></div>');
		$('#product_paging_num').text('111111');
		if(curPage == pageCount){
			$('#product_wrap_paging').append('<div class="product_paging_prevNext" style="color:lightgray">다음</div>')
		}
		
		if(curPage!=pageCount){
			$('#product_wrap_paging').append('<div class="product_paging_firstLast">. . . <a href="javascript:getProductJSON('+ pageCount +')">'+ pageCount +'</a></div>')
		}
		
		
		
		
		
		
		
		
	})
}
