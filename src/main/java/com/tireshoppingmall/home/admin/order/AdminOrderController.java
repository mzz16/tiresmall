package com.tireshoppingmall.home.admin.order;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminOrderController {
	
	@Autowired
	private OrderDAO oDAO;
	
	//admin.order.go
	@RequestMapping(value = "/admin.order.go", method = RequestMethod.GET)
	public String orderGo(HttpServletRequest req) {
		
		oDAO.getOrder(1, req);
		
		req.setAttribute("contentPage", "order/order.jsp");
		return "admin/master";
	}
	
	
}
