// Escribe un programa que lea un número entero por teclado e indique si es par o impar.

import java.util.Scanner;

public class Ejercicio1Estructuras {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");

        int N = scanner.nextInt();

        if (N%2 == 0){

            System.out.println(N + " es par.");
        } else {

            System.out.println(N + " es impar.");
        }

    }
}
