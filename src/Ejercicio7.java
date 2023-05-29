import java.util.Scanner;

public class Ejercicio7 {

    /*Realizar la operacion para llenar de forma aleatoria un vector de numeros enteros y contar cuantos numeros
    * que estan almacenados en el vector son numeros primos*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vector = new int[20];

        for (int i = 0; i < 20; i++) {
            vector[i] = (int)(Math.random() * (50 + 1));
        }

        int contador = 0;

        for (int i = 0; i < 20; i++) {
            if (vector[i] % 2 == 1) {
                System.out.print(vector[i] + " ");
                contador++;
            }
        }

        System.out.println("\nHay "+contador+" numeros primos ");

    }

}