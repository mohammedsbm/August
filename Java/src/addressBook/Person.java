package addressBook;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Created by student on 8/23/2016.
 */
public class Person {
    //fields
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    //properties
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    //constructors
    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    //methods
    public long getAge() {

        if(birthDate == null) {
            return 0;
        }
        long years = ChronoUnit.YEARS.between(birthDate, LocalDate.now());
        return years;
    }

    //methods
    @Override
    public String toString() {
        return String.format("Name: %s %s Age: %s", this.firstName, this.lastName, this.getAge());
    }

}
