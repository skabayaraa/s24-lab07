package frogger;

/**
 * Refactored Frogger Class (Without Extra Classes)
 */
public class Frogger {
    private final Road road;
    private int position;
    private final Records records;
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private final String zipCode;
    private final String state;
    private final String gender;

    public Frogger(Road road, int position, Records records, String firstName, String lastName, String phoneNumber, 
                   String zipCode, String state, String gender) {
        this.road = road;
        this.position = position;
        this.records = records;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
        this.state = state;
        this.gender = gender;
    }

    public boolean move(boolean forward) {
        int nextPosition = this.position + (forward ? 1 : -1);
        if (!isValid(nextPosition) || isOccupied(nextPosition)) {
            return false;
        }
        this.position = nextPosition;
        return true;
    }

    public boolean isOccupied(int position) {
        boolean[] occupied = (road != null) ? road.getOccupied() : null;
        return occupied != null && position >= 0 && position < occupied.length && occupied[position];
    }

    public boolean isValid(int position) {
        boolean[] occupied = (road != null) ? road.getOccupied() : null;
        return occupied != null && position >= 0 && position < occupied.length;
    }

    public boolean recordMyself() {
        return records.addRecord(firstName, lastName, phoneNumber, zipCode, state, gender);
    }
}
