package com.tireshoppingmall.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tireshoppingmall.home.store.StoreDAO;

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
	
	@RequestMapping(value = "/board.home", method = RequestMethod.GET)
	public String boardHome(Model model) {
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_contents", "board_home.jsp");
		model.addAttribute("board_whereAmIOne", "");
		model.addAttribute("board_whereAmITwo", "고객센터");
		return "index";
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
	
	@RequestMapping(value = "/store", method = RequestMethod.GET)
	public String goStore(Model model, @RequestParam int id) {
		StoreDAO.getAStore(model, id);
		model.addAttribute("content", "main/store/store.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public String goCart(Model model) {
		model.addAttribute("content", "main/product/cart.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/detail.test", method = RequestMethod.GET)
	public String goDetailTest(Model model) {
		model.addAttribute("content", "main/product/detail.jsp");
		return "index";
	}
}
