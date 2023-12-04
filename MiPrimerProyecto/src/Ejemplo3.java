public class Ejemplo3 {
    public static void main(String[] args) {
        final double PI = 3.14;

        double radio = 5.56;
        double resultado = PI * radio * radio;
        // System.out.println("El radio del circulo es: " + resultado);
        System.out.printf("El radio del circulo %.1f es %.3f", radio, resultado);
        // System.out.println("Radio = " + radio + "\n" + "Circulo: " );
    }
}
