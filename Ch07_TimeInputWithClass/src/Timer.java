public class Timer {
    // Class variables that keep track of the state of the timer
    private static long startTime;
    private static long stopTime;
    private static boolean isRunning = false;

    /**
     * Starts the timer, if necessary.  If the timer
     * is running already, the method does nothing.
     */
    public static void start() {
        if (!isRunning) {
            isRunning = true;
            startTime = System.currentTimeMillis();
        }
    }
    
    public static void stop() {
        if (isRunning) {
            stopTime = System.currentTimeMillis();
            isRunning = false;
        }
    }

    /**
     * Returns the elapsed time in seconds.
     * @return the elapsed time in seconds, if the timer is
     * stopped.  If the timer currently is running, the method
     * returns zero.
     */
    public static double elapsed() {
        if (!isRunning) {
            return (stopTime - startTime)/1000.0;
        } else {
            return 0.0;
        }
    }
    
}
