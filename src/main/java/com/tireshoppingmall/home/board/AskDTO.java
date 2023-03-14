package com.tireshoppingmall.home.board;

import java.util.Date;

public class AskDTO {
	private int rownumber;
	private int a_number;
	private String a_owner_fk;
	private String a_sortation;
	private String a_title;
	private String a_text;
	private String a_photo;
	private Date a_date;
	private String a_status;
	private AskReplyDTO a_reply;
	public AskDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AskDTO(int rownumber, int a_number, String a_owner_fk, String a_sortation, String a_title, String a_text,
			String a_photo, Date a_date, String a_status, AskReplyDTO a_reply) {
		super();
		this.rownumber = rownumber;
		this.a_number = a_number;
		this.a_owner_fk = a_owner_fk;
		this.a_sortation = a_sortation;
		this.a_title = a_title;
		this.a_text = a_text;
		this.a_photo = a_photo;
		this.a_date = a_date;
		this.a_status = a_status;
		this.a_reply = a_reply;
	}
	public int getRownumber() {
		return rownumber;
	}
	public void setRownumber(int rownumber) {
		this.rownumber = rownumber;
	}
	public int getA_number() {
		return a_number;
	}
	public void setA_number(int a_number) {
		this.a_number = a_number;
	}
	public String getA_owner_fk() {
		return a_owner_fk;
	}
	public void setA_owner_fk(String a_owner_fk) {
		this.a_owner_fk = a_owner_fk;
	}
	public String getA_sortation() {
		return a_sortation;
	}
	public void setA_sortation(String a_sortation) {
		this.a_sortation = a_sortation;
	}
	public String getA_title() {
		return a_title;
	}
	public void setA_title(String a_title) {
		this.a_title = a_title;
	}
	public String getA_text() {
		return a_text;
	}
	public void setA_text(String a_text) {
		this.a_text = a_text;
	}
	public String getA_photo() {
		return a_photo;
	}
	public void setA_photo(String a_photo) {
		this.a_photo = a_photo;
	}
	public Date getA_date() {
		return a_date;
	}
	public void setA_date(Date a_date) {
		this.a_date = a_date;
	}
	public String getA_status() {
		return a_status;
	}
	public void setA_status(String a_status) {
		this.a_status = a_status;
	}
	public AskReplyDTO getA_reply() {
		return a_reply;
	}
	public void setA_reply(AskReplyDTO a_reply) {
		this.a_reply = a_reply;
	}
}
