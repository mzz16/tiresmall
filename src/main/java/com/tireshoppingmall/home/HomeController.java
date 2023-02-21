package com.tireshoppingmall.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		return "index";
		
	}
	
	//shopmall.go			(마스터에서 홈페이지로 가는것)
	@RequestMapping(value = "admin.shopmall.go", method = RequestMethod.GET)
	public String shopMallGO() {

			return "index";
	}
	
}
