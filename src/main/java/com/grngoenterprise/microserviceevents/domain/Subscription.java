package com.grngoenterprise.microserviceevents.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "subscription")
@Table(name = "subscription")
@Data
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String participantEmail;
    @ManyToOne
    private Event event;
}
