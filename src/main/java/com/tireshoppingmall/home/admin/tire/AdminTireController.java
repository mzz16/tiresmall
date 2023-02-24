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
	
	//admin.tire.brand.go
	@RequestMapping(value = "/admin.tire.brand.go", method = RequestMethod.GET)
	public String tireBrandGo(HttpServletRequest req) {
		req.setAttribute("subMenuPage", "tire/tire_subMenu.jsp");
		req.setAttribute("contentPage", "tire/tire_brand.jsp");
		return "admin/master";
	}
	
	//admin.tire.discount.go
	@RequestMapping(value = "/admin.tire.discount.go", method = RequestMethod.GET)
	public String tireDiscountGo(HttpServletRequest req) {
		req.setAttribute("subMenuPage", "tire/tire_subMenu.jsp");
		req.setAttribute("contentPage", "tire/tire_discount.jsp");
		return "admin/master";
	}
	
	//admin.tire.charicteristic.go
	@RequestMapping(value = "/admin.tire.charicteristic.go", method = RequestMethod.GET)
	public String tireCharicteristicGo(HttpServletRequest req) {
		req.setAttribute("subMenuPage", "tire/tire_subMenu.jsp");
		req.setAttribute("contentPage", "tire/tire_charicteristic.jsp");
		return "admin/master";
	}
	
	
}
