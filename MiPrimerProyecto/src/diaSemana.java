import java.util.Scanner;
public class diaSemana {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dia;

        System.out.println("Introduzca un número entre el 1 y el 7: ");

        dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes. Lo siento.");
                break;

            case 2:
                System.out.println("Martes. Mejor que Lunes.");
                break;

            case 3:
                System.out.println("Miércoles, ya falta menos.");
                break;

            case 4:
                System.out.println("Jueves, ¡casi!");
                break;

            case 5:
                System.out.println("¡VIERNES!");
                break;

            case 6:
                System.out.println("Sá-bad-o o o o");
                break;

            case 7:
                System.out.println("Domingo, a descansar.");
                break;

            default:
                System.out.println("ERROR. Tiene que ser entre el UNO (1) y el SIETE (7)");
                break;
        }

    }
}

