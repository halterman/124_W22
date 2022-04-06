public class Circle extends Shape {
    private double radius;

    /**
     * Initializes a new {@code Circle} object with a
     * given radius
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Computes the area of a {@code Rectangle} object
     * @return the area of the {@code Rectangle} object
     */
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("[Circle (radius = %.3f)]", radius);
    }

    /**
     * Compares two double-precision floating-points numbers to see
     * if they are close enough to be considered "equal"
     * @param a one of the numbers to compare
     * @param b the other number to compare
     * @return true, if the difference of the two arguments is very small; 
     *         otherwise, returns false
     */
    private static boolean floatEquals(double a, double b) {
        return a == b || Math.abs(a - b) < 0.000001;
    }

    /**
     * Determines if an object is equal to a {@code Rectangle} object
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } 
        if (obj == null) {
            return false;
        } 
        if (getClass() != obj.getClass()) {
            return false;
        }
        Circle other = (Circle) obj;
        return floatEquals(radius, other.radius); 
    } 
}
