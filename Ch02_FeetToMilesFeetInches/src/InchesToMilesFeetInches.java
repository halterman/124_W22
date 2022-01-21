import java.util.Scanner;

public class InchesToMilesFeetInches {
    public static void main(String[] args) {
        // Get the user's input
        Scanner scan = new Scanner(System.in);
        int miles, feet, inches;
        System.out.print("Please enter the total number of inches: ");
        inches = scan.nextInt();
        scan.close();

        // Set up some conversion factors
        final int INCHES_PER_FOOT = 12, 
                  INCHES_PER_MILE = 5280*INCHES_PER_FOOT;

        // Compute the whole number of miles
        miles = inches / INCHES_PER_MILE;

        // Compute the remaining inches
        inches = inches % INCHES_PER_MILE;

        // Compute the whole number of feet
        feet = inches / INCHES_PER_FOOT;

        // Compute the remaining inches
        inches = inches % INCHES_PER_FOOT;

        // Report the results
        System.out.println("Miles: " + miles + ", feet: " + feet + ", inches: " + inches);
    }
}
