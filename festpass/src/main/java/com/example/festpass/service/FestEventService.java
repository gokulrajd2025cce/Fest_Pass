package com.example.festpass.service;

import com.example.festpass.entity.FestEvent;
import com.example.festpass.repository.FestEventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FestEventService {

    private final FestEventRepository repository;

    public FestEventService(FestEventRepository repository) {
        this.repository = repository;
    }

    public FestEvent createEvent(FestEvent event) {
        return repository.save(event);
    }

    public List<FestEvent> getAllEvents() {
        return repository.findAll();
    }
}