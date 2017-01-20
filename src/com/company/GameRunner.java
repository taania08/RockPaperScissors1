package com.company;


public class GameRunner {

    private GameState game;
    private HumanPlayer humanPlayer;
    private ComputerPlayer computerPlayer;

    public GameRunner() {
        this.game = new GameState();
        this.humanPlayer = new HumanPlayer();
        this.computerPlayer = new ComputerPlayer();
    }

    public void run(){

        while (!game.isOver()){

            Move humanMove = humanPlayer.play();
            Move computerMove = computerPlayer.play();

            GamePrinter.printComputerMove(computerMove);

            Result result = game.winnerMove(humanMove, computerMove);

            if (result.equals(Result.COMPUTER)){
                game.increaseComputerScore();
            }
            else if (result.equals(Result.HUMAN)){
                game.increaseHumanScore();
            }

            GamePrinter.printResult(result,game);
        }

        GamePrinter.printWinner(game.getWinner());
    }
}
