package assignmentClasses;


public class Admin {

    // Private fields for the Admin class
    private String username;
    private String admin_ID;
    private String admin_name;
    private String password;

    // Constructor to initialize all the fields
    public Admin(String username, String admin_ID, String admin_name, String password) {
        this.setUsername(username);
        this.setAdmin_ID(admin_ID);
        this.setAdmin_name(admin_name);
        this.setPassword(password);
    }

    // Getter and Setter for username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter and Setter for admin_ID
    public String getAdmin_ID() {
        return admin_ID;
    }

    public void setAdmin_ID(String admin_ID) {
        this.admin_ID = admin_ID;
    }

    // Getter and Setter for admin_name
    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    // Getter and Setter for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
