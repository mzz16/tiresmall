package com.tireshoppingmall.home.board;

import java.util.Date;

public class AskDTO {
	private int rownumber;
	private int q_no;
	private String q_title;
	private String q_txt;
	private Date q_date;
	private String q_id;
	private int q_reply_has;
	private AskReplyDTO a_reply;
	/*
	private String a_owner_fk;
	private String a_sortation;
	private String a_title;
	private String a_text;
	private String a_photo;
	private Date a_date;
	private String a_status;
	private AskReplyDTO a_reply;
	*/
	public AskDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AskDTO(int rownumber, int q_no, String q_title, String q_txt, Date q_date, String q_id, int q_reply_has,
			AskReplyDTO a_reply) {
		super();
		this.rownumber = rownumber;
		this.q_no = q_no;
		this.q_title = q_title;
		this.q_txt = q_txt;
		this.q_date = q_date;
		this.q_id = q_id;
		this.q_reply_has = q_reply_has;
		this.a_reply = a_reply;
	}
	public int getRownumber() {
		return rownumber;
	}
	public void setRownumber(int rownumber) {
		this.rownumber = rownumber;
	}
	public int getQ_no() {
		return q_no;
	}
	public void setQ_no(int q_no) {
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
	public int getQ_reply_has() {
		return q_reply_has;
	}
	public void setQ_reply_has(int q_reply_has) {
		this.q_reply_has = q_reply_has;
	}
	public AskReplyDTO getA_reply() {
		return a_reply;
	}
	public void setA_reply(AskReplyDTO a_reply) {
		this.a_reply = a_reply;
	}
}
