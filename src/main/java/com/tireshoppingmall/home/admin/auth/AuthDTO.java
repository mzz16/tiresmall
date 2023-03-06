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

	// my_car

	private String mc_number;
	private String mc_id;
	private String mc_model;
	private String mc_brand;
	private int mc_year;

	public AuthDTO() {
	}

	public AuthDTO(String a_id, String a_pw, String a_Sortation, String a_name, String a_phone, String a_address,
			Date a_date, String mc_number, String mc_id, String mc_model, String mc_brand, int mc_year) {
		super();
		this.a_id = a_id;
		this.a_pw = a_pw;
		this.a_Sortation = a_Sortation;
		this.a_name = a_name;
		this.a_phone = a_phone;
		this.a_address = a_address;
		this.a_date = a_date;
		this.mc_number = mc_number;
		this.mc_id = mc_id;
		this.mc_model = mc_model;
		this.mc_brand = mc_brand;
		this.mc_year = mc_year;
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

	public String getMc_number() {
		return mc_number;
	}

	public void setMc_number(String mc_number) {
		this.mc_number = mc_number;
	}

	public String getMc_id() {
		return mc_id;
	}

	public void setMc_id(String mc_id) {
		this.mc_id = mc_id;
	}

	public String getMc_model() {
		return mc_model;
	}

	public void setMc_model(String mc_model) {
		this.mc_model = mc_model;
	}

	public String getMc_brand() {
		return mc_brand;
	}

	public void setMc_brand(String mc_brand) {
		this.mc_brand = mc_brand;
	}

	public int getMc_year() {
		return mc_year;
	}

	public void setMc_year(int mc_year) {
		this.mc_year = mc_year;
	}

	@Override
	public String toString() {
		return "AuthDTO [a_id=" + a_id + ", a_pw=" + a_pw + ", a_Sortation=" + a_Sortation + ", a_name=" + a_name
				+ ", a_phone=" + a_phone + ", a_address=" + a_address + ", a_date=" + a_date + ", mc_number="
				+ mc_number + ", mc_id=" + mc_id + ", mc_model=" + mc_model + ", mc_brand=" + mc_brand + ", mc_year="
				+ mc_year + "]";
	}
	
	
}
