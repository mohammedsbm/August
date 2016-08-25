package dayTwo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by student on 8/23/2016.
 */
public class generatedPeople {
    //Person object can no longer be created because the Person object is abstract
    /*
    public static Person dana = new Person ("Dana", "Scully", (short)160, 52.5,
            LocalDate.of(1968, 9, 9), SexType.FEMALE);

    public static Person saqib = new Person ("Saqib", "Mazumder", (short)170, 59.5,
            LocalDate.of(1990, 4, 30), SexType.MALE);
    */

    public static Employee fox = new Employee("Fox", "Mulder", (short)185, 78.90,
            LocalDate.of(1965, 4, 16), SexType.MALE,
            "X-File specialist", LocalDate.of(1995, 10, 16));

    public static Employee me = new Employee("Me", "You", (short)185, 78.90,
            LocalDate.of(1965, 4, 16), SexType.MALE,
            "X-File specialist", LocalDate.of(1995, 10, 16));



    public static List<Employee> people = new ArrayList<>(); //collection of employees

    static void addPeople() {
        //people.add(saqib);
        //people.add(dana);
        people.add(fox);
        people.add(me);
    }
}
