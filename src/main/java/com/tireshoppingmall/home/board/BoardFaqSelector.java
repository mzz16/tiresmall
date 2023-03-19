package com.tireshoppingmall.home.board;

import java.math.BigDecimal;

public class BoardFaqSelector {
	private BigDecimal begin;
	private BigDecimal last;
	private String faqSearch;
	public BoardFaqSelector() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoardFaqSelector(BigDecimal begin, BigDecimal last, String faqSearch) {
		super();
		this.begin = begin;
		this.last = last;
		this.faqSearch = faqSearch;
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
	public String getFaqSearch() {
		return faqSearch;
	}
	public void setFaqSearch(String faqSearch) {
		this.faqSearch = faqSearch;
	}
}
