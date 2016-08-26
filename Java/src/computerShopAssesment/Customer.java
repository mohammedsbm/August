package computerShopAssesment;

/**
 * Created by student on 8/26/2016.
 */
public class Customer extends Person {

    private ComputerType pcType;

    //properties
    public ComputerType getPcType() {
        return pcType;
    }

    public void setPcType(ComputerType pcType) {
        this.pcType = pcType;
    }

    //constructor
    Customer() {}

    public Customer(ComputerType pcType) {
        this.pcType = pcType;
    }

    public Customer(String firstName, String lastName, ComputerType pcType) {
        super(firstName, lastName);
        this.pcType = pcType;
    }
}
