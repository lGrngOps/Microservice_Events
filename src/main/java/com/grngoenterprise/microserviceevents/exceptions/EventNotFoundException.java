package com.grngoenterprise.microserviceevents.exceptions;

public class EventNotFoundException extends RuntimeException {

    public EventNotFoundException(){
        super("Evento flopou, menor");
    }

    public EventNotFoundException(String message){
        super(message);
    }
}
