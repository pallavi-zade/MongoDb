package com.service.sql;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.sql.OrderDao;
import com.dao.sql.UserMasterDao;
import com.model.sql.UserMaster;
import com.model.sql.orders;

   
@Service
@Transactional
public class OrderMasterServiceImpl implements OrderMasterService{
	final static Logger logger = Logger.getLogger(OrderMasterServiceImpl.class);
	
	@Autowired
	private OrderDao orderDao;




	@Override
	public orders saveOrder(orders orders) {
		// TODO Auto-generated method stub
		return orderDao.saveOrder(orders);
	}



	@Override
	public List<orders> getorders() {
		// TODO Auto-generated method stub
		return orderDao.getOrder();
	}



	@Override
	public List<orders> getOrderWithStatusComplited() {
		// TODO Auto-generated method stub
		return orderDao.getOrderWithStatusComplited();
	}



	@Override
	public List<orders> getOrderWithStatusCancelled() {
		// TODO Auto-generated method stub
		return orderDao.getOrderWithStatusCancelled();
	}



	@Override
	public List<orders> getOrderWithStatusRefund() {
		// TODO Auto-generated method stub
		return orderDao.getOrderWithStatusRefund();
	}




	

	
}
