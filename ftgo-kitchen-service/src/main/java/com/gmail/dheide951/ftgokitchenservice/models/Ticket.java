package com.gmail.dheide951.ftgokitchenservice.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "order_id")
    private long orderId;

}
