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

	public void readAll(int pageNumber, HttpServletRequest req) {
		int count = aco.getAskCountPerPage();
		int start = (pageNumber - 1) * count + 1;
		int end = start + (count - 1);
		
		AskSelector search = (AskSelector) req.getSession().getAttribute("AskSearch");
		
		int askCount = 0;
		if (search == null) {
            search = new AskSelector("", new BigDecimal(start), new BigDecimal(end));
            askCount = allAskCount;
        } else {
            search.setStart(new BigDecimal(start));
            search.setEnd(new BigDecimal(end));
            askCount = ss.getMapper(BoardMapper.class).getAskCount(search);
        }
		
		List<AskDTO> asks = ss.getMapper(BoardMapper.class).getAsk(search);
				
        for (AskDTO a : asks) {
            a.setA_replys(ss.getMapper(BoardMapper.class).getAskReply(a));
        }

        int pageCount = (int) Math.ceil(askCount / (double) count);
        req.setAttribute("pageCount", pageCount);

        req.setAttribute("msgs", asks);
        req.setAttribute("curPage", pageNumber);
	}
}
