package com.tireshoppingmall.home.order;

import java.util.List;

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
	public String goCart(HttpServletRequest req, List<CartDTO> cList) {
		if (req.getSession().getAttribute("cartSession") == null) {
			req.getSession().setAttribute("cartSession", cList);
		}
		req.setAttribute("content", "main/product/cart.jsp");
		return "index";
	}
	
	@ResponseBody
	@RequestMapping(value = "/cart.add", method = RequestMethod.POST)
	public int addCart(List<CartDTO> cList, CartDTO cDTO, HttpServletRequest req) {
		return cDAO.addCart(cList, cDTO, req);
	}
	
	@ResponseBody
	@RequestMapping(value = "/cart.delete", method = RequestMethod.POST)
	public int deleteCart(CartDTO cDTO, HttpServletRequest req) {
		return cDAO.deleteCart(cDTO, req);
	}
}
