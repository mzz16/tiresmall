package com.tireshoppingmall.home.product;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
	
	@Autowired
	private ProductDAO pDAO;
	
	@RequestMapping(value = "/product.brand", method = RequestMethod.GET)
	public String goProductBrand(HttpServletRequest request, @RequestParam String b, @RequestParam int p) {
		pDAO.searchProductGroup(b, request);
		pDAO.getProductGroup(p, request);
		request.setAttribute("content", "main/product/product.jsp");
		return "index";
	}
}
