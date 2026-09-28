package com.example.festpass.controller;

import com.example.festpass.entity.FestEvent;
import com.example.festpass.service.FestEventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class FestEventController {

    private final FestEventService service;

    public FestEventController(FestEventService service) {
        this.service = service;
    }

    @PostMapping
    public FestEvent createEvent(@RequestBody FestEvent event) {
        return service.createEvent(event);
    }

    @GetMapping
    public List<FestEvent> getAllEvents() {
        return service.getAllEvents();
    }
}