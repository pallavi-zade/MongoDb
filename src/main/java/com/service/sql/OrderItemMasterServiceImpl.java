package com.service.sql;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.sql.OrderItemDao;
import com.dao.sql.UserMasterDao;
import com.model.sql.OrdersIteam;
import com.model.sql.UserMaster;
import com.model.sql.orders;

   
@Service
@Transactional
public class OrderItemMasterServiceImpl implements OrderItemMasterService{
	final static Logger logger = Logger.getLogger(OrderItemMasterServiceImpl.class);
	
	@Autowired
	private OrderItemDao ordersItemdao;

	







	@Override
	public OrdersIteam saveOrdersIteam(OrdersIteam ordersIteam) {
		// TODO Auto-generated method stub
		return ordersItemdao.saveOrder(ordersIteam);
	}



	@Override
	public List<OrdersIteam> getOrdersIteam() {
		// TODO Auto-generated method stub
		return ordersItemdao.getOrder();
	}




	

	
}
