package Game;

public abstract class Game {

    private GameBoard board;
    protected int xPositions;
    protected int yPositions;

    public abstract boolean moveLegal();

    public BoardPosition[][] getBoard() {
        return board.getGameBoard();
    }

    public GameBoard getGameBoardObject(){
        return board;
    }

    public void setBoard(GameBoard board) {
        this.board = board;
    }

    protected abstract void resetInitialBoardState();
}
