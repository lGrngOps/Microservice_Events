package com.grngoenterprise.microserviceevents.exceptions;

public class EventFullException extends RuntimeException{

    public EventFullException(){
        super(" Frevo lotado, parça");
    }

    public EventFullException(String message){
        super(message);
    }
}
