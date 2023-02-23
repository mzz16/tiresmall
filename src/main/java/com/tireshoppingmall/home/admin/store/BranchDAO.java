package com.tireshoppingmall.home.admin.store;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class BranchDAO {

	@Autowired
	private SqlSession ss;
	
	public void getAllBranch(Model m) {
	m.addAttribute("branchs", ss.getMapper(AdminStoreMapper.class).getAllBranch());
		
	} 

}
