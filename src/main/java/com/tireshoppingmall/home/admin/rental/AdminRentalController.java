package com.tireshoppingmall.home.admin.rental;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tireshoppingmall.home.admin.AdminMenuSession;

@Controller
public class AdminRentalController {

	@Autowired
	RentalDAO rDAO;
	
	
	//admin.rental.go
	@RequestMapping(value = "/admin.rental.go", method = RequestMethod.GET)
	public String companyGo(AdminMenuSession menuSession, HttpServletRequest req) {
		
		
		
		rDAO.menuSession(menuSession, req);
		
		req.setAttribute("contentPage", "rental/rental.jsp");
		return "admin/master";
	}
	
}
