package com.github.cricket.controllers;

import com.github.cricket.entity.Players;
import com.github.cricket.services.PlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayersController {

    @Autowired
    private PlayersService playersService;

    @GetMapping()
    public ResponseEntity<List<Players>> getAllPlayer(){
        return new ResponseEntity<List<Players>>(this.playersService.getAllPlayers(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Players> addPlayer(){
        return new ResponseEntity<Players>(this.playersService.addPlayer(), HttpStatus.OK);
    }
}
