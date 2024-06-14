package com.example.betBull.service;

import com.example.betBull.model.Player;
import com.example.betBull.model.Team;
import com.example.betBull.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public Team createTeam(Team team){
        return teamRepository.save(team);
    }

    public void deleteTeamByID(Long id){
        teamRepository.deleteById(id);
    }

    public Team updateTeam(Team team){
        return teamRepository.save(team);
    }

    public List<Team> getAllTeamList(){
        return teamRepository.findAll();
    }

    public Team findTeamByID(Long id){
        Optional<Team> team = teamRepository.findById(id);
        if (team.isPresent()){
            return team.get();
        }else {
            throw new RuntimeException(id+"ID'li takım bulunamadı.");
        }
    }
}
