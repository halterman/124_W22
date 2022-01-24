public class ImpreciseFifth {
    public static void main(String[] args) throws Exception {
        double one = 1.0, 
               oneFifth = 1.0/5.0,
               zero = one - oneFifth - oneFifth - oneFifth
                          - oneFifth - oneFifth;
        /* Demonstrate that floating-point arithmetic is not precise */
        System.out.println("one = " + one + ", oneFifth = " + oneFifth + ", zero = " + zero);

        double z = 1.0 - 1.0/5 - 1.0/5 - 1.0/5 - 1.0/5 - 1.0/5;
        System.out.println(z);
        double big = 1.0e20;
        System.out.println(big * z);
    }
}
