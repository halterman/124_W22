import java.util.Scanner;

public class MilesFeetInchesToInches {
    public static void main(String[] args) {
        // Get the input from the user
        Scanner scan = new Scanner(System.in);
        int miles, feet, inches;
        System.out.print("Please enter the number of miles: ");
        miles = scan.nextInt();
        System.out.print("Please enter the number of feet: ");
        feet = scan.nextInt();
        System.out.print("Please enter the number of inches: ");
        inches = scan.nextInt();
        scan.close();

        // Set up some conversion factors
        final int INCHES_PER_FOOT = 12, 
                  INCHES_PER_MILE = 5280*INCHES_PER_FOOT;

        // Compute the total number of inches 
        int totalInches = miles * INCHES_PER_MILE + feet * INCHES_PER_FOOT + inches;

        // Report the result
        System.out.println("Total inches: " + totalInches);

    }
}
