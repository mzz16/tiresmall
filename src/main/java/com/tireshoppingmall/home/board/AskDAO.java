package com.tireshoppingmall.home.board;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AskDAO {
	@Autowired
	private AskCountOption aco;
	
	private int allAskCount;
	public int getAllAskCount() {
		return allAskCount;
	}
	public void setAllAskCount(int allAskCount) {
		this.allAskCount = allAskCount;
	}
	
	@Autowired
	private SqlSession ss;

	public void readAllAsk(int pageNumber, HttpServletRequest req) {
		int countPerPage = aco.getAskCountPerPage();		// 페이지당 게시물수
		int begin = (pageNumber - 1) * countPerPage + 1;	// 블록당 첫페이지의숫자
		/*
		int end = pageNumber * countPerPage;				// 블록당 마지막페이지의숫자
		*/
		int last = begin + (countPerPage - 1);				// 마지막페이지의숫자
		
		AskSelector askSearch = (AskSelector) req.getSession().getAttribute("askSearch");
		int askCount = 0;
		if (askSearch == null) {
			askSearch = new AskSelector("", new BigDecimal(begin), new BigDecimal(last));
            askCount = allAskCount;
        } else {
        	askSearch.setBegin(new BigDecimal(begin));
        	askSearch.setLast(new BigDecimal(last));
            askCount = ss.getMapper(BoardMapper.class).getAskCount(askSearch);
        }
		int pageCount = (int) Math.ceil(askCount / (double) countPerPage);
		
		List<AskDTO> asks = ss.getMapper(BoardMapper.class).getAskAll(askSearch);
        for (AskDTO a : asks) {
            a.setA_reply(ss.getMapper(BoardMapper.class).getAskReply(a));
        }

        req.setAttribute("pageNumber", pageNumber);
        
        req.setAttribute("countPerPage", countPerPage);
        req.setAttribute("begin", begin);
        /*
        req.setAttribute("end", end);
        */
        req.setAttribute("last", last);
        req.setAttribute("askCount", askCount);
        req.setAttribute("pageCount", pageCount);
        
        req.setAttribute("asks", asks);
	}
	
	public void calculateAllAskCount() {
		AskSelector aSel = new AskSelector("", null, null);
		allAskCount = ss.getMapper(BoardMapper.class).getAskCount(aSel);
	}
	
	public void readOneAsk(AskDTO a, HttpServletRequest req) {
		AskDTO ask = (AskDTO) ss.getMapper(BoardMapper.class).getAskOne(a);
		ask.setA_reply(ss.getMapper(BoardMapper.class).getAskReply(a));
		
		req.setAttribute("ask", ask);
	}
	
	public void createAsk(AskDTO a, HttpServletRequest req) {
		String q_txt = a.getQ_txt();
		a.setQ_txt(q_txt.replace("\r\n", "<br>"));
		
		if (ss.getMapper(BoardMapper.class).createAsk(a) == 1) {
			req.setAttribute("result", "create성공");
		} else {
			req.setAttribute("result", "create실패");
		}
	}
	
	public void updateAsk(AskDTO a, HttpServletRequest req) {
		if (ss.getMapper(BoardMapper.class).updateAsk(a) == 1) {
			req.setAttribute("result", "update성공");
		} else {
			req.setAttribute("result", "update실패");
		}
	}
	
	public void deleteAsk(AskDTO a, HttpServletRequest req) {
		if (ss.getMapper(BoardMapper.class).deleteAsk(a) == 1) {
			req.setAttribute("result", "delete성공");
		} else {
			req.setAttribute("result", "delete실패");
		}
	}
}