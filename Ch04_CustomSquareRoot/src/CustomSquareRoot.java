public class CustomSquareRoot {
    public static void main(String[] args) throws Exception {
        System.out.println("Number   Custom    Standard");
        System.out.println("---------------------------");
        for (int i = 1; i < 21; i++) {
            // Compute square root of i and print it
            double root = 1.0;
            while (Math.abs(root*root - i) > 0.000001) {
                root = (root + i/root) / 2;
            }
            System.out.printf("%3d      %.5f     %.5f%n", i, root, Math.sqrt(i));
        }
    }
}
