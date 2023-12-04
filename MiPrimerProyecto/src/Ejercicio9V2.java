import java.util.Scanner;
public class Ejercicio9V2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una cantidad de segundos: ");

        long segundos = scanner.nextLong();

        long unaSemana = 604800;
        long unDia = 86400;
        long unaHora = 3600;
        long unMinuto = 60;

        long semanas = segundos / unaSemana;

        System.out.printf("La cantidad de segundos que has introducido es equivalente a: %d semanas, %d dias, %d horas, %d minutos y %d segundos.", semanas);

    }
}
