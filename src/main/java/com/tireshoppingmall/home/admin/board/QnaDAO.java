package com.tireshoppingmall.home.admin.board;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QnaDAO {

	@Autowired
	private SqlSession ss;

	public void getAllQna(HttpServletRequest req) {
		
	}
	
}
