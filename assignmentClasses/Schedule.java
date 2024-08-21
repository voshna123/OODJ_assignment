package assignmentClasses;

import java.time.LocalDate;
import java.time.LocalTime;

public class Schedule extends Hall {

    // Private fields exclusive to the Schedule class
    private LocalDate Date;
    private LocalTime Time_Slot;

    // Constructor to initialize all fields
    public Schedule(String Hall_ID, String Hall_Name, String Address, LocalDate Date, LocalTime Time_Slot) {
        // Call to the super class constructor to initialize Hall fields
        super(Hall_ID, Hall_Name, null, Address);
        this.setDate(Date);
        this.setTime_Slot(Time_Slot);
    }

    // Getter and Setter for Date
    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate Date) {
        this.Date = Date;
    }

    // Getter and Setter for Time_Slot
    public LocalTime getTime_Slot() {
        return Time_Slot;
    }

    public void setTime_Slot(LocalTime Time_Slot) {
        this.Time_Slot = Time_Slot;
    }
}
