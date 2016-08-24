package addressBook;

/**
 * Created by student on 8/23/2016.
 */
public class Contact {
    //fields
    private Person person;
    private Address address;
    private String phoneNumber;
    private String email;

    //properties
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //constructors
    public Contact(Person person, Address address, String phoneNumber, String email) {
        this.person = person;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //methods
    @Override
    public String toString() {
        return String.format("Contact: %s %s Tel: %s Email: %s", this.person, this.address, this.phoneNumber, this.email);
    }
}
