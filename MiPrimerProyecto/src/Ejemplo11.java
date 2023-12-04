import java.util.Scanner;

public class Ejemplo11 {
    public static void main(String[] args) {
        // 1. Leer un número entero del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce un número entero:");
        int numero = scanner.nextInt();

        int contador = 0;
        int numeroTemporal = numero;

        if (numero == 0) {
            contador = 1;

        } else {
            if (numeroTemporal < 0)
                numeroTemporal = -numeroTemporal;
        }

        while (numeroTemporal != 0) {
            numeroTemporal = numeroTemporal / 10;
            contador++;
        }

        System.out.println("El número " + numero + " tiene " + contador + " dígitos.");
    }
}

