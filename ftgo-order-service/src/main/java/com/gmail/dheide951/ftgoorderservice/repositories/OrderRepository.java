package com.gmail.dheide951.ftgoorderservice.repositories;

import com.gmail.dheide951.ftgoorderservice.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
