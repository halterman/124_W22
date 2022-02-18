import java.util.Scanner;

public class SumOfN_Version_2 {
    public static void main(String[] args) {
        int number, sum = 0;
        System.out.print("Please enter a sequence of non-negative integers (negative number ends the list): ");
        Scanner s = new Scanner(System.in);
        while ((number = s.nextInt()) >= 0) {
            sum += number;
        }
        s.close();
        System.out.println("The sum is " + sum);
    }
}