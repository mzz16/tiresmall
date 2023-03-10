package com.tireshoppingmall.home.admin.order;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.tireshoppingmall.home.admin.board.SearchDTO;
import com.tireshoppingmall.home.admin.AdminMenuSession;

@Controller
public class AdminOrderController {
	
	private boolean orderFirstReq;
	
	@Autowired
	private OrderDAO oDAO;
	
	public AdminOrderController() {
		orderFirstReq = true;
	}
	
	//admin.order.go
	@RequestMapping(value = "/admin.order.go", method = RequestMethod.GET)
	public String orderGo(AdminMenuSession menuSession, HttpServletRequest req) {
		if(orderFirstReq) {
			oDAO.calcAllOrderCount();
			orderFirstReq = false;
		}
		OrderSearchDTO.clearsearch(req);
		oDAO.getOrder(1, req);
		oDAO.menuSession(menuSession,req);
		req.setAttribute("contentPage", "order/order.jsp");
		return "admin/master";
	}
	
	@RequestMapping(value = "/search.order.do", method = RequestMethod.GET)
	public String search(HttpServletRequest req, OrderSearchDTO osDTO) {
		
		oDAO.searchOrder(osDTO, req);
		oDAO.getOrder(1, req);
		req.setAttribute("contentPage", "order/order.jsp");
		return "admin/master";
	}
	
}
