package com.tireshoppingmall.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("content", "main/home/home.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String goLogin() {
		
		return "main/auth/login";
		
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String goJoin() {
		
		return "main/auth/termsOfUse";
		
	}
	
	@RequestMapping(value = "/search.size", method = RequestMethod.GET)
	public String goSearchSize(Model model) {
		model.addAttribute("content", "main/search/search_size.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/search.car", method = RequestMethod.GET)
	public String goSearchCar(Model model) {
		model.addAttribute("content", "main/search/search_car.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/search.product", method = RequestMethod.GET)
	public String goSearchProduct(Model model) {
		model.addAttribute("content", "main/search/search_product.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/store1", method = RequestMethod.GET)
	public String goStore1(Model model) {
		model.addAttribute("content", "main/store/store.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/store2", method = RequestMethod.GET)
	public String goStore2(Model model) {
		model.addAttribute("content", "main/store/store.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/store3", method = RequestMethod.GET)
	public String goStore3(Model model) {
		model.addAttribute("content", "main/store/store.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/store4", method = RequestMethod.GET)
	public String goStore4(Model model) {
		model.addAttribute("content", "main/store/store.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/store5", method = RequestMethod.GET)
	public String goStore5(Model model) {
		model.addAttribute("content", "main/store/store.jsp");
		return "index";
	}
	
}
