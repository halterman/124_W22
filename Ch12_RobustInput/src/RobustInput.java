import java.util.InputMismatchException;
import java.util.Scanner;

public class RobustInput {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        boolean goodInput = false;
        System.out.print("Please enter an integer: ");
        while (!goodInput) {
            try {
                input = scan.nextInt();
                goodInput = true;
                scan.close();
            } catch (InputMismatchException ex) {
                System.out.print("Illegal form entered; please try again: ");
                scan.nextLine();
            }
        }
        System.out.println("You entered " + input);
    }
}
