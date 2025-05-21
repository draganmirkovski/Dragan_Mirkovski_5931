package com.example.service;

import com.example.entity.Event;
import com.example.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Optional<Event> getEventById(Long id) {
        return eventRepository.findById(id);
    }

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public Event updateEvent(Long id, Event updatedEvent) {
        return eventRepository.findById(id)
                .map(event -> {
                    event.setName(updatedEvent.getName());
                    event.setLocation(updatedEvent.getLocation());
                    event.setStartDate(updatedEvent.getStartDate());
                    event.setEndDate(updatedEvent.getEndDate());
                    event.setCapacity(updatedEvent.getCapacity());
                    return eventRepository.save(event);
                }).orElseThrow(() -> new RuntimeException("Event not found"));
    }

    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }
}
