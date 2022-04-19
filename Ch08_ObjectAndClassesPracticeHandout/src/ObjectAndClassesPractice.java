class Widget {
    private int value;
    private int limit;
    private int serialNumber;
    private static double rate = 2.0;
    private static int serialNumberSource = 0;

    public Widget(int initialValue, int maximum) {
        value = initialValue;
        limit = maximum;
        serialNumber = ++serialNumberSource;
    }

    public void increment() {
        if (value < limit) {
            value++;
        }
    }

    public int getSerialNumber() {
        // this.limit = 0;
        return serialNumber;
    }

    public int getValue() {
        return value;
    }

    public static double getRate() {
        // this.limit = 0;
        return rate;
    }

    public static void setRate(double rate) {
        Widget.rate = rate;
    }

    public boolean compare(Widget wid) {
        return value == wid.value;
    }
}


public class ObjectAndClassesPractice {

    private static void Question_1() {
        System.out.println("Question 1 -------------------------------");
        Widget wid = new Widget(5, 10);
        System.out.println(wid.getValue());
        System.out.println(wid.getSerialNumber());
    }

    private static void Question_2() {
        System.out.println("Question 2 -------------------------------");
        Widget[] wids = new Widget[5];
        for (Widget wid : wids) {
            System.out.print(wid + " ");
        }
        System.out.println();
    }
    
    private static void Question_3() {
        System.out.println("Question 3 -------------------------------");
        Widget[] wids = new Widget[5];
        for (int i = 0; i < wids.length; i++) {
            wids[i] = new Widget(0, 10);
        }

        for (Widget wid : wids) {
            System.out.print(wid + " ");
        }
        System.out.println();
        System.out.println(wids[4].getSerialNumber());
    }

    private static void Question_4() {
        System.out.println("Question 4 -------------------------------");
        Widget wid = new Widget(0, 5);
        for (int i = 0; i < 10; i++) {
            wid.increment();
        }
        System.out.println(wid.getValue());
        System.out.println(wid.getSerialNumber());
    }

    private static void Question_5() {
        System.out.println("Question 5 -------------------------------");
        Widget myWidget = new Widget(0, 5),
        part = new Widget(2, 20);
        System.out.println(part.compare(myWidget));
        System.out.println(myWidget.compare(myWidget));
    }

    private static void Question_5e() {
        System.out.println("Question 5e -------------------------------");
        Widget myWidget = new Widget(0, 5),
        part = new Widget(2, 20);
        int count = 0;
        while (!myWidget.compare(part)) {
            myWidget.increment();
            count++;
        }           
        System.out.println("Loop executed " + count + " times");
    }

    private static void Question_5f() {
        System.out.println("Question 5f -------------------------------");
        Widget myWidget = new Widget(0, 5),
               part = new Widget(2, 20);
        for (int i = 0; i < 100; i++) {
            myWidget.increment();
        }
        System.out.println(myWidget.getValue());
    }

    private static void Question_6() {
        System.out.println("Question 6 -------------------------------");
        Widget wid = new Widget(0, 5);
        //wid.serialNumber = 44;
    }

    private static void Question_9() {
        System.out.println("Question 9 -------------------------------");
        Widget wid = new Widget(0, 5);
        System.out.println(wid.getValue());
        System.out.println(wid.getSerialNumber());
        System.out.println(wid.getRate());
        System.out.println(Widget.getRate());
        //System.out.println(Widget.getValue());
        //System.out.println(Widget.getSerialNumber()); 
    }

    public static void main(String[] args) throws Exception {
        Question_1();
        // Question_2();
        // Question_3();
        // Question_4();
        // Question_5();
        // Question_5e();
        // Question_5f();
        //Question_6();
        //Question_9();
    }
}
