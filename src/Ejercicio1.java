import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamanio del arreglo");
        int tamanio = sc.nextInt();

        int[] vector = new int[tamanio];
        int[] total = new int[tamanio];

        System.out.println("Ingrese los numeros a elevar");

        for (int i = 0; i < tamanio; i++) {

            System.out.println("Elemento "+(i+1));
            vector[i] = sc.nextInt();

            total[i] = vector[i] * vector[i];
        }

        System.out.println("Los numeros elevados al cuadrado son: ");

        for (int i = 0; i < vector.length; i++) {

            System.out.println(total[i]);

        }

    }

}