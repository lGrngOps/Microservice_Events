package com.grngoenterprise.microserviceevents.controller;

import com.grngoenterprise.microserviceevents.domain.Event;
import com.grngoenterprise.microserviceevents.dtos.EventRequestDTO;
import com.grngoenterprise.microserviceevents.dtos.SubscriptionRequestDTO;
import com.grngoenterprise.microserviceevents.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping
    public List<Event> getAllEvents(){
        return eventService.getAllEvents();
    }

    @GetMapping("/upcoming")
    public List<Event> getUpcomingEvents(){
        return eventService.getUpcomingEvents();
    }

    @PostMapping
    public Event createEvent(@RequestBody EventRequestDTO eventRequestDTO){
        return eventService.createEvent(eventRequestDTO);
    }

    @PostMapping("/{eventId}/register")
    public void registerParticipant(@PathVariable String eventId, @RequestBody SubscriptionRequestDTO subscriptionRequestDTO){
        eventService.registerParticipant(eventId, subscriptionRequestDTO.participantEmail());
    }
}
