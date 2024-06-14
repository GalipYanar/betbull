package com.example.betBull.controller;

import com.example.betBull.model.Team;
import com.example.betBull.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("team")
@CrossOrigin

public class TeamController {

    @Autowired
    private TeamService teamService;

    @PostMapping("/createteam")
    public Team createTeam(@RequestBody Team team){
        return teamService.createTeam(team);
    }

    @DeleteMapping("/deleteteam/{id}")
    public void deleteTeamByID(@PathVariable("id") Long id){
        teamService.deleteTeamByID(id);
    }

    @PutMapping("/updateteam/{id}")
    public Team updateTeam(@PathVariable("id")Long id, @RequestBody Team team){
        return teamService.updateTeam(team);
    }

    @GetMapping
    public List<Team> getAllTeamList(){
        return teamService.getAllTeamList();
    }

    @GetMapping("/getteam/{id}")
    public Team findTeamByID(@PathVariable("id") Long id){
        return teamService.findTeamByID(id);
    }
}
