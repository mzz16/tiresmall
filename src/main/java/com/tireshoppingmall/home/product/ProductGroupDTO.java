package com.tireshoppingmall.home.product;

import org.springframework.stereotype.Service;

@Service
public class ProductGroupDTO {
	private int tg_id;
	private String tg_brand;
	private String tg_name;
	private String tg_img;
	private String tg_text;
	private int tg_dcrate;
	private int tg_print;
	private int tg_sedan;
	private int tg_suv;
	private int minInch;
	private int maxInch;
	private int minPrice;
	private int MaxPrice;
	
	public ProductGroupDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProductGroupDTO(int tg_id, String tg_brand, String tg_name, String tg_img, String tg_text, int tg_dcrate,
			int tg_print, int tg_sedan, int tg_suv, int minInch, int maxInch, int minPrice, int maxPrice) {
		super();
		this.tg_id = tg_id;
		this.tg_brand = tg_brand;
		this.tg_name = tg_name;
		this.tg_img = tg_img;
		this.tg_text = tg_text;
		this.tg_dcrate = tg_dcrate;
		this.tg_print = tg_print;
		this.tg_sedan = tg_sedan;
		this.tg_suv = tg_suv;
		this.minInch = minInch;
		this.maxInch = maxInch;
		this.minPrice = minPrice;
		MaxPrice = maxPrice;
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

	public int getTg_dcrate() {
		return tg_dcrate;
	}

	public void setTg_dcrate(int tg_dcrate) {
		this.tg_dcrate = tg_dcrate;
	}

	public int getTg_print() {
		return tg_print;
	}

	public void setTg_print(int tg_print) {
		this.tg_print = tg_print;
	}

	public int getTg_sedan() {
		return tg_sedan;
	}

	public void setTg_sedan(int tg_sedan) {
		this.tg_sedan = tg_sedan;
	}

	public int getTg_suv() {
		return tg_suv;
	}

	public void setTg_suv(int tg_suv) {
		this.tg_suv = tg_suv;
	}

	public int getMinInch() {
		return minInch;
	}

	public void setMinInch(int minInch) {
		this.minInch = minInch;
	}

	public int getMaxInch() {
		return maxInch;
	}

	public void setMaxInch(int maxInch) {
		this.maxInch = maxInch;
	}

	public int getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}

	public int getMaxPrice() {
		return MaxPrice;
	}

	public void setMaxPrice(int maxPrice) {
		MaxPrice = maxPrice;
	}
	
}
