package com.tireshoppingmall.home.admin.store;

import java.util.List;

import com.tireshoppingmall.home.admin.store.SearchBranchDTO;



public interface AdminStoreMapper {

	List<BranchDTO> getAllBranch();
	

	int regBranch(BranchDTO b);

	List<BranchDTO> branchSearchbranchname(SearchBranchDTO b);


	BranchDTO getbranch(BranchDTO b);


	int updatebranch(BranchDTO b);


	int deletebranch(BranchDTO b);


//	List<BranchDTO> branchSearcharea(SearchBranchDTO b);


	int getBranchCount(SearchBranchDTO search);


	List<BranchDTO> getBranchlist(SearchBranchDTO search);


	List<BranchDTO> getBranch(SearchBranchDTO search);




	
}
