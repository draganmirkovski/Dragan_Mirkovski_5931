package com.example.controller;

import com.example.entity.Event;
import com.example.entity.Participant;
import com.example.entity.Registration;
import com.example.service.EventService;
import com.example.service.ParticipantService;
import com.example.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registrations")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private EventService eventService;

    @Autowired
    private ParticipantService participantService;

    @PostMapping("/events/{eventId}/participants/{participantId}")
    public ResponseEntity<?> register(
            @PathVariable Long eventId,
            @PathVariable Long participantId) {

        Event event = eventService.getEventById(eventId)
                .orElseThrow(() -> new RuntimeException("Event not found"));

        Participant participant = participantService.getParticipantById(participantId)
                .orElseThrow(() -> new RuntimeException("Participant not found"));

        try {
            return ResponseEntity.ok(registrationService.registerParticipant(event, participant));
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @DeleteMapping("/{registrationId}")
    public ResponseEntity<Void> cancel(@PathVariable Long registrationId) {
        registrationService.cancelRegistration(registrationId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/events/{eventId}/participants")
    public List<Registration> listParticipantsOfEvent(@PathVariable Long eventId) {
        return registrationService.getParticipantsByEvent(eventId);
    }

    @GetMapping("/participants/{participantId}/events")
    public List<Registration> listEventsOfParticipant(@PathVariable Long participantId) {
        return registrationService.getEventsByParticipant(participantId);
    }
}
