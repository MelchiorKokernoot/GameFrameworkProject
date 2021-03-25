package Game;

abstract class BoardPosition {
    PositionState state;

    public PositionState getState() {
        return state;
    }

    public void setState(PositionState state) {
        this.state = state;
    }
}
