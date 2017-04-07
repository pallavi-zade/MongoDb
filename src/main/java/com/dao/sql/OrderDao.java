package com.dao.sql;

import java.io.Serializable;
import java.util.List;
 
import com.model.sql.UserMaster;
import com.model.sql.orders;



public interface OrderDao extends Serializable
{
	
	orders saveOrder(orders user);
    List<orders> getOrder();
     List<orders>getOrderWithStatusComplited();
     List<orders>getOrderWithStatusCancelled();
     List<orders>getOrderWithStatusRefund();
}
