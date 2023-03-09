package com.tireshoppingmall.home.auth;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.UrlPathHelper;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;



@Controller
public class AuthController {
	
	@Autowired
	private MemberDAO mDAO;
	@Autowired
	private LoginSocialDAO lsDAO;
	
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
	
	
	@RequestMapping(value = "/login/getKakaoAuthUrl" , method = RequestMethod.GET)
	public @ResponseBody String getKakaoAuthUrl(
			HttpServletRequest request) throws Exception {
		String reqUrl = 
				"https://kauth.kakao.com/oauth/authorize"
				+ "?client_id=9ac97206ae6044bf6edfb9749a0e5e62"
				+ "&redirect_uri=http://localhost/home/login/oauth_kakao"
				+ "&response_type=code";
		return reqUrl;
	}
	
	// 카카오 연동정보 조회
	@RequestMapping(value = "/login/oauth_kakao")
	public String oauthKakao(
			@RequestParam(value = "code", required = false) String code
			, Model model) throws Exception {

		System.out.println("#########" + code);
        String access_Token = lsDAO.getAccessToken(code);
        System.out.println("###access_Token#### : " + access_Token);
        
        
        HashMap<String, Object> userInfo = lsDAO.getUserInfo(access_Token);
        System.out.println("###access_Token#### : " + access_Token);
        System.out.println("###userInfo#### : " + userInfo.get("email"));
        System.out.println("###nickname#### : " + userInfo.get("nickname"));
       
        JsonObject kakaoInfo =  new JsonObject();
        model.addAttribute("kakaoInfo", kakaoInfo);
        
        
        
        model.addAttribute("content", "main/home/home.jsp");
        return "redirect:/"; //본인 원하는 경로 설정
	}
	
   
 













}
	
	
	

