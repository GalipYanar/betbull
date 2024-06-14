package com.example.betBull.controller;

import com.example.betBull.model.Player;
import com.example.betBull.repository.PlayerRepository;
import com.example.betBull.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
@CrossOrigin

public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping("/createplayer")
    public Player createPlayer(@RequestBody Player player){
        return playerService.createPlayer(player);
    }

    @DeleteMapping ("/deleteplayer/{id}")
    public void deletePlayerByID(@PathVariable("id") Long id){
        playerService.deletePlayerByID(id);
    }

    @PutMapping("/updateplayer/{id}")
    public Player updatePlayer(@PathVariable("id")Long id, @RequestBody Player player){
        return playerService.updatePlayer(player);
    }


    @GetMapping
    public List<Player> getAllPlayerList(){
        return playerService.getAllPlayerList();
    }

    @GetMapping("/getplayer/{id}")
    public Player findPlayerByID (@PathVariable("id") Long id){
        return playerService.findPlayerByID(id);
    }
}
