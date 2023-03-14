package com.tireshoppingmall.home.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SearchController {
	
	@Autowired
	private SearchDAO sDAO;
	
	
	@ResponseBody
	@RequestMapping(value="/getTires.json", produces="application/json; charset=utf-8" )
	public Tires getTiresJSON(Tire tire) {
		return sDAO.getTiresJson(tire);
		
		
	}
	
}
