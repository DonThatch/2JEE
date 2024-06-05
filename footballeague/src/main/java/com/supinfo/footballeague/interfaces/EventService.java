package com.supinfo.footballeague.interfaces;

import com.supinfo.footballeague.entity.Event;

import java.util.List;

public interface EventService {
    Event saveEvent(Event event);
    List<Event> getAllEvents();
    Event getEventById(Long id);
    void deleteEvent(Long id);
}