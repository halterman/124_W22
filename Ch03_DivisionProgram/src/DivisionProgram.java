import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter two integer values: ");
        int num1, num2;
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        scan.close();
        if (num2 != 0) {
            System.out.println(num1 + " / " + num2 + " = " + num1/num2);
        } else {
            System.out.println("Cannot divide by zero.");
        }
        System.out.println("Done!");
    }
}
