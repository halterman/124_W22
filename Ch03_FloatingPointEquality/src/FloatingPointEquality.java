public class FloatingPointEquality {
    public static void main(String[] args) throws Exception {
        double one = 1.0, 
               oneFifth = 1.0/5.0,
               zero = one - oneFifth - oneFifth - oneFifth
                          - oneFifth - oneFifth;
        /* Demonstrate that floating-point arithmetic is not precise */
        System.out.println("one = " + one + ", oneFifth = " + oneFifth + ", zero = " + zero);

        // Watch out for equality, too
        if (0.0 == zero) {
            System.out.println("Yay!  Floating-point arithmetic is great!");
        }
        if (Math.abs(0.0 - zero) < 0.0000001) {
            System.out.println("Meh.  Floating-point arithmetic is okay.");
        }
    }
}

