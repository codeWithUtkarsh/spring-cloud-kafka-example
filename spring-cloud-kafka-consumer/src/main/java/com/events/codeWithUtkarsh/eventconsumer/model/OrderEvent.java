package com.events.codeWithUtkarsh.eventconsumer.model;

public class OrderEvent {

    private int eventId;

    private String eventName;

    private String eventDate;

    private Order order;
    
    public OrderEvent() {
		// TODO Auto-generated constructor stub
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public OrderEvent(int eventId, String eventName, String eventDate, Order order) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.order = order;
	}
    
    
}
