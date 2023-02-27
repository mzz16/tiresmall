package com.tireshoppingmall.home.admin.board;

import java.util.Date;

public class QnaDTO {

	private String q_no;
	private String q_title;
	private String q_txt;
	private Date q_date;
	private String q_id;
	private String a_name;
	private int q_reply_has;
	
	public String getQ_no() {
		return q_no;
	}
	public void setQ_no(String q_no) {
		this.q_no = q_no;
	}
	public String getQ_title() {
		return q_title;
	}
	public void setQ_title(String q_title) {
		this.q_title = q_title;
	}
	public String getQ_txt() {
		return q_txt;
	}
	public void setQ_txt(String q_txt) {
		this.q_txt = q_txt;
	}
	public Date getQ_date() {
		return q_date;
	}
	public void setQ_date(Date q_date) {
		this.q_date = q_date;
	}
	public String getQ_id() {
		return q_id;
	}
	public void setQ_id(String q_id) {
		this.q_id = q_id;
	}
	public String getA_name() {
		return a_name;
	}
	public void setA_name(String a_name) {
		this.a_name = a_name;
	}
	
	
	
	public int getQ_reply_has() {
		return q_reply_has;
	}
	public void setQ_reply_has(int q_reply_has) {
		this.q_reply_has = q_reply_has;
	}
	@Override
	public String toString() {
		return "QnaDTO [q_no=" + q_no + ", q_title=" + q_title + ", q_txt=" + q_txt + ", q_date=" + q_date + ", q_id="
				+ q_id + ", a_name=" + a_name + ", q_reply_has=" + q_reply_has + "]";
	}

	
}
