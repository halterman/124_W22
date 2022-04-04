public class GreatestCommonDivisor {
    public static void main(String[] args) throws Exception {
        System.out.println("The GCD(8, 12) is " + MathStuff.gcd(8, 12) + "  " + MathStuff.gcd2(8, 12));
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("The GCD(%d, %d) is %d   %d%n", i, j, MathStuff.gcd(i, j), MathStuff.gcd2(i, j));
            }
        }

        Stopwatch timer = new Stopwatch();
        timer.start();
        System.out.println(MathStuff.gcd(300000261, 500000435));
        timer.stop();
        System.out.println("Time for gcd: " + timer.elapsed() + " sec");
        timer.start();
        System.out.println(MathStuff.gcd2(300000261, 500000435));
        timer.stop();
        System.out.println("Time for gcd2: " + timer.elapsed() + " sec");
    }
}
