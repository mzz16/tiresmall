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

	public void searchOrder(OrderSearchDTO osDTO, HttpServletRequest req) {
		req.getSession().setAttribute("orderSearchDTO", osDTO);
	}
	
	public void calcAllOrderCount() {
		OrderSearchDTO ost = new OrderSearchDTO(null, null, "", "", "", "", "");
		allOrderCount = ss.getMapper(AdminOrderMapper.class).getOrderCount(ost);
		System.out.println(allOrderCount);
	}
	
	public void getOrder(int pageNo, HttpServletRequest req) {
		int count = oo.getOrderCountPerPage();
		int start = (pageNo - 1) * count + 1;
		int end = start + (count - 1);
		
		OrderSearchDTO orderSearch = (OrderSearchDTO) req.getSession().getAttribute("searchDTO");
		int orderCount = 0;
		if(orderSearch == null) {
			orderSearch = new OrderSearchDTO(new BigDecimal(start), new BigDecimal(end), "", "", "", "", "");
			orderCount = allOrderCount;
			System.out.println("null이면---" + allOrderCount);
		}else {
			orderSearch.setStart(new BigDecimal(start));
			orderSearch.setEnd(new BigDecimal(end));
			orderCount = ss.getMapper(AdminOrderMapper.class).getOrderCount(orderSearch);
		}
	
		List<OrderSearchDTO> orders = ss.getMapper(AdminOrderMapper.class).getOrder(orderSearch);
	
		int pageCount = (int) Math.ceil(orderCount / (double) count);
		
		req.setAttribute("orders", orders);
		req.setAttribute("pageCount", pageCount);
		req.setAttribute("curPage", pageNo);
		
	}
	
}
