public class MixedTypes {
    public static void main(String[] args) throws Exception {
        int intValue = 2;
        double doubleValue = 2.0e20;
        System.out.println("intValue = " + intValue + ", doubleValue = " + doubleValue);
        // doubleValue = intValue;
        intValue = (int) doubleValue;
        System.out.println("intValue = " + intValue + ", doubleValue = " + doubleValue);

    }
}
