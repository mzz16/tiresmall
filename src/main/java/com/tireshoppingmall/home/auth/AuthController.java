package com.tireshoppingmall.home.auth;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.util.UrlPathHelper;

import com.github.scribejava.core.model.OAuth2AccessToken;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;



@Controller
public class AuthController {
	
	@Autowired
	private MemberDAO mDAO;
	@Autowired
	private LoginSocialDAO lsDAO;
	
	 /* NaverLoginBO */
    private NaverLoginBO naverLoginBO;
    private String apiResult = null;
    
    @Autowired
    private void setNaverLoginBO(NaverLoginBO naverLoginBO) {
        this.naverLoginBO = naverLoginBO;
    }
    
	
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
	@RequestMapping(value = "/logout.do", method = RequestMethod.GET)
	public String logoutDo(MemberDTO mDTO, HttpServletRequest req) {
		
		mDAO.logout(req);
		mDAO.loginCheck( req);
		req.setAttribute("content", "main/home/home.jsp");
		return "index";
	}
	@RequestMapping(value = "/authReg.go", method = RequestMethod.GET)
	public String authRegGo(HttpServletRequest req) {
		
		String socialID = req.getParameter("socialID");
	
		//소셜로그인으로 회원가입하는 경우
		if (!(socialID.equals(""))) {
			req.setAttribute("socialID", socialID);
			return "main/auth/authRegSocial";
		}
		return "main/auth/authReg";
	}
	@RequestMapping(value = "/authReg.do", method = RequestMethod.POST)
	public String authRegDo(HttpServletRequest req,MemberDTO mDTO) {
		mDAO.regMember(req,mDTO);
		
		mDAO.login(mDTO,req);
		mDAO.loginCheck( req);
		req.setAttribute("content", "main/home/home.jsp");
		return "redirect:/";
	}
	@RequestMapping(value = "/authRegSocial.do", method = RequestMethod.POST)
	public String authRegSocialDo(HttpServletRequest req,MemberDTO mDTO) {
				//회원가입 성공하면
			if (lsDAO.regMemberSocial(req,mDTO)) {
				String socialID =  mDTO.getU_id();
				lsDAO.login(socialID,req);
				mDAO.loginCheck(req);   
				req.setAttribute("content", "main/home/home.jsp");
				return "redirect:/"; //본인 원하는 경로 설정}
			}
			req.setAttribute("content", "main/home/home.jsp");
			return "redirect:/"; //본인 원하는 경로 설정}
		
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
			, Model model,HttpServletRequest req,RedirectAttributes rttr) throws Exception {

		System.out.println("#########" + code);
        String access_Token = lsDAO.getAccessToken(code);
        System.out.println("###access_Token#### : " + access_Token);
        
        
        HashMap<String, Object> userInfo = lsDAO.getUserInfo(access_Token);
       //System.out.println("###access_Token#### : " + access_Token);
       // System.out.println("###userInfo#### : " + userInfo.get("email"));
       // System.out.println("###nickname#### : " + userInfo.get("nickname"));
       System.out.println("###KAKAOID#### : " + userInfo.get("kakaoID"));
       
        JsonObject kakaoInfo =  new JsonObject();
        model.addAttribute("kakaoInfo", kakaoInfo);
        //model.addAttribute("kakaoID", userInfo.get("kakaoID"));
        
        String socialID = (String) userInfo.get("kakaoID");
        System.out.println("반환값 : "+ lsDAO.checkIdkko(socialID));
        
        //반환값이 1이면 기존 가입한 회원, 0이면 가입하지 않은 회원
        if (lsDAO.checkIdkko(socialID)==1) {
        	lsDAO.login(socialID,req);
        	mDAO.loginCheck(req);   
        	model.addAttribute("content", "main/home/home.jsp");
               return "redirect:/"; //본인 원하는 경로 설정
		}else {
			//필요한 추가 정보를 얻기 위한 회원가입 페이지로 이동
			rttr.addFlashAttribute("socialID", socialID);
			return "redirect:/authTermsOfUse.go";
		}
        
       
	}
	
   
	 //로그인 첫 화면 요청 메소드
    @RequestMapping(value = "/users/naverlogin", method = { RequestMethod.GET, RequestMethod.POST })
    public String login(Model model, HttpSession session) {
        
        /* 네이버아이디로 인증 URL을 생성하기 위하여 naverLoginBO클래스의 getAuthorizationUrl메소드 호출 */
        String naverAuthUrl = naverLoginBO.getAuthorizationUrl(session);
        
        //https://nid.naver.com/oauth2.0/authorize?response_type=code&client_id=sE***************&
        //redirect_uri=http%3A%2F%2F211.63.89.90%3A8090%2Flogin_project%2Fcallback&state=e68c269c-5ba9-4c31-85da-54c16c658125
        System.out.println("네이버:" + naverAuthUrl);
        
        //네이버 
        model.addAttribute("url", naverAuthUrl);

        /* 생성한 인증 URL을 View로 전달 */
        return "main/auth/authReg";
    }

    //네이버 로그인 성공시 callback호출 메소드
    @RequestMapping(value = "/users/callback.do", method = { RequestMethod.GET, RequestMethod.POST })
    public String callback(Model model, @RequestParam String code, @RequestParam String state, HttpSession session)
            throws IOException {
        System.out.println("여기는 callback");
        OAuth2AccessToken oauthToken;
        oauthToken = naverLoginBO.getAccessToken(session, code, state);
        //로그인 사용자 정보를 읽어온다.
        apiResult = naverLoginBO.getUserProfile(oauthToken);
        System.out.println(naverLoginBO.getUserProfile(oauthToken).toString());
        model.addAttribute("result", apiResult);
        System.out.println("result"+apiResult);
        /* 네이버 로그인 성공 페이지 View 호출 */
//      JSONObject jsonobj = jsonparse.stringToJson(apiResult, "response");
//      String snsId = jsonparse.JsonToString(jsonobj, "id");
//      String name = jsonparse.JsonToString(jsonobj, "name");
//
//      UserVO vo = new UserVO();
//      vo.setUser_snsId(snsId);
//      vo.setUser_name(name);
//
//      System.out.println(name);
//      try {
//          vo = service.naverLogin(vo);
//      } catch (Exception e) {
//          // TODO Auto-generated catch block
//          e.printStackTrace();
//      }


//      session.setAttribute("login",vo);
//      return new ModelAndView("user/loginPost", "result", vo);
        
        return "users/naverSuccess";
    }













}
	
	
	

