package Game;

import Game.*;
import Game.Othello.OthelloGame;
import Game.TicTacToe.TicTacToeGame;

public class Main {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        gameManager.setGame(new TicTacToeGame());
        gameManager.getBoard().getBoardState();
        gameManager.setGame(null);
        System.out.println("Switching to Othello game now");
        gameManager.setGame(new OthelloGame());
        gameManager.getBoard().getBoardState();

    }
}
