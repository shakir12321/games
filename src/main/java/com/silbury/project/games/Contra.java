package com.silbury.project.games;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Contra implements GamesInterface{

    @Override
    public void up() {
        System.out.println("Contra up");
    }

    @Override
    public void down() {
        System.out.println("Contra down");

    }

    @Override
    public void left() {
        System.out.println("Contra left");

    }

    @Override
    public void right() {
        System.out.println("Contra right");

    }
}
