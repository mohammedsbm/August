package dayTwo;

import java.time.LocalDate;
import java.util.List;

import static dayTwo.generatedPeople.people;
/**
 * Created by student on 8/23/2016.
 */
public class TaskProcessing {

    //method
    static void createEmployee(List<String> data) {

        Employee temp = new Employee(
                data.get(0),
                data.get(1),
                Short.parseShort(data.get(2)),
                Double.parseDouble(data.get(3)),
                LocalDate.of(Integer.parseInt(data.get(4)), Integer.parseInt(data.get(5)),
                        Integer.parseInt(data.get(6))),
                checkSex(data.get(7)),
                data.get(8),
                LocalDate.of(Integer.parseInt(data.get(9)), Integer.parseInt(data.get(10)),
                        Integer.parseInt(data.get(11))));

        people.add(temp); //add new employee object into people collection
    }

    static void printALL() { //list all records

        for (Person e : people) //for each person in people
            System.out.println(String.format("[%s] " + e, people.indexOf(e))); //print out each person in people
    }
    //search records if person found return index of person
    static int searchByFirstName(String firstName) {

        for (Person p : people) {
            if(p.getFirstName().contains(firstName)) //search records based on firstname
                return people.indexOf(p); //if record exists return index of person
        }
        return -1; //if record index not found
    }

    static void editDetails(int index, List<String> data) { //search index number to edit in a collection list

        people.get(index).setFirstName(data.get(0));
        people.get(index).setLastName(data.get(1));
        people.get(index).setHeight(Short.parseShort(data.get(2)));
        people.get(index).setWeight(Double.parseDouble(data.get(3)));
        people.get(index).setBirthDate(LocalDate.of(
                Integer.parseInt(data.get(4)),
                Integer.parseInt(data.get(5)),
                Integer.parseInt(data.get(6))));
        people.get(index).setSex(checkSex(data.get(7)));
        people.get(index).setPosition(data.get(8));
        people.get(index).setHireDate(LocalDate.of(
                Integer.parseInt(data.get(9)),
                Integer.parseInt(data.get(10)),
                Integer.parseInt(data.get(11))));
    }

    //Method to check whether user M or F and set employee gender
    static SexType checkSex(String data) {

        if(data.contains("M"))
            return SexType.MALE; //if M return Male
        else
            return SexType.FEMALE; //else return Female

    }

    //Method to retrieve index of an object and remove it
    static void removeEmployee(int index) {

        people.remove(index);
    }
}
