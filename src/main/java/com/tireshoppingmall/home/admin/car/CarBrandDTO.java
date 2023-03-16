package com.tireshoppingmall.home.admin.car;

public class CarBrandDTO {
	private String cb_name;
	private String old_cb_name;
	private String new_cb_name;
	private String cb_ea;
	private int cb_order;
	
	public CarBrandDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarBrandDTO(String cb_name, String old_cb_name, String new_cb_name, String cb_ea, int cb_order) {
		super();
		this.cb_name = cb_name;
		this.old_cb_name = old_cb_name;
		this.new_cb_name = new_cb_name;
		this.cb_ea = cb_ea;
		this.cb_order = cb_order;
	}

	public String getCb_name() {
		return cb_name;
	}

	public void setCb_name(String cb_name) {
		this.cb_name = cb_name;
	}

	public String getOld_cb_name() {
		return old_cb_name;
	}

	public void setOld_cb_name(String old_cb_name) {
		this.old_cb_name = old_cb_name;
	}

	public String getNew_cb_name() {
		return new_cb_name;
	}

	public void setNew_cb_name(String new_cb_name) {
		this.new_cb_name = new_cb_name;
	}

	public String getCb_ea() {
		return cb_ea;
	}

	public void setCb_ea(String cb_ea) {
		this.cb_ea = cb_ea;
	}

	public int getCb_order() {
		return cb_order;
	}

	public void setCb_order(int cb_order) {
		this.cb_order = cb_order;
	}

	@Override
	public String toString() {
		return "CarBrandDTO [cb_name=" + cb_name + ", old_cb_name=" + old_cb_name + ", new_cb_name=" + new_cb_name
				+ ", cb_ea=" + cb_ea + ", cb_order=" + cb_order + "]";
	}
	
	
	
	
}
