package com.tireshoppingmall.home.auth;

import java.math.BigDecimal;

public class AuthUserDTO {

	private int u_no;
	private String u_id;
	private int u_logintype;
	private String i_name;
	
	// 1:1문의 페이징관련
	private BigDecimal begin;
	private BigDecimal last;
	
	public AuthUserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AuthUserDTO(int u_no, String u_id, int u_logintype, String i_name, BigDecimal begin, BigDecimal last) {
		super();
		this.u_no = u_no;
		this.u_id = u_id;
		this.u_logintype = u_logintype;
		this.i_name = i_name;
		this.begin = begin;
		this.last = last;
	}
	public int getU_no() {
		return u_no;
	}
	public void setU_no(int u_no) {
		this.u_no = u_no;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public int getU_logintype() {
		return u_logintype;
	}
	public void setU_logintype(int u_logintype) {
		this.u_logintype = u_logintype;
	}
	public String getI_name() {
		return i_name;
	}
	public void setI_name(String i_name) {
		this.i_name = i_name;
	}
	public BigDecimal getBegin() {
		return begin;
	}
	public void setBegin(BigDecimal begin) {
		this.begin = begin;
	}
	public BigDecimal getLast() {
		return last;
	}
	public void setLast(BigDecimal last) {
		this.last = last;
	}
}
