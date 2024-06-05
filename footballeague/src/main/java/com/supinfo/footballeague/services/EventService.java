package com.supinfo.footballeague.services;

import com.supinfo.footballeague.entity.Event;

import java.util.List;

public interface EventService {
    Event addEventToMatch(Long matchId, Event event);
    Event saveEvent(Event event);
    List<Event> getAllEvents();
    Event getEventById(Long id);
    void deleteEvent(Long id);
}