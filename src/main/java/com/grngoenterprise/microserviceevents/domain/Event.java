package com.grngoenterprise.microserviceevents.domain;

import com.grngoenterprise.microserviceevents.dtos.EventRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "event")
@Table(name = "event")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private int maxParticipants;
    private int registeredParticipants;
    private String date;
    private String title;
    private String description;

    public int getRegisteredParticipants() {
        return registeredParticipants;
    }

    public void setRegisteredParticipants(int registeredParticipants) {
        this.registeredParticipants = registeredParticipants;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    public Event(EventRequestDTO eventRequest){
        this.date = eventRequest.date();
        this.maxParticipants = eventRequest.maxParticipant();
        this.registeredParticipants = eventRequest.registeredParticipants();
        this.title = eventRequest.title();
        this.description = eventRequest.description();
    }
}
