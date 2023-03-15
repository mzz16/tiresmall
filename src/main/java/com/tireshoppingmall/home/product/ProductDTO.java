package com.tireshoppingmall.home.product;

public class ProductDTO {
	private int tg_id;
	private String tg_brand;
	private String tg_name;
	private String tg_img;
	private String tg_text;
	private String tg_dcrate;
	private int ti_id;
	private int ti_tg_id;
	private int ti_hg;
	private String ti_speed;
	private int ti_width;
	private int ti_ratio;
	private int ti_inch;
	private int ti_stock;
	private int ti_pricegp;
	private int ti_pricefac;
	private int ti_vat;
	
	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDTO(int tg_id, String tg_brand, String tg_name, String tg_img, String tg_text, String tg_dcrate,
			int ti_id, int ti_tg_id, int ti_hg, String ti_speed, int ti_width, int ti_ratio, int ti_inch, int ti_stock,
			int ti_pricegp, int ti_pricefac, int ti_vat) {
		super();
		this.tg_id = tg_id;
		this.tg_brand = tg_brand;
		this.tg_name = tg_name;
		this.tg_img = tg_img;
		this.tg_text = tg_text;
		this.tg_dcrate = tg_dcrate;
		this.ti_id = ti_id;
		this.ti_tg_id = ti_tg_id;
		this.ti_hg = ti_hg;
		this.ti_speed = ti_speed;
		this.ti_width = ti_width;
		this.ti_ratio = ti_ratio;
		this.ti_inch = ti_inch;
		this.ti_stock = ti_stock;
		this.ti_pricegp = ti_pricegp;
		this.ti_pricefac = ti_pricefac;
		this.ti_vat = ti_vat;
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

	public String getTg_text() {
		return tg_text;
	}

	public void setTg_text(String tg_text) {
		this.tg_text = tg_text;
	}

	public String getTg_dcrate() {
		return tg_dcrate;
	}

	public void setTg_dcrate(String tg_dcrate) {
		this.tg_dcrate = tg_dcrate;
	}

	public int getTi_id() {
		return ti_id;
	}

	public void setTi_id(int ti_id) {
		this.ti_id = ti_id;
	}

	public int getTi_tg_id() {
		return ti_tg_id;
	}

	public void setTi_tg_id(int ti_tg_id) {
		this.ti_tg_id = ti_tg_id;
	}

	public int getTi_hg() {
		return ti_hg;
	}

	public void setTi_hg(int ti_hg) {
		this.ti_hg = ti_hg;
	}

	public String getTi_speed() {
		return ti_speed;
	}

	public void setTi_speed(String ti_speed) {
		this.ti_speed = ti_speed;
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

	public int getTi_vat() {
		return ti_vat;
	}

	public void setTi_vat(int ti_vat) {
		this.ti_vat = ti_vat;
	}

	@Override
	public String toString() {
		return "ProductDTO [tg_id=" + tg_id + ", tg_brand=" + tg_brand + ", tg_name=" + tg_name + ", tg_img=" + tg_img
				+ ", tg_text=" + tg_text + ", tg_dcrate=" + tg_dcrate + ", ti_id=" + ti_id + ", ti_tg_id=" + ti_tg_id
				+ ", ti_hg=" + ti_hg + ", ti_speed=" + ti_speed + ", ti_width=" + ti_width + ", ti_ratio=" + ti_ratio
				+ ", ti_inch=" + ti_inch + ", ti_stock=" + ti_stock + ", ti_pricegp=" + ti_pricegp + ", ti_pricefac="
				+ ti_pricefac + ", ti_vat=" + ti_vat + "]";
	}
}
