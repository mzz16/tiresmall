package com.tireshoppingmall.home.admin.rental;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.tireshoppingmall.home.admin.AdminMenuSession;

@Service
public class RentalDAO {

	
	
	public void menuSession(AdminMenuSession menuSession, HttpServletRequest req) {
		AdminMenuSession menu = (AdminMenuSession) req.getSession().getAttribute("menuSession");
		menu.setMenu("rental");
	}
}
