import java.util.Scanner;

public class PepeDebugger
{
    final static int PRECIO_54 = 54;
    final static int PRECIO_2503 = 2403;
    final static float CINCO_PORCIENTO_DE_DESCUENTO = 0.05f;
    final static float QUINCE_PORCIENTO_DE_DESCUENTO = 0.15f;

    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el precio del producto");

        double precio = scanner.nextDouble();

        if(precio >= PRECIO_54 && precio < PRECIO_2503){
            double descuento = precio + CINCO_PORCIENTO_DE_DESCUENTO;
            precio = precio - descuento;
        }else {
            double descuento = precio + QUINCE_PORCIENTO_DE_DESCUENTO;
            precio = precio * descuento;
        }

        System.out.println("El precio final del producto es: " + precio);

    }
}
