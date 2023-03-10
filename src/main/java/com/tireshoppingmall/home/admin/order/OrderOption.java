package com.tireshoppingmall.home.admin.order;

public class OrderOption {

	private int orderCountPerPage;

	public OrderOption() {
		// TODO Auto-generated constructor stub
	}
	
	public OrderOption(int orderCountPerPage) {
		super();
		this.orderCountPerPage = orderCountPerPage;
	}
	public int getOrderCountPerPage() {
		return orderCountPerPage;
	}

	public void setOrderCountPerPage(int orderCountPerPage) {
		this.orderCountPerPage = orderCountPerPage;
	}
	
	
	
}
