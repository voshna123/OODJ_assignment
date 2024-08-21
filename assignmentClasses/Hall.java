package assignmentClasses;

public class Hall {

    // Private fields for the Hall class
    private String Hall_ID;
    private String Hall_Name;
    private String Hall_Type;
    private String Address;

    // Constructor to initialize all fields
    public Hall(String Hall_ID, String Hall_Name, String Hall_Type, String Address) {
        this.setHall_ID(Hall_ID);
        this.setHall_Name(Hall_Name);
        this.setHall_Type(Hall_Type);
        this.setAddress(Address);
    }

    // Getter and Setter for Hall_ID
    public String getHall_ID() {
        return Hall_ID;
    }

    public void setHall_ID(String Hall_ID) {
        this.Hall_ID = Hall_ID;
    }

    // Getter and Setter for Hall_Name
    public String getHall_Name() {
        return Hall_Name;
    }

    public void setHall_Name(String Hall_Name) {
        this.Hall_Name = Hall_Name;
    }

    // Getter and Setter for Hall_Type
    public String getHall_Type() {
        return Hall_Type;
    }

    public void setHall_Type(String Hall_Type) {
        this.Hall_Type = Hall_Type;
    }

    // Getter and Setter for Address
    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
}
