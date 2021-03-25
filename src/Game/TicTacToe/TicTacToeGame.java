package Game.TicTacToe;


import Game.Game;
import Game.GameBoard;

public class TicTacToeGame extends Game {


    public TicTacToeGame() {

        this.xPositions = 3;
        this.yPositions = 3;

        setBoard(new GameBoard(xPositions, yPositions));
    }

    public boolean moveLegal(int x, int y){
        return true;
    }
}
