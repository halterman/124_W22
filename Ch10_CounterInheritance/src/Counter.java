/**
 * Allows clients to keep track of the number of things.
 * {@code Counter} objects are more reliable than simple integer
 * variables because they automatically are initialized to zero 
 * (unlike local variables), and each count incident increases their
 * value exactly by one.  By comparison, clients may assign arbitrary 
 * values to integer variables.
 */
public class Counter {
    private int count;

    /**
     * Initializes a new {@code Counter} object to begin counting at zero
     */
    public Counter() {
        count = 0;
    }

    /**
     * Adds one to the counter.
     */
    public void increment() {
        count++;
    }

    /**
     * Returns the {@code Counter} object's current value
     * @return the counter's current value
     */
    public int read() {
        return count;
    }

}