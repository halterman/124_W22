public class GCD_Test {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                System.out.printf("GCD(%d, %d) = %d%n", i, j, MathStuff.gcd(i, j));
            }
        }
    }
}
