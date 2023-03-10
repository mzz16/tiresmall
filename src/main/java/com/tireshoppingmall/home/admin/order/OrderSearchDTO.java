package com.tireshoppingmall.home.admin.order;

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;

public class OrderSearchDTO {

	private BigDecimal start;
	private BigDecimal end;
	private String dateSearch1;
	private String dateSearch2;
	private String nameInput;
	private String phoneInput;
	private String orderNumberInput;
	
	public OrderSearchDTO() {
		// TODO Auto-generated constructor stub
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

	public String getDateSearch1() {
		return dateSearch1;
	}

	public void setDateSearch1(String dateSearch1) {
		this.dateSearch1 = dateSearch1;
	}

	public String getDateSearch2() {
		return dateSearch2;
	}

	public void setDateSearch2(String dateSearch2) {
		this.dateSearch2 = dateSearch2;
	}

	public String getNameInput() {
		return nameInput;
	}

	public void setNameInput(String nameInput) {
		this.nameInput = nameInput;
	}

	public String getPhoneInput() {
		return phoneInput;
	}

	public void setPhoneInput(String phoneInput) {
		this.phoneInput = phoneInput;
	}

	public String getOrderNumberInput() {
		return orderNumberInput;
	}

	public void setOrderNumberInput(String orderNumberInput) {
		this.orderNumberInput = orderNumberInput;
	}

	public OrderSearchDTO(BigDecimal start, BigDecimal end, String dateSearch1, String dateSearch2, String nameInput,
			String phoneInput, String orderNumberInput) {
		super();
		this.start = start;
		this.end = end;
		this.dateSearch1 = dateSearch1;
		this.dateSearch2 = dateSearch2;
		this.nameInput = nameInput;
		this.phoneInput = phoneInput;
		this.orderNumberInput = orderNumberInput;
	}

	@Override
	public String toString() {
		return "SearchDTO [start=" + start + ", end=" + end + ", dateSearch1=" + dateSearch1 + ", dateSearch2="
				+ dateSearch2 + ", nameInput=" + nameInput + ", phoneInput=" + phoneInput + ", orderNumberInput="
				+ orderNumberInput + "]";
	}

	public static void clearsearch(HttpServletRequest req) {
		req.getSession().setAttribute("orderSearchDTO", null);		
	}
	
}
