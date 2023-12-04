// Define un array de 10 caracteres y asigna los valores a los elementos según la tabla que se muestra a continuación.
// Muestra el contenido de todos los elementos del array.
// ¿Qué sucede con los valores de los elementos que no han sido inicializados?. Indica la respuesta en forma de comentario.
public class Ejercicio4Tema3 {
    public static void main(String[] args) {

        char[] caracteres = new char[9];

        caracteres[0] = 'a';
        caracteres[1] = 'x';
        caracteres[4] = '@';
        caracteres[6] = ' ';
        caracteres[7] = '+';
        caracteres[8] = 'Q';

        for (int i = 0; i < caracteres.length; i++) {
            System.out.println("Elemento en la posición " + i + ": " + caracteres[i]);

        }
    // Muestra un carácter erróneo, sin embargo, si lo casteamos, sadŕa un '0'
    }
}
