package frogger;

public class Road {
    private final boolean[] occupied;

    public Road(boolean[] occupied) {
        this.occupied = occupied;
    }

    // Make sure this method is PUBLIC!
    public boolean[] getOccupied() {
        return this.occupied;
    }
}
