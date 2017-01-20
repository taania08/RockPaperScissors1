package com.company;


public class GameState {

    private int humanScore = 0;
    private int computerScore = 0;

    public int getHumanScore() {
        return humanScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public int increaseHumanScore(){
        humanScore++;
        return humanScore;
    }

    public int increaseComputerScore(){
        computerScore++;
        return computerScore;
    }

    public boolean isOver(){
        if (humanScore==3 || computerScore==3){
            return true;
        }
        else {
            return false;
        }
    }

    public Result winnerMove(Move human, Move computer){
        if (human.equals(Move.ROCK)  && computer.equals(Move.PAPER)){
            return Result.COMPUTER ;
        }
        else if (human.equals(Move.ROCK) && computer.equals(Move.SCISSORS)){
            return Result.HUMAN;
        }
        else if (human.equals(Move.PAPER) && computer.equals(Move.SCISSORS)){
            return Result.COMPUTER;
        }
        else if (human.equals(Move.PAPER) && computer.equals(Move.ROCK)){
            return Result.HUMAN;
        }
        else if (human.equals(Move.SCISSORS) && computer.equals(Move.PAPER)){
            return Result.HUMAN;
        }
        else if (human.equals(Move.SCISSORS) && computer.equals(Move.ROCK)){
            return Result.COMPUTER;
        }
        else {
            return Result.DRAW;
        }
    }

    public Result getWinner(){
        if (humanScore==3){
            return Result.HUMAN;
        }
        else if (computerScore==3){
            return Result.COMPUTER;
        }
        return null;
    }
}
