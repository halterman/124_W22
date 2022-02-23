public class MyMath {
    public static double squareRoot(double d) {
        double root = 1.0;
        while (Math.abs(root*root - d) > 0.0000001) {
            root = (root + d/root) / 2;
        }
        return root;
    }    
}
