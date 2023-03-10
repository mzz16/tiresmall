package com.tireshoppingmall.home.admin.car;

public class CarOption {

	
	private int CarCountPerPage; //한 페이지당 Car 개수

	public int SearchCar() {
		return CarCountPerPage;
	}

	public void setCarCountPerPage(int CarCountPerPage) {
		CarCountPerPage = CarCountPerPage;
	}

	public CarOption(int CarCountPerPage) {
		super();
		CarCountPerPage = CarCountPerPage;
	}

	public CarOption() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCarCountPerPage() {
		return CarCountPerPage;
	}


	
	
	
	
	
}
