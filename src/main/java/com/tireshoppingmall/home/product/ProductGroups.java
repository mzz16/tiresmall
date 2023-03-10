package com.tireshoppingmall.home.product;

import java.util.List;

public class ProductGroups {
	private List<ProductGroupDTO> pGroups;
	private int pageCount;
	private int theNumber;
	private int curPage;
	
	public ProductGroups() {
		// TODO Auto-generated constructor stub
	}

	public ProductGroups(List<ProductGroupDTO> pGroups, int pageCount, int theNumber, int curPage) {
		super();
		this.pGroups = pGroups;
		this.pageCount = pageCount;
		this.theNumber = theNumber;
		this.curPage = curPage;
	}

	public List<ProductGroupDTO> getpGroups() {
		return pGroups;
	}

	public void setpGroups(List<ProductGroupDTO> pGroups) {
		this.pGroups = pGroups;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getTheNumber() {
		return theNumber;
	}

	public void setTheNumber(int theNumber) {
		this.theNumber = theNumber;
	}

	public int getCurPage() {
		return curPage;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	
	
}
