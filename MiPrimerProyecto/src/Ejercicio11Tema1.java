// Escribe un programa que lea dos números enteros y aplique sobre ellos todos los operadores aritméticos
// (suma, resta, multiplicación, división entera, módulo, postincremento, preincremento del primero de ellos, postdecremento y predecremento del segundo),
// visualizando todas las operaciones con sus resultados.
import java.util.Scanner;
public class Ejercicio11Tema1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca dos números enteros: ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("La suma de " + num1 + " + " + num2 + " es igual a: " + (num1+num2));

        System.out.println("La resta de " + num1 + " - " + num2 + " es igual a: " + (num1-num2));

        System.out.println("La multiplicación de " + num1 + " x " + num2 + " es igual a: " + (num1*num2));

        System.out.println("La división de " + num1 + " / " + num2 + " es igual a: " + (num1/num2));

        System.out.println("El módulo de " + num1 + " % " + num2 + " es igual a: " + (num1%num2));

        System.out.println("La postincremento de " + num1 + " es igual a: " + (num1++));

        System.out.println("El preincremento de " + num1 + " es igual a: " + (++num1));

        System.out.println("El postdecremento de " + num2 + " es igual a: " + (num2--));

        System.out.println("El predecremento de " + num2 + " es igual a: " + (--num2));
    }
}
