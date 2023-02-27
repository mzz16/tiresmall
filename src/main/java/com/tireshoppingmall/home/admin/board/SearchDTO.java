package com.tireshoppingmall.home.admin.board;

import java.math.BigDecimal;

public class SearchDTO {

	private String selectOption;
	private String titleInput;
	private BigDecimal start;
	private BigDecimal end;

	

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
