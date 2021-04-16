package com.geoxus.event;

import org.springframework.context.ApplicationEvent;

public class CommonEvent extends ApplicationEvent {
    private final Object eventName;

    public CommonEvent(Object source) {
        super(source);
        this.eventName = source;
    }
}
