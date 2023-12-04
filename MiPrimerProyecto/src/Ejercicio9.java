import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número: ");

        long tiempoEnSegundos = scanner.nextLong();

        long semanas = tiempoEnSegundos / (7 * 24 * 60 * 60);
        tiempoEnSegundos %= (7 * 24 * 60 * 60);

        long dias = tiempoEnSegundos / (24 * 60 * 60);
        tiempoEnSegundos %= (24 * 60 * 60);

        long horas = tiempoEnSegundos / (60 * 60);
        tiempoEnSegundos %= (60 * 60);

        long minutos = tiempoEnSegundos / 60;
        tiempoEnSegundos %= 60;

        System.out.printf("Tiempo en segundos: %d semanas, %d días, %d horas, %d minutos y %d segundos.", semanas, dias, horas, minutos, tiempoEnSegundos);


        }


    }


