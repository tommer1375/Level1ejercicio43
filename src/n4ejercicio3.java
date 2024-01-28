package n4ejercicio3;

import java.sql.Array;
import java.util.*;

public class n4ejercicio3 {
    public static void main(String[] args) {

       Scanner myObj = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6,};

        try {


            System.out.println("Indica una posición para saber si existe en el array");
            int posicion=myObj.nextInt();

            System.out.println(array[posicion]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: número fuerda de indice" + e);
        } finally {
            System.out.println("Fin del programa");
        }
    }

}


