import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        int number, sum = 0;
        System.out.print("Please enter a sequence of non-negative integers (negative number ends the list): ");
        Scanner s = new Scanner(System.in);
        number = s.nextInt();
        while (number >= 0) {
            sum += number;
            number = s.nextInt();
        }
        s.close();
        System.out.println("The sum is " + sum);
    }
}
