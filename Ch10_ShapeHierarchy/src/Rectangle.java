public class Rectangle extends Shape {
    private double width;
    private double height;

    /**
     * Initializes a new {@code Rectangle} object with a
     * given width and height
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Computes the area of a {@code Rectangle} object
     * @return the area of the {@code Rectangle} object
     */
    public double area() {
        return width*height;
    }

    @Override
    public String toString() {
        return String.format("[Rectangle (%.3f x %.3f)]", width, height);
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
        Rectangle other = (Rectangle) obj;
        return floatEquals(width, other.width) && floatEquals(height, other.height); 
    }
}
