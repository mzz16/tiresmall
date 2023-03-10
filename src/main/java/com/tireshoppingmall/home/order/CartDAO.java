package com.tireshoppingmall.home.order;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service
public class CartDAO {

	public int addCart(CartDTO cDTO, HttpServletRequest req) {
		System.out.println(cDTO.getTg_name());
		ArrayList<CartDTO> cList = (ArrayList<CartDTO>) req.getSession().getAttribute("cartSession");
		cList.add(cDTO);
		System.out.println(cList);
		return 1;
	}

	public int deleteCart(CartDTO cDTO, HttpServletRequest req) {
		
		return 0;
	}

}
