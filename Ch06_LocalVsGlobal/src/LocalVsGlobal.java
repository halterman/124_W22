public class LocalVsGlobal {

    private static int i = 0;

    private static void func() {
        // int i = 0;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
    }

    public static void main(String[] args) throws Exception {
        int x = 5;
        System.out.println("x = " + x);
        {
            int y = 10;
            System.out.println("y = " + y);
        }
        System.out.println("x = " + x);
        // System.out.println("y = " + y);
        {
            int y = 15;
            System.out.println("y = " + y);
        }

        System.out.println("----------------------");
        func();
        func();
        func();
        System.out.println("i = " + i);
    }
}
