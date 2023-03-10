package com.tireshoppingmall.home.admin.tire;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tireshoppingmall.home.admin.AdminMenuSession;

@Controller
public class AdminTireController {
	
	@Autowired
	TireDAO tDAO;
	
	private boolean tireFirstReq;
	private boolean tireBrandFirstReq;
	private boolean tireDiscountRateFirstReq;
	private boolean tireCharacteristicsFirstReq;

	public AdminTireController() {
		tireFirstReq=true;
		tireBrandFirstReq=true;
		tireDiscountRateFirstReq=true;
		tireCharacteristicsFirstReq=true;
	}
	
	
	//admin.tire.go
	@RequestMapping(value = "/admin.tire.go", method = RequestMethod.GET)
	public String tireGo(AdminMenuSession menuSession,HttpServletRequest req) {

		if (tireFirstReq) {
			tDAO.calcAllTireCount();
			tireFirstReq = false;
		}	
		
		tDAO.getAllTireGroup(1,req);
		
		tDAO.menuSession(menuSession, req);
		req.setAttribute("subMenuPage", "tire/tire_subMenu.jsp");
		req.setAttribute("contentPage", "tire/tire.jsp");
		return "admin/master";
	}
	
	//admin.tire.reg
	@RequestMapping(value = "/admin.tire.reg.go", method = RequestMethod.GET)
	public String tireRegGo(HttpServletRequest req) {

		/*tDAO.;*/
		
		req.setAttribute("subMenuPage", "tire/tire_subMenu.jsp");
		req.setAttribute("contentPage", "tire/tire.jsp");
		return "admin/master";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	//admin.tire.brand.go
	@RequestMapping(value = "/admin.tire.brand.go", method = RequestMethod.GET)
	public String tireBrandGo(AdminMenuSession menuSession,HttpServletRequest req) {
		

		if (tireBrandFirstReq) {
			tDAO.calcAllTireCount();
			tireBrandFirstReq = false;
		}	
		
		
		tDAO.menuSession(menuSession, req);
		req.setAttribute("subMenuPage", "tire/tire_subMenu.jsp");
		req.setAttribute("contentPage", "tire/tire_brand.jsp");
		return "admin/master";
	}
	
	//admin.tire.discount.go
	@RequestMapping(value = "/admin.tire.discount.go", method = RequestMethod.GET)
	public String tireDiscountGo(AdminMenuSession menuSession,HttpServletRequest req) {
		
		

		if (tireDiscountRateFirstReq) {
			tDAO.calcAllTireCount();
			tireDiscountRateFirstReq = false;
		}	
		
		tDAO.menuSession(menuSession, req);
		req.setAttribute("subMenuPage", "tire/tire_subMenu.jsp");
		req.setAttribute("contentPage", "tire/tire_discount.jsp");
		return "admin/master";
	}
	
	//admin.tire.charicteristic.go
	@RequestMapping(value = "/admin.tire.charicteristic.go", method = RequestMethod.GET)
	public String tireCharicteristicGo(AdminMenuSession menuSession,HttpServletRequest req) {
		
		

		if (tireCharacteristicsFirstReq) {
			tDAO.calcAllTireCount();
			tireCharacteristicsFirstReq = false;
		}	
		
		tDAO.menuSession(menuSession, req);
		req.setAttribute("subMenuPage", "tire/tire_subMenu.jsp");
		req.setAttribute("contentPage", "tire/tire_charicteristic.jsp");
		return "admin/master";
	}
	
	
}
