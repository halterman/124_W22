import java.util.Scanner;

public class StarsRectangle {
    public static void main(String[] args) throws Exception {
        System.out.print("Rectangle dimensions: ");
        Scanner scan = new Scanner(System.in);
        int rows, columns;
        rows = scan.nextInt();
        columns = scan.nextInt();
        int r = 0;
        while (r < rows) {
            int c = 0;
            while (c < columns) {
                System.out.print("* ");
                c++;
            }
            r++;
            System.out.println();
        }

    }
}
