package dayOne.primitives;

import java.util.Scanner;

/**
 * Created by student on 8/22/2016.
 */
public class Light { //this class can be accessed globally, by the whole project

    static  int lightSpeed = 186000; //make it static because the value doesn't change

    public static void main(String[] args) {
        //calculate light speed
        //Evenson et all - calculated 299,792,458 metres / second

        System.out.print("Enter number of days: ");
        Scanner input = new Scanner(System.in);
        long days = input.nextLong(); //get value in long

        //java uses streams, streams manage i/o.. use output stream
        System.out.println("In " + days);
        System.out.println("days light will travel about " + lightCalculator(days) + " miles.");
    }

    static long lightCalculator(long days) {
        long seconds = days * 24 * 60 * 60;
        return lightSpeed * seconds;
    }
}
