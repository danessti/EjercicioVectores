import java.util.Scanner;

public class Ejercicio3 {

    /*Hacer un programa que permita ingresar 10 valores a un array seguido muestre cuantos son positivos, cuantos
    * negativos y cuantos son nulos*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Inrgesa el tamano del arreglo");
        int tamano = sc.nextInt();

        int[] vector = new int[tamano];

        for (int i = 0; i < tamano; i++) {

            System.out.println("Ingresa el valor "+(i+1));
            vector[i] = sc.nextInt();

        }

        int positivos = 0;
        int nulos = 0;
        int negativos = 0;

        for (int i = 0; i < tamano; i++) {

            if (vector[i] > 0) {
                positivos++;
            } else if (vector[i] == 0) {
                nulos++;
            } else {
                negativos++;
            }

        }

        System.out.println("Hay "+positivos+" positivos \n");
        System.out.println("Hay "+negativos+" negativos \n");
        System.out.println("Hay "+nulos+" nulos ");

    }

}