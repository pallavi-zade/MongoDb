package com.dao.sql;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.sql.orders;
 




@Repository
public class OrderDaoImpl implements OrderDao {
	final static Logger logger = Logger.getLogger(OrderDaoImpl.class);
	
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private SessionFactory  sessionFactory;
	


	@SuppressWarnings("unchecked")
	@Override
	public List<orders> getOrder() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from orders").list();
	}

	@Override
	public orders saveOrder(orders user) {
		 sessionFactory.getCurrentSession().save(user);
		 return user;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<orders> getOrderWithStatusComplited() {
		// TODO Auto-generated method stub
		
		 return (sessionFactory.getCurrentSession().createQuery("select order from orders order where order.status=:status")
				 .setParameter("status","wc-completed")).list();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<orders> getOrderWithStatusCancelled() {
		// TODO Auto-generated method stub
		 return (sessionFactory.getCurrentSession().createQuery("select order from orders order where order.status=:status")
				 .setParameter("status","wc-cancelled")).list();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<orders> getOrderWithStatusRefund() {
		// TODO Auto-generated method stub
		 return (sessionFactory.getCurrentSession().createQuery("select order from orders order where order.status=:status")
				 .setParameter("status","wc-refunded")).list();
	}

	
	



}
