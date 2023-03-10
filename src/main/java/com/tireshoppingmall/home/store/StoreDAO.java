package com.tireshoppingmall.home.store;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.tireshoppingmall.home.admin.store.BranchDTO;

@Service
public class StoreDAO {
	
	@Autowired
	private static SqlSession ss;
	
	
	public void getAStore(HttpServletRequest req, int id) {
		BranchDTO b = ss.getMapper(StoreMapper.class).getAStore(id);
		req.setAttribute("store", b);
	}

}
