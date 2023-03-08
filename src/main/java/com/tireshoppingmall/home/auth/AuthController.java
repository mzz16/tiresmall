package com.tireshoppingmall.home.auth;

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
import org.springframework.web.util.UrlPathHelper;

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
	@RequestMapping(value = "/login.type_kakao", method = RequestMethod.GET)
	public String loginWithKakao(HttpServletRequest request, HttpServletResponse response,
			HttpSession session, Model model) {
		
		UrlPathHelper urlPathHelper = new UrlPathHelper();
		String originalURL = urlPathHelper.getOriginatingRequestUri(request);
		Map<String, String[]> paramMap = request.getParameterMap();
		Iterator keyData = paramMap.keySet().iterator();
		CommonData dto = new CommonData();
		while (keyData.hasNext()) {
			String key = ((String) keyData.next());
			String[] value = paramMap.get(key);
			dto.put(key, value[0].toString());
		}
		String url = "https://kauth.kakao.com/oauth/token";
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		LinkedMultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("client_id", "REST 앱키를 입력하세요.");
		String redirect_url = "http://localhost:8080/user/loginpage_kakao_callback";
		map.add("redirect_uri", redirect_url);
		map.add("grant_type", "authorization_code");
		map.add("code", dto.get("code"));
        
		HttpEntity<LinkedMultiValueMap<String, String>> request2 = new HttpEntity<LinkedMultiValueMap<String, String>>(
				map, headers);
		CommonData response2 = restTemplate.postForObject(url, request2, CommonData.class);
		map.clear();
		model.addAttribute("access_token", response2.get("access_token"));
		
		return "/user/loginpage_kakao_callback";
	}
	
	
	
	
}
