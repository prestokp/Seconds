package seconds;

import java.util.Scanner;

public class Seconds {

    public static void main(String[] args) {           //establishes the main function

        final int SECONDS_PER_HOUR = 3600; //defines the constants for our
        final int SECONDS_PER_MINUTE = 60; //different measures of time

        int seconds, minutes, hours; //declares our variables of type integer

        Scanner scan = new Scanner(System.in);             //sets up scanner object to scan for user input from keyboard
        System.out.print("Enter the number of seconds: "); //console output
        seconds = scan.nextInt();                          //scans the istream for an integer input

        //Do some calculations
        hours = seconds / SECONDS_PER_HOUR;      //gives the number of hours elapsed
        seconds = seconds % SECONDS_PER_HOUR;    //gives the remaining seconds, overrides the prior value of seconds
        minutes = seconds / SECONDS_PER_MINUTE;
        seconds = seconds % SECONDS_PER_MINUTE;  //remaining seconds

        System.out.println();
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}
