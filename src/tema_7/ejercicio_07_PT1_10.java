package tema_7;
import tema_7.Funciones.arrays;

public class ejercicio_07_PT1_10 {
    public static void main(String[] args) {
        int[] resultado = arrays.rellenaAleatorios(20, 0, 100);
        System.out.println("Array original:");
        arrays.visualizaArray(resultado);
        resultado = arrays.paresImpares(resultado);
        System.out.println("\nArray con los pares al principio:");
        arrays.visualizaArray(resultado);
    }
}
