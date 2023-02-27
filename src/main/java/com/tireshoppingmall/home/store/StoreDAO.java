package com.tireshoppingmall.home.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.tireshoppingmall.home.admin.store.BranchDTO;

@Service
public class StoreDAO {
	
	
	private static SqlSession ss;
	@Autowired
	private void setSqlSession(SqlSession ss){ 
	    this.ss = ss;
	}
	
	
	public static void getAStore(Model model, int id) {
		BranchDTO b = ss.getMapper(StoreMapper.class).getAStore(id);
		model.addAttribute("store", b);
	}

}
