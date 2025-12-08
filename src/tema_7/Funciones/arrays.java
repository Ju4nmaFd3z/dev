package tema_7.Funciones;

public class arrays {
    public static int[] dameArray(int longitud){
        return new int[longitud];
    }
    public static int[] copiaArray(int[] array){
        int[] copia = dameArray(array.length);
        for (int i=0; i<array.length; i++){
            copia[i]=array[i];
        }
        return copia;
    }
    public static int[] rellenaAleatorios(int longitud, int min, int max){
        int[] numeros = new int[longitud];
        for (int i=0; i<numeros.length; i++){
            numeros[i]=(int)(Math.random()*(max - min + 1)) + min;
        }
        return numeros;
    }
    public static int[] paresImpares(int[] numeros) {
        int[] resultado = dameArray(numeros.length);
        int indice = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0)
                resultado[indice++] = numeros[i];
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0)
                resultado[indice++] = numeros[i];
        }
        return resultado;
    }
    public static int[] desplazaArrayDerecha(int[] array, int desde, int hasta){
        int[] copia = copiaArray(array);
        for (int i=hasta; i>desde; i--){
            copia[i] = array[i-1];
        }
        if (hasta==array.length-1) {
            copia[0]=array[array.length-1];
        }
        return copia;
    }
    public static int[] desplazaArrayIzquierda(int[] array, int desde, int hasta){
        int[] copia = copiaArray(array);
        for (int i=desde; i<hasta; i++){
            copia[i] = array[i+1];
        }
        if (desde==0) {
            copia[array.length-1]=array[0];
        }
        return copia;
    }
    public static int[] primos(int[] numeros) {
        int[] resultado = dameArray(numeros.length);
        int indice = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i]))
                resultado[indice++] = numeros[i];
        }
        for (int i = 0; i < numeros.length; i++) {
            if (!esPrimo(numeros[i]))
                resultado[indice++] = numeros[i];
        }
        return resultado;
    }
    private static boolean esPrimo(int num){
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2){
            if (num % i == 0) return false;
        }
        return true;
    }
    public static void imprimirTabla(int[] array){
        System.out.print("╔═══════════");
        for (int i=0; i<array.length; i++){
            System.out.print("╦═════");
        }
        System.out.println("╗");
        System.out.printf("║ %-10s", "Índice:");
        for (int i=0; i<array.length; i++){
            System.out.printf("║%4d ", i+1);
        }
        System.out.print("║");
        System.out.println();
        System.out.print("╠═══════════");
        for (int i=0; i<array.length; i++){
            System.out.print("╬═════");
        }
        System.out.println("╣");
        System.out.printf("║ %-10s", "Valor:");
        for (int i=0; i<array.length; i++){
            System.out.printf("║%4d ", array[i]);
        }
        System.out.print("║");
        System.out.println();
        System.out.print("╚═══════════");
        for (int i=0; i<array.length; i++){
            System.out.print("╩═════");
        }
        System.out.println("╝");
    }
    public static int maximo(int[] array){
        int maximo = Integer.MIN_VALUE;
        for (int i=0; i<array.length; i++){
            if (array[i]>maximo)
                maximo = array[i];
        }
        return maximo;
    }
    public static int minimo(int[] array){
        int minimo = Integer.MAX_VALUE;
        for (int i=0; i<array.length; i++){
            if (array[i]<minimo)
                minimo = array[i];
        }
        return minimo;
    }
    public static void visualizaArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}