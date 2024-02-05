import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayIndexOutOfBoundsExceptionTest {

    @Test
    public void testThrowArrayIndexOutOfBoundsException() {
        ArrayIndexOutOfBoundsExceptionClass exceptionClass = new ArrayIndexOutOfBoundsExceptionClass();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            exceptionClass.throwArrayIndexOutOfBoundsException();
        });
    }
}
