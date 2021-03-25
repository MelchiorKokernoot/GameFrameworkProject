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

    public GameBoard getBoard(){
        return this.game.getBoard();
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
}
