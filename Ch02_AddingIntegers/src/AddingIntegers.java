import java.util.Scanner;

public class AddingIntegers {
    public static void main(String[] args) throws Exception {
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        num1 = scan.nextInt();
        System.out.print("Please enter another integer: ");
        num2 = scan.nextInt();
        scan.close();
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
    }
}
