package com.company;

import java.util.concurrent.ThreadLocalRandom;


public class ComputerPlayer {

    public Move play(){

        int randomNum = ThreadLocalRandom.current().nextInt(0, Move.values().length);

        switch (randomNum){
            case 0: return Move.ROCK;
            case 1: return Move.PAPER;
            case 2: return Move.SCISSORS;
        }
        return null;
    }
}
