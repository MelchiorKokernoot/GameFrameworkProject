package Game.Othello;


import Game.*;

public class OthelloGame extends Game {

    public OthelloGame() {
        this.xPositions = 8;
        this.yPositions = 8;

        setBoard(new GameBoard(xPositions, yPositions));
        resetInitialBoardState();
    }

    @Override
    public boolean moveLegal() {
        return true;
    }

    @Override
    protected void resetInitialBoardState() {
        for (BoardPosition[] row : getBoard()) {
            for (BoardPosition column : row) {
                column.setState(OthelloPositionState.EMPTY_STATE);
            }
        }
    }
}
