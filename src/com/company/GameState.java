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
        return null;
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
