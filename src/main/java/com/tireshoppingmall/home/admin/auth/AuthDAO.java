package com.tireshoppingmall.home.admin.auth;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthDAO {
	
	@Autowired
	private SqlSession ss;
	
	
	public void getAllAuth(HttpServletRequest req) {
		req.setAttribute("manyAuth", ss.getMapper(AdminAuthMapper.class).getAllAuth());
		
	}


	public void searchAuth(HttpServletRequest req) {
		
		
	}


	public void searchAuth(HttpServletRequest req, AuthDTO aDTO) {
		//아이디, 이름, 자동차번호
		req.setAttribute("manyAuth",ss.getMapper(AdminAuthMapper.class).seachAuth(aDTO));
		
		
		
	}


	public void authDelete(HttpServletRequest req, AuthDTO aDTO) {
		if(ss.getMapper(AdminAuthMapper.class).authDelete(aDTO)==1) {
			req.setAttribute("r", "삭제 성공");
		}
		
	}


	public void updateAuth(HttpServletRequest req, AuthDTO aDTO) {
		if(ss.getMapper(AdminAuthMapper.class).authUpdate(aDTO)==1) {
			req.setAttribute("r", "삭제 성공");
		}
		
	}

}
