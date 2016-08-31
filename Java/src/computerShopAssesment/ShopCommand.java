package computerShopAssesment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by student on 8/26/2016.
 */
public class ShopCommand {

    static Scanner input = new Scanner(System.in);

    static void display() {

        char choice;
        do {
            System.out.println("Welcome To The Computer Shop");
            System.out.println();
            System.out.println("C - Create a New Computer");
            System.out.println("N - Create a New Customer");
            System.out.println("S - Search a Computer");
            System.out.println("M - Match Customers To Computer");
            System.out.println("O - Order/Sort Existing Computers By Price");
            System.out.println("L - Display Customers According To Requirements");
            System.out.println("Q - Exit Shop");
            System.out.println();
            System.out.println("Please Select An Option: ");

            choice = input.nextLine().charAt(0);

        }while(choice != 'C' && choice != 'N' && choice != 'S' && choice != 'M' && choice != 'O' && choice != 'L' && choice != 'Q');

        //switch statement
        List<String> tempData = new ArrayList<>();

        switch(choice) {
            case 'C':
                System.out.println("Do You Want To Create A Laptop Or Desktop?");
                selectInputScreen(tempData);
                display();
                break;

            case 'N':
                tempData = custInputScreen();
                TaskProcessing.createCustomer(tempData);
                display();
                break;
        }
    }


    static List<String> desktopInputScreen() {

        List<String> desktopData = new ArrayList<>();

        input.nextLine();
        System.out.println("Enter CPU Type (Quadcore/Dualcore: ");
        desktopData.add(input.nextLine());

        System.out.println("Enter Ram Size: ");
        desktopData.add(input.nextLine());

        System.out.println("Enter Hard Drive Capacity: ");
        desktopData.add(input.nextLine());

        System.out.println("Enter Graphics Card Type: ");
        desktopData.add(input.nextLine());

        System.out.println("Enter Computer Type: ");
        desktopData.add(input.nextLine());

        System.out.println("Enter Monitor Size: ");
        desktopData.add(input.nextLine());

        return desktopData;
    }

    static List<String> laptopInputScreen() {

        List<String> laptopData = new ArrayList<>();

        input.nextLine();
        System.out.println("Enter CPU Type (Quadcore/Dualcore): ");
        laptopData.add(input.nextLine());

        System.out.println("Enter Ram Size: ");
        laptopData.add(input.nextLine());

        System.out.println("Enter Hard Drive Capacity: ");
        laptopData.add(input.nextLine());

        System.out.println("Enter Graphics Card Type: ");
        laptopData.add(input.nextLine());

        System.out.println("Enter Computer Type (Laptop/Desktop): ");
        laptopData.add(input.nextLine());

        System.out.println("Enter Laptop Size: ");
        laptopData.add(input.nextLine());

        System.out.println("Enter Laptop Weight: ");
        laptopData.add(input.nextLine());

        System.out.println("Enter Laptop Battery Life: ");
        laptopData.add(input.nextLine());

        return laptopData;
    }

    static List<String> custInputScreen() {

        List<String> userData = new ArrayList<>();

        input.nextLine();
        System.out.println("Enter First Name: ");
        userData.add(input.nextLine());

        System.out.println("Enter Last Name: ");
        userData.add(input.nextLine());

        System.out.println("Enter Computer Type: ");
        userData.add(input.nextLine());

        return userData;
    }

    static void selectInputScreen(List<String> data) {

        String userInput = input.next();
        if(userInput.contains("Laptop")) {
            data = laptopInputScreen();
            TaskProcessing.createLaptop(data);
        }
        else {
            data = desktopInputScreen();
            TaskProcessing.createDesktop(data);
        }

    }

}
