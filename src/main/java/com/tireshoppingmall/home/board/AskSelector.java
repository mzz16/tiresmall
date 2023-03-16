package com.tireshoppingmall.home.board;

import java.math.BigDecimal;

public class AskSelector {
	private String askSearch;
	private BigDecimal begin;
	private BigDecimal last;
	public AskSelector() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AskSelector(String askSearch, BigDecimal begin, BigDecimal last) {
		super();
		this.askSearch = askSearch;
		this.begin = begin;
		this.last = last;
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
}
