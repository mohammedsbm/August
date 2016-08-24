package dayTwo;

import java.time.LocalDate;

/**
 * Created by student on 8/23/2016.
 */
//employee is a person (person is a super class of employee)
public class Employee extends Person { //extends - employee is a 'person' (has all members of person)
    // with additional members
    private String position;
    private LocalDate hireDate;

    Employee() {} //default constructor - is required for other constructors to work

    Employee(String firstName, String lastName, short height, double weight,
             LocalDate birthDate, SexType sex, String pos, LocalDate hd)
    {
        super(firstName, lastName, height, weight, birthDate, sex); //when super is called it runs the 'person' constructor
        this.position = pos;
        this.hireDate = hd;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return String.format("Employee Name: %s %s %s", super.toString(), //polymorphism - same method but different output
                this.position, this.hireDate);
    }
}
