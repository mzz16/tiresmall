package com.tireshoppingmall.home.admin.order;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminOrderController {
	
	//admin.order.go
	@RequestMapping(value = "admin.order.go", method = RequestMethod.GET)
	public String orderGo(HttpServletRequest req) {
		
		req.setAttribute("contentPage", "order.jsp");
		return "admin/master";
	}
	
	
}
