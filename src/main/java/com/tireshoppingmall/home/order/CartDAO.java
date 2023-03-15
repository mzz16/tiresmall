package com.tireshoppingmall.home.order;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service
public class CartDAO {

	public int addCart(CartDTO cDTO, HttpServletRequest req) {
		ArrayList<CartDTO> cList = (ArrayList<CartDTO>) req.getSession().getAttribute("cartSession");
		for (CartDTO cartSession : cList) {
			if (cartSession.getTg_id() == cDTO.getTg_id()) {
				return 0;
			}
		}
		cList.add(cDTO);
		return 1;
	}

	public int deleteCart(CartDTO cDTO, HttpServletRequest req) {
		
		return 0;
	}

}
