package com.tireshoppingmall.home.admin.board;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminBoardController {

	
	
	//admin.comunity.go
	@RequestMapping(value = "admin.comunity.go", method = RequestMethod.GET)
	public String comunityGo(HttpServletRequest req) {
		
		req.setAttribute("contentPage", "comunity.jsp");
		return "admin/master";
	}
}
