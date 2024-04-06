package com.example.cqrsbankingapp.repository;

import com.example.cqrsbankingapp.domain.model.Account;
import com.example.cqrsbankingapp.events.AbstractEvent;
import com.example.cqrsbankingapp.events.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<AbstractEvent, Long> {
}
