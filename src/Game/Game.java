package Game;

public abstract class Game {

    private GameBoard board;
    protected int xPositions;
    protected int yPositions;

    public GameBoard getBoard() {
        return board;
    }

    public void setBoard(GameBoard board) {
        this.board = board;
    }
}
