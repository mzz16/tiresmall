package com.tireshoppingmall.home.board;

import javax.servlet.http.HttpServletRequest;

public class BoardQnaCountOption {
	private int qnaCountPerPage;
	public BoardQnaCountOption() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoardQnaCountOption(int qnaCountPerPage) {
		super();
		this.qnaCountPerPage = qnaCountPerPage;
	}
	public int getQnaCountPerPage() {
		return qnaCountPerPage;
	}
	public void setQnaCountPerPage(int qnaCountPerPage) {
		this.qnaCountPerPage = qnaCountPerPage;
	}
	public static void clearQnaSearch(HttpServletRequest req) {
		req.getSession().setAttribute("QnaSearch", null);
	}
}
