import java.util.Scanner;
public class Ejemplo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el número 1: ");
        double n1 = sc.nextDouble();
        System.out.println("Introduzca en número 2: ");
        double n2 = sc.nextDouble();
        System.out.println("La suma de " + n1 + " +" + n2 + "es igual a: " + (n1+n2));
        System.out.println("La resta de " + n1 + " -" + n2 + "es igual a: " + (n1-n2));
        System.out.println("La multiplicación de " + n1 + " *" + n2 + "es igual a: " + (n1*n2));
    }
}

