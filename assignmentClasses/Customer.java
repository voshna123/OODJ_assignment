package assignmentClasses;

public class Customer {

    // Private fields for the Customer class
    private String username;
    private String customer_ID;
    private String customer_name;
    private String password;

    // Constructor to initialize all the fields
    public Customer(String username, String customer_ID, String customer_name, String password) {
        this.setUsername(username);
        this.setCustomer_ID(customer_ID);
        this.setCustomer_name(customer_name);
        this.setPassword(password);
    }

    // Getter and Setter for username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter and Setter for customer_ID
    public String getCustomer_ID() {
        return customer_ID;
    }

    public void setCustomer_ID(String customer_ID) {
        this.customer_ID = customer_ID;
    }

    // Getter and Setter for customer_name
    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    // Getter and Setter for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
