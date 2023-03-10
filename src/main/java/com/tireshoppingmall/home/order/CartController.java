package com.tireshoppingmall.home.order;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CartController {
	
	@Autowired
	CartDAO cDAO;
	
	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public String goCart(HttpServletRequest req) {
		req.setAttribute("content", "main/product/cart.jsp");
		return "index";
	}
	
	@ResponseBody
	@RequestMapping(value = "/cart.add", method = RequestMethod.POST)
	public int addCart(CartDTO cDTO, HttpServletRequest req) {
		return cDAO.addCart(cDTO, req);
	}
	
	@ResponseBody
	@RequestMapping(value = "/cart.delete", method = RequestMethod.POST)
	public int deleteCart(CartDTO cDTO, HttpServletRequest req) {
		return cDAO.deleteCart(cDTO, req);
	}
}
