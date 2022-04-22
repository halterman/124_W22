public class RecursionExample {
    private static int callCount = 0;

    public static int compute(int n) {
        callCount++;
        if (n < 1) {
            return 3;
        } else {
            return n + compute(n - 1) + compute(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("callCount: " + callCount);
        System.out.println(RecursionExample.compute(5));
        System.out.println("callCount: " + callCount);
    }
}
