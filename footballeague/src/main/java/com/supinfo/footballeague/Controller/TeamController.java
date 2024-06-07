package com.supinfo.footballeague.controller;

import com.supinfo.footballeague.entity.Team;
import com.supinfo.footballeague.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teams")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @PostMapping
    public Team createTeam(@RequestBody Team team) {
        return teamService.createTeam(team);
    }

    @GetMapping("/{id}")
    public Team getTeamById(@PathVariable Long id) {
        return teamService.getTeamById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTeam(@PathVariable Long id) {
        teamService.deleteTeam(id);
    }
}