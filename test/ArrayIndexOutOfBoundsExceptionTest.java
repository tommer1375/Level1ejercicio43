import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class ArrayIndexOutOfBoundsExceptiontest {
    @Test
    public void testArrayIndexOutOfBoundsException() {
        int[] arr = { 1, 2, 3, 4, 5 };
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            main.getElementAtIndex(arr, 9);
        });
    }
}

