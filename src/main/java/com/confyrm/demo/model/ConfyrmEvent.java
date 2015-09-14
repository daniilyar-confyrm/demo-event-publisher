/**
 * Copyright 2015 by Confyrm Inc.
 */
package com.confyrm.demo.model;

/**
 * Information about the event, which will be sent to Confyrm.
 */
public class ConfyrmEvent {

    /**
     * Type of event
     */
    private final String eventType;

    /**
     * An externally visible reference, such as an email, that is provided by the Event Publisher
     */
    private final String externalRef;

    /**
     * An optional reference that is provided by the Event Publisher for the externalRef on which the Event is being raised
     */
    private final String subscriptionRef;

    public ConfyrmEvent(String eventType, String externalRef, String subscriptionRef) {
        this.eventType = eventType;
        this.externalRef = externalRef;
        this.subscriptionRef = subscriptionRef;
    }

    public String getEventType() {
        return eventType;
    }

    public String getExternalRef() {
        return externalRef;
    }

    public String getSubscriptionRef() {
        return subscriptionRef;
    }

    @Override
    public String toString() {
        return "ConfyrmEvent{" + "eventType='" + eventType + '\'' +
                ", externalRef='" + externalRef + '\'' +
                ", subscriptionRef='" + subscriptionRef + '\'' +
                '}';
    }
}
