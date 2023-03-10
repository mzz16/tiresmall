package com.tireshoppingmall.home.admin.car;

public class CarBrandDTO {
	private String cb_name;
	private String cb_ea;
	private String cb_order;
	
	
	@Override
	public String toString() {
		return "CarBrandDTO [cb_name=" + cb_name + ", cb_ea=" + cb_ea + ", cb_order=" + cb_order + "]";
	}
	public String getCb_name() {
		return cb_name;
	}
	public void setCb_name(String cb_name) {
		this.cb_name = cb_name;
	}
	public String getCb_ea() {
		return cb_ea;
	}
	public void setCb_ea(String cb_ea) {
		this.cb_ea = cb_ea;
	}
	public String getCb_order() {
		return cb_order;
	}
	public void setCb_order(String cb_order) {
		this.cb_order = cb_order;
	}
	
	public CarBrandDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarBrandDTO(String cb_name, String cb_ea, String cb_order, int cb_count) {
		super();
		this.cb_name = cb_name;
		this.cb_ea = cb_ea;
		this.cb_order = cb_order;
	
	}
	
	
	
	
	
	
	
	
	
}
