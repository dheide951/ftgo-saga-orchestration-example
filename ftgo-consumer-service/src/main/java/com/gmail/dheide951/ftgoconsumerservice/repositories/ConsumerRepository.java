package com.gmail.dheide951.ftgoconsumerservice.repositories;

import com.gmail.dheide951.ftgoconsumerservice.models.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer, Long> {
}
