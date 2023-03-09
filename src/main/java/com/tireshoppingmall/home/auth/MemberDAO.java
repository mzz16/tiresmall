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
		
		MemberDTO dbMember = ss.getMapper(MemberMapper.class).getMember(mDTO);

		if (dbMember != null) {
			if (mDTO.getPw_password().equals(dbMember.getPw_password())) {
				req.getSession().setAttribute("loginMember", dbMember);
				req.getSession().setMaxInactiveInterval(60 * 10);
			} else {
				req.setAttribute("resultMem", "password error!");
			}
		} else {
			req.setAttribute("resultMem", "Can not find user");
		}	
	}

	public boolean loginCheck(HttpServletRequest req) {
		MemberDTO m = (MemberDTO) req.getSession().getAttribute("loginMember");
		if (m != null) {
			req.setAttribute("loginOK", m.getI_name());
			return true;
		}
		return false;
	}

	
	 
	
	
	
	
	
	
	
	
	
	
	
}
