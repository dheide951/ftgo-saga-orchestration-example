package com.gmail.dheide951.ftgoconsumerservice.controllers;

import com.gmail.dheide951.ftgoconsumerservice.models.Consumer;
import com.gmail.dheide951.ftgoconsumerservice.services.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @PostMapping("/consumers")
    public Consumer createConsumer(@RequestBody Consumer consumer) {
        return consumerService.createConsumer(consumer);
    }

}
