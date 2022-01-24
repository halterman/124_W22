import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter degrees Fahrenheit: ");
        double degreesF, degreesC;
        degreesF = scan.nextDouble();
        scan.close();
        degreesC = 5/9*(degreesF - 32);
        System.out.println(degreesF + " degrees Fahrenheit is " + degreesC + " degrees Celsius.");
    }
}
