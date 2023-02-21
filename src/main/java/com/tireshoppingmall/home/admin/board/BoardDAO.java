package com.tireshoppingmall.home.admin.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardDAO {

	@Autowired
	private SqlSession ss;
	
	
	public void getAllNotice(HttpServletRequest req) {
		
		List<NoticeDTO> notice = ss.getMapper(AdminBoardMapper.class).getAllNotice();
		req.setAttribute("notice", notice);
		
	}

	public void search(HttpServletRequest req, SearchDTO sDTO) {
			String[] option = {"","안내","매장","프로모션"};
			sDTO.setSelectOption(option[Integer.parseInt(req.getParameter("selectOption"))]);
			List<NoticeDTO> notice = ss.getMapper(AdminBoardMapper.class).searchAllNotice(sDTO);
			req.setAttribute("notice", notice);
	}

	public void regNotice(HttpServletRequest req, NoticeDTO nDTO) {
		if(ss.getMapper(AdminBoardMapper.class).regNotice(nDTO) == 1) {
			req.setAttribute("regR", "등록 성공");
		}else {
			req.setAttribute("regR", "등록 실패");
		}
		
	}

	public void updateNotice(HttpServletRequest req, NoticeDTO nDTO) {
		if(ss.getMapper(AdminBoardMapper.class).updateNotice(nDTO) >= 1) {
			req.setAttribute("updateR", "업데이트 성공");
		}else {
			req.setAttribute("updateR", "업데이트 실패");
		}
		
	}

	public void deleteNotice(HttpServletRequest req, NoticeDTO nDTO) {
		if(ss.getMapper(AdminBoardMapper.class).deleteNotice(nDTO)) {
			System.out.println("삭제 성공");
		} else {
			System.err.println("삭제 실패");
		}
		
	}

	
	
}
