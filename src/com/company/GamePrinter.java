package com.company;


public class GamePrinter {

    public static void printInstructions(){

        System.out.println("Escoge Piedra(0), Papel(1), Tijera(2), Lagarto(3) o Spock(4)");


    }

    public static void optionNotValid() {
        System.out.println("Introduce a number between 0 and 4.");
    }


    public static void printResult(Result result){
        System.out.println( result.name() + " has won.");
    }

    public static void printWinner(Result result){
        System.out.println( result.name() + " has won the game!!!");
    }

}
