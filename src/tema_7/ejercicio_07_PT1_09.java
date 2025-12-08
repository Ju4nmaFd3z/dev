package tema_7;
import tema_7.Funciones.arrays;

public class ejercicio_07_PT1_09 {
    public static void main(String[] args) {
        try {
            final int LONGITUD = 8;
            int[] numeros = arrays.dameArray(LONGITUD);
            System.out.println("Introduzca "+LONGITUD+" números enteros, pulse INTRO después de cada número:");
            for (int i=0; i<LONGITUD; i++){
                numeros[i]=Integer.parseInt(System.console().readLine());
            }
            System.out.println();
            for (int i=0; i<LONGITUD; i++){
                System.out.print((numeros[i]%2==0)?numeros[i]+" par":numeros[i]+" impar");
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("\nHa introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("\nHa ocurrido un error inesperado.");
        }
    }
}
