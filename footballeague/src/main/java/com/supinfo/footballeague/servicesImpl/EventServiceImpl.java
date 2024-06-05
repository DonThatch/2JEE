package com.supinfo.footballeague.servicesImpl;

import com.supinfo.footballeague.Repository.EventRepository;
import com.supinfo.footballeague.Repository.MatchRepository;
import com.supinfo.footballeague.entity.Event;
import com.supinfo.footballeague.entity.Match;
import com.supinfo.footballeague.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private MatchRepository matchRepository;

    @Override
    public Event addEventToMatch(Long matchId, Event event) {
        Match match = matchRepository.findById(matchId).orElseThrow(() -> new RuntimeException("Match not found"));
        event.setMatch(match);
        return eventRepository.save(event);
    }


    @Override
    public Event saveEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Event getEventById(Long id) {
        return eventRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }
}