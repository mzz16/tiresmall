package com.tireshoppingmall.home.admin.order;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDAO {

	@Autowired
	private SqlSession ss;
	
	@Autowired
	private OrderOption oo;
	
	private int allOrderCount;
	
	public int getAllOrderCount() {
		return allOrderCount;
	}

	public void setAllOrderCount(int allOrderCount) {
		this.allOrderCount = allOrderCount;
	}

	public void getOrder(int pageNo, HttpServletRequest req) {
		int count = oo.getOrderCountPerPage();
		int start = (pageNo - 1) * count + 1;
		int end = start + (count - 1);
		
		SearchDTO search = (SearchDTO) req.getSession().getAttribute("searchDTO");
		int orderCount = 0;
		if(search == null) {
			search = new SearchDTO(new BigDecimal(start), new BigDecimal(end), "", "", "", "", "");
			orderCount = allOrderCount;
			System.out.println("null이면---" + allOrderCount);
		}else {
			search.setStart(new BigDecimal(start));
			search.setEnd(new BigDecimal(end));
			orderCount = ss.getMapper(AdminOrderMapper.class).getOrderCount(search);
		}
	
		List<OrderDTO>
	
	}
	
}
