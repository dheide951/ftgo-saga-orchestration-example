package com.gmail.dheide951.ftgoorderservice.models;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "ORDERS")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "amount", nullable = true, precision = 10, scale = 2)
    private BigDecimal amount;

}
