package com.supinfo.footballeague.servicesImpl;

import com.supinfo.footballeague.Repository.MatchRepository;
import com.supinfo.footballeague.entity.Match;
import com.supinfo.footballeague.services.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MatchServiceImpl implements MatchService {
    @Autowired
    private MatchRepository matchRepository;

    @Override
    public void startMatch(Long matchId) {
        Match match = matchRepository.findById(matchId).orElseThrow(() -> new RuntimeException("Match not found"));
        match.setStatus("Started");
        matchRepository.save(match);
    }

    @Override
    public void endMatch(Long matchId) {
        Match match = matchRepository.findById(matchId).orElseThrow(() -> new RuntimeException("Match not found"));
        match.setStatus("Ended");
        matchRepository.save(match);
    }

    @Override
    public void suspendMatch(Long matchId, String reason) {
        Match match = matchRepository.findById(matchId).orElseThrow(() -> new RuntimeException("Match not found"));
        match.setStatus("Suspended");
        match.setReason(reason);
        matchRepository.save(match);
    }

    @Override
    public void rescheduleMatch(Long matchId, String reason) {
        Match match = matchRepository.findById(matchId).orElseThrow(() -> new RuntimeException("Match not found"));
        match.setStatus("Rescheduled");
        match.setReason(reason);
        matchRepository.save(match);
    }
    // autres méthodes...
}