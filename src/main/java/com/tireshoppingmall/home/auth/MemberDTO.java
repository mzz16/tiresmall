package com.tireshoppingmall.home.auth;

public class MemberDTO {

	private String u_id;
	private String pw_password;
	private String i_name;
	private String i_phoneNum;
	private String i_email;
	private String u_logintype;
	private String i_carbrand;
	private String i_carname;
	private String i_caryear;
	private String i_carnum;
	
	
	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public MemberDTO(String u_id, String pw_password, String i_name, String i_phoneNum, String i_email,
			String u_logintype, String i_carbrand, String i_carname, String i_caryear, String i_carnum) {
		super();
		this.u_id = u_id;
		this.pw_password = pw_password;
		this.i_name = i_name;
		this.i_phoneNum = i_phoneNum;
		this.i_email = i_email;
		this.u_logintype = u_logintype;
		this.i_carbrand = i_carbrand;
		this.i_carname = i_carname;
		this.i_caryear = i_caryear;
		this.i_carnum = i_carnum;
	}



	public String getU_id() {
		return u_id;
	}



	public void setU_id(String u_id) {
		this.u_id = u_id;
	}



	public String getPw_password() {
		return pw_password;
	}



	public void setPw_password(String pw_password) {
		this.pw_password = pw_password;
	}



	public String getI_name() {
		return i_name;
	}



	public void setI_name(String i_name) {
		this.i_name = i_name;
	}



	public String getI_phoneNum() {
		return i_phoneNum;
	}



	public void setI_phoneNum(String i_phoneNum) {
		this.i_phoneNum = i_phoneNum;
	}



	public String getI_email() {
		return i_email;
	}



	public void setI_email(String i_email) {
		this.i_email = i_email;
	}



	public String getU_logintype() {
		return u_logintype;
	}



	public void setU_logintype(String u_logintype) {
		this.u_logintype = u_logintype;
	}



	public String getI_carbrand() {
		return i_carbrand;
	}



	public void setI_carbrand(String i_carbrand) {
		this.i_carbrand = i_carbrand;
	}



	public String getI_carname() {
		return i_carname;
	}



	public void setI_carname(String i_carname) {
		this.i_carname = i_carname;
	}



	public String getI_caryear() {
		return i_caryear;
	}



	public void setI_caryear(String i_caryear) {
		this.i_caryear = i_caryear;
	}



	public String getI_carnum() {
		return i_carnum;
	}



	public void setI_carnum(String i_carnum) {
		this.i_carnum = i_carnum;
	}







	
	
		
}
