package frogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Records class for storing Frogger information.
 */
public class Records {
    private final List<String[]> records;

    public Records() {
        this.records = new ArrayList<>();
    }

    /**
     * Adds a Frogger's record.
     *
     * @param firstName   first name of the Frogger
     * @param lastName    last name of the Frogger
     * @param phoneNumber phone number of the Frogger
     * @param zipCode     zip code of the Frogger
     * @param state       state of the Frogger
     * @param gender      gender of the Frogger
     * @return Return false if the record already exists, else return true.
     */
    public boolean addRecord(String firstName, String lastName, String phoneNumber,
                             String zipCode, String state, String gender) {
        for (String[] row : this.records) {
            if (row[0].equals(firstName)
                    && row[1].equals(lastName)
                    && row[2].equals(phoneNumber)
                    && row[3].equals(zipCode)
                    && row[4].equals(state)
                    && row[5].equals(gender)) {
                return false;
            }
        }
        this.records.add(new String[]{firstName, lastName, phoneNumber, zipCode, state, gender});
        return true;
    }
}
