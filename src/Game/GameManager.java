package Game;

import java.util.ArrayList;

public class GameManager {

    private Game game;
    private ArrayList<Player> players = new ArrayList<Player>();

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public Game getGame() {
        return game;
    }

    public void getBoardState() {
        for (BoardPosition[] row : this.game.getBoard()) {
            for (BoardPosition column : row) {
                System.out.print(column.getState());
            }
            System.out.println("");
        }
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void setNewStateAtXY(int x, int y, int newState) {
        this.game.getGameBoardObject().setBoardPositionState(x, y, newState);
    }

    public int getStateAtXY(int x, int y) {
        return this.game.getGameBoardObject().getBoardPositionState(x, y);
    }
}
