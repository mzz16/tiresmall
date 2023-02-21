package com.tireshoppingmall.home.admin.board;

import java.util.Date;

public class NoticeDTO {

	private String n_id;
	private String n_sortation;
	private String n_title;
	private String n_txt;
	private Date n_date;
	private String selectOption;
	
	
	public NoticeDTO() {
		// TODO Auto-generated constructor stub
	}


	public NoticeDTO(String n_id, String n_sortation, String n_title, String n_txt, Date n_date, String selectOption) {
		super();
		this.n_id = n_id;
		this.n_sortation = n_sortation;
		this.n_title = n_title;
		this.n_txt = n_txt;
		this.n_date = n_date;
		this.selectOption = selectOption;
	}


	public String getN_id() {
		return n_id;
	}


	public void setN_id(String n_id) {
		this.n_id = n_id;
	}


	public String getN_sortation() {
		return n_sortation;
	}


	public void setN_sortation(String n_sortation) {
		this.n_sortation = n_sortation;
	}


	public String getN_title() {
		return n_title;
	}


	public void setN_title(String n_title) {
		this.n_title = n_title;
	}


	public String getN_txt() {
		return n_txt;
	}


	public void setN_txt(String n_txt) {
		this.n_txt = n_txt;
	}


	public Date getN_date() {
		return n_date;
	}


	public void setN_date(Date n_date) {
		this.n_date = n_date;
	}


	public String getSelectOption() {
		return selectOption;
	}


	public void setSelectOption(String selectOption) {
		this.selectOption = selectOption;
	}


	
	
	
	
}
