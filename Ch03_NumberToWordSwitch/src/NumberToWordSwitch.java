import java.util.Scanner;

public class NumberToWordSwitch {
    public static void main(String[] args) {
        // Get a small integer from the user
        System.out.print("Please enter an integer in the range 1...5: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        scan.close();
        String word = "THIS SHOULD NEVER HAPPEN";

        if (input < 1) {
            word = "a number too low";
        } else if (input > 5) {
            word = "a number too high";
        } else {
            switch (input) {
                case 1:
                    word = "one";
                    break;
                case 2:
                    word = "two";
                    break;
                case 3:
                    word = "three";
                    break;
                case 4:
                    word = "four";
                    break;
                case 5:
                    word = "five";
                    break;

            }
        }

        // Display the word
        System.out.println("You entered " + word);

    }

}
