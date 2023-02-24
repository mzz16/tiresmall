
$(function(){
	
	$("option[value="+location.href.substring(location.href.length-1)+"]").attr("selected","");
	$('#store_info_name').text("| "+$('option:selected').attr('comp_name'));
	$('.store_info_row_content').eq(0).text($('option:selected').attr('comp_address'))
	$('.store_info_row_content').eq(1).text($('option:selected').attr('comp_tel'))
	$('.store_info_row_content').eq(2).text($('option:selected').attr('opentimememo'))
	$('.store_info_row_content').eq(3).text($('option:selected').attr('locmemo'))
//	$('#location_lng').val($('option:selected').attr('lngmemo'));
//	$('#location_lat').val($('option:selected').attr('latmemo'));
	
	
})


window.initMap = function () {
	const latV=parseFloat(document.getElementById('location_lat').value);
	const lngV=parseFloat(document.getElementById('location_lng').value);
	const map = new google.maps.Map(document.getElementById("store_wrap_map"), {
		center: { lat: latV, lng: lngV },
		zoom: 18,
	});
	
	const marker = new google.maps.Marker({
	    position: { lat: latV, lng: lngV },
	    map: map,
	    title: "[직영점]타이어쇼핑몰",
	  });
	
  const contentString =
	    '<div id="content">' +
	    '<div id="siteNotice">' +
	    "</div>" +
	    '<h1 id="firstHeading" class="firstHeading">[직영점]타이어쇼핑몰</h1>' +
	    '<div id="bodyContent">' +
	    "<p>"+ $('option:selected').attr('comp_address') +"</p>" +
	    "</div>" +
	    "</div>";
  
	  const infowindow = new google.maps.InfoWindow({
	    content: contentString,
	    ariaLabel: "Uluru",
	  });
	  
	  infowindow.open({
	      anchor: marker,
	      map,
	    });

	  marker.addListener("click", () => {
	    infowindow.open({
	      anchor: marker,
	      map,
	    });
	  });
	
	
};	





