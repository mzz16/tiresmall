package com.tireshoppingmall.home.admin.tire;

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;

public class TireDTO {
	
	//타이어 그룹
	private int tg_id;
	private String tg_brand;
	private String tg_name;
	private String tg_img;
	private String tg_text;		
	private int tg_dcrate;		/* dc rate 할인율 */
	private int tg_print;       /* 출력 여부 */
	private int tg_sedan;	/* 승용차 추천 1(t)/0(f) */
	private int tg_suv;		/* suv 추천 1(t)/0(f)*/	
	
	//타이어 상세
	private int ti_id;		
	private int ti_tg_id;		/* tire_group 테이블 pk 참조하는 것 */
	private int ti_hg;			/* 하중 */
	private String ti_speed;	/* 속도계수 		하중 + 속도계수 = 마킹이 됨. */ 
	private int ti_width;		/* 단면폭 */
	private int ti_ratio;		/* 편평비 */
	private int ti_inch;		/* 인치 */
	private int ti_stock;		/* 재고량 */
	private int ti_pricegp;		/* 기표가격 */	
	private int ti_pricefac;		/* 공장가격 */
	private int ti_vat;		/* 부가세 */
	
	//페이지 작업
	private BigDecimal start;
	private BigDecimal end;
	
	public TireDTO() {
		// TODO Auto-generated constructor stub
	}

	
	//전체
	public TireDTO(int tg_id, String tg_brand, String tg_name, String tg_img, String tg_text, int tg_dcrate,
			int tg_print, int tg_sedan, int tg_suv, int ti_id, int ti_tg_id, int ti_hg, String ti_speed, int ti_width,
			int ti_ratio, int ti_inch, int ti_stock, int ti_pricegp, int ti_pricefac, int ti_vat) {
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
	
	//검색 페이징 작업 객체호출
	

	public int getTg_id() {
		return tg_id;
	}

	public TireDTO(String tg_brand, String tg_name, BigDecimal start, BigDecimal end) {
		super();
		this.tg_brand = tg_brand;
		this.tg_name = tg_name;
		this.start = start;
		this.end = end;
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
	
	public static void TirePagsing(HttpServletRequest req) {
		req.getSession().setAttribute("authDTO", null);
	}
	
	
	
}
