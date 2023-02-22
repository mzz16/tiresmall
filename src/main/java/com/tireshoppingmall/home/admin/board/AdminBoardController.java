package com.tireshoppingmall.home.admin.board;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tireshoppingmall.home.admin.board.BoardDAO;
import com.tireshoppingmall.home.admin.board.NoticeDTO;
import com.tireshoppingmall.home.admin.board.SearchDTO;

@Controller
public class AdminBoardController {

	@Autowired
	private BoardDAO bDAO;
  
	@RequestMapping(value = "/admin.notice.go", method = RequestMethod.GET)
	public String notice(HttpServletRequest req) {
		
		bDAO.getAllNotice(req);
		
		return "admin/board/notice_board";
	}

	@RequestMapping(value = "/search.do", method = RequestMethod.GET)
	public String search(HttpServletRequest req, SearchDTO sDTO) {
		
		bDAO.search(req, sDTO);
		
		return "admin/board/notice_board";
	}

	@RequestMapping(value = "/reg.notice.do", method = RequestMethod.GET)
	public String regNotice(HttpServletRequest req, NoticeDTO nDTO) {
		
		bDAO.regNotice(req, nDTO);
		bDAO.getAllNotice(req);
		
		return "admin/board/notice_board";
	}

	@RequestMapping(value = "/update.notice.do", method = RequestMethod.GET)
	public String updateNotice(HttpServletRequest req, NoticeDTO nDTO) {
		
		bDAO.updateNotice(req, nDTO);
		bDAO.getAllNotice(req);
		
		return "admin/board/notice_board";
	}

	@RequestMapping(value = "/delete.notice.do", method = RequestMethod.GET)
	public String deleteNotice(HttpServletRequest req, NoticeDTO nDTO) {
		
		bDAO.deleteNotice(req, nDTO);
		bDAO.getAllNotice(req);
		
		return "admin/board/notice_board";
	}
}
