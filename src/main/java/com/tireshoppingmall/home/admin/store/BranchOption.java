package com.tireshoppingmall.home.admin.store;

public class BranchOption {

	private int BranchCountPerPage; //한 페이지당 Branch 개수

	public int SearchBranch() {
		return BranchCountPerPage;
	}

	public void setBranchCountPerPage(int branchCountPerPage) {
		BranchCountPerPage = branchCountPerPage;
	}

	public BranchOption(int branchCountPerPage) {
		super();
		BranchCountPerPage = branchCountPerPage;
	}

	public BranchOption() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBranchCountPerPage() {
		return BranchCountPerPage;
	}


	
	
}
