package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.model.CancelledOrderInfo;
import com.model.ComplitedOrderInfo;

public interface CompletedOrderMongoRepository extends CrudRepository<ComplitedOrderInfo, String>{

}
