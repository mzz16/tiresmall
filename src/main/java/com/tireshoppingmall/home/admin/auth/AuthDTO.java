package com.tireshoppingmall.home.admin.auth;

import java.util.Date;

public class AuthDTO {
	private String a_id;
	private String a_pw;
	private String a_Sortation;
	private String a_name;
	private String a_phone;
	private String a_address;
	private Date a_date;
	
	public AuthDTO() {
		// TODO Auto-generated constructor stub
	}

	public AuthDTO(String a_id, String a_pw, String a_Sortation, String a_name, String a_phone, String a_address,
			Date a_date) {
		super();
		this.a_id = a_id;
		this.a_pw = a_pw;
		this.a_Sortation = a_Sortation;
		this.a_name = a_name;
		this.a_phone = a_phone;
		this.a_address = a_address;
		this.a_date = a_date;
	}

	public String getA_id() {
		return a_id;
	}

	public void setA_id(String a_id) {
		this.a_id = a_id;
	}

	public String getA_pw() {
		return a_pw;
	}

	public void setA_pw(String a_pw) {
		this.a_pw = a_pw;
	}

	public String getA_Sortation() {
		return a_Sortation;
	}

	public void setA_Sortation(String a_Sortation) {
		this.a_Sortation = a_Sortation;
	}

	public String getA_name() {
		return a_name;
	}

	public void setA_name(String a_name) {
		this.a_name = a_name;
	}

	public String getA_phone() {
		return a_phone;
	}

	public void setA_phone(String a_phone) {
		this.a_phone = a_phone;
	}

	public String getA_address() {
		return a_address;
	}

	public void setA_address(String a_address) {
		this.a_address = a_address;
	}

	public Date getA_date() {
		return a_date;
	}

	public void setA_date(Date a_date) {
		this.a_date = a_date;
	}
	

	
	
	
}
