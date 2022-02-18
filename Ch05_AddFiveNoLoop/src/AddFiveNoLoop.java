import java.util.Scanner;

public class AddFiveNoLoop {
    public static void main(String[] args) throws Exception {
        System.out.print("Please enter 5 numbers to add: ");
        Scanner scan = new Scanner(System.in);
        double num1, num2, num3, num4, num5;
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();
        num3 = scan.nextDouble();
        num4 = scan.nextDouble();
        num5 = scan.nextDouble();
        scan.close();
        double sum = num1 + num2 + num3 + num4 + num5;
        System.out.printf("%f + %f + %f + %f + %f = %f%n",
                          num1, num2, num3, num4, num5, sum);
    }
}
