// Debido a una pertinaz sequía se decidió poner en práctica un sistema de cobro de agua que penalice el consumo excesivo
// tal como indica la tabla siguiente:
//Consumo ( en metros cúbicos)
//€ por metro cúbico
//Primeros 100
//0.15
//De 100 a 500
//0.20
//De 500 a 1000
//0.35
//Más de 1000
//0.80
//Escribe un programa que lea del teclado los metros cúbicos consumidos y muestre en la pantalla el coste de agua total.
// Ten en cuenta que en la tabla se indica lo que hay que cobrar por los metros cúbicos que se encuentran en el intervalo.
// Así si hemos consumido 750 deberíamos pagar: 100*0.15 + 400*0.20 + 250*0.35 = 182.50 €. Usa constantes.

import java.util.Scanner;

public class Ejercicio6Tema2 {

    public static void main(String[] args) {

        final double costo_100 = 0.15;
        final double costo_500 = 0.20;
        final double costo_1000 = 0.35;
        final double costo_mas_1000 = 0.80;

        final int limite_100 = 100;
        final int limite_500 = 500;
        final int limite_1000 = 1000;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el consumo en metros cúbicos: ");
        double consumo = sc.nextDouble();

        double total = 0;

        if (consumo <= limite_100) {
            total = consumo * costo_100;
        } else if (consumo <= limite_500) {
            total = limite_100 * costo_100 + (consumo - limite_100) * costo_500;

        } else if (consumo <= limite_1000) {
            total = limite_100 * costo_100 + (limite_500 - limite_100) * costo_500
        }


    }
}
