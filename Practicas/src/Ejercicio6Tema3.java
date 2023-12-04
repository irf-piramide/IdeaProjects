// Escribe un programa que pida 10 números por teclado y que luego muestre los números introducidos junto con las palabras “máximo” y “mínimo”
// al lado del máximo y del mínimo respectivamente.

import java.util.Scanner;

public class Ejercicio6Tema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el número" + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int maximo = numeros[0];
        int minimo = numeros[0];

        for (int i = 1; i < numeros.length; i++) {

        }

        }
    }
