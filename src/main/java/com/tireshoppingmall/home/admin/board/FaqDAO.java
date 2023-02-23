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

	public void getAllFaq(HttpServletRequest req) {

		List<FaqDTO> faq = ss.getMapper(AdminBoardMapper.class).getAllFaq();
		req.setAttribute("faq", faq);

	}

	public void searchFaq(HttpServletRequest req, SearchDTO sDTO) {
		String[] option = { "", "주문/배송", "상품관련", "장착관련", "반품/교환/취소","회원" };
		sDTO.setSelectOption(option[Integer.parseInt(req.getParameter("selectOption"))]);
		List<FaqDTO> faq = ss.getMapper(AdminBoardMapper.class).searchAllFaq(sDTO);
		req.setAttribute("faq", faq);
		
	}

	public void regFaq(HttpServletRequest req, FaqDTO faqDTO) {
		if(ss.getMapper(AdminBoardMapper.class).regFaq(faqDTO) == 1) {
			req.setAttribute("regR", "등록 성공");
		}else {
			req.setAttribute("regR", "등록 실패");
		}
		
	}

	public void updateFaq(HttpServletRequest req, FaqDTO faqDTO) {
		if(ss.getMapper(AdminBoardMapper.class).updateFaq(faqDTO) >= 1) {
			req.setAttribute("updateR", "업데이트 성공");
		}else {
			req.setAttribute("updateR", "업데이트 실패");
		}
	}

	public void deleteFaq(HttpServletRequest req, FaqDTO faqDTO) {
		if(ss.getMapper(AdminBoardMapper.class).deleteFaq(faqDTO)) {
			System.out.println("삭제 성공");
		} else {
			System.err.println("삭제 실패");
		}
	}

	
}
