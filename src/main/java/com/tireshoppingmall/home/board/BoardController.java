package com.tireshoppingmall.home.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {
	@RequestMapping(value = "/board.notice", method = RequestMethod.GET)
	public String boardNotice(Model model) {
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_contents", "board_notice.jsp");
		model.addAttribute("board_whereAmIOne", "<span style=\"color: white;\">></span> 공지사항");
		model.addAttribute("board_whereAmITwo", "공지사항");
		return "index";
	}
	
	@RequestMapping(value = "/board.event", method = RequestMethod.GET)
	public String boardEvent(Model model) {
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_contents", "board_event.jsp");
		model.addAttribute("board_whereAmIOne", "<span style=\"color: white;\">></span> 이벤트");
		model.addAttribute("board_whereAmITwo", "이벤트");
		return "index";
	}
	
	@RequestMapping(value = "/board.shoppingGuide", method = RequestMethod.GET)
	public String boardShoppingGuide(Model model) {
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_contents", "board_shoppingGuide.jsp");
		model.addAttribute("board_whereAmIOne", "<span style=\"color: white;\">></span> 구매가이드");
		model.addAttribute("board_whereAmITwo", "구매가이드");
		return "index";
	}
	
	@RequestMapping(value = "/board.faq", method = RequestMethod.GET)
	public String boardFAQ(Model model) {
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_contents", "board_faq.jsp");
		model.addAttribute("board_whereAmIOne", "<span style=\"color: white;\">></span> FAQ");
		model.addAttribute("board_whereAmITwo", "FAQ");
		return "index";
	}
	
	@RequestMapping(value = "/board.askBySite", method = RequestMethod.GET)
	public String boardAskBySite(Model model) {
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_contents", "board_askBySite.jsp");
		model.addAttribute("board_whereAmIOne", "<span style=\"color: white;\">></span> 1:1문의게시판");
		model.addAttribute("board_whereAmITwo", "1:1문의게시판");
		return "index";
	}
	
	@RequestMapping(value = "/board.askByKakao", method = RequestMethod.GET)
	public String boardAskByKakao(Model model) {
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_contents", "board_askByKakao.jsp");
		model.addAttribute("board_whereAmIOne", "<span style=\"color: white;\">></span> 카카오톡상담");
		model.addAttribute("board_whereAmITwo", "카카오톡상담");
		return "index";
	}
}
