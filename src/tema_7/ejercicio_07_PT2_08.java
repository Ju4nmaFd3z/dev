package tema_7;

public class ejercicio_07_PT2_08 {
    // Constantes de valores del tablero
    public static final int VACIO = 0;
    public static final int ALFIL = 1;
    public static final int PELIGRAN = 2;
    
    // Constantes de tamaño del tablero
    public static final int TAMANIO = 8;
    public static final char LETRA_MIN = 'a';
    public static final char LETRA_MAX = 'h';
    public static final int NUMERO_MIN = 1;
    public static final int NUMERO_MAX = 8;
    
    // Constantes de colores
    public static final String RESET = "\u001B[0m";
    public static final String FONDO_BLANCO = "\u001B[47m";
    public static final String FONDO_NEGRO = "\u001B[40m";
    
    public static void main(String[] args) {
        try {
            int[][] tablero = new int[TAMANIO][TAMANIO];
            
            System.out.print("Letra (" + LETRA_MIN + "-" + LETRA_MAX + "): ");
            char letra = System.console().readLine().toLowerCase().charAt(0);
            
            System.out.print("Número (" + NUMERO_MIN + "-" + NUMERO_MAX + "): ");
            int numero = Integer.parseInt(System.console().readLine());
            
            // Convertir a posición del array
            int columna = letra - LETRA_MIN;
            int fila = TAMANIO - numero;
            
            // Poner el alfil
            tablero[fila][columna] = ALFIL;
            
            // Diagonal arriba-izquierda
            for (int i = fila-1, j = columna-1; i >= 0 && j >= 0; i--, j--) {
                tablero[i][j] = PELIGRAN;
            }
            // Diagonal arriba-derecha
            for (int i = fila-1, j = columna+1; i >= 0 && j < TAMANIO; i--, j++) {
                tablero[i][j] = PELIGRAN;
            }
            // Diagonal abajo-izquierda
            for (int i = fila+1, j = columna-1; i < TAMANIO && j >= 0; i++, j--) {
                tablero[i][j] = PELIGRAN;
            }
            // Diagonal abajo-derecha
            for (int i = fila+1, j = columna+1; i < TAMANIO && j < TAMANIO; i++, j++) {
                tablero[i][j] = PELIGRAN;
            }
            
            // Mostrar el tablero
            System.out.print("   ");
            for (char c = LETRA_MIN; c <= LETRA_MAX; c++) {
                System.out.print(c + "  ");
            }
            System.out.println();
            
            for (int i = 0; i < TAMANIO; i++) {
                System.out.print((TAMANIO-i) + " ");
                for (int j = 0; j < TAMANIO; j++) {
                    // Fondo blanco o negro
                    if ((i + j) % 2 == 0) {
                        System.out.print(FONDO_BLANCO);
                    } else {
                        System.out.print(FONDO_NEGRO);
                    }
                    
                    // Pintamos según caso
                    if (tablero[i][j] == ALFIL) {
                        System.out.print(" ♗ ");
                    } else if (tablero[i][j] == PELIGRAN) {
                        System.out.print(" X ");
                    } else {
                        System.out.print("   ");
                    }
                    
                    System.out.print(RESET);
                }
                System.out.println(" " + (TAMANIO-i));
            }
            
            System.out.print("   ");
            for (char c = LETRA_MIN; c <= LETRA_MAX; c++) {
                System.out.print(c + "  ");
            }
            System.out.println();
            
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}