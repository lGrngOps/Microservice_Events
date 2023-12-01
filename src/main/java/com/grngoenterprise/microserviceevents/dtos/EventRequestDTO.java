package com.grngoenterprise.microserviceevents.dtos;

public record EventRequestDTO(int maxParticipant, int registeredParticipants, String date, String title, String description) {
}
