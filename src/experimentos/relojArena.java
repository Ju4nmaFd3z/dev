package experimentos;

public class relojArena {
    public static final String CLEAN_SCREEN = "\033[H\033[2J";
    public static void main(String[] args) throws Exception {
        int alturaMitad = 10;
        int fila;
        int nivelArenaArriba = 10;
        int nivelArenaAbajo = 10;
        do {
            fila = alturaMitad;
            while (fila > 1) {
                for (int i = 1; i <= alturaMitad - fila; i++) {
                    System.out.print(" ");
                }
                for (int i = 1; i <= 2 * fila + 1; i++) {
                    if (i == 1 || fila == alturaMitad || i == 2 * fila + 1) 
                        System.out.print("*");
                    else if (nivelArenaArriba >= fila) 
                        System.out.print("·");
                    else 
                        System.out.print(" ");
                }
                System.out.println();
                fila--;
            }
            fila = 1;
            while (fila <= alturaMitad) {
                for (int i = 1; i <= alturaMitad - fila; i++) {
                    System.out.print(" ");
                }
                for (int i = 1; i <= 2 * fila + 1; i++) {
                    if (i == 1 || fila == alturaMitad || i == 2 * fila + 1) 
                        System.out.print("*");
                    else if (nivelArenaAbajo <= fila) 
                        System.out.print("·");
                    else 
                        System.out.print(" ");
                }
                System.out.println();
                fila++;
            }
            nivelArenaArriba--;
            nivelArenaAbajo--;
            Thread.sleep(500);
            System.out.print(CLEAN_SCREEN);
        } while (true);
    }
}