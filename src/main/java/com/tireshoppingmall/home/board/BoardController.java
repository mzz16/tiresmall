package com.tireshoppingmall.home.board;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tireshoppingmall.home.auth.AuthUserDTO;
import com.tireshoppingmall.home.auth.MemberDAO;

@Controller
public class BoardController {
	
	@Autowired
	private BoardFaqDAO bfDAO;
	
	@Autowired
	private MemberDAO mDAO;
	
	@Autowired
	private BoardQnaDAO bqDAO;
	
	/*
	private boolean BoardFaqFirstReq;
	private boolean BoardQnaFirstReq;
	
	public BoardController() {
		BoardFaqFirstReq = true;
		BoardQnaFirstReq = true;
	}
	*/
	
	@RequestMapping(value = "/board.faq.readall", method = RequestMethod.GET)
	public String boardFaqReadall(HttpServletRequest req, Model model) {
		// BoardFaqCountOption.clearFaqSearch(req);
		req.getSession().setAttribute("FaqSearch", null);
		
		// bfDAO.calculateFaqCount(req);
		
		bfDAO.readallFaq(1, req);
		
		/*
		if (BoardFaqFirstReq) {
			bfDAO.calculateFaqCount(req);
			BoardFaqFirstReq = false;
		}
		*/
		
		/*
		BoardQnaCountOption.clearQnaSearch(req);
		 */
		
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<i class=\"fa-solid fa-chevron-right\"></i> FAQ");
		model.addAttribute("board_whereAmITwo", "FAQ");
		model.addAttribute("board_contents", "board_faq.jsp");
		return "index";
	}
	@RequestMapping(value = "/board.faq.readsearched", method = RequestMethod.GET)
	public String boardFaqReadsearched(BoardFaqSelector bfSel, HttpServletRequest req, Model model) {
		req.getSession().setAttribute("search", bfSel);
		
		bfDAO.calculateFaqCount(req);
		/*
		if (BoardFaqFirstReq) {
			bfDAO.calculateFaqCount(req);
			BoardFaqFirstReq = false;
		}
		*/
		
		/*
		BoardQnaCountOption.clearQnaSearch(req);
		 */
		bfDAO.readallFaq(1, req);
		
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<i class=\"fa-solid fa-chevron-right\"></i> FAQ");
		model.addAttribute("board_whereAmITwo", "FAQ");
		model.addAttribute("board_contents", "board_faq.jsp");
		return "index";
	}
	@RequestMapping(value = "/board.faq.read.paging", method = RequestMethod.GET)
	public String boardFaqSearchReadPaging(HttpServletRequest req, Model model) {
		bfDAO.calculateFaqCount(req);
		/*
		if (BoardFaqFirstReq) {
			bfDAO.calculateFaqCount(req);
			BoardFaqFirstReq = false;
		}
		*/
		
		/*
		BoardQnaCountOption.clearQnaSearch(req);
		 */
		bfDAO.readallFaq(1, req);
		
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<i class=\"fa-solid fa-chevron-right\"></i> FAQ");
		model.addAttribute("board_whereAmITwo", "FAQ");
		model.addAttribute("board_contents", "board_faq.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/board.qna.check", method = RequestMethod.GET)
	public String boardQna(HttpServletRequest req, Model model) {
		if (mDAO.loginCheck(req)) {
			AuthUserDTO auDTO = (AuthUserDTO) req.getSession().getAttribute("loginMember");
			
			model.addAttribute("content", "main/board/board.jsp");
			model.addAttribute("board_whereAmIOne", "<i class=\"fa-solid fa-chevron-right\"></i> 1:1문의");
			model.addAttribute("board_whereAmITwo", "1:1문의");
			return "redirect: board.qna.readall?u_id=" + auDTO.getU_id();
		} else {
			req.getSession().setAttribute("loginRequiredByQna", "YES");
			return "redirect: login";
		}
	}
	
	@RequestMapping(value = "/board.qna.read", method = RequestMethod.GET)
	public String boardQnaRead(HttpServletRequest req, Model model) {
		bqDAO.calculateQnaCount(req);
		/*
		if (BoardQnaFirstReq) {
			bqDAO.calculateQnaCount(req);
			BoardQnaFirstReq = false;
		}
		*/
		
		/*
		BoardQnaCountOption.clearQnaSearch(req);
		 */
		
		bqDAO.readallQna(1, req);
		
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<i class=\"fa-solid fa-chevron-right\"></i> 1:1문의");
		model.addAttribute("board_whereAmITwo", "1:1문의");
		model.addAttribute("board_contents", "board_qna_readall.jsp");
		return "index";
	}
	@RequestMapping(value = "/board.qna.readall.paging", method = RequestMethod.GET)
	public String boardQnaReadallPaging(@RequestParam int pn, HttpServletRequest req, Model model) {
		bqDAO.readallQna(pn, req);
		
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<i class=\"fa-solid fa-chevron-right\"></i> 1:1문의");
		model.addAttribute("board_whereAmITwo", "1:1문의");
		model.addAttribute("board_contents", "board_qna_readall.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/board.qna.readone", method = RequestMethod.GET)
	public String boardQnaReadone(BoardQnaDTO bq, HttpServletRequest req, Model model) {
		bqDAO.readoneQna(bq, req);
		
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<i class=\"fa-solid fa-chevron-right\"></i> 1:1문의");
		model.addAttribute("board_whereAmITwo", "1:1문의");
		model.addAttribute("board_contents", "board_qna_readone.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/board.qna.create.go", method = RequestMethod.GET)
	public String boardQnaCreateGo(Model model) {
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<i class=\"fa-solid fa-chevron-right\"></i> 1:1문의");
		model.addAttribute("board_whereAmITwo", "1:1문의");
		model.addAttribute("board_contents", "board_qna_create.jsp");
		return "index";
	}
	@RequestMapping(value = "/board.qna.create.do", method = RequestMethod.POST)
	public String boardQnaCreateDo(BoardQnaDTO bq, HttpServletRequest req, Model model) {
		bqDAO.createQna(bq, req);
		
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<i class=\"fa-solid fa-chevron-right\"></i> 1:1문의");
		model.addAttribute("board_whereAmITwo", "1:1문의");
		model.addAttribute("board_contents", "board_qna_complete.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/board.qna.update.go", method = RequestMethod.GET)
	public String boardQnaUpdateGo(BoardQnaDTO bq, HttpServletRequest req, Model model) {
		bqDAO.readoneQna(bq, req);
		
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<i class=\"fa-solid fa-chevron-right\"></i> 1:1문의");
		model.addAttribute("board_whereAmITwo", "1:1문의");
		model.addAttribute("board_contents", "board_qna_update.jsp");
		return "index";
	}
	@RequestMapping(value = "/board.qna.update.do", method = RequestMethod.POST)
	public String boardQnaUpdateDo(BoardQnaDTO bq, HttpServletRequest req, Model model) {
		bqDAO.updateQna(bq, req);
		
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<i class=\"fa-solid fa-chevron-right\"></i> 1:1문의");
		model.addAttribute("board_whereAmITwo", "1:1문의");
		model.addAttribute("board_contents", "board_qna_complete.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/board.qna.delete", method = RequestMethod.GET)
	public String boardQnaDelete(BoardQnaDTO bq, HttpServletRequest req, Model model) {
		bqDAO.deleteQna(bq, req);
		
		bqDAO.readallQna(1, req);
		
		model.addAttribute("content", "main/board/board.jsp");
		model.addAttribute("board_whereAmIOne", "<i class=\"fa-solid fa-chevron-right\"></i> 1:1문의");
		model.addAttribute("board_whereAmITwo", "1:1문의");
		model.addAttribute("board_contents", "board_qna_readall.jsp");
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
