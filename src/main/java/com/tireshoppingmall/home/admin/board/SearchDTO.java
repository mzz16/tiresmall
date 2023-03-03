package com.tireshoppingmall.home.admin.board;

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;

public class SearchDTO {

	private String selectOption;
	private String titleInput;
	private BigDecimal start;
	private BigDecimal end;
	private String nameInput;
	private String idInput;
	
	public SearchDTO() {
		// TODO Auto-generated constructor stub
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


	public String getNameInput() {
		return nameInput;
	}


	public void setNameInput(String nameInput) {
		this.nameInput = nameInput;
	}


	public String getIdInput() {
		return idInput;
	}


	public void setIdInput(String idInput) {
		this.idInput = idInput;
	}


	public SearchDTO(String selectOption, String titleInput, BigDecimal start, BigDecimal end, String nameInput,
			String idInput) {
		super();
		this.selectOption = selectOption;
		this.titleInput = titleInput;
		this.start = start;
		this.end = end;
		this.nameInput = nameInput;
		this.idInput = idInput;
	}


	public static void clearSearch(HttpServletRequest req) {
		req.getSession().setAttribute("searchDTO", null);
	}


	@Override
	public String toString() {
		return "SearchDTO [selectOption=" + selectOption + ", titleInput=" + titleInput + ", start=" + start + ", end="
				+ end + ", nameInput=" + nameInput + ", idInput=" + idInput + "]";
	}

	
	
}
