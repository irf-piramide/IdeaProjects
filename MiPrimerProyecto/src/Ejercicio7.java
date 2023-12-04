// Escribe un programa que pasa de dólares a euros.

import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una cantidad de dólares: ");
        double dolar = scanner.nextDouble();
        double euro = dolar * 0.94;

        System.out.printf("%.2f dólares son %.2f euros.", dolar, euro);

    }
}
