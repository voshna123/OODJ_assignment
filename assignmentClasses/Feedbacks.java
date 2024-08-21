package assignmentClasses;

import java.time.LocalDate;
import java.time.LocalTime;

public class Feedbacks {

    // Private fields for the Feedbacks class
    private String feedback_id;
    private String customer_id;
    private String hall_id;
    private String feedback;
    private String staff_id;
    private String status; // Progress
    private LocalTime time_slot;
    private LocalDate date;

    // Constructor to initialize all the fields
    public Feedbacks(
            String feedback_id,
            String customer_id,
            String hall_id,
            String feedback,
            String staff_id,
            String status,
            LocalTime time_slot,
            LocalDate date) {

        this.setFeedback_id(feedback_id);
        this.setCustomer_id(customer_id);
        this.setHall_id(hall_id);
        this.setFeedback(feedback);
        this.setStaff_id(staff_id);
        this.setStatus(status);
        this.setTime_slot(time_slot);
        this.setDate(date);

    }

    // Getter and Setter for feedback_id
    public String getFeedback_id() {
        return feedback_id;
    }

    public void setFeedback_id(String feedback_id) {
        this.feedback_id = feedback_id;
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

    // Getter and Setter for feedback
    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    // Getter and Setter for staff_id
    public String getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(String staff_id) {
        this.staff_id = staff_id;
    }

    // Getter and Setter for status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Getter and Setter for time_slot
    public LocalTime getTime_slot() {
        return time_slot;
    }

    public void setTime_slot(LocalTime time_slot) {
        this.time_slot = time_slot;
    }

    // Getter and Setter for date
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
