import java.lang.*;

public class main {

    public static int getElementAtIndex(int[] arr, int index) throws ArrayIndexOutOfBoundsException {

        if (index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("Índice fuera de los límites del array");
        }
        return arr[index];
    }
}

