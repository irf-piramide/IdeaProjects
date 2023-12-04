import java.util.Scanner;
public class Ejercicio9b {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int numeroMaximo = scanner.nextInt();

        int contadorLinea = 1;

        while (contadorLinea <= numeroMaximo) {

            int numeroActual = 1;

            while (numeroActual <= contadorLinea) {

                System.out.print(numeroActual + " ");
                numeroActual++;

            }
            System.out.println();
            contadorLinea++;

        }
    }
}
