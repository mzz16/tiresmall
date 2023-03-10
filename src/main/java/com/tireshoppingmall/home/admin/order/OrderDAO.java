package com.tireshoppingmall.home.admin.order;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.tireshoppingmall.home.admin.AdminMenuSession;

@Service
public class OrderDAO {

	
	
	
	
	
	
	
	public void menuSession(AdminMenuSession menuSession, HttpServletRequest req) {
		req.getSession().setAttribute("menuSession", menuSession);
	
		
		
		//세션 무한대라서 나중에 삭제 해줘야함
		req.getSession().setMaxInactiveInterval(-1);
		
		/*HttpSession menuSessionTime = (HttpSession) req.getSession().getAttribute("menuSession");
		menuSessionTime.setMaxInactiveInterval(-1);	//무한대*/	
		
		AdminMenuSession menu = (AdminMenuSession) req.getSession().getAttribute("menuSession");
		menu.setMenu("order");
	}
	
}
