package com.example.service;

import com.example.entity.Participant;
import com.example.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParticipantService {

    @Autowired
    private ParticipantRepository participantRepository;

    public List<Participant> getAllParticipants() {
        return participantRepository.findAll();
    }

    public Optional<Participant> getParticipantById(Long id) {
        return participantRepository.findById(id);
    }

    public Participant createParticipant(Participant participant) {
        return participantRepository.save(participant);
    }

    public Participant updateParticipant(Long id, Participant updatedParticipant) {
        return participantRepository.findById(id)
                .map(participant -> {
                    participant.setFirstName(updatedParticipant.getFirstName());
                    participant.setLastName(updatedParticipant.getLastName());
                    participant.setEmail(updatedParticipant.getEmail());
                    return participantRepository.save(participant);
                }).orElseThrow(() -> new RuntimeException("Participant not found"));
    }

    public void deleteParticipant(Long id) {
        participantRepository.deleteById(id);
    }
}
