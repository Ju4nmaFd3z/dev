package tema_7;
public class ejercicio_07_PT1_14 {
    public static void main(String[] args) {
        final String[] COLORES = {"verde","rojo","gris","naranja","rosa","blanco","negro","morado"};
        final int LONGITUD = 8;
        String[] palabras = new String[LONGITUD];
        String[] aux = new String[LONGITUD];
        int posColor = 0;
        int posOtros = 0;
        System.out.println("Introduce 8 palabras:");
        // Leer y clasificar palabras
        for(int i=0; i<LONGITUD; i++){
            String palabra = System.console().readLine();
            // Comprobar si la palabra es un color
            if (esColor(COLORES, palabra)) {
                palabras[posColor++] = palabra;
            } else {
                aux[posOtros++] = palabra;
            }
        }
        // Copiar las palabras que NO son colores después de los colores
        for (int i=0; i<posOtros; i++){
            palabras[posColor+i] = aux[i];
        }
        // Mostrar resultado
        System.out.println("\nResultado:");
        for (int i=0; i<palabras.length; i++){
            if (palabras[i] != null) {
                System.out.print(palabras[i] + " ");
            }
        }
    }
    // Función para comprobar si una palabra es un color
    public static boolean esColor(String[] colores, String palabra) {
        for (int i=0; i<colores.length; i++) {
            if (colores[i].equalsIgnoreCase(palabra)) {
                return true;
            }
        }
        return false;
    }
}