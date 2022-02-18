import java.util.Scanner;

public class AddFiveWithArray {
    public static void main(String[] args) throws Exception {
        final int NUMBER_OF_NUMBERS = 10;
        System.out.printf("Please enter %d numbers to add: ", NUMBER_OF_NUMBERS);
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        double[] numberList = new double[NUMBER_OF_NUMBERS];
        
        // Read in the numbers to add and accumulate the sum
        for (int i = 0; i < NUMBER_OF_NUMBERS; i++) {
            numberList[i] = scan.nextDouble();
            sum += numberList[i];
        }
        scan.close();

        // Print the numbers and the sum
        System.out.printf("%f", numberList[0]);
        for (int i = 1; i < NUMBER_OF_NUMBERS; i++) {
            System.out.printf(" + %f", numberList[i]);
        }
        System.out.printf(" = %f%n", sum);
    }
}