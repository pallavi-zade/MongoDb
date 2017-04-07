package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.model.CustomerInfo;
import com.model.OrderInfo;

public interface OrderMongoRepository extends CrudRepository<OrderInfo, String>{

}
