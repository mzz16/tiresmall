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
	
  //admin.comunity.go
  @RequestMapping(value = "admin.comunity.go", method = RequestMethod.GET)
	public String comunityGo(HttpServletRequest req) {
		
		req.setAttribute("contentPage", "comunity.jsp");
		return "admin/master";
	}
  
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String notice(HttpServletRequest req) {
		
		bDAO.getAllNotice(req);
		
		return "board";
	}

	@RequestMapping(value = "/search.do", method = RequestMethod.GET)
	public String search(HttpServletRequest req, SearchDTO sDTO) {
		
		bDAO.search(req, sDTO);
		
		return "board";
	}

	@RequestMapping(value = "/reg.notice.do", method = RequestMethod.GET)
	public String regNotice(HttpServletRequest req, NoticeDTO nDTO) {
		
		bDAO.regNotice(req, nDTO);
		bDAO.getAllNotice(req);
		
		return "board";
	}

	@RequestMapping(value = "/update.notice.do", method = RequestMethod.GET)
	public String updateNotice(HttpServletRequest req, NoticeDTO nDTO) {
		
		bDAO.updateNotice(req, nDTO);
		bDAO.getAllNotice(req);
		
		return "board";
	}

	@RequestMapping(value = "/delete.notice.do", method = RequestMethod.GET)
	public String deleteNotice(HttpServletRequest req, NoticeDTO nDTO) {
		
		bDAO.deleteNotice(req, nDTO);
		bDAO.getAllNotice(req);
		
		return "board";
	}
}
