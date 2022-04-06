import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class ArrayUtilsTester {
    
    //----- ArrayUtils.findElement tests ----------------
    
    @Test
    void checkFindElementInTheMiddle() {
        int[] a = { 20, 16, 30, 20, 55 };
        assertEquals(true, ArrayUtils.findElement(a, 30));
    }

    @Test
    void checkFindElementMissing() {
        int[] a = { 20, 16, 30, 20, 55 };
        assertEquals(false, ArrayUtils.findElement(a, 35));
    }

    @Test
    void checkFindElementLast() {
        int[] a = { 20, 16, 30, 16, 55 };
        assertEquals(true, ArrayUtils.findElement(a, 55));
    }

    @Test
    void checkFindElementFirst() {
        int[] a = { 20, 16, 30, 16, 55 };
        assertEquals(true, ArrayUtils.findElement(a, 20));
    }
    
    //----- ArrayUtils.countEvens tests ----------------
    
    @Test
    void checkCountEvensThree() {
        int[] a = { 22, 16, 31, 20, 55 };
        assertEquals(3, ArrayUtils.countEvens(a));
    }

    @Test
    void checkCountEvensNone() {
        int[] a = { 23, 17, 31, 19, 55 };
        assertEquals(0, ArrayUtils.countEvens(a));
    }

    @Test
    void checkCountEvensAll() {
        int[] a = { 22, 16, 0, 18, 56 };
        assertEquals(a.length, ArrayUtils.countEvens(a));
    }
}
