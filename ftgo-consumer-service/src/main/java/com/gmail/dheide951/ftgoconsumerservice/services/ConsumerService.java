package com.gmail.dheide951.ftgoconsumerservice.services;

import com.gmail.dheide951.ftgoconsumerservice.models.Consumer;
import com.gmail.dheide951.ftgoconsumerservice.repositories.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @Autowired
    private ConsumerRepository consumerRepository;

    public Consumer createConsumer(Consumer consumer) {

        consumerRepository.save(consumer);

        return consumer;
    }

}
