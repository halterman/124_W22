public class MathStuff {
    public static int gcd(int m, int n) {
        // Determine smaller of the m and n
        int smaller = (m < n) ? m : n;
        int result = 1;
        for (int potentialFactor = 2; potentialFactor <= smaller; potentialFactor++) {
            if (m % potentialFactor == 0 && n % potentialFactor == 0) {
                result = potentialFactor;
            }
        }
        return result;
    }

    public static int gcd2(int m, int n) {
            while (n != 0) {
                int t = n;
                n = m % n;
                m = t;
            }
            return m;   
    }
}
