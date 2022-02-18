import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        // Reads a sequence of non-negative integers terminated with a negative value.
        // Prints the sum of the sequence (not counting the negative terminator).
        
        //-----------------------------------------------------------------
        // Version 1: Getting the input from the keyboard
        // int number, sum = 0;
        // Scanner s = new Scanner(System.in);
        // while ((number = s.nextInt()) >= 0) {
        //     sum += number;
        // }
        // s.close();
        // System.out.println("The sum is " + sum);


        //-----------------------------------------------------------------
        // Version 1: Getting the input from a file
        // int number, sum = 0;
        // Scanner s = new Scanner(new File("Data1.text"));
        // while ((number = s.nextInt()) >= 0) {
        //     sum += number;
        // }
        // s.close();
        // System.out.println("The sum is " + sum);

        //-----------------------------------------------------------------
        // Version 2: Getting the input from a file using a dialog
        int number, sum = 0;
        JFileChooser dialog = new JFileChooser();
        dialog.showOpenDialog(null);
        File f = dialog.getSelectedFile();
        Scanner s = new Scanner(f);
        while ((number = s.nextInt()) >= 0) {
            sum += number;
        }
        s.close();
        System.out.println("The sum is " + sum);
    }
}
