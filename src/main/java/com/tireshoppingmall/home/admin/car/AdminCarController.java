package com.tireshoppingmall.home.admin.car;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tireshoppingmall.home.admin.AdminMenuSession;

@Controller
public class AdminCarController {

	@Autowired
	CarDAO cDAO;
	
	//admin.car.go
	@RequestMapping(value = "/admin.car.go", method = RequestMethod.GET)
	public String carGo(AdminMenuSession menuSession,HttpServletRequest req) {
		
		
		
		cDAO.menuSession(menuSession, req);
		req.setAttribute("subMenuPage", "car/car_subMenu.jsp");
		req.setAttribute("contentPage", "car/car.jsp");
		return "admin/master";
	}
	
	//admin.car.brand.go
	@RequestMapping(value = "/admin.car.brand.go", method = RequestMethod.GET)
	public String carBrandGo(AdminMenuSession menuSession,HttpServletRequest req) {
		
		
		cDAO.menuSession(menuSession, req);
		req.setAttribute("subMenuPage", "car/car_subMenu.jsp");
		req.setAttribute("contentPage", "car/car_brand.jsp");
		return "admin/master";
	}
	
	
}
