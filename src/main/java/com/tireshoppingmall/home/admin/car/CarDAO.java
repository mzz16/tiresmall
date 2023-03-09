package com.tireshoppingmall.home.admin.car;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.tireshoppingmall.home.admin.AdminMenuSession;

@Service
public class CarDAO {

	
	
	
	
	
	
	
	
	
	
	
	
	public void menuSession(AdminMenuSession menuSession, HttpServletRequest req) {
		AdminMenuSession menu = (AdminMenuSession) req.getSession().getAttribute("menuSession");
		menu.setMenu("car");
		menu.setSubMenu(menuSession.getSubMenu());	
	}
}
