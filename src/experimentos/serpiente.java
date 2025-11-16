package experimentos;

public class serpiente {
    public static final String CLEAN_SCREEN = "\033[H\033[2J";

    public static void main(String[] args) {
        try {
            int altura = Integer.parseInt(System.console().readLine("Introduce la altura de la serpiente: "));
            int posicionInicial = 10;
            int ultPosicion = posicionInicial;
            do {
                for (int i = 1; i <= ultPosicion; i++) {
                    System.out.print(" ");
                }
                System.out.println("@");
                for (int i = 1; i <= altura; i++) {
                    int movimiento = (int) Math.round(Math.random() * 2) - 1;
                    int posicion = Math.min(30, Math.max(0, ultPosicion + movimiento));
                    for (int j = 1; j <= posicion; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                    ultPosicion = posicion;
                }
                Thread.sleep(100);
                System.out.print(CLEAN_SCREEN);
            } while (true);
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
