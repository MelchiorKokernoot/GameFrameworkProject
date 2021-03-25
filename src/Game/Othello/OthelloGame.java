package Game.Othello;


import Game.Game;
import Game.GameBoard;

public class OthelloGame extends Game {

    public OthelloGame() {


        this.xPositions = 8;
        this.yPositions = 8;

        setBoard(new GameBoard(xPositions, yPositions));
    }
}
