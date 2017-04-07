package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.model.CancelledOrderInfo;
import com.model.RefundedOrderInfo;

public interface RefundOrderMongoRepository extends CrudRepository<RefundedOrderInfo, String>{

}
