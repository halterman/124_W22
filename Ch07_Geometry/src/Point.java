/**
 * Represents a geometric point.
 * Point objects are immutable.
 */
public class Point {
    /** The <em>x</em> component of the point */
    public final double x;
    /** The <em>y</em> component of the point */
    public final double y;

    /** The point (0, 0); that is, the origin of the coordinate system */
    public static final Point ORIGIN = new Point(0, 0);

    /** Specifies the tolerance when comparing floating-point numbers for equality */
    private static final double CLOSE_ENOUGH = 0.00001;

    /** Can add a javadoc comment here ... */
    private boolean floatEquals(double num1, double num2, double tolerance) {
        return num1 == num2 || Math.abs(num1 - num2) < tolerance;
    }

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


    /**
     * Computes the distance between this point and another point
     * @param other the point to compute the distance to
     * @return the distance to the other point
     */
    public double distance(Point other) {
        double xDiff = other.x - this.x,
               yDiff = other.y - this.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public boolean equals(Point p) {
        return floatEquals(x, p.x, CLOSE_ENOUGH) && floatEquals(y, p.y, CLOSE_ENOUGH);
    }

    /**
     * Returns a human-readable representation of a point object
     */
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
