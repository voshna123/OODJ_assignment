package assignmentClasses;

public class Scheduler {

    // Private fields for the Scheduler class
    private String username;
    private String scheduler_ID;
    private String scheduler_name;
    private String password;

    // Constructor to initialize all the fields
    public Scheduler(String username, String scheduler_ID, String scheduler_name, String password) {
        this.setUsername(username);
        this.setScheduler_ID(scheduler_ID);
        this.setScheduler_name(scheduler_name);
        this.setPassword(password);
    }

    // Getter and Setter for username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter and Setter for scheduler_ID
    public String getScheduler_ID() {
        return scheduler_ID;
    }

    public void setScheduler_ID(String scheduler_ID) {
        this.scheduler_ID = scheduler_ID;
    }

    // Getter and Setter for scheduler_name
    public String getScheduler_name() {
        return scheduler_name;
    }

    public void setScheduler_name(String scheduler_name) {
        this.scheduler_name = scheduler_name;
    }

    // Getter and Setter for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
