package com.base.events;

import com.bon.eventbus.IEvent;


public class SignInEvent implements IEvent {
    private String message;

    public SignInEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SignInEvent{" +
                "message='" + message + '\'' +
                '}';
    }
}
