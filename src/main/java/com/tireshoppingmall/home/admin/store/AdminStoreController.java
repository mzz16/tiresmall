package com.tireshoppingmall.home.admin.store;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminStoreController {

	
	//admin.company.go
	@RequestMapping(value = "admin.company.go", method = RequestMethod.GET)
	public String companyGo(HttpServletRequest req) {
		
		req.setAttribute("contentPage", "company.jsp");
		return "admin/master";
	}
}
