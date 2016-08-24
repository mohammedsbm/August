package dayTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static dayTwo.generatedPeople.people;
/**
 * Created by student on 8/23/2016.
 */
//commandrecieve input and display output
public class commandGUI {
    static Scanner input = new Scanner(System.in); //Scanner - a class used to deal with input data

    static void display() { //call display and output data on the screen

        int choice; //used to compare the input we have from user
        do{
            System.out.println("Welcome to Employee Database");
            System.out.println("1. Add an Employee");
            System.out.println("2. Edit an Employee");
            System.out.println("3. Remove an Employee");
            System.out.println("4. List all Employees");
            System.out.println("5. Search by First Name");
            System.out.println("6. Terminate");
            System.out.println();
            System.out.println("Enter between (1-6): ");

            //read input
            choice = input.nextInt(); //next.Int - encapsulates input with method to convert input to int

        } while (choice < 1 || choice > 6); //while choice is not between 1-6 keep running loop

        int index;

        List<String> tempData = new ArrayList<>(); //once a value between 1-6 is chosen execute the corresponding case
        switch(choice) { //compare user input with cases
            case 1:
                tempData = inputScreen(); //take user to inputScreen() and store users input into tempData
                TaskProcessing.createEmployee(tempData); //open up screen to create employee using the tempData list
                display(); //called recursive - go bak up and display loop - rerun own method
                break;
            case 2:
                index = findFirstName();
                tempData = inputScreen();
                TaskProcessing.editDetails(index, tempData);
                display();
                break;
            case 3:
                TaskProcessing.removeEmployee(requestIndex());
                display();
                break;
            case 4:
                TaskProcessing.printALL();
                display();
                break;
            case 5:
                index = findFirstName();
                System.out.println(people.get(index));
                display();
                break;
            case 6:
                break;

        }
    }

    //collect input
    static List<String> inputScreen() {
        List<String> employeeData = new ArrayList<>(); //list to collect input within the block and send back to tempData list

        input.nextLine(); //read the next line
        System.out.print("Enter First Name: ");
        employeeData.add(input.nextLine());

        System.out.print("Enter Last Name: ");
        employeeData.add(input.nextLine());

        System.out.print("Enter Height: ");
        employeeData.add(input.nextLine());

        System.out.print("Enter Weight: ");
        employeeData.add(input.nextLine());

        //split dob field and add to collection
        System.out.print("Enter DOB (YYYY/MM/DD): "); //format dob wiv forward slash
        String dob = input.nextLine();
        String[] dobData = dob.split("/"); //split dob based on forward slash

        //add dob values to collection 1 by 1
        for(int i = 0; i <= dobData.length - 1; i++) {

            employeeData.add(dobData[i]);
        }

        System.out.print("Enter Sex M/F: ");
        employeeData.add(input.nextLine());

        //System.out.print("Enter Bloodtype A/B/AB/O/RHESUS_NEG: ");
        //employeeData.add(input.nextLine());

        System.out.print("Enter Position: ");
        employeeData.add(input.nextLine());

        //split dob field and add to collection
        System.out.print("Enter Hire Date (YYYY/MM/DD): "); //format dob wiv forward slash
        String hireData = input.nextLine();
        String[] hireDate = hireData.split("/"); //split dob based on forward slash

        //add dob values to collection 1 by 1
        for(int i = 0; i <= hireDate.length - 1; i++) {

            employeeData.add(hireDate[i]);
        }

        return employeeData;
    }

    static int findFirstName() {
        System.out.print("Enter First Name: "); //request input
        String firstname = input.next();
        return TaskProcessing.searchByFirstName(firstname);
    }

    static int requestIndex() {
        System.out.print("Enter Employee Index To Remove: ");
        return input.nextInt();
    }
}
