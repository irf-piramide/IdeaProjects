// Crea un array de notas de un alumno. Además crea una variable que almacene el número de años que lleva estudiando en el centro.
// Genera un método que "cambie" el valor de los años que lleva estudiando en el centro (pasado como argumento).
// Luego otro que cambie la primera nota del array
// (pasado como argumento). Invoca los dos métodos, presenta luego los datos y observa lo que pasa. (utiliza .length)
public class Ejemplo2Array {
    public static void main(String[] args) {

        int[] notas = {1, 2, 3, 4};
        int tiempo = 2;

        System.out.println("El alumno lleva estudiando " + tiempo);

        cambiaTiempo(tiempo);

        System.out.println("Después de llamar a cambiaTiempo, el tiempo vale " + tiempo);

        System.out.println("El array de notas contiene ");
       // for(int i = 0; i < notas.length, i++)
    }

    public static void cambiaTiempo(int tiempo){

        tiempo++;
    }

    public static void cambiaNotas(int[] notas){

        for (int i = 0; i < notas.length; i++){

            notas[i]++;
        }
    }


}
