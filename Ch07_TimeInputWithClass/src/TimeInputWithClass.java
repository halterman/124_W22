import java.util.Scanner;

public class TimeInputWithClass {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        Timer.start();
        String name = scan.next();
        Timer.stop();
        scan.close();
        System.out.printf("%s, it took you %.1f secs to enter your name.", 
                          name, Timer.elapsed());
    }
}
