package com.tireshoppingmall.home.admin.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FaqDAO {
	
	@Autowired
	private SqlSession ss;

	public void getAllfaq(HttpServletRequest req) {
		
		List<FaqDTO> faq = ss.getMapper(AdminBoardMapper.class).getAllFaq();
		req.setAttribute("faq", faq);
		
	}

	
	
	
}
