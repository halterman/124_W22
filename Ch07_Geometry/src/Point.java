/**
 * Represents a geometric point.
 * Point objects are immutable.
 */
public class Point {
    public final double x;
    public final double y;

    /**
     * Initializes a {@code Point} object
     * @param x is the <em>x</em> component of the new point
     * @param y is the <em>y</em> component of the new 
     *        <span style="color:red;">point</span>
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point other) {
        double xDiff = other.x - this.x,
               yDiff = other.y - this.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
