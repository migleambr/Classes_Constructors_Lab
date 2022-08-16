public class Customer {

    // identifying properties
    int id;
    String firstName;
    String lastName;
    Double heldMoney;

    // constructor
    public Customer(int newID, String newFirstName, String newLastName, Double newHeldMoney) {
        this.id = newID;
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.heldMoney = newHeldMoney;
    }
    
}
