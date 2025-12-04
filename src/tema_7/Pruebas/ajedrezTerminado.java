package tema_7.Pruebas;

public class ajedrezTerminado {
    // Constantes de valores del tablero
    public static final int VACIO = 0;
    public static final int POSICION = 1;
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
    public static final String FONDO_MARRON = "\u001B[48;5;94m";
    
    // Marca una casilla si está dentro del tablero
    public static void marcarCasilla(int[][] tablero, int fila, int columna) {
        if (fila >= 0 && fila < TAMANIO && columna >= 0 && columna < TAMANIO) {
            if (tablero[fila][columna] != POSICION) {
                tablero[fila][columna] = PELIGRAN;
            }
        }
    }
    
    // Marca todas las diagonales
    public static void marcarDiagonales(int[][] tablero, int fila, int columna) {
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
    }
    
    // Marca todas las líneas rectas (arriba, abajo, izquierda, derecha)
    public static void marcarLineasRectas(int[][] tablero, int fila, int columna) {
        // Arriba
        for (int i = fila-1; i >= 0; i--) {
            tablero[i][columna] = PELIGRAN;
        }
        // Abajo
        for (int i = fila+1; i < TAMANIO; i++) {
            tablero[i][columna] = PELIGRAN;
        }
        // Izquierda
        for (int j = columna-1; j >= 0; j--) {
            tablero[fila][j] = PELIGRAN;
        }
        // Derecha
        for (int j = columna+1; j < TAMANIO; j++) {
            tablero[fila][j] = PELIGRAN;
        }
    }
    
    // Muestra el tablero
    public static void mostrarTablero(int[][] tablero, String icono_pieza) {
        System.out.print("      ");
        for (char c = LETRA_MIN; c <= LETRA_MAX; c++) {
            System.out.print(Character.toUpperCase(c) + "  ");
        }
        System.out.println();
        System.out.print("  ");
        for (char c = LETRA_MIN; c <= LETRA_MAX+2; c++) {
            System.out.print(FONDO_MARRON+"   ");
        }
        System.out.print(RESET);
        System.out.println();
        
        for (int i = 0; i < TAMANIO; i++) {
            System.out.print((TAMANIO-i)+" "+FONDO_MARRON+"   "+RESET);
            for (int j = 0; j < TAMANIO; j++) {
                // Fondo blanco o negro
                if ((i + j) % 2 == 0) {
                    System.out.print(FONDO_BLANCO);
                } else {
                    System.out.print(FONDO_NEGRO);
                }
                
                // Pintamos según caso
                if (tablero[i][j] == POSICION) {
                    System.out.print(icono_pieza);
                } else if (tablero[i][j] == PELIGRAN) {
                    System.out.print(" X ");
                } else {
                    System.out.print("   ");
                }
                
                System.out.print(RESET);
            }
            System.out.println(FONDO_MARRON+"   "+RESET+" " + (TAMANIO-i));
        }
        
        System.out.print("  ");
        for (char c = LETRA_MIN; c <= LETRA_MAX+2; c++) {
            System.out.print(FONDO_MARRON+"   ");
        }
        System.out.print(RESET);
        System.out.println();
        System.out.print("      ");
        for (char c = LETRA_MIN; c <= LETRA_MAX; c++) {
            System.out.print(Character.toUpperCase(c) + "  ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        try {
            int[][] tablero = new int[TAMANIO][TAMANIO];
            
            // TODO: Controlar Letra
            System.out.print("Letra (" + LETRA_MIN + "-" + LETRA_MAX + "): ");
            char letra = System.console().readLine().toLowerCase().charAt(0);
            // TODO: Controlar Número
            System.out.print("Número (" + NUMERO_MIN + "-" + NUMERO_MAX + "): ");
            int numero = Integer.parseInt(System.console().readLine());
            
            System.out.println("\nSelecciona la pieza: ");
            System.out.println("1. Rey");
            System.out.println("2. Reina");
            System.out.println("3. Peón");
            System.out.println("4. Alfil");
            System.out.println("5. Caballo");
            System.out.println("6. Torre");
            System.out.print("Opción: ");
            int pieza = Integer.parseInt(System.console().readLine());
            
            // Convertir a posición del array
            int columna = letra - LETRA_MIN;
            int fila = TAMANIO - numero;
            
            // Poner la pieza en la posición
            tablero[fila][columna] = POSICION;
            
            String icono_pieza = "";
            
            switch (pieza) {
                case 1: // Rey - se mueve 1 casilla en todas direcciones
                    icono_pieza = " ♔ ";
                    marcarCasilla(tablero, fila-1, columna-1); // Arriba-izquierda
                    marcarCasilla(tablero, fila-1, columna);   // Arriba
                    marcarCasilla(tablero, fila-1, columna+1); // Arriba-derecha
                    marcarCasilla(tablero, fila, columna-1);   // Izquierda
                    marcarCasilla(tablero, fila, columna+1);   // Derecha
                    marcarCasilla(tablero, fila+1, columna-1); // Abajo-izquierda
                    marcarCasilla(tablero, fila+1, columna);   // Abajo
                    marcarCasilla(tablero, fila+1, columna+1); // Abajo-derecha
                    break;
                    
                case 2: // Reina - diagonales + líneas rectas
                    icono_pieza = " ♕ ";
                    marcarDiagonales(tablero, fila, columna);
                    marcarLineasRectas(tablero, fila, columna);
                    break;
                    
                case 3: // Peón - solo 1 diagonal adelante
                    icono_pieza = " ♙ ";
                    marcarCasilla(tablero, fila-1, columna-1);
                    marcarCasilla(tablero, fila-1, columna+1);
                    break;
                    
                case 4: // Alfil - solo diagonales
                    icono_pieza = " ♗ ";
                    marcarDiagonales(tablero, fila, columna);
                    break;
                    
                case 5: // Caballo - movimiento en L
                    icono_pieza = " ♘ ";
                    marcarCasilla(tablero, fila-2, columna-1);
                    marcarCasilla(tablero, fila-2, columna+1);
                    marcarCasilla(tablero, fila-1, columna-2);
                    marcarCasilla(tablero, fila-1, columna+2);
                    marcarCasilla(tablero, fila+1, columna-2);
                    marcarCasilla(tablero, fila+1, columna+2);
                    marcarCasilla(tablero, fila+2, columna-1);
                    marcarCasilla(tablero, fila+2, columna+1);
                    break;
                    
                case 6: // Torre - solo líneas rectas
                    icono_pieza = " ♖ ";
                    marcarLineasRectas(tablero, fila, columna);
                    break;
                    
                default:
                    System.out.println("Debe introducir una pieza correcta.");
                    return;
            }
            
            // Mostrar el tablero
            mostrarTablero(tablero, icono_pieza);
            
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado: " + e.getMessage());
        }
    }
}