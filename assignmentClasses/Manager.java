package assignmentClasses;

public class Manager {

    // Private fields for the Manager class
    private String username;
    private String manager_ID;
    private String manager_name;
    private String password;

    // Constructor to initialize all the fields
    public Manager(String username, String manager_ID, String manager_name, String password) {
        this.setUsername(username);
        this.setManager_ID(manager_ID);
        this.setManager_name(manager_name);
        this.setPassword(password);
    }

    // Getter and Setter for username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter and Setter for manager_ID
    public String getManager_ID() {
        return manager_ID;
    }

    public void setManager_ID(String manager_ID) {
        this.manager_ID = manager_ID;
    }

    // Getter and Setter for manager_name
    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    // Getter and Setter for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
