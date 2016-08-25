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

    static int searchByFirstName(String firstName) {

        for(Contact c : contacts) {
            if(c.getPerson().getFirstName().contains(firstName))
                return contacts.indexOf(c);
        }
        return -1;
    }

    static void editContact(int index, List<String> data) {

        contacts.get(index).getPerson().setFirstName(data.get(0));
        contacts.get(index).getPerson().setLastName(data.get(1));
        contacts.get(index).getPerson().setBirthDate(LocalDate.of(
                Integer.parseInt(data.get(2)),
                Integer.parseInt(data.get(3)),
                Integer.parseInt(data.get(4))));
        contacts.get(index).getAddress().setAddressLine1(data.get(5));
        contacts.get(index).getAddress().setAddressLine2(data.get(6));
        contacts.get(index).getAddress().setTown(data.get(7));
        contacts.get(index).getAddress().setPostcode(data.get(8));
        contacts.get(index).setPhoneNumber(data.get(9));
        contacts.get(index).setEmail(data.get(10));

    }

    static void removeContact(int index) {
        contacts.remove(index);
    }
}
