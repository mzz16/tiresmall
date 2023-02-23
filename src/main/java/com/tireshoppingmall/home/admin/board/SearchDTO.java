package com.tireshoppingmall.home.admin.board;

import java.math.BigDecimal;

public class SearchDTO {

	private String selectOption;
	private String titleInput;
	private BigDecimal start;
	private BigDecimal end;
	
	public SearchDTO() {
		// TODO Auto-generated constructor stub
	}

	public SearchDTO(String selectOption, String titleInput, BigDecimal start, BigDecimal end) {
		super();
		this.selectOption = selectOption;
		this.titleInput = titleInput;
		this.start = start;
		this.end = end;
	}

	public String getSelectOption() {
		return selectOption;
	}

	public void setSelectOption(String selectOption) {
		this.selectOption = selectOption;
	}

	public String getTitleInput() {
		return titleInput;
	}

	public void setTitleInput(String titleInput) {
		this.titleInput = titleInput;
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
