package com.example.ordersservice.repository;

import com.example.ordersservice.pojo.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {



    @Query(value="{ '_id' : ?0 }")
    public Order findOrderByOrderId(String orderId);
}
