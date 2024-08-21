package assignmentClasses;

import java.time.LocalDate;
import java.time.LocalTime;

public class Maintenance extends Schedule{

    private String status;

    public Maintenance(String status, LocalDate date, LocalTime time) {

        // Call to the super class constructor to initialize the requisite fields from the schedule class
        super(null, null, null, date, time);

    }

    // Getter and Setter for status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (this.status.equalsIgnoreCase("Under Maintenance") ||
                this.status.equalsIgnoreCase("Fully Operational")) {

            this.status = status;

        } else {
            throw new IllegalArgumentException("Status must be either 'Under Maintenance' or 'Fully Operational'");
        }
    }
}
