package com.tireshoppingmall.home.admin.board;

import java.util.Date;

public class FaqDTO {

	private int f_id;
	private String f_sortation;
	private String f_title;
	private String f_txt;
	private Date f_date;
	private String selectOption;
	
	public FaqDTO() {
		// TODO Auto-generated constructor stub
	}

	public FaqDTO(int f_id, String f_sortation, String f_title, String f_txt, Date f_date, String selectOption) {
		super();
		this.f_id = f_id;
		this.f_sortation = f_sortation;
		this.f_title = f_title;
		this.f_txt = f_txt;
		this.f_date = f_date;
		this.selectOption = selectOption;
	}

	public int getF_id() {
		return f_id;
	}

	public void setF_id(int f_id) {
		this.f_id = f_id;
	}

	public String getF_sortation() {
		return f_sortation;
	}

	public void setF_sortation(String f_sortation) {
		this.f_sortation = f_sortation;
	}

	public String getF_title() {
		return f_title;
	}

	public void setF_title(String f_title) {
		this.f_title = f_title;
	}

	public String getF_txt() {
		return f_txt;
	}

	public void setF_txt(String f_txt) {
		this.f_txt = f_txt;
	}

	public Date getF_date() {
		return f_date;
	}

	public void setF_date(Date f_date) {
		this.f_date = f_date;
	}

	public String getSelectOption() {
		return selectOption;
	}

	public void setSelectOption(String selectOption) {
		this.selectOption = selectOption;
	}
	
	
	
}
