import java.util.Scanner;

public class EmptyIfs {
    public static void main(String[] args) {
        System.out.print("Please enter a 1 or a 2: ");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        s.close();
        // Rewrite this to avoid the empty if bodies
        if (number == 1) {

        } else {
            if (number == 2) {

            } else {
                System.out.println("You did not enter a 1 and you did not enter a 2!");
                return;
            }
        }
        System.out.println("The rest of the program continues . . .");
    }
}
