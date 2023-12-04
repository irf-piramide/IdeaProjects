// Define un array de 12 números y asigna valores a los elementos según la tabla que se muestra a continuación. Muestra el contenido de todos los elementos del array.
// ¿Qué sucede con los valores de los elementos que no han sido inicializados?. Indica la respuesta en forma de comentario.
public class Ejercicio2Tema3 {
    public static void main(String[] args) {

        int[] numeros = new int[12];

        numeros[0] = 39;
        numeros[1] = -2;
        numeros[3] = 0;
        numeros[5] = 14;
        numeros[7] = 5;
        numeros[9] = 120;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en la posición " + i + ": " + numeros[i]);
        }

        // Los elementos del array que no han sido inicializados tendrán el valor por defecto para su tipo, que sería 0.
    }
}