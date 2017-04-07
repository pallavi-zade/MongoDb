package com.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.model.CancelledOrderInfo;
import com.model.CustomerInfo;
import com.model.OrderInfo;
@Repository
public class CancelledOrderMongoRepositoryImpl implements CancelledOrderMongoRepository {
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
	public void delete(CancelledOrderInfo arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends CancelledOrderInfo> arg0) {
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
	public Iterable<CancelledOrderInfo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<CancelledOrderInfo> findAll(Iterable<String> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CancelledOrderInfo findOne(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CancelledOrderInfo> S save(S object) {
		// TODO Auto-generated method stub
		mongoTemplate.save(object);
		return null;
	}

	@Override
	public <S extends CancelledOrderInfo> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
