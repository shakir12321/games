package com.silbury.project.games.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.constant.Constable;

@RestController
public class GamesController {

    @GetMapping("/listGames")
    public String helloGames(){
        return "Mario Contra PacMan";
}
    
    
}
