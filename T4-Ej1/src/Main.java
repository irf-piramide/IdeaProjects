import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Empezamos");
        int numero1 = obtenerNumeroUnoPorTeclado();
        int numero2 = obtenerNumeroDosPorTeclado();

        System.out.println("El número (1) que ha devuelto el usuario es: " + numero1);
        System.out.println("El número (2) que ha devuelto el usuario es: " + numero2);

        System.out.println("--------------");

        System.out.println("La suma de (1) y (2) es: " + suma(numero1, numero2));
        System.out.println("La resta de (1) y (2) es: " + resta(numero1, numero2));
        System.out.println("La division de (1) y (2) es: " + division(numero1, numero2));
        System.out.println("La multiplicación de (1) y (2) es: " + multiplicacion(numero1, numero2));


    }

    public static int obtenerNumeroUnoPorTeclado(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int numero1 = scanner.nextInt();

        return numero1;
    }

    public static int obtenerNumeroDosPorTeclado(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el segundo número");
        int numero2 = scanner.nextInt();

        return numero2;
    }

    public static int suma(int numero1, int numero2) {

        int sumaNumeros = numero1 + numero2;
        return sumaNumeros;
    }

    public static int resta(int numero1, int numero2){

        int restaNumeros = numero1 - numero2;
        return restaNumeros;
    }

    public static int division(int numero1, int numero2){
fútbol
        int divisionNumeros = numero1 / numero2;
        return divisionNumeros;
    }

    public static int multiplicacion(int numero1, int numero2){

        int multiplicacionNumeros = numero1 * numero2;
        return multiplicacionNumeros;
    }
}

