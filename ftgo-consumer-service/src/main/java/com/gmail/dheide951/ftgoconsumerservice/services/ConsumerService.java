package com.gmail.dheide951.ftgoconsumerservice.services;

import com.gmail.dheide951.ftgoconsumerservice.models.Consumer;
import com.gmail.dheide951.ftgoconsumerservice.repositories.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ConsumerService {

    @Autowired
    private ConsumerRepository consumerRepository;

    public Consumer createConsumer(Consumer consumer) {
        consumerRepository.save(consumer);
        return consumer;
    }

    public boolean verifyCustomer(Consumer consumerDetails) {
        Optional<Consumer> consumer = consumerRepository.findById(consumerDetails.getId());
        return consumer.isPresent();
    }

}
