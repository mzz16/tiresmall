package com.tireshoppingmall.home;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service
public class HomeDAO {

	public void createCartSession(HttpServletRequest req) {
		CartDTO cDTO = new CartDTO();
		req.setAttribute("cSession", cDTO);
	}
	
}
