public class IntegerOverflow {
    public static void main(String[] args) throws Exception {
        int number = Integer.MAX_VALUE - 2;
        System.out.println("number = " + number);
        number++;  
        System.out.println("number = " + number);
        number++;  
        System.out.println("number = " + number);
        number++;  
        System.out.println("number = " + number);
        number++;  
        System.out.println("number = " + number);
        number++;  
    }
}
