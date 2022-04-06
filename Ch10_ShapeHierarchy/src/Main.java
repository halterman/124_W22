import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Rectangle rect1 = new Rectangle(10, 5),
                  rect2 = new Rectangle(4, 2.5),
                  rect3 = new Rectangle(10, 5);
        System.out.println(rect1 + " equal to " + rect2 + "?   " + rect1.equals(rect2));
        System.out.println(rect1 + " equal to " + rect3 + "?   " + rect1.equals(rect3));
        System.out.println("Area of " + rect1 + " is " + rect1.area());
        System.out.printf("Area of %s is %.3f%n", rect1, rect1.area());

        System.out.println("--------------------------------");

        Circle circ1 = new Circle(5),
               circ2 = new Circle(2.5),
               circ3 = new Circle(5);
        System.out.println(circ1 + " equal to " + circ2 + "?   " + circ1.equals(circ2));
        System.out.println(circ1 + " equal to " + circ3 + "?   " + circ1.equals(circ3));
        System.out.println("Area of " + circ1 + " is " + circ1.area());
        System.out.printf("Area of %s is %.3f%n", circ1, circ1.area());

        System.out.println("--------------------------------");

        Rectangle[] rects = { new Rectangle(1, 1), new Rectangle(2, 4), new Rectangle(14, 12), new Rectangle(8, 3) };
        System.out.println(Arrays.toString(rects));
        double totalArea = 0.0;
        for (Rectangle r : rects) {
            totalArea += r.area();
        }
        System.out.println("Total rectangle area is " + totalArea);

        Circle[] circs = { new Circle(1), new Circle(4), new Circle(14), new Circle(8) };
        System.out.println(Arrays.toString(circs));

        Shape s = new Rectangle(10, 4);
        System.out.println(s + " has area " + s.area());

        Shape[] shapes = {new Rectangle(1, 1), new Rectangle(2, 4), 
                        new Circle(1), new Circle(4), new Circle(14)};

        totalArea = 0.0;
        for (Shape obj : shapes) {
            totalArea += obj.area();
        }
        System.out.println("Total shape area is " + totalArea);
    }
}
