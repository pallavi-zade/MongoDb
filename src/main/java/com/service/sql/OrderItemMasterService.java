package com.service.sql;

import java.util.List;

import com.model.sql.OrdersIteam;
import com.model.sql.UserMaster;

public interface OrderItemMasterService
{
  
	OrdersIteam saveOrdersIteam(OrdersIteam ordersIteam);
	List<OrdersIteam> getOrdersIteam();
}
 