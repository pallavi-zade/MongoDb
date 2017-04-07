package com.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.model.CancelledOrderInfo;
import com.model.ComplitedOrderInfo;
import com.model.CustomerInfo;
import com.model.OrderInfo;
@Repository
public class ComplitedOrderMongoRepositoryImpl implements CompletedOrderMongoRepository {
	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ComplitedOrderInfo arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends ComplitedOrderInfo> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<ComplitedOrderInfo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<ComplitedOrderInfo> findAll(Iterable<String> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComplitedOrderInfo findOne(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ComplitedOrderInfo> S save(S object) {
		mongoTemplate.save(object);
		return null;
	}

	@Override
	public <S extends ComplitedOrderInfo> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
