import java.util.Scanner;

public class TimeInput {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        long startTime = System.currentTimeMillis();
        String name = scan.next();
        long stopTime = System.currentTimeMillis();
        scan.close();
        System.out.printf("%s, it took you %.1f secs to enter your name.", 
                          name, (stopTime - startTime)/1000.0);
    }
}
