public class App {

    private static void show(WidgetInterface w) {
        System.out.println(w.id());
    }

    public static void main(String[] args) {
        Widget wid1 = new Widget();
        Widget wid2 = new Gadget();

        System.out.println("wid1 says " + wid1.id());
        System.out.println("wid2 says " + wid2.id());

        Widget wid3 = new Widget() {
            @Override
            public String id() {
                return "I'm an instance of an unnamed subclass of Widget";
            }
        };

        System.out.println("wid3 says " + wid3.id());

        System.out.println("--------------------------------");

        show(wid1);
        show(wid2);
        show(wid3);

        show(new Widget() {
            @Override
            public String id() {
                return "I'm another instance of an unnamed subclass of Widget";
            }
        });

        show(() -> "I'm id'ing an anonymous object created via a lambda expression");
    }
}
