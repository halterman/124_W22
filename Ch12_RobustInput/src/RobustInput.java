import java.util.Scanner;

public class RobustInput {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int input;
        System.out.print("Please enter an integer: ");
        input = scan.nextInt();
        scan.close();
        System.out.println("You entered " + input);
    }
}
