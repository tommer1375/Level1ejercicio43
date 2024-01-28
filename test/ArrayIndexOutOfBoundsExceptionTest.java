package n4ejercicio3;
import java.sql.Array;
import java.util.*;
import org.junit.jupiter.api.Test;

public class ArrayIndexOutOfBoundsExceptionTest {

    @Test
    public void testThrowArrayIndexOutOfBoundsException() {

        try {
            int[] array = {1, 2, 3, 4, 5, 6,};
            System.out.println(array[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: número fuerda de indice" + e);
        }
    }
}