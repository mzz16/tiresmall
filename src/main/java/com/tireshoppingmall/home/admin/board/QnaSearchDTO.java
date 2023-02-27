package com.tireshoppingmall.home.admin.board;

import java.math.BigDecimal;

public class QnaSearchDTO {

	private String nameInput;
	private String idInput;
	private String titleInput;
	private BigDecimal start;
	private BigDecimal end;

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
	@Override
	public String toString() {
		return "QnaSearchDTO [nameInput=" + nameInput + ", idInput=" + idInput + ", titleInput=" + titleInput
				+ ", start=" + start + ", end=" + end + "]";
	}

	


	
	
}
