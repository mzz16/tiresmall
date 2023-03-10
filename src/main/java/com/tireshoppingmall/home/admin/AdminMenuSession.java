package com.tireshoppingmall.home.admin;

public class AdminMenuSession {
	private String menu;
	private String subMenu;
	
	public AdminMenuSession() {
		// TODO Auto-generated constructor stub
	}
	
	public AdminMenuSession(String menu, String subMenu) {
		super();
		this.menu = menu;
		this.subMenu = subMenu;
	}



	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getSubMenu() {
		return subMenu;
	}

	public void setSubMenu(String subMenu) {
		this.subMenu = subMenu;
	}
}
