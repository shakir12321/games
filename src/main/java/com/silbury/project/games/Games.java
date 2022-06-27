package com.silbury.project.games;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Games {

    @Autowired
    private GamesInterface game;


    public void Games(GamesInterface game){
        this.game = game;

    }



    public void runGame() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
