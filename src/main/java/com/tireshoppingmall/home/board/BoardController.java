package com.tireshoppingmall.home.board;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {
	private boolean askFirstReq;
	
	@Autowired
	private AskDAO aDAO;
	
	public BoardController() {
		askFirstReq = true;
	}
	
	@RequestMapping(value = "/board.faq", method = RequestMethod.GET)
	public String boardFAQ(Model model) {
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<i class=\"fa-solid fa-chevron-right\"></i> FAQ");
		model.addAttribute("board_whereAmITwo", "FAQ");
		model.addAttribute("board_contents", "board_faq.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/board.ask", method = RequestMethod.GET)
	public String boardAsk(Model model) {
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<i class=\"fa-solid fa-chevron-right\"></i> 1:1문의");
		model.addAttribute("board_whereAmITwo", "1:1문의");
		if (true) {
			model.addAttribute("board_contents", "board_ask_loginRequired.jsp");
		} else if (false) {
			model.addAttribute("board_contents", "board_ask_loginRequired.jsp");
		}
		return "index";
	}
	
	@RequestMapping(value = "/board.ask.readall", method = RequestMethod.GET)
	public String boardAskReadall(HttpServletRequest req, Model model) {
		if (askFirstReq) {
			aDAO.calculateAllAskCount();
			askFirstReq = false;
		}
		
		AskCountOption.clearAskSearch(req);
		
		aDAO.readAllAsk(1, req);
		
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<i class=\"fa-solid fa-chevron-right\"></i> 1:1문의");
		model.addAttribute("board_whereAmITwo", "1:1문의");
		model.addAttribute("board_contents", "board_ask_readAll.jsp");
		return "index";
	}
	@RequestMapping(value = "/board.ask.readall.paging", method = RequestMethod.GET)
	public String boardAskReadallPaging(@RequestParam int pn, HttpServletRequest req, Model model) {
		aDAO.readAllAsk(pn, req);
		
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<i class=\"fa-solid fa-chevron-right\"></i> 1:1문의");
		model.addAttribute("board_whereAmITwo", "1:1문의");
		model.addAttribute("board_contents", "board_ask_readAll.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/board.ask.readone", method = RequestMethod.GET)
	public String boardAskReadone(AskDTO a, HttpServletRequest req, Model model) {
		aDAO.readOneAsk(a, req);
		
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<i class=\"fa-solid fa-chevron-right\"></i> 1:1문의");
		model.addAttribute("board_whereAmITwo", "1:1문의");
		model.addAttribute("board_contents", "board_ask_readOne.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/board.ask.create.go", method = RequestMethod.GET)
	public String boardAskCreateGo(Model model) {
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<i class=\"fa-solid fa-chevron-right\"></i> 1:1문의");
		model.addAttribute("board_whereAmITwo", "1:1문의");
		model.addAttribute("board_contents", "board_ask_create.jsp");
		return "index";
	}
	@RequestMapping(value = "/board.ask.create.do", method = RequestMethod.POST)
	public String boardAskCreateDo(AskDTO a, HttpServletRequest req, Model model) {
		aDAO.createAsk(a, req);
		
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<i class=\"fa-solid fa-chevron-right\"></i> 1:1문의");
		model.addAttribute("board_whereAmITwo", "1:1문의");
		model.addAttribute("board_contents", "board_ask_complete.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/board.ask.update.go", method = RequestMethod.GET)
	public String boardAskUpdateGo(AskDTO a, HttpServletRequest req, Model model) {
		aDAO.readOneAsk(a, req);
		
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<i class=\"fa-solid fa-chevron-right\"></i> 1:1문의");
		model.addAttribute("board_whereAmITwo", "1:1문의");
		model.addAttribute("board_contents", "board_ask_update.jsp");
		return "index";
	}
	@RequestMapping(value = "/board.ask.update.do", method = RequestMethod.POST)
	public String boardAskUpdateDo(AskDTO a, HttpServletRequest req, Model model) {
		aDAO.updateAsk(a, req);
		
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<i class=\"fa-solid fa-chevron-right\"></i> 1:1문의");
		model.addAttribute("board_whereAmITwo", "1:1문의");
		model.addAttribute("board_contents", "board_ask_complete.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/board.ask.delete", method = RequestMethod.GET)
	public String boardAskDelete(AskDTO a, HttpServletRequest req, Model model) {
		aDAO.deleteAsk(a, req);
		
		aDAO.readAllAsk(1, req);
		
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<i class=\"fa-solid fa-chevron-right\"></i> 1:1문의");
		model.addAttribute("board_whereAmITwo", "1:1문의");
		model.addAttribute("board_contents", "board_ask_readAll.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/board.notice", method = RequestMethod.GET)
	public String boardNotice(Model model) {
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<i class=\"fa-solid fa-chevron-right\"></i> 공지사항");
		model.addAttribute("board_whereAmITwo", "공지사항");
		model.addAttribute("board_contents", "board_notice.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/board.event", method = RequestMethod.GET)
	public String boardEvent(Model model) {
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<i class=\"fa-solid fa-chevron-right\"></i> 이벤트");
		model.addAttribute("board_whereAmITwo", "이벤트");
		model.addAttribute("board_contents", "board_event.jsp");
		return "index";
	}
}
