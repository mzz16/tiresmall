package com.tireshoppingmall.home.board;

import java.util.Date;

public class AskReplyDTO {
	private int ar_number;
	private int ar_number_fk;
	private String ar_text;
	private String ar_photo;
	private Date ar_date;
	public AskReplyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AskReplyDTO(int ar_number, int ar_number_fk, String ar_text, String ar_photo, Date ar_date) {
		super();
		this.ar_number = ar_number;
		this.ar_number_fk = ar_number_fk;
		this.ar_text = ar_text;
		this.ar_photo = ar_photo;
		this.ar_date = ar_date;
	}
	public int getAr_number() {
		return ar_number;
	}
	public void setAr_number(int ar_number) {
		this.ar_number = ar_number;
	}
	public int getAr_number_fk() {
		return ar_number_fk;
	}
	public void setAr_number_fk(int ar_number_fk) {
		this.ar_number_fk = ar_number_fk;
	}
	public String getAr_text() {
		return ar_text;
	}
	public void setAr_text(String ar_text) {
		this.ar_text = ar_text;
	}
	public String getAr_photo() {
		return ar_photo;
	}
	public void setAr_photo(String ar_photo) {
		this.ar_photo = ar_photo;
	}
	public Date getAr_date() {
		return ar_date;
	}
	public void setAr_date(Date ar_date) {
		this.ar_date = ar_date;
	}
}
