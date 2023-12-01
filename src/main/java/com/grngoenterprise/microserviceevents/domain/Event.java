package com.grngoenterprise.microserviceevents.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "event")
@Table(name = "event")
@Data
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private int maxParticipants;
    private int registeredParticipants;
    private String date;
    private String title;
    private String description;
}
