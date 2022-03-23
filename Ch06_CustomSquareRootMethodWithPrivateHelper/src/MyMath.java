public class MyMath {
    private static boolean isCloseEnough(double a, double b) {
        return Math.abs(a - b) < 0.0000001;
    }

    public static double squareRoot(double d) {
        double root = 1.0;
        while (!isCloseEnough(root*root, d)) {
            root = (root + d/root) / 2;
        }
        return root;
    }    
}
