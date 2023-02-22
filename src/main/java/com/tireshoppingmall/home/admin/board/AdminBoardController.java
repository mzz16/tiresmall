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
		req.setAttribute("subMenuPage", "board/board_subMenu.jsp");
		req.setAttribute("contentPage", "board/notice_board.jsp");
		return "admin/master";
	}

	@RequestMapping(value = "/search.do", method = RequestMethod.GET)
	public String search(HttpServletRequest req, SearchDTO sDTO) {
		
		bDAO.search(req, sDTO);
		
		req.setAttribute("subMenuPage", "board/board_subMenu.jsp");
		req.setAttribute("contentPage", "board/notice_board.jsp");
		return "admin/master";
	}

	@RequestMapping(value = "/reg.notice.do", method = RequestMethod.GET)
	public String regNotice(HttpServletRequest req, NoticeDTO nDTO) {
		
		bDAO.regNotice(req, nDTO);
		bDAO.getAllNotice(req);
		
		req.setAttribute("subMenuPage", "board/board_subMenu.jsp");
		req.setAttribute("contentPage", "board/notice_board.jsp");
		return "admin/master";
	}

	@RequestMapping(value = "/update.notice.do", method = RequestMethod.GET)
	public String updateNotice(HttpServletRequest req, NoticeDTO nDTO) {
		
		bDAO.updateNotice(req, nDTO);
		bDAO.getAllNotice(req);
		
		req.setAttribute("subMenuPage", "board/board_subMenu.jsp");
		req.setAttribute("contentPage", "board/notice_board.jsp");
		return "admin/master";
	}

	@RequestMapping(value = "/delete.notice.do", method = RequestMethod.GET)
	public String deleteNotice(HttpServletRequest req, NoticeDTO nDTO) {
		
		bDAO.deleteNotice(req, nDTO);
		bDAO.getAllNotice(req);
		
		req.setAttribute("subMenuPage", "board/board_subMenu.jsp");
		req.setAttribute("contentPage", "board/notice_board.jsp");
		return "admin/master";
	}
}
