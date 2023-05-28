import java.util.Scanner;

public class Ejercicio6 {

    /*Elaborar un programa que ingrese 20 numeros aleatorios a un array y mostrar una lista de los numeros menores
    * o iguales que 10 que hayan sido ingresados */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vector = new int[20];

        for (int i = 0; i < 20; i++) {
            vector[i] = (int)(Math.random() * (50 + 1));
        }

        for (int i = 0; i < 20; i++) {
            if (vector[i] <= 10) {
                System.out.print(vector[i] + " ");
            }
        }

        System.out.println("");

    }

}