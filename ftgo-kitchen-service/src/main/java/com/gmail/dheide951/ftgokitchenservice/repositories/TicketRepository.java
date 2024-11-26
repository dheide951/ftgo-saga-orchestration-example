package com.gmail.dheide951.ftgokitchenservice.repositories;

import com.gmail.dheide951.ftgokitchenservice.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
