package com.company;


public class GamePrinter {

    public static void printInstructions(){

        System.out.println("Choose Rock(0), Paper(1) or Scissors(2).");


    }

    public static void optionNotValid() {
        System.out.println("Introduce a number between 0 and 2.");
    }

    public static void printComputerMove(Move move){
        System.out.println("The computer chose " + move);
    }


    public static void printResult(Result result){
        if (result.equals(Result.COMPUTER) || result.equals(Result.HUMAN)) {
            System.out.println(result.name() + " has won.");
        }
        else {
            System.out.println("Draw.");
        }


    }

    public static void printWinner(Result result){
        System.out.println( result.name() + " has won the game!!!");
    }

}
