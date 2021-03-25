package Game;

public class GameBoard {

    private BoardPosition[][] board;

    public GameBoard(int xSize, int ySize) {
        this.board = new BoardPosition[xSize][ySize];
    }

    public void getBoardState() {
        for (BoardPosition[] row : board) {
            for (BoardPosition column : row) {
                System.out.print("[]");
            }
            System.out.println("");
        }
    }

    public void setBoardPositionState(int x, int y, PositionState newState){
        this.board[x][y].setState(newState);
    }

    public PositionState getBoardPositionState(int x, int y){
        return this.board[x][y].getState();
    }
}
