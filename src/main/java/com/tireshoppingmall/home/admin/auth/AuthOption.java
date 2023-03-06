package com.tireshoppingmall.home.admin.auth;

public class AuthOption {
	private int authCountPerPage;
	
	public AuthOption() {
		// TODO Auto-generated constructor stub
	}

	public AuthOption(int authCountPerPage) {
		super();
		this.authCountPerPage = authCountPerPage;
	}

	public int getAuthCountPerPage() {
		return authCountPerPage;
	}

	public void setAuthCountPerPage(int authCountPerPage) {
		this.authCountPerPage = authCountPerPage;
	}
	
	
}
