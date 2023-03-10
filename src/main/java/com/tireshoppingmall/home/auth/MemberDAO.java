package com.tireshoppingmall.home.auth;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.tireshoppingmall.home.auth.MemberDTO;
import com.tireshoppingmall.home.auth.MemberMapper;


	

@Service
public class MemberDAO {
	
	@Autowired
	private SqlSession ss;
	
	public void regMember(HttpServletRequest req, MemberDTO mDTO) {

		if(ss.getMapper(MemberMapper.class).regMember(mDTO)>=3) {
			System.out.println("가입성공");
			req.setAttribute("resultMem", "가입성공");
		}else {
			req.setAttribute("resultMem", "가입실패");
		}
	}

	public void login(MemberDTO mDTO, HttpServletRequest req) {
		
		int checkMemberInDB = ss.getMapper(MemberMapper.class).checkMember(mDTO);//반환값이 1이면 입력한 값과 db 값이 일치

		if (checkMemberInDB == 1) {
				AuthUserDTO member = ss.getMapper(MemberMapper.class).getMember(mDTO);
				req.getSession().setAttribute("loginMember", member);
				req.getSession().setMaxInactiveInterval(60 * 10);
			
		} else {
			req.setAttribute("resultMem", "Can not find user");
		}	
	}

	public boolean loginCheck(HttpServletRequest req) {
		AuthUserDTO m = (AuthUserDTO) req.getSession().getAttribute("loginMember");
		if (m != null) {
			return true;
		}
		return false;
	}

	public void logout(HttpServletRequest req) {
		req.getSession().setAttribute("loginMember", null);		
	}

	
	 
	
	
	
	
	
	
	
	
	
	
	
}
