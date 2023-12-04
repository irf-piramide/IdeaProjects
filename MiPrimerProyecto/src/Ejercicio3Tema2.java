// Escribe un programa que lea del teclado dos números e indique si uno de ellos es múltiplo de otro.
import java.util.Scanner;
public class Ejercicio3Tema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca dos números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 % num2 == 0) {
            System.out.println(num1 + " y " + num2 + " son múltiplos.");
        } else {
            System.out.println(num1 + " y " + num2 + " no son múltiplos.");
        }

    }
}
