public class ArrayUtilities {
    public static int countEvens(int[] arr) {
        int count = 0;
        // This version uses the traditional for loop
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] % 2 == 0) {
        //         count++;
        //     }
        // }
        
        // This version uses the enhanced for loop
        for (int elem : arr) {
            if (elem % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] filterEvens(int[] original) {
        int[] result;
        int resultSize = original.length - countEvens(original);
        result = new int[resultSize];
        int pos = 0;
        for (int i = 0; i < original.length; i++) {
            if (original[i] % 2 != 0) {
                result[pos] = original[i];
                pos++;
            }
        }
        return result;
    }
}
