package com.tireshoppingmall.home.search;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchDAO {

	@Autowired
	private SqlSession ss;
	
	public Tires getTiresJson(Tire tire) {
		
		return new Tires(ss.getMapper(SearchMapper.class).getTiresJSON(tire));
	}
	
	
	
}
