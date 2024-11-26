package com.gmail.dheide951.ftgokitchenservice.services;

import com.gmail.dheide951.ftgokitchenservice.models.Ticket;
import com.gmail.dheide951.ftgokitchenservice.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KitchenService {

    @Autowired
    private TicketRepository ticketRepository;

    public Ticket createTicket(Ticket ticket) {
        ticketRepository.save(ticket);
        return ticket;
    }

}
