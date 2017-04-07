package com.service.sql;

import java.util.List;

import com.model.sql.UserMaster;
import com.model.sql.orders;

public interface OrderMasterService
{
  
	orders saveOrder(orders orders);
	List<orders> getorders();
	 List<orders>getOrderWithStatusComplited();
     List<orders>getOrderWithStatusCancelled();
     List<orders>getOrderWithStatusRefund();
}
 