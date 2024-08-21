package assignmentClasses;

import java.time.LocalDate;
import java.time.LocalTime;

public class Bookings {

    // Private fields for the Bookings superclass
    private String customer_id;
    private String hall_id;
    private String hall_name;
    private LocalDate date;
    private LocalTime time_slot;
    private Double payment;
    private String status; // "Past" or "Incoming"


    // Constructor to initialize all fields
    public Bookings(
            String customer_id,
            String hall_id,
            String hall_name,
            LocalDate date,
            LocalTime time_slot,
            Double payment,
            String status) {

        this.setCustomer_id(customer_id);
        this.setHall_id(hall_id);
        this.setHall_name(hall_name);
        this.setDate(date);
        this.setTime_slot(time_slot);
        this.setPayment(payment);
        this.setStatus(status);
    }

    // Getter and Setter for customer_id
    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    // Getter and Setter for hall_id
    public String getHall_id() {
        return hall_id;
    }

    public void setHall_id(String hall_id) {
        this.hall_id = hall_id;
    }

    // Getter and Setter for hall_name
    public String getHall_name() {
        return hall_name;
    }

    public void setHall_name(String hall_name) {
        this.hall_name = hall_name;
    }

    // Getter and Setter for date
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    // Getter and Setter for time_slot
    public LocalTime getTime_slot() {
        return time_slot;
    }

    public void setTime_slot(LocalTime time_slot) {
        this.time_slot = time_slot;
    }

    // Getter and Setter for payment
    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    // Getter and Setter for status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        // Validate that status is either "Past" or "Incoming"
        if (status.equalsIgnoreCase("Past") || status.equalsIgnoreCase("Incoming")) {
            this.status = status;
        } else {
            throw new IllegalArgumentException("Status must be either 'Past' or 'Incoming'");
        }
    }
}
