package dayOne.primitives;

import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by student on 8/22/2016.
 */
public class ControlStatement {

    public static void main (String[] args) {

        //seasonCheck();
        //numberComparison();
        //menu();
        //iceCream();
        //WhileInfinate();
        //ForLoopTest();
        binaryCalculator();
    }

    static void seasonCheck() {

        int month = 4;
        String season;

        if(month == 12 || month == 1 || month == 2)
            season = "Winter";
        else if(month == 3 || month == 4 || month == 5)
            season = "Spring";
        else if(month == 6 || month == 7 || month == 8)
            season = "Summer";
        else if(month == 9 || month == 10 || month == 11)
            season = "Autumn";
        else
            season = "Bogus Month";

        System.out.println("April is in the " + season);
    }

    static void numberComparison() {

        System.out.println("Enter a Number between 1 - 2000...");

        Scanner userInput = new Scanner(System.in); //used to get user input

        long userNum = userInput.nextLong();

        String msg;

        if(userNum <= 100)
            msg = "your number is less than 100- Your number is equal to 100";
        else if(userNum <= 500)
            msg = "your number is less than 500- Your number is equal to 500";
        else if(userNum < 100 || userNum == 1000)
            msg = "Your number is less than 100- Your number is equal to 1000";
        else
            msg = "Your number is more than 1000- Your number is beyond our scope";

        System.out.println(msg);

    }

    static void menu() {
        try {
            char choice; //declare variable choice as a char type
            do {

                System.out.println("Helper Menu:");
                System.out.println("1. if");
                System.out.println("2. Switch");
                System.out.println("3. while");
                System.out.println("4. do-while");

                choice = (char) System.in.read();
            }
            while (choice < '1' || choice > '4'); //exit loop once condition is met

            switch(choice) {
                case '1':
                    System.out.println("if statement use boolean condition");
                    break;
                case '2':
                    System.out.println("Switch use constant expressions to compare");
                    break;
                case '3':
                    System.out.println("while is a simple loop, boolean condition");
                    break;
                case '4':
                    System.out.println("Do-while Just keep doing it Boom!");
                    break;
            }

        } catch (IOException e) {

            System.out.println(e.getMessage());
            //System.out.println("This is not a character we needed! BOOM!");
        }
    }

    static void iceCream() {

        try {
            char userChoice;
            do{
                System.out.println("Please Choose Your Ice-Cream Size: ");
                System.out.println("1. Small");
                System.out.println("2. Medium");
                System.out.println("3. Large");
                System.out.println("4. Huge");

                userChoice = (char) System.in.read();
            } while(userChoice < '1' || userChoice > '4');

            switch(userChoice) {

                case '1':
                    System.out.println("You chose a small Ice-Cream, the total is £1.25");
                    break;
                case '2':
                    System.out.println("You chose a medium Ice-Cream, the total is £2.25");
                    break;
                case '3':
                    System.out.println("You chose a Large Ice-Cream, the total is £3.25");
                    break;
                case '4':
                    System.out.println("You chose a Huge Ice-Cream, the total is £4.00");
                    break;
            }

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }

    /**static void threeValues() {

        Scanner input = new Scanner(System.in);

        String value1, value2, op;

        System.out.println("Enter your 1st number: ");
        value1 = input.nextLine();
        int firstNumber = Integer.parseInt(value1);

        System.out.println("Enter your 2nd number: ");
        value2 = input.nextLine();
        int secondNumber = Integer.parseInt(value2);

        System.out.println("Enter the Operand (+,-,/,*): ");
        op = input.nextLine();

        switch(op) {

            case '+':

        }
    }*/

    static void WhileInfinate() {

        int index = 0;

        outer: //jump statement
        while(true) {

            int value = ++index;

            System.out.println(value);

            if(value == 5) {
                System.out.println("Found it!");
                break outer; //jump from the inside block to the outer block
            }

            if(value == 10) {
                break;
            }
        }
    }

    static void ForLoopTest() {

        String[] data = {"This", "is", "a", "String."};

        for(int i = 0; i <= data.length - 1; i++) {

            System.out.println(data[i]);
        }

        String result = "";
        //for each loop
        //each String using s in data
        for(String s : data) {
            result += String.format(s + " ");
        }
        System.out.println(result);
    }

    static void binaryCalculator() {

        System.out.println("Enter Binary Value: ");

        Scanner userInput = new Scanner(System.in); //used to get user input

        String binary = userInput.nextLine();

        //binary.charAt();
        //binary.length

        int result = 0, mult = 1;

        //loop backwards from the last value of user input
        for(int i = binary.length() - 1; i >= 0; i--) {

            if(binary.charAt(i) == '1')
                result += mult;
            mult = mult * 2;
        }
        System.out.println("Decimal value: " + result);
    }
}
