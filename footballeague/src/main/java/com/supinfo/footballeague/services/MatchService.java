package com.supinfo.footballeague.services;

public interface MatchService {
    void startMatch(Long matchId);
    void endMatch(Long matchId);
    void suspendMatch(Long matchId, String reason);
    void rescheduleMatch(Long matchId, String reason);
}