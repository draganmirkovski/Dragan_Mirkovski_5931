package com.example.service;

import com.example.entity.Event;
import com.example.entity.Participant;
import com.example.entity.Registration;
import com.example.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    public Registration registerParticipant(Event event, Participant participant) {
        if (registrationRepository.findByEventAndParticipant(event, participant).isPresent()) {
            throw new RuntimeException("Participant is already registered for this event");
        }

        if (registrationRepository.countByEventId(event.getId()) >= event.getCapacity()) {
            throw new RuntimeException("Event capacity reached");
        }

        Registration registration = new Registration(LocalDate.now(), event, participant);
        return registrationRepository.save(registration);
    }

    public void cancelRegistration(Long registrationId) {
        registrationRepository.deleteById(registrationId);
    }

    public List<Registration> getParticipantsByEvent(Long eventId) {
        return registrationRepository.findByEventId(eventId);
    }

    public List<Registration> getEventsByParticipant(Long participantId) {
        return registrationRepository.findByParticipantId(participantId);
    }

    public long countParticipantsByEvent(Long eventId) {
        return registrationRepository.countByEventId(eventId);
    }

    public long countEventsByParticipant(Long participantId) {
        return registrationRepository.countByParticipantId(participantId);
    }
}
