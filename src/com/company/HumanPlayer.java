package com.company;

import java.util.Scanner;


public class HumanPlayer {

    public Scanner scanner = new Scanner(System.in);

    public Move play(){

        GamePrinter.printInstructions();
        int num = scanner.nextInt();

        if (num<0 || num>3){
            GamePrinter.optionNotValid();
        }

        switch (num){
            case 0: return Move.ROCK;
            case 1: return Move.PAPER;
            case 2: return Move.SCISSORS;
        }
        return null;
    }
}
