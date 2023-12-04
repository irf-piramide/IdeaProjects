import java.util.Scanner;
public class NotasAlumno {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nota;

        System.out.println("Alumno, introduzca su nota: ");

        nota = scanner.nextInt();

        switch (nota){
            case 10:
            case 9:
                System.out.println("Sobresaliente.");
                break;
            case 8:
            case 7:
                System.out.println("Notable.");
                break;
            case 6:
                System.out.println("Bien.");
                break;
            case 5:
                System.out.println("Suficiente.");
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Insuficiente.");
                break;
            default:
                System.out.println("Número inválido.");
        }


       /* int nota = scanner.nextInt();

        if ( nota > 10 || nota < 0 ){
            System.out.println("¡ERROR! El número de la nota que ser entre 0 y 10");
        } else if ( nota >= 9) {
            System.out.println("¡Excelente! Has sacado un SOBRESALIENTE.");
        } else if ( nota == 7 || nota == 8) {
            System.out.println("Enhorabuena, has sacado un NOTABLE.");
        } else if ( nota == 6) {
            System.out.println("Has sacado un BIEN.");
        } else if ( nota == 5 ) {
            System.out.println("Tu nota es un SUFICIENTE.");
        } else {
            System.out.println("Tu nota es un INSUFICIENTE.");
        }*/
    }
}
