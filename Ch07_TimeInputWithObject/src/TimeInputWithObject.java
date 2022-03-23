import java.util.Scanner;

public class TimeInputWithObject {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        Stopwatch timer = new Stopwatch();
        timer.start();
        String name = scan.next();
        timer.stop();
        scan.close();
        System.out.printf("%s, it took you %.1f secs to enter your name.", 
                          name, timer.elapsed());
    }
}
