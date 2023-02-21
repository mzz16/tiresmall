package com.tireshoppingmall.home.admin.auth;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminAuthController {

	
	//admin.auth.go
	@RequestMapping(value = "admin.auth.go", method = RequestMethod.GET)
	public String authGo(HttpServletRequest req) {
		
		req.setAttribute("contentPage", "auth.jsp");
		return "admin/master";
	}
}
