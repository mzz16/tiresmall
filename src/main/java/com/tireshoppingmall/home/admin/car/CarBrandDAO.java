package com.tireshoppingmall.home.admin.car;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class CarBrandDAO {

	

	@Autowired
	private SqlSession ss;
	

	
	
	public void getallCarBrands(Model m) {
		
		m.addAttribute("carbrands", ss.getMapper(AdminCarMapper.class).getAllCarBrands());
		
	}

}
