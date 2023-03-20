package com.tireshoppingmall.home.order;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MainOrderController {
	@RequestMapping(value = "/pay.go", method = RequestMethod.GET)
	public String home(HttpServletRequest req) {
		req.setAttribute("content", "main/product/pay.jsp");
		return "index";
	}
}
