import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a whole number in the range 1...5, inclusive: ");
        int number = s.nextInt();
        s.close();
        // Evaluate the number to see if it is too low, too high, or in range
        if (number < 1) {
            System.out.println("The number is too low.");
        } else {
            if (number > 5) {
                System.out.println("The number is too big.");
            } else {
                System.out.println("The number is in range.");
            }
        }

    }
}
