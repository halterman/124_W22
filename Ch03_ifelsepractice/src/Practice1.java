import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        int x, y, z;
        System.out.print("Enter two ints: ");
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        y = scan.nextInt();
        if (x < y) {
            if (x <= 4) {
                z = 3;
            } else {
                z = 0;
            }
        } else {
            if (y <= 4) {
                z = 2;
            } else {
                z = 1;
            }
        }
        System.out.println(z);
    }
}
