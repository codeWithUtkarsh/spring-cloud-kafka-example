package com.events.codeWithUtkarsh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.events.codeWithUtkarsh.eventproducer.model.Order;
import com.events.codeWithUtkarsh.eventproducer.publisher.EventService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping("/event/order")
    public ResponseEntity<String> createOrderEvent(@RequestBody Order order) {
        eventService.publishEvent(order);
        return ResponseEntity.ok("Order Events published successfully.");
    }
}
