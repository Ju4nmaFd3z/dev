package tema_7;
import tema_7.Funciones.arrays;

public class ejercicio_07_PT1_19 {
    public static void main(String[] args) {
        int[] numeros = arrays.rellenaAleatorios(12, 0, 200);
        System.out.println("Array original:");
        arrays.imprimirTabla(numeros);
        int numAInsertar = Integer.parseInt(System.console().readLine("Introduzca el número que quiere insertar: "));
        int posAInsertar = (Integer.parseInt(System.console().readLine("Introduzca la posición donde lo quiere insertar (1-12): ")))-1;
        if (posAInsertar >= 0 && posAInsertar < numeros.length) {
            int[] resultado = despDerPierdeUlt(numeros, posAInsertar, numeros.length-1);
            resultado[posAInsertar] = numAInsertar;
            System.out.println("\nArray modificado:");
            arrays.imprimirTabla(resultado);
        } else {
            System.out.println("Error en la entrada de datos.");
        }
    }
    private static int[] despDerPierdeUlt(int[] array, int desde, int hasta){
        int[] resultado = arrays.copiaArray(array);
        for (int i = hasta; i > desde; i--){
            resultado[i] = resultado[i-1];
        }
        return resultado;
    }
}