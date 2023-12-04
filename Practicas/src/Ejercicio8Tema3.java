// Implementa un programa que pida al usuario las calificaciones (double) de los 10 estudiantes de una clase y los guarde en un array.
// Después, mostrará esas calificaciones (cada una en una línea), seguida de la media del curso y del número de aprobados y suspensos.
// Se usará un método para calcular la nota media y otro para el número de suspensos.
import java.util.Scanner;
public class Ejercicio8Tema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] calificaciones = new double[10];

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.printf("Ingrese la calificación del estudiante " + (i + 1) + ": ");
            calificaciones[i] = sc.nextDouble();

        }
        for (int i = 0; i < calificaciones.length; i++){
            System.out.println("Calificaciones estudiantes: " + (i + 1) + ": " + calificaciones[i] );
        }


    }

    public static double calcularMedia(double[] calificaciones) {
        return 0.0;

    }

    public  static double calcularSuspensos(double[] calificaciones) {
        return 0;
    }
}
