package assignmentClasses;

import java.time.LocalDate;
import java.time.LocalTime;

public class Availablity extends Schedule {

    // Private field exclusive to the Available class
    private String status; // "Available" or "Unavailable"

    // Constructor to initialize all the fields
    public Availablity(
            String Hall_ID, String Hall_Name, String Address, LocalDate Date, LocalTime Time_Slot, String Status) {

        // Call to the superclass constructor to initialize Schedule fields
        super(Hall_ID, Hall_Name, Address, Date, Time_Slot);
        this.setStatus(Status);
    }

    // Getter and Setter for Status
    public String getStatus() {
        return status;
        }

    public void setStatus(String Status) {
        if (Status.equalsIgnoreCase("available") || Status.equalsIgnoreCase("unavailable")) {
            this.status = Status;
        } else {
            throw new IllegalArgumentException("Status must be either 'Available' or 'Unavailable'");
        }

    }
}
