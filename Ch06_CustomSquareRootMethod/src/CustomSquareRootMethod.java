public class CustomSquareRootMethod {
    public static void main(String[] args) {
        System.out.println("Number   Custom    Standard");
        System.out.println("---------------------------");
        for (int i = 1; i < 21; i++) {
            System.out.printf("%3d     %.5f     %.5f%n", i, MyMath.squareRoot(i), Math.sqrt(i));
        }
    }
}