package com.tireshoppingmall.home.order;

public class CartDTO {
	private int tg_id;
	private String tg_brand;
	private String tg_name;
	private String tg_img;
	private int tg_dcrate;
	private int ti_width;
	private int ti_ratio;
	private int ti_inch;
	private int ti_stock;
	private int ti_pricegp;
	private int ti_pricefac;
	
	public CartDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CartDTO(int tg_id, String tg_brand, String tg_name, String tg_img, int tg_dcrate, int ti_width, int ti_ratio,
			int ti_inch, int ti_stock, int ti_pricegp, int ti_pricefac) {
		super();
		this.tg_id = tg_id;
		this.tg_brand = tg_brand;
		this.tg_name = tg_name;
		this.tg_img = tg_img;
		this.tg_dcrate = tg_dcrate;
		this.ti_width = ti_width;
		this.ti_ratio = ti_ratio;
		this.ti_inch = ti_inch;
		this.ti_stock = ti_stock;
		this.ti_pricegp = ti_pricegp;
		this.ti_pricefac = ti_pricefac;
	}

	public int getTg_id() {
		return tg_id;
	}

	public void setTg_id(int tg_id) {
		this.tg_id = tg_id;
	}

	public String getTg_brand() {
		return tg_brand;
	}

	public void setTg_brand(String tg_brand) {
		this.tg_brand = tg_brand;
	}

	public String getTg_name() {
		return tg_name;
	}

	public void setTg_name(String tg_name) {
		this.tg_name = tg_name;
	}

	public String getTg_img() {
		return tg_img;
	}

	public void setTg_img(String tg_img) {
		this.tg_img = tg_img;
	}

	public int getTg_dcrate() {
		return tg_dcrate;
	}

	public void setTg_dcrate(int tg_dcrate) {
		this.tg_dcrate = tg_dcrate;
	}

	public int getTi_width() {
		return ti_width;
	}

	public void setTi_width(int ti_width) {
		this.ti_width = ti_width;
	}

	public int getTi_ratio() {
		return ti_ratio;
	}

	public void setTi_ratio(int ti_ratio) {
		this.ti_ratio = ti_ratio;
	}

	public int getTi_inch() {
		return ti_inch;
	}

	public void setTi_inch(int ti_inch) {
		this.ti_inch = ti_inch;
	}

	public int getTi_stock() {
		return ti_stock;
	}

	public void setTi_stock(int ti_stock) {
		this.ti_stock = ti_stock;
	}

	public int getTi_pricegp() {
		return ti_pricegp;
	}

	public void setTi_pricegp(int ti_pricegp) {
		this.ti_pricegp = ti_pricegp;
	}

	public int getTi_pricefac() {
		return ti_pricefac;
	}

	public void setTi_pricefac(int ti_pricefac) {
		this.ti_pricefac = ti_pricefac;
	}
}
