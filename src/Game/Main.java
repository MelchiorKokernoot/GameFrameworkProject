package Game;

import Game.*;
import Game.Othello.OthelloGame;
import Game.TicTacToe.TicTacToeGame;
import Game.TicTacToe.TicTacToePositionState;

public class Main {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        gameManager.setGame(new TicTacToeGame());
        gameManager.setNewStateAtXY(1, 2, TicTacToePositionState.CIRCLE_STATE);
        gameManager.setNewStateAtXY(1, 1, TicTacToePositionState.CROSS_STATE);
        gameManager.setNewStateAtXY(1, 0, TicTacToePositionState.CIRCLE_STATE);
        gameManager.getBoardState();
        gameManager.setGame(null);
        System.out.println("Switching to Othello game now");
        gameManager.setGame(new OthelloGame());
        gameManager.getBoardState();
    }
}
