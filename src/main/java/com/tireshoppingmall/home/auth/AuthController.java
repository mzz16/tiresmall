package com.tireshoppingmall.home.auth;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthController {

	@RequestMapping(value = "/authTermsOfUse.go", method = RequestMethod.GET)
	public String authTermsOfUseGo(Model model) {
		return "main/auth/termsOfUse";
	}
	@RequestMapping(value = "/authReg.go", method = RequestMethod.GET)
	public String authRegGo(Model model) {
		return "main/auth/authReg";
	}
	@RequestMapping(value = "/findEmail.go", method = RequestMethod.GET)
	public String findEmailGo(Model model) {
		return "main/auth/authFind";
	}
	
	
	
	
}
