import java.util.Scanner;

public class Ejercicio2 {

    /*Ingresar 10 valores numericos a un array y mostrar cuantos son pares y cuantos son impares*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vector = new int[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("Vector "+(i+1));
            vector[i] = sc.nextInt();

        }

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 5; i++) {

            if (vector[i] % 2 ==0){
                pares++;
            } else {
                impares++;
            }

        }

        System.out.println("Hay "+pares+" numeros pares");
        System.out.println("Hay "+impares+" numeros impares");

    }

}