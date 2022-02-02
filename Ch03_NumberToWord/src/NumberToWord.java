import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        // Get a small integer from the user
        System.out.print("Please enter an integer in the range 1...5: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        scan.close();
        String word;

        if (input < 1) {
            word = "a number too low";
        } else {
            if (input > 5) {
                word = "a number too high";
            } else {
                if (input == 1) {
                    word = "one";
                } else {
                    if (input == 2) {
                        word = "two";
                    } else {
                        if (input == 3) {
                            word = "three";
                        } else {
                            if (input == 4) {
                                word = "four"; 
                            } else {
                                word = "five";
                            }
                        }
                    }
                }
            }
        }

        // Display the word
        System.out.println("You entered " + word);

    }
}
