package tema_7.Funciones;

public class arrays {
    public static int[] dameArray(int longitud){
        return new int[longitud];
    }
    public static int[] rellenaAleatorios(int longitud, int min, int max){
        int[] numeros = new int[longitud];
        for (int i=0; i<numeros.length; i++){
            numeros[i]=(int)(Math.random()*(max - min + 1)) + min;
        }
        return numeros;
    }
    public static void visualizaArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]+" ");
        }
    }
}
