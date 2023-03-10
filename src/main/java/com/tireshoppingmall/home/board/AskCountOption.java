package com.tireshoppingmall.home.board;

import javax.servlet.http.HttpServletRequest;

public class AskCountOption {
	private int askCountPerPage;
	public AskCountOption() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AskCountOption(int askCountPerPage) {
		super();
		this.askCountPerPage = askCountPerPage;
	}
	public int getAskCountPerPage() {
		return askCountPerPage;
	}
	public void setAskCountPerPage(int askCountPerPage) {
		this.askCountPerPage = askCountPerPage;
	}
	public static void clearAskSearch(HttpServletRequest req) {
		req.getSession().setAttribute("AskSearch", null);
	}
}
