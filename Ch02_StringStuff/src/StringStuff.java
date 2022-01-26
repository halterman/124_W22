import java.util.Scanner;

public class StringStuff {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        word = scan.next();
        word = word.toUpperCase();
        System.out.println("word = " + word);
        scan.close();
    }
}
