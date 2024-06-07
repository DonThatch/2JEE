package com.supinfo.footballeague.services;

import com.supinfo.footballeague.entity.Team;

public interface TeamService {
    Team createTeam(Team team);
    Team getTeamById(Long id);
    void deleteTeam(Long id);
}