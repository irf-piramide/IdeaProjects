// Escribe un programa que lea 10 números por teclado y luego los muestre en orden inverso
// es decir, el primero que se introduce es el último en mostrarse y viceversa.
import java.util.Scanner;
public class Ejercicio1Tema3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int [] numeros = new int[10];



        for (int i = 0; i <= 9; i++ ) {

            System.out.println("Introduzca un número: ");

            int num = scanner.nextInt();

            numeros[i] = num;
        }

        for (int i = 9; i >= 0; i-- ) {

            System.out.println(numeros[i]);
        }


    }

 }




