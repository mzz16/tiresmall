package com.tireshoppingmall.home.admin.auth;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminAuthController {

	@Autowired
	private AuthDAO aDAO;
	
	
	
	
	//admin.auth.go
	@RequestMapping(value = "/admin.auth.go", method = RequestMethod.GET)
	public String authGo(HttpServletRequest req) {
		
		aDAO.getAllAuth(req);
		
		req.setAttribute("contentPage", "auth/auth.jsp");
		return "admin/master";
	}
	
	//admin.searchAuth.do
	@RequestMapping(value = "/admin.searchAuth.do", method = RequestMethod.POST)
	public String searchAuthDo(HttpServletRequest req,AuthDTO aDTO) {
		
		aDAO.searchAuth(req,aDTO);
		
		req.setAttribute("contentPage", "auth/auth.jsp");
		return "admin/master";
	}
	
	//auth.delete.go
	@RequestMapping(value = "/auth.delete.go", method = RequestMethod.GET)
	public String authDeleteGo(HttpServletRequest req,AuthDTO aDTO) {
		
		aDAO.authDelete(req,aDTO);
		
		aDAO.getAllAuth(req);
		
		req.setAttribute("contentPage", "auth/auth.jsp");
		return "admin/master";
	}
	
	//admin.update.go
	@RequestMapping(value = "/admin.update.go", method = RequestMethod.POST)
	public String updateAuthDo(HttpServletRequest req,AuthDTO aDTO) {
		
		aDAO.updateAuth(req,aDTO);
		aDAO.getAllAuth(req);
		
		req.setAttribute("contentPage", "auth/auth.jsp");
		return "admin/master";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
