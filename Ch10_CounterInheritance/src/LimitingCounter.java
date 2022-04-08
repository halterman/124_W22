/**
 * A restricted counter that cannot count above a certain value
 */
public class LimitingCounter extends Counter {
    private int limit;

   /**
     * Initializes a new {@code Counter} object to begin counting at zero
     * a establishes the upper limit to which it can count.
     */
    public LimitingCounter(int limit) {
        this.limit = limit;
    }

    /**
     * Adds one to the counter, unless it has reached its
     * upper limit.
     */
    public void increment() {
        if (read() < limit) {
            super.increment();
        }
    }

}
