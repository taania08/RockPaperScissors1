package com.company;

import java.util.Scanner;


public class HumanPlayer {

    public Scanner scanner = new Scanner(System.in);

    public Move play(){

        int num = 0;

        do{
            GamePrinter.printInstructions();
            num = scanner.nextInt();

            if (num<0 || num>2){
                GamePrinter.optionNotValid();
            }

        }while (num<0 || num>2);



        switch (num){
            case 0: return Move.ROCK;
            case 1: return Move.PAPER;
            case 2: return Move.SCISSORS;
        }
        return null;
    }
}
