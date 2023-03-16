package com.tireshoppingmall.home.admin.store;

import java.math.BigDecimal;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public class SearchBranchDTO {

	
	private String branchareaInput;
	private String branchnameInput;
	private BigDecimal start;
	private BigDecimal end;
	public SearchBranchDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SearchBranchDTO(String branchareaInput, String branchnameInput, BigDecimal start, BigDecimal end) {
		super();
		this.branchareaInput = branchareaInput;
		this.branchnameInput = branchnameInput;
		this.start = start;
		this.end = end;
	}
	public String getBranchareaInput() {
		return branchareaInput;
	}
	public void setBranchareaInput(String branchareaInput) {
		this.branchareaInput = branchareaInput;
	}
	public String getBranchnameInput() {
		return branchnameInput;
	}
	public void setBranchnameInput(String branchnameInput) {
		this.branchnameInput = branchnameInput;
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
	public static void clearSearch(HttpServletRequest req) {
		req.getSession().setAttribute("branchs", null);
		
	}
	
	@Override
	public String toString() {
		return "SearchBranchDTO [branchareaInput=" + branchareaInput + ", branchnameInput=" + branchnameInput
				+ ", start=" + start + ", end=" + end + "]";
	}
	
	
}