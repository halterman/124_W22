public class MathStuff {
    public static int gcd(int m, int n) {
        int smaller = (m < n) ? m : n;
        for (int potentialFactor = smaller; potentialFactor >= 2; potentialFactor--) {
            if (m % potentialFactor == 0 && n % potentialFactor == 0) {
                return potentialFactor;
            }

        }
        return 1;
    }
}