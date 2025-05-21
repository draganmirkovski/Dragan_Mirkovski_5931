package com.example;

import com.example.entity.Event;
import com.example.entity.Participant;
import com.example.repository.EventRepository;
import com.example.repository.ParticipantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    CommandLineRunner runner(EventRepository eventRepository, ParticipantRepository participantRepository) {
        return args -> {
            eventRepository.save(new Event("Spring Summit 2025", "Skopje", LocalDate.of(2025, 6, 15), LocalDate.of(2025, 6, 17), 250));
            eventRepository.save(new Event("Java Days", "Ohrid", LocalDate.of(2025, 7, 5), LocalDate.of(2025, 7, 6), 150));
            eventRepository.save(new Event("Tech Talks", "Bitola", LocalDate.of(2025, 8, 10), LocalDate.of(2025, 8, 11), 100));

            participantRepository.save(new Participant("Alice", "Smith", "alice@example.com"));
            participantRepository.save(new Participant("Bob", "Johnson", "bob@example.com"));
            participantRepository.save(new Participant("Charlie", "Brown", "charlie@example.com"));
        };
    }
}