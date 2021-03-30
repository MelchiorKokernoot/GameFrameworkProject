package Game.TicTacToe;


import Game.*;

public class TicTacToeGame extends Game {


    public TicTacToeGame() {

        this.xPositions = 3;
        this.yPositions = 3;

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
                column.setState(TicTacToePositionState.EMPTY_STATE);
            }
        }
    }
}
