package tema_7;
import tema_7.Funciones.arrays;

public class ejercicio_07_PT1_11 {
    public static void main(String[] args) {
        try {
            int[] numeros = arrays.dameArray(10);
            System.out.println("Introduzca 10 números separados por INTRO:");
            for (int i=0; i<numeros.length; i++){
                numeros[i] = Integer.parseInt(System.console().readLine());
            }
            numeros = arrays.paresImpares(numeros);
            arrays.imprimirTabla(numeros);
        } catch (NumberFormatException e) {
            System.out.println("\nHa introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("\nHa ocurrido un error inesperado.");
        }
    }
}
