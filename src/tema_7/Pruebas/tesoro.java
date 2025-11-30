package tema_7.Pruebas;

public class tesoro {
    public static void main(String[] args) {
        try {
            final int VACIO = 0;
            final int MINA = 1;
            final int TESORO = 2;
            final int INTENTO = 3;
            int x;
            int y;
            int[][] cuadrante = new int[5][4];
            
            // Inicializar todo el tablero
            for (x = 0; x < 5; x++) {
                for (y = 0; y < 4; y++) {
                    cuadrante[x][y] = VACIO;
                }
            }
            
            // Colocar mina
            int minaX = (int)(Math.random() * 5);
            int minaY = (int)(Math.random() * 4);
            cuadrante[minaX][minaY] = MINA;
            
            // Colocar tesoro
            int tesoroX;
            int tesoroY;
            do {
                tesoroX = (int)(Math.random() * 5);
                tesoroY = (int)(Math.random() * 4);
            } while ((tesoroX == minaX) && (tesoroY == minaY));
            cuadrante[tesoroX][tesoroY] = TESORO;
            
            System.out.println("ENCUENTRA EL TESORO!");
            boolean salir = false;
            String pinta = "";
            
            do {
                // Mostrar tablero
                for (y = 3; y >= 0; y--) {
                    System.out.print(y + "|");
                    for (x = 0; x < 5; x++) {
                        if (cuadrante[x][y] == INTENTO) 
                            System.out.print("X ");
                        else 
                            System.out.print("  ");
                    }
                    System.out.println();
                }
                System.out.println("  ---------");
                System.out.println("  0 1 2 3 4");
                
                // Pedir coordenadas
                boolean xCorrecta = false;
                boolean yCorrecta = false;
                
                do {
                    x = Integer.parseInt(System.console().readLine("Coordenada X: "));
                    if (x < 0 || x > 4) {
                        System.out.println("Debe introducir una coordenada dentro del rango (0-4)!");
                        xCorrecta = false;
                    } else {
                        xCorrecta = true;
                    }
                } while (!xCorrecta);
                
                do {
                    y = Integer.parseInt(System.console().readLine("Coordenada Y: "));
                    if (y < 0 || y > 3) {
                        System.out.println("Debe introducir una coordenada dentro del rango (0-3)!");
                        yCorrecta = false;
                    } else {
                        yCorrecta = true;
                    }
                } while (!yCorrecta);
                
                // Comprobar casilla
                switch (cuadrante[x][y]) {
                    case VACIO:
                        cuadrante[x][y] = INTENTO;
                        break;
                    case MINA:
                        System.out.println("Has encontrado... pero la mina, HAS PERDIDO!");
                        salir = true;
                        break;
                    case TESORO:
                        System.out.println("Has encontrado el tesoro ¡Enhorabuena!");
                        salir = true;
                        break;
                    case INTENTO:
                        System.out.println("Ya has probado esta casilla!");
                        break;
                    default:
                        break;
                }
            } while (!salir);
            
            // Mostrar tablero final
            for (y = 3; y >= 0; y--) {
                System.out.print(y + "|");
                for (x = 0; x < 5; x++) {
                    switch (cuadrante[x][y]) {
                        case VACIO:
                            pinta = "  ";
                            break;
                        case MINA:
                            pinta = "* ";
                            break;
                        case TESORO:
                            pinta = "€ ";
                            break;
                        case INTENTO:
                            pinta = "X ";
                            break;
                        default:
                            break;
                    }
                    System.out.print(pinta);
                }
                System.out.println();
            }
            System.out.println("  ---------");
            System.out.println("  0 1 2 3 4");
            
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto!");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}