package com.tireshoppingmall.home.auth;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthController {
	
	@Autowired
	private MemberDAO mDAO;
	
	
	@RequestMapping(value = "/authTermsOfUse.go", method = RequestMethod.GET)
	public String authTermsOfUseGo(Model model) {
		return "main/auth/termsOfUse";
	}
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String loginDo(MemberDTO mDTO, HttpServletRequest req) {
		
		mDAO.login(mDTO,req);
		mDAO.loginCheck( req);
		req.setAttribute("content", "main/home/home.jsp");
		return "index";
	}
	@RequestMapping(value = "/authReg.go", method = RequestMethod.GET)
	public String authRegGo(Model model) {
		return "main/auth/authReg";
	}
	@RequestMapping(value = "/authReg.do", method = RequestMethod.POST)
	public String authRegDo(HttpServletRequest req,MemberDTO mDTO) {
		mDAO.regMember(req,mDTO);
		req.setAttribute("content", "main/home/home.jsp");
		return "redirect:/";
	}
	@RequestMapping(value = "/findEmail.go", method = RequestMethod.GET)
	public String findEmailGo(Model model) {
		return "main/auth/authFind";
	}
	
	
	
	
}
