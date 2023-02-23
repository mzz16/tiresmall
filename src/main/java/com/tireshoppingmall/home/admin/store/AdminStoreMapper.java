package com.tireshoppingmall.home.admin.store;

import java.util.List;


public interface AdminStoreMapper {

	List<BranchDTO> getAllBranch();
	
	List<BranchDTO> branchSearchname(BranchDTO b);

	int regBranch(BranchDTO b);

}
