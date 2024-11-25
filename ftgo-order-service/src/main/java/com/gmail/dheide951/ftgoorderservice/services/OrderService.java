package com.gmail.dheide951.ftgoorderservice.services;

import com.gmail.dheide951.ftgoorderservice.models.Order;
import com.gmail.dheide951.ftgoorderservice.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(Order order) {

        orderRepository.save(order);

        return order;
    }

}
