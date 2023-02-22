package com.tireshoppingmall.home.admin.car;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminCarController {

	
	//admin.car.go
	@RequestMapping(value = "/admin.car.go", method = RequestMethod.GET)
	public String carGo(HttpServletRequest req) {
		
		req.setAttribute("contentPage", "car/car.jsp");
		return "admin/master";
	}
	
	
	
}
