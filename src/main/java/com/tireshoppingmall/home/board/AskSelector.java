package com.tireshoppingmall.home.board;

import java.math.BigDecimal;

public class AskSelector {
	private String askSearch;
	private BigDecimal begin;
	private BigDecimal last;
	private String u_id;
	public AskSelector() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AskSelector(String askSearch, BigDecimal begin, BigDecimal last, String u_id) {
		super();
		this.askSearch = askSearch;
		this.begin = begin;
		this.last = last;
		this.u_id = u_id;
	}
	public String getAskSearch() {
		return askSearch;
	}
	public void setAskSearch(String askSearch) {
		this.askSearch = askSearch;
	}
	public BigDecimal getBegin() {
		return begin;
	}
	public void setBegin(BigDecimal begin) {
		this.begin = begin;
	}
	public BigDecimal getLast() {
		return last;
	}
	public void setLast(BigDecimal last) {
		this.last = last;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
}
