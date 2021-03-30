package Game;

public class GameBoard {

    private BoardPosition[][] gameBoard;

    public GameBoard(int xSize, int ySize) {
        this.gameBoard = new BoardPosition[xSize][ySize];
        for (int i = 0; i < xSize; i++) {
            //Create rows with BoardPositions
            this.gameBoard[i] = new BoardPosition[ySize];
            for (int j = 0; j < ySize; j++) {
                //Create columns with BoardPositions
                this.gameBoard[i][j] = new BoardPosition();
            }
        }
    }

    //Get the current GameBoard multidimensional Array
    public BoardPosition[][] getGameBoard() {
        return gameBoard;
    }

    //Set a specific X Y coordinate on the GameBoard with a GamePositionState
    public void setBoardPositionState(int x, int y, int newState) {
        this.gameBoard[x][y].setState(newState);
    }

    //Get a specific X Y GamePositionState on the GameBoard XY coordinate
    public int getBoardPositionState(int x, int y) {
        return this.gameBoard[x][y].getState();
    }
}
