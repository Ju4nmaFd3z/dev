package tema_7;
import tema_7.Funciones.arrays;

public class ejercicio_07_PT1_21 {
    public static void main(String[] args) {
        int[] numeros = arrays.rellenaAleatorios(20, 0, 500);
        System.out.println("Array original:");
        arrays.imprimirTabla(numeros);
        for (int i=0; i<numeros.length; i++){
            numeros[i] = (multiplo5(numeros[i])?numeros[i]:siguienteMultiplo5(numeros[i]));
        }
        System.out.println("Array cincuerizado:");
        arrays.imprimirTabla(numeros);
    }
    private static int siguienteMultiplo5(int num){
        do {
            num++;
        } while (!multiplo5(num));
        return num;
    }
    private static boolean multiplo5(int num){
        return num%5==0;
    }
}
