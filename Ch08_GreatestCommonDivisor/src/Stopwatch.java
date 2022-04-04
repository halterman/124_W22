public class Stopwatch {
    private long startTime;
    private long stopTime;
    private boolean isRunning = false;

    public void start() {
        if (!isRunning) {
            isRunning = true;
            startTime = System.currentTimeMillis();
        }
    }
    
    public void stop() {
        if (isRunning) {
            stopTime = System.currentTimeMillis();
            isRunning = false;
        }
    }

    public double elapsed() {
        if (!isRunning) {
            return (stopTime - startTime)/1000.0;
        } else {
            return 0.0;
        }
    } 
}
