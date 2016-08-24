package addressBook;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 8/23/2016.
 */
public class generatedContact {
    public static Contact con1 = new Contact(
            new Person("Mohammed", "Mazumder", LocalDate.of(1990, 4, 30)),
            new Address("18", "Morland Road", "Croydon", "CR06NA"), "07951690189", "saqibmazumder@gmail.com");

    public static List<Contact> contacts = new ArrayList<>();

    static void addContact(){

        contacts.add(con1);
    }

}
