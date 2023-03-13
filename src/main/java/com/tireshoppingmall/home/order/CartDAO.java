package com.tireshoppingmall.home.order;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service
public class CartDAO {

	public int addCart(List<CartDTO> cList, CartDTO cDTO, HttpServletRequest req) {
		cList = (List<CartDTO>) req.getSession().getAttribute("cartSession");
		for (CartDTO cart : cList) {
			if (cart.getTg_id() == cDTO.getTg_id()) {
				return 0;
			}
		}
		cList.add(cDTO);
		System.out.println(cList);
		return 1;
	}

	public int deleteCart(CartDTO cDTO, HttpServletRequest req) {
		
		return 0;
	}

}
