import java.util.Scanner;

public class AddFiveWithLoop {
    public static void main(String[] args) throws Exception {
        final int NUMBER_OF_NUMBERS = 5;
        System.out.printf("Please enter %d numbers to add: ", NUMBER_OF_NUMBERS);
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        for (int i = 0; i < NUMBER_OF_NUMBERS; i++) {
            sum += scan.nextDouble();
        }
        scan.close();
        System.out.printf("The sum is %f%n", sum);
    }
}
