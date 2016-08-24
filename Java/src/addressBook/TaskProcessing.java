package addressBook;

import java.time.LocalDate;
import java.util.List;

import static addressBook.generatedContact.contacts;

/**
 * Created by student on 8/23/2016.
 */
public class TaskProcessing {

    //method
    static void createContact(List<String> data) {

        Contact temp = new Contact(
                new Person(data.get(0), data.get(1),
                LocalDate.of(Integer.parseInt(data.get(2)),Integer.parseInt(data.get(3)), Integer.parseInt(data.get(4)))),
                (new Address(data.get(5), data.get(6), data.get(7), data.get(8))),
                data.get(9), data.get(10));

        contacts.add(temp);

    }

    static void printAll() {

        for (Contact c : contacts)
            System.out.println(String.format("[%s] " + c, contacts.indexOf(c)));

    }

    static void deleteContact() {


    }
}
