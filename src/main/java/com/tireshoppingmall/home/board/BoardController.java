package com.tireshoppingmall.home.board;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {
	@Autowired
	private AskDAO aDAO;
	
	@RequestMapping(value = "/board.notice", method = RequestMethod.GET)
	public String boardNotice(Model model) {
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<span style=\"color: white;\">></span> 공지사항");
		model.addAttribute("board_whereAmITwo", "공지사항");
		model.addAttribute("board_contents", "board_notice.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/board.event", method = RequestMethod.GET)
	public String boardEvent(Model model) {
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<span style=\"color: white;\">></span> 이벤트");
		model.addAttribute("board_whereAmITwo", "이벤트");
		model.addAttribute("board_contents", "board_event.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/board.shoppingGuide", method = RequestMethod.GET)
	public String boardShoppingGuide(Model model) {
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<span style=\"color: white;\">></span> 구매가이드");
		model.addAttribute("board_whereAmITwo", "구매가이드");
		model.addAttribute("board_contents", "board_shoppingGuide.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/board.faq", method = RequestMethod.GET)
	public String boardFAQ(Model model) {
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<span style=\"color: white;\">></span> FAQ");
		model.addAttribute("board_whereAmITwo", "FAQ");
		model.addAttribute("board_contents", "board_faq.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/board.ask", method = RequestMethod.GET)
	public String boardAsk(Model model) {
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<span style=\"color: white;\">></span> 1:1문의");
		model.addAttribute("board_whereAmITwo", "1:1문의");
		if (true) {
			model.addAttribute("board_contents", "board_ask_loginRequired.jsp");
		} else if (false) {
			model.addAttribute("board_contents", "board_ask_loginRequired.jsp");
		}
		return "index";
	}
	
	@RequestMapping(value = "/board.ask.readall", method = RequestMethod.GET)
	public String boardAskReadAll(AskDTO a, HttpServletRequest req, Model model) {
		AskCountOption.clearAskSearch(req);
		
		aDAO.readAll(1, req);
		
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<span style=\"color: white;\">></span> 1:1문의");
		model.addAttribute("board_whereAmITwo", "1:1문의");
		model.addAttribute("board_contents", "board_ask_readAll.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/board.ask.readone", method = RequestMethod.GET)
	public String boardAskReadOne(Model model) {
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<span style=\"color: white;\">></span> 1:1문의");
		model.addAttribute("board_whereAmITwo", "1:1문의");
		model.addAttribute("board_contents", "board_ask_readOne.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/board.ask.create", method = RequestMethod.GET)
	public String boardAskCreate(Model model) {
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<span style=\"color: white;\">></span> 1:1문의");
		model.addAttribute("board_whereAmITwo", "1:1문의");
		model.addAttribute("board_contents", "board_ask_create.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/board.ask.update", method = RequestMethod.GET)
	public String boardAskUpdate(Model model) {
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<span style=\"color: white;\">></span> 1:1문의");
		model.addAttribute("board_whereAmITwo", "1:1문의");
		model.addAttribute("board_contents", "board_ask_update.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/board.ask.delete", method = RequestMethod.GET)
	public String boardAskDelete(Model model) {
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<span style=\"color: white;\">></span> 1:1문의");
		model.addAttribute("board_whereAmITwo", "1:1문의");
		model.addAttribute("board_contents", "board_ask_delete.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/board.kakao", method = RequestMethod.GET)
	public String boardKakao(Model model) {
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<span style=\"color: white;\">></span> 카카오톡상담");
		model.addAttribute("board_whereAmITwo", "카카오톡상담");
		model.addAttribute("board_contents", "board_kakao.jsp");
		return "index";
	}
}
