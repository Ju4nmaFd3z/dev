package experimentos;

public class serpiente {
    public static final String CLEAN_SCREEN = "\033[H\033[2J";
    public static void main(String[] args) throws Exception{
        try {
            int altura = Integer.parseInt(System.console().readLine("Introduzca la altura de la serpiente: "));
            int desplazamiento = 10;
            int ultimaPosicion = desplazamiento;
            do {
                for (int i=1; i<=ultimaPosicion; i++) {
                    System.out.print(" ");
                }
                System.out.println("@");
                for (int i=1; i<=altura-1; i++) {
                    int posicion = Math.min(30, Math.max(0, ultimaPosicion+((int)(Math.round(Math.random()*2)))-1));
                    for (int j=1; j<=posicion; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                    ultimaPosicion = posicion;
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
