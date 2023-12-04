// Escribe un programa que lea del teclado tres números e indique el mayor de ellos.
import java.util.Scanner;
public class Ejercicio2Estructuras {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numeroA, numeroB, numeroC;

        System.out.println("Introduzca tres números: ");

        numeroA = scanner.nextFloat();
        numeroB = scanner.nextFloat();
        numeroC = scanner.nextFloat();

        // System.out.printf("%.2f %.2f %.2f", numeroA, numeroB, numeroC);

        double posicion1, posicion2, posicion3;

        if (numeroA>numeroB && numeroA>numeroC){

            posicion1 = numeroA;

        }

       // if (numeroB>numeroA && numeroB>numeroC)

    }
}
