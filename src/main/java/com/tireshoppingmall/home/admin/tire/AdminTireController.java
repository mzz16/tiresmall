package com.tireshoppingmall.home.admin.tire;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminTireController {
	
	//admin.tire.go
	@RequestMapping(value = "/admin.tire.go", method = RequestMethod.GET)
	public String tireGo(HttpServletRequest req) {
		req.setAttribute("subMenuPage", "tire/tire_subMenu.jsp");
		req.setAttribute("contentPage", "tire/tire.jsp");
		return "admin/master";
	}
	
	
	
	
	
}
