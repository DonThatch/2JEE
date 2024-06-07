package com.supinfo.footballeague.servicesImpl;

import com.supinfo.footballeague.Repository.TeamRepository;
import com.supinfo.footballeague.entity.Team;
import com.supinfo.footballeague.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamRepository teamRepository;

    @Override
    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public Team getTeamById(Long id) {
        return teamRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteTeam(Long id) {
        teamRepository.deleteById(id);
    }
}