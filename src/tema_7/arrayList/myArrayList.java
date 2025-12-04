package tema_7.arrayList;

public class myArrayList {
    /**
     * Crea un array de dimensión N
     * @param n Dimensión del array
     * @return Array de dimensión N
     */
    public static int[] crearArray(int n){
        return new int[n];
    }
    /**
     * Copia un array en otro
     * @param array Array origen a copiar
     * @return Array copiado
     */
    public static int[] copiarArray(int[] array){
        int[] nuevo = new int[array.length];
        return nuevo;
    }
}
