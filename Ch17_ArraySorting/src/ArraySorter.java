import java.util.Arrays;

public class ArraySorter {

    /**
     * Performs a selection sort on an integer array
     * @param a the array to sort
     */
    public static void sort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[smallest]) {
                    smallest = j;
                }
            }
            if (smallest != i) {
                int temp = a[smallest];
                a[smallest] = a[i];
                a[i] = temp;
            }
        }
    }


    public static void main(String[] args) throws Exception {
        int[] list = { 2, 4, 7, 1, 5, 2, 0, 4, 3 };
        System.out.println(Arrays.toString(list));
        sort(list);
        System.out.println(Arrays.toString(list));
    }
}
