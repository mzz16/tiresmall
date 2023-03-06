package com.tireshoppingmall.home.product;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class ProductDAO {
	
	private static SqlSession ss;
	@Autowired
	private void setSqlSession(SqlSession ss){ 
	    this.ss = ss;
	}
	
	public static void getProduct(Model model, int id) {
		ss.getMapper(ProductMapper.class).getProduct(id);
		
	}

}
