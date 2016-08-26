package dayTwo;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import static dayTwo.generatedPeople.people;
/**
 * Created by student on 8/23/2016.
 */
public class TaskProcessing {

    static employeeDb db;

    static void prepareDb() throws Exception {
        db = new employeeDb();
        db.queryAll();
    }

    //when update occurs reload
    static void loadData() throws SQLException {
        people.clear(); //clear collection
        db.queryAll(); //retrieve new collection
    }

    //add new employee to database and refresh screen
    static void newEmployee(List<String> data) throws SQLException {
        db.addEmployee(data); //send info to database
        loadData(); //refresh database
    }

    //method
    static void createEmployee(List<String> data) {

        String[] dob = data.get(4).split("-"); //split dob string using hyphen
        String[] hireDate = data.get(7).split("-"); //split hiredate string using hyphen

        Employee temp = new Employee(
                data.get(0),
                data.get(1),
                Short.parseShort(data.get(2)),
                Double.parseDouble(data.get(3)),
                LocalDate.of(Integer.parseInt(dob[0]), Integer.parseInt(dob[1]),
                        Integer.parseInt(dob[2])),
                checkSex(data.get(5)),
                data.get(6),
                LocalDate.of(Integer.parseInt(hireDate[0]), Integer.parseInt(hireDate[1]),
                        Integer.parseInt(hireDate[2])));

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
