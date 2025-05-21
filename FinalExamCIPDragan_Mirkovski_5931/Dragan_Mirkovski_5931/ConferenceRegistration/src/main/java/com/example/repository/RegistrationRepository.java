package com.example.repository;

import com.example.entity.Event;
import com.example.entity.Participant;
import com.example.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
    List<Registration> findByEventId(Long eventId);
    List<Registration> findByParticipantId(Long participantId);

    Optional<Registration> findByEventAndParticipant(Event event, Participant participant);

    long countByEventId(Long eventId);
    long countByParticipantId(Long participantId);
}
