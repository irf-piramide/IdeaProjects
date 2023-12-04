// Escribe un programa que lea 15 números por teclado y los almacene en un array.
//  Rota los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1, el de la 1 a la 2, etc.
// El número que se encuentra en la última posición debe pasar a la posición 0. Finalmente, muestra el contenido del array.
import java.util.Scanner;

public class Ejercicio7Tema3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[15];
        int[] aux = new int [15];

        System.out.println("Escribe 15 números: ");

        for (int i = 0; i < 15; i++) {
            aux[i] = scanner.nextInt();
        }

        nums[0] = aux[14];

        for (int j = 1; j < 14; j++) {
            nums[j] = aux[j-1];

        }

        //for (int k = 0; k < 14; k++) {
            //System.out.println(nums[k]);
       // }
        System.out.println(nums[1] +nums[2] + );







                }

            }



/* nums[0] = nums[14];
         nums[1] = nums [0];
         nums[2] = nums[1];
         nums[3] = nums[2];
         nums[4] = nums[3];
         nums[5] = nums[4];
         nums[6] = nums[5];
         nums[7] = nums[6];
         nums[8] = nums[7];
         nums[9] = nums[8];
         nums[10] = nums[9];
         nums[11] = nums[10];
         nums[12] = nums[11];
         nums[13] = nums[12];
         nums[14] = nums[13];
*/