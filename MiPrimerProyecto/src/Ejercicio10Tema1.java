// Escribe un programa que solicite la longitud y anchura en metros de una habitación e imprima su superficie con cuatro decimales.
import java.util.Scanner;
public class Ejercicio10Tema1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca longitud y anchura: ");
        double longitud = scanner.nextDouble();
        double anchura = scanner.nextDouble();

        double superficie = longitud * anchura;

        System.out.printf("Longitud: %.4f \n Anchura: %.4f \n Superficie = %.4f x %.4f \n Resultado superficie = %.4f", longitud, anchura, longitud, anchura, superficie);

    }
}
