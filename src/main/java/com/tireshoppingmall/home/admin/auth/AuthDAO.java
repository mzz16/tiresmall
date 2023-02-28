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

}
