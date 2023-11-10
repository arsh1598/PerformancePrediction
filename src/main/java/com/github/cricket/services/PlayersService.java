package com.github.cricket.services;

import com.github.cricket.Repositories.PlayersRepository;
import com.github.cricket.entity.Players;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayersService {

    @Autowired
    PlayersRepository playersRepository;

    public List<Players> getAllPlayers(){
        return this.playersRepository.findAll();
    }

    public Players addPlayer(){
        Players player = new Players();
        player.setPlayerName("Sachin");
        player.setCenturies(100);
        player.setBatsman(true);
        return this.playersRepository.save(player);
    }
}
