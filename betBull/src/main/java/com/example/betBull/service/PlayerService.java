package com.example.betBull.service;

import com.example.betBull.model.Player;
import com.example.betBull.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public Player createPlayer(Player player){
        return playerRepository.save(player);
    }

    public void deletePlayerByID (Long id){
        playerRepository.deleteById(id);
    }

    public Player updatePlayer(Player player){
        return playerRepository.save(player);
    }

    public List<Player> getAllPlayerList(){
        return playerRepository.findAll();
    }

    public Player findPlayerByID(Long id){
        Optional<Player> player= playerRepository.findById(id);
        if (player.isPresent()){
            return player.get();
        }else {
            throw new RuntimeException(id+" ID'li oyuncu bulunamadı.");
        }
    }

}
