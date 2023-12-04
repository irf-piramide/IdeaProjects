// Escribe un programa que lea del teclado una letra e imprima su carácter ASCII así como los tres siguientes caracteres:
//
//Introduce un carácter: E
//
//Código ASCII de E es 69
//
//Los tres siguientes caracteres son: F - G - H

import java.util.Scanner;
public class Ejercicio12Tema1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un carácter: ");
        char letra = scanner.next().charAt(0);

        int ascii = letra;

        switch (ascii){
            case 88:
                System.out.println("Código ASCII de X es 88 \n Los tres siguientes carácteres son: Y Z A");
                break;
            case 89:
                System.out.println("Código ASCII de Y es 89");
                break;
            case 90:
                System.out.println("Código ASCII de Z es");
            default:
                System.out.println("Código ASCII de " + letra + " es " + ascii);

                System.out.println("Los tres siguientes carácteres son: ");


        }


    }
}


// --------------------------------------------------
        /*if (ascii == 58){

            System.out.println("Código ASCII de X es 58.");
            System.out.println("Los tres siguientes: Y Z A ");

        } else if (ascii == 59) {

            System.out.println("Código ASCII de Y es 59.");
            System.out.println("Los tres siguientes: Z A B");

        } else if (ascii == 60) {

            System.out.println("Código ASCII de Z es 60.");
            System.out.println("Los tres siguientes: A B C");

        } else if (ascii == 78) {

            System.out.println("Código ASCII");


        } */