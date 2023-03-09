package com.tireshoppingmall.home.admin.order;

import java.util.List;

public interface AdminOrderMapper {

	int getOrderCount(OrderSearchDTO search);

	List<OrderSearchDTO> getOrder(OrderSearchDTO orderSearch);

}
