public class Ejemplo1Array {
    public static void main(String[] args) {
        double [] porcentajes;
        porcentajes = new double[12];

        porcentajes[0] = 34.2;
        porcentajes[1] = 4.25;
        porcentajes[2] = 45.44;
        porcentajes[3] = 3.74;
        porcentajes[4] = 3.145;
        porcentajes[5] = 94.85;
        porcentajes[6] = 11.11;
        porcentajes[7] = 99.22;
        porcentajes[8] = 144.44;
        porcentajes[9] = 304.345;
        porcentajes[10] = 1004.2;
        porcentajes[11] = 5.10;

        System.out.printf("Junio: %.1f, Julio: %.1f y Agosto %.1f", porcentajes[5], porcentajes[6], porcentajes[7]);
    }
}
