package com.tireshoppingmall.home.board;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tireshoppingmall.home.auth.AuthUserDTO;

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
	
	public void calculateAllAskCount(HttpServletRequest req) {
		/*
		AskSelector aSel = new AskSelector("", null, null, auDTO.getU_id());
		allAskCount = ss.getMapper(BoardMapper.class).getAskCount(aSel);
		 */
		AuthUserDTO forU_id = (AuthUserDTO) req.getSession().getAttribute("loginMember");
		allAskCount = ss.getMapper(BoardMapper.class).getAskCount(forU_id);
	}
	/*
	*/

	public void readAllAsk(int pageNumber, HttpServletRequest req) {
		int countPerPage = aco.getAskCountPerPage();		// 페이지당 게시물수
		int begin = (pageNumber - 1) * countPerPage + 1;	// 블록당 첫페이지의숫자
		/*
		int end = pageNumber * countPerPage;				// 블록당 마지막페이지의숫자
		*/
		int last = begin + (countPerPage - 1);				// 마지막페이지의숫자
		
		// AskSelector askSearch = (AskSelector) req.getSession().getAttribute("askSearch");
		AuthUserDTO forBeginLastU_id = (AuthUserDTO) req.getSession().getAttribute("loginMember");
		// auDTO.setU_id();
		forBeginLastU_id.setBegin(new BigDecimal(begin));
		forBeginLastU_id.setLast(new BigDecimal(last));
		int askCount = 0;
		/*
		if (askSearch == null) {
			System.out.println(allAskCount);
		 */
		//	askSearch = new AskSelector("", new BigDecimal(begin), new BigDecimal(last), auDTO.getU_id());
            askCount = allAskCount;
        /*
        } else {
        	askSearch.setBegin(new BigDecimal(begin));
        	askSearch.setLast(new BigDecimal(last));
            askCount = ss.getMapper(BoardMapper.class).getAskCount(askSearch);
        }
         */
		
		List<AskDTO> asks = ss.getMapper(BoardMapper.class).readAskAll(forBeginLastU_id);
		// List<AskDTO> asks = ss.getMapper(BoardMapper.class).readAskAll(askSearch);
        for (AskDTO a : asks) {
            a.setA_reply(ss.getMapper(BoardMapper.class).readAskReply(a));
        }
        
        System.out.println("a=" + forBeginLastU_id.getBegin());
        System.out.println("b=" + forBeginLastU_id.getLast());
        System.out.println("c=" + forBeginLastU_id.getU_id());
        
        System.out.println("d=" + begin);
        System.out.println("e=" + last);
        
        int pageCount = (int) Math.ceil(askCount / (double) countPerPage);

        req.setAttribute("pageNumber", pageNumber);
        req.setAttribute("countPerPage", countPerPage);
        req.setAttribute("begin", begin);
        /*
        req.setAttribute("end", end);
        */
        req.setAttribute("last", last);
        req.setAttribute("askCount", askCount);
        
        req.setAttribute("asks", asks);
        
        req.setAttribute("pageCount", pageCount);
	}
	
	public void readOneAsk(AskDTO a, HttpServletRequest req) {
		AskDTO ask = (AskDTO) ss.getMapper(BoardMapper.class).readAskOne(a);
		ask.setA_reply(ss.getMapper(BoardMapper.class).readAskReply(a));
		
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