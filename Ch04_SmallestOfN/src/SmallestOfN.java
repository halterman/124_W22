import java.util.Scanner;

public class SmallestOfN {
    public static void main(String[] args) {
        int number, smallest;
        System.out.print("Please enter a sequence of non-negative integers (negative number ends the list): ");
        Scanner s = new Scanner(System.in);
        number = s.nextInt();
        if (number >= 0) {
            smallest = number;
            while (number >= 0) {
                number = s.nextInt();
                if (number >= 0 && number < smallest) {
                    smallest = number;
                }
            }
            System.out.println("The smallest number is " + smallest);
        } else {
            System.out.println("No non-negative numbers provided");
        }
        s.close();
    }
}
