public class ArrayUtils {
    /**
     * Determines if an integer array contains a particular value
     * @param arr the array to search
     * @param seek the value to locate
     * @return true, if the array contains the value; otherwise, false
     */
    public static boolean findElement(int[] arr, int seek) {
        // Note: This code has a bug in it
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == seek) {
                return true;
            }
        }
        return false;
    }

    /**
     * Counts the number of even values in an integer array
     * @param arr the array
     * @return the number of even numbers stored in the array
     */
    public static int countEvens(int[] arr) {
        int count = 0;
        for (int val : arr) {
            if (val % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    
}
