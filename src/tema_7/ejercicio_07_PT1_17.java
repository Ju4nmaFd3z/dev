package tema_7;
import tema_7.Funciones.arrays;

public class ejercicio_07_PT1_17 {
    public static void main(String[] args) {
        try {
            final int LONGITUD = 10;
            int[] numeros = arrays.rellenaAleatorios(LONGITUD,0,100);
            int numIntroducido;
            int posicion = -1;
            do {
                arrays.imprimirTabla(numeros);
                numIntroducido = Integer.parseInt(System.console().readLine("\nIntroduzca uno de los números del array: "));
                posicion = buscaNum(numeros, numIntroducido);
                if (posicion==-1) System.out.println("Ese número no se encuentra en el array.");
            } while (posicion==-1);
            int[] resultado = rotaHastaInicio(numeros, posicion);
            arrays.imprimirTabla(resultado);
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
    private static int buscaNum(int[] array, int num){
        for(int i=0; i<array.length; i++){
            if (num==array[i]){
                return i;
            }
        }
        return -1;
    }
    private static int[] rotaHastaInicio(int[] array, int desde){
        int[] copia = arrays.copiaArray(array);
        for (int i=0; i<array.length; i++){
            copia[i]=array[(desde+i)%array.length];
        }
        return copia;
    }
}
