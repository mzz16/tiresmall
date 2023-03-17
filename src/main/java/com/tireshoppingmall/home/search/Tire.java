package com.tireshoppingmall.home.search;

public class Tire {

	private int ti_width;
	private int ti_ratio;
	private int ti_inch;
	
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
	@Override
	public String toString() {
		return "Tire [ti_width=" + ti_width + ", ti_ratio=" + ti_ratio + ", ti_inch=" + ti_inch + "]";
	}
	
	
}
