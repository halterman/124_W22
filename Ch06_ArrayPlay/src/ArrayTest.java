import java.util.Arrays;

public class ArrayTest{
    public static void main(String[] args) {
        int[] numbers = {3, 0, 10, 11, 5, 3, 10, 12};
        int[] numbers1 = {3, 1, 13, 11, 5, 3, 1, 21};
        int[] numbers2 = {3};
        int[] numbers3 = {2};
        int[] numbers4 = {};

        System.out.println("Number of evens in " + Arrays.toString(numbers)
                           + " is " + ArrayUtilities.countEvens(numbers));
        System.out.println("Number of evens in " + Arrays.toString(numbers1)
                           + " is " + ArrayUtilities.countEvens(numbers1));
        System.out.println("Number of evens in " + Arrays.toString(numbers2)
                           + " is " + ArrayUtilities.countEvens(numbers2));
        System.out.println("Number of evens in " + Arrays.toString(numbers3)
                           + " is " + ArrayUtilities.countEvens(numbers3));
        System.out.println("Number of evens in " + Arrays.toString(numbers4)
                           + " is " + ArrayUtilities.countEvens(numbers4));
        System.out.println(Arrays.toString(numbers) + " without evens is "
                           + Arrays.toString(ArrayUtilities.filterEvens(numbers)));
    }
}
