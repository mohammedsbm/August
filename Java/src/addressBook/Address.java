package addressBook;

/**
 * Created by student on 8/23/2016.
 */
public class Address {
    //fields
    private String addressLine1;
    private String addressLine2;
    private String town;
    private String postcode;

    //properties
    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    //constructors
    public Address(String addressLine1, String addressLine2, String town, String postcode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.town = town;
        this.postcode = postcode;
    }

    //methods
    @Override
    public String toString() {
        return String.format("Address: %s %s %s %s", this.addressLine1, this.addressLine2, this.town, this.postcode);
    }
}
