public class RationalTest {
    public static void main(String[] args) {
        Rational num1 = new Rational(1, 2);  // One-half
        Rational num2 = new Rational(1, 3);  // One-third
        Rational sum = num1.add(num2);       // Add the two fractions
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println("------------------------------");
        System.out.println(num1.getClass().getSuperclass().getName());
        String s = "Hello";
        System.out.println(s.getClass().getName());
    }
}