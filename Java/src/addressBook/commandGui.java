package addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by student on 8/23/2016.
 */
public class commandGui {
    static Scanner input = new Scanner(System.in);

    static void display() {

        int choice;

        do{
            System.out.println("Welcome To Your Contact List:");
            System.out.println("1. Add New Contact");
            System.out.println("2. Delete a Contact");
            System.out.println("3. Edit a Contact");
            System.out.println("4. List All Contacts");
            System.out.println("5. Search Contact By First Name");
            System.out.println("6. Terminate");
            System.out.println();
            System.out.println("Choose An Option(1-6): ");

            //read input
            choice = input.nextInt();

        }while (choice < 1 || choice > 6);

        List<String> tempData = new ArrayList<>();

        switch(choice) {
            case 1:
                tempData = inputScreen();
                TaskProcessing.createContact(tempData);
                display();
                break;
            case 2:
            case 3:
            case 4:
                TaskProcessing.printAll();
                display();

            case 5:
            case 6:
                break;
        }

    }

    static List<String> inputScreen(){

        List<String> contactData = new ArrayList<>(); //list to collect input

        input.nextLine(); //read next line
        System.out.print("Enter First Name: ");
        contactData.add(input.nextLine());

        System.out.print("Enter Last Name: ");
        contactData.add(input.nextLine());

        //split dob field and add to collection
        System.out.print("Enter DOB (YYYY/MM/DD): "); //format dob wiv forward slash
        String dob = input.nextLine();
        String[] dobData = dob.split("/"); //split dob based on forward slash
        //add dob values to collection 1 by 1
        for(int i = 0; i <= dobData.length - 1; i++) {

            contactData.add(dobData[i]);
        }

        System.out.print("Enter Door Number: ");
        contactData.add(input.nextLine());

        System.out.print("Enter Road Name: ");
        contactData.add(input.nextLine());

        System.out.print("Enter Town: ");
        contactData.add(input.nextLine());

        System.out.print("Enter Postcode: ");
        contactData.add(input.nextLine());

        System.out.print("Enter Telephone Number: ");
        contactData.add(input.nextLine());

        System.out.print("Enter Email Address: ");
        contactData.add(input.nextLine());

        return contactData;
    }
}
