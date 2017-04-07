package com.dao.sql;

import java.io.Serializable;
import java.util.List;

import com.model.sql.OrdersIteam;
import com.model.sql.UserMaster;
import com.model.sql.orders;



public interface OrderItemDao extends Serializable
{

	OrdersIteam saveOrder(OrdersIteam user);
    List<OrdersIteam> getOrder();
}
