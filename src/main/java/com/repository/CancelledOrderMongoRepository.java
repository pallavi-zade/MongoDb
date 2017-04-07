package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.model.CancelledOrderInfo;

public interface CancelledOrderMongoRepository extends CrudRepository<CancelledOrderInfo, String>{

}
