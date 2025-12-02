package tema_7;

public class ejercicio_07_PT1_01 {
    public static void main(String[] args) {
        final int LONGITUD = 12;
        int[] numeros = new int[LONGITUD];
        numeros[0] = 39;
        numeros[1] = -2;
        numeros[4] = 0;
        numeros[6] = 14;
        numeros[8] = 5;
        numeros[9] = 120;
        for (int i=0; i<LONGITUD; i++){
            System.out.println(numeros[i]);
        }
    }
}
