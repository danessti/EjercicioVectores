import java.util.Scanner;

public class Ejercicio5 {

    /*Haz un vector numerico de 10 posiciones dados por el usuario y muestre los elementos que son mayores al numero
    * dado por el usuario*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vector = new int[10];

        for (int i = 0; i < 10; i++) {

            System.out.println("Ingrese el valor "+(i+1));
            vector[i] = sc.nextInt();

        }

        System.out.println("Ingrese un numero");
        int num = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if (vector[i] > num) {
                System.out.println(vector[i]);
            }
        }

    }

}