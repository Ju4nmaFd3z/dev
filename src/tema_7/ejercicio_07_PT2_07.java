package tema_7;

public class ejercicio_07_PT2_07 {
    public static void main(String[] args) {
        try {
            final int VACIO = 0;
            final int INTENTO = 1;
            final int MINA = 2;
            final int TESORO = 3;
            int[][] mapa = new int[5][4];

            int x;
            int y;

            for (x = 0; x < 5; x++) {
                for (y = 0; y < 4; y++) {
                    mapa[x][y] = VACIO;
                }
            }

            int minaX = (int)(Math.random() * 5);
            int minaY = (int)(Math.random() * 4);        
            mapa[minaX][minaY] = MINA;
            
            int tesoroX;
            int tesoroY;
            do {
                tesoroX = (int)(Math.random() * 5);
                tesoroY = (int)(Math.random() * 4);
            } while (tesoroX == minaX && tesoroY == minaY);
            mapa[tesoroX][tesoroY] = TESORO;

            System.out.println("ENCUENTRA EL TESORO!");
            boolean salir = false;

            do {
                for (y = 3; y >= 0; y--) {
                    System.out.print(y + "|");
                    for (x = 0; x < 5; x++) {
                        if (mapa[x][y] == INTENTO) System.out.print("X ");
                        else System.out.print("  ");
                    }
                    System.out.println();
                }
                System.out.println("  ---------");
                System.out.println("  0 1 2 3 4");

                boolean xCorrecta = false;
                boolean yCorrecta = false;
                do {
                    xCorrecta = false;
                    yCorrecta = false;
                    
                    x = Integer.parseInt(System.console().readLine("Coordenada X: "));
                    if (x >= 0 && x <= 4) xCorrecta = true;
                    else System.out.println("Debe introducir una coordenada dentro del rango de X!");
                    
                    y = Integer.parseInt(System.console().readLine("Coordenada Y: "));
                    if (y >= 0 && y <= 3) yCorrecta = true;
                    else System.out.println("Debe introducir una coordenada dentro del rango de Y!");
                } while (!xCorrecta || !yCorrecta);

                switch (mapa[x][y]) {
                    case VACIO:
                        mapa[x][y] = INTENTO;
                        if ((x+1 < 5 && mapa[x+1][y] == MINA) ||
                            (x-1 >= 0 && mapa[x-1][y] == MINA) ||
                            (y+1 < 4 && mapa[x][y+1] == MINA) ||
                            (y-1 >= 0 && mapa[x][y-1] == MINA) ||
                            (x+1 < 5 && y+1 < 4 && mapa[x+1][y+1] == MINA) ||
                            (x+1 < 5 && y-1 >= 0 && mapa[x+1][y-1] == MINA) ||
                            (x-1 >= 0 && y+1 < 4 && mapa[x-1][y+1] == MINA) ||
                            (x-1 >= 0 && y-1 >= 0 && mapa[x-1][y-1] == MINA)) {
                            System.out.println("Cuidado, hay una mina cerca.");
                        }
                        break;
                    case INTENTO:
                        System.out.println("Ya has probado en esta casilla!");
                        break;
                    case MINA:
                        System.out.println("Encontraste la mina! Has perdido!");
                        salir = true;
                        break;
                    case TESORO:
                        System.out.println("Encontraste el tesoro! Has ganado!");
                        salir = true;
                        break;
                    default:
                        break;
                }
            } while (!salir);
            
            // Mostrar mapa final
            for (y = 3; y >= 0; y--) {
                System.out.print(y + "|");
                for (x = 0; x < 5; x++) {
                    switch (mapa[x][y]) {
                        case VACIO:
                            System.out.print("  ");
                            break;
                        case INTENTO:
                            System.out.print("X ");
                            break;
                        case MINA:
                            System.out.print("* ");
                            break;
                        case TESORO:
                            System.out.print("$ ");
                            break;
                        default:
                            break;
                    }
                }
                System.out.println();
            }
            System.out.println("  ---------");
            System.out.println("  0 1 2 3 4");
            
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}