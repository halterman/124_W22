public class Geometry {
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1) * (y2 - y1));
    }
    public static double distance(Point p1, Point p2) {
        double xDiff = p2.x - p1.x,
               yDiff = p2.y - p1.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public static void main(String[] args) {
        Point pt1 = new Point(1, 1), pt2 = new Point(2, 2);

        System.out.println("The distance between pt1 and pt2 is " 
                            + distance(pt1, pt2));
        System.out.println("The distance between pt1 and pt2 is " 
                            + pt1.distance(pt2));
        System.out.println(pt1);
    }
}
