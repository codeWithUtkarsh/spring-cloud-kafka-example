package com.events.codeWithUtkarsh.eventproducer.publisher;

import com.events.codeWithUtkarsh.eventproducer.model.Order;

public interface EventService {

    void publishEvent(Order order);
}
