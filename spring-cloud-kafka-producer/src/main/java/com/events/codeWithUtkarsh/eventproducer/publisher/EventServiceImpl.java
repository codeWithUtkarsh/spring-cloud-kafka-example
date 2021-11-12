package com.events.codeWithUtkarsh.eventproducer.publisher;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.events.codeWithUtkarsh.eventproducer.model.Order;
import com.events.codeWithUtkarsh.eventproducer.model.OrderEvent;

@Service
public class EventServiceImpl implements EventService {

    /**
     * This bean is injected by spring. It is used to publish events to supplier manually.
     */
    @Autowired
    private StreamBridge streamBridge;

    @Override
    public void publishEvent(Order order) {
    	Stream.of(order).map(this::createEvent).forEach(orderEvent -> {
            streamBridge.send("producer-out-0", MessageBuilder.withPayload(orderEvent)
                    .setHeader(KafkaHeaders.MESSAGE_KEY, String.valueOf(orderEvent.getEventId())).build());
        });
    }

    public OrderEvent createEvent(Order order) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String eventTime = dateTimeFormatter.format(LocalDateTime.now());

        order.setOrderDate(eventTime);
        order.setOrderNumber(UUID.randomUUID().toString());
        
        OrderEvent orderEvent = new OrderEvent();
        orderEvent.setEventDate(eventTime);
        orderEvent.setEventId(1);
        orderEvent.setEventName("Order Created");
        orderEvent.setOrder(order);
        
        return orderEvent;
    }
}
