package com.silbury.project.games;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class Mario implements GamesInterface{

    @Override
    public void up() {
        System.out.println("Mario up");
    }

    @Override
    public void down() {
        System.out.println("Mario down");

    }

    @Override
    public void left() {
        System.out.println("Mario left");

    }

    @Override
    public void right() {
        System.out.println("Mario right");

    }
}
