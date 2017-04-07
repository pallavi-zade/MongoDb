package com.dao.sql;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.sql.OrdersIteam;

 




@Repository
public class OrderItemDaoImpl implements OrderItemDao {
	final static Logger logger = Logger.getLogger(OrderItemDaoImpl.class);
	
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private SessionFactory  sessionFactory;
	


	@SuppressWarnings("unchecked")
	@Override
	public List<OrdersIteam> getOrder() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from OrdersIteam").list();
	}



	@Override
	public OrdersIteam saveOrder(OrdersIteam user) {
		 sessionFactory.getCurrentSession().save(user);
		 return user;
	}

	
	



}
