package com.gmail.dheide951.ftgoconsumerservice.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Consumer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

}
