import java.util.Scanner;

public class Ejercicio4 {

    /*Pedir por teclado el tamano de un arreglo de numeros y pedir los valores numericos con los que se rellena.
    * Los valoresno se pueden repetir, por lo tanto, debera de envargarse de buscar cada numero que lea y verificar
    * que no se haya leido antes. Mostrar el arreglo con los valores al final*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeros_elementos = 0;
        int elemento = 0;
        boolean elemento_no_repetido = true;

        System.out.println("Introduce el tamano del arreglo");
        int tamano = sc.nextInt();

        int[] numeros_no_repetidos = new int[tamano];

        while (numeros_elementos < tamano) {

            System.out.println("Escriba un valor numerico:  "+(numeros_elementos+1));
            elemento = sc.nextInt();

            for (int i = 0; i < numeros_elementos; i++) {

                if (elemento == numeros_no_repetidos[i]){
                    elemento_no_repetido = false;
                }

            }

            if (elemento_no_repetido) {

                numeros_no_repetidos[numeros_elementos] = elemento;
                numeros_elementos++;

            } else {
                System.out.println("Este elemento existe en el arreglo");
            }

            elemento_no_repetido = true;

        }

        System.out.println("El contenido del arreglo es: ");

        for (int i = 0; i < tamano; i++) {
            System.out.println(numeros_no_repetidos[i]);
        }

    }

}