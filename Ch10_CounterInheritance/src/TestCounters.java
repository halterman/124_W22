public class TestCounters {

    private static void countToTen(String label, String varName, Counter counter) {
        System.out.println("\nCount with a " + label + " ----------------\n");
        for (int i = 0; i < 10; i++) {
            System.out.println(varName + " is " + counter.read());
            counter.increment();
        }
    }

    public static void main(String[] args) throws Exception {
        Counter ctr = new Counter();  // Can count as high as integers go
        LimitingCounter lctr = new LimitingCounter(4);  // Cannot count above 4

        countToTen("regular counter", "ctr", ctr);

        countToTen("limiting counter", "lctr", lctr);
    }
}
