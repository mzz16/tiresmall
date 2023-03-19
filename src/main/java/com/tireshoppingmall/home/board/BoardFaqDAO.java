package com.tireshoppingmall.home.board;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tireshoppingmall.home.auth.AuthUserDTO;

@Service
public class BoardFaqDAO {
	@Autowired
	private SqlSession ss;
	
	@Autowired
	private BoardFaqCountOption bfco;
	
	private int FaqCount;
	public int getFaqCount() {
		return FaqCount;
	}
	public void setFaqCount(int FaqCount) {
		this.FaqCount = FaqCount;
	}
	public void calculateFaqCount(HttpServletRequest req) {
		
		// allFaqCount = ss.getMapper(BoardMapper.class).getFaqCount(fSel);
		// FaqDTO forWhat = (FaqDTO) aa;
		// allFaqCount = ss.getMapper(BoardMapper.class).getFaqCount(forWhat);
	}

	public void readallFaq(int pageNumber, HttpServletRequest req) {
		int countPerPage = bfco.getFaqCountPerPage();
		int begin = (pageNumber - 1) * countPerPage + 1;
		/*
		int end = pageNumber * countPerPage;
		*/
		int last = begin + (countPerPage - 1);
		
		// BoardFaqCountOption.clearFaqSearch(req);
		int faqCount = 0;
		BoardFaqSelector faqSearch = (BoardFaqSelector) req.getSession().getAttribute("FaqSearch");
		if (faqSearch == null) {
			// search
		} else {
			
		}
		
		
		
		
	}
}
