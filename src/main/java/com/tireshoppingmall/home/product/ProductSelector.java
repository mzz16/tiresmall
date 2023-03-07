package com.tireshoppingmall.home.product;

import java.math.BigDecimal;

public class ProductSelector {
	private String search;
	private String searchBrand;
	private BigDecimal start;
	private BigDecimal end;
	
	public ProductSelector() {
		// TODO Auto-generated constructor stub
	}

	public ProductSelector(String search, String searchBrand, BigDecimal start, BigDecimal end) {
		super();
		this.search = search;
		this.searchBrand = searchBrand;
		this.start = start;
		this.end = end;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String getSearchBrand() {
		return searchBrand;
	}

	public void setSearchBrand(String searchBrand) {
		this.searchBrand = searchBrand;
	}

	public BigDecimal getStart() {
		return start;
	}

	public void setStart(BigDecimal start) {
		this.start = start;
	}

	public BigDecimal getEnd() {
		return end;
	}

	public void setEnd(BigDecimal end) {
		this.end = end;
	}
	
	
}
