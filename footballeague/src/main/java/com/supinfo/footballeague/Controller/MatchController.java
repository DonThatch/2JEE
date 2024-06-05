package com.supinfo.footballeague.Controller;


import com.supinfo.footballeague.services.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchController{
@Autowired
private MatchService matchService;

@PostMapping("/{matchId}/start")
public ResponseEntity<Void> startMatch(@PathVariable Long matchId) {
    matchService.startMatch(matchId);
    return ResponseEntity.ok().build();
}

@PostMapping("/{matchId}/end")
public ResponseEntity<Void> endMatch(@PathVariable Long matchId) {
    matchService.endMatch(matchId);
    return ResponseEntity.ok().build();
}

@PostMapping("/{matchId}/suspend")
public ResponseEntity<Void> suspendMatch(@PathVariable Long matchId, @RequestParam String reason) {
    matchService.suspendMatch(matchId, reason);
    return ResponseEntity.ok().build();
}

@PostMapping("/{matchId}/reschedule")
public ResponseEntity<Void> rescheduleMatch(@PathVariable Long matchId, @RequestParam String reason) {
    matchService.rescheduleMatch(matchId, reason);
    return ResponseEntity.ok().build();
}
// autres méthodes...
}