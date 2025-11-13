package experimentos;

public class repasoBucles {
    public static final String CLEAN_SCREEN = "\033[H\033[2J";

    public static void main(String[] args) throws Exception {
        int ancho = Integer.parseInt(System.console().readLine("Introduzca el ancho del canvas: "));
        int alto = Integer.parseInt(System.console().readLine("Introduzca el alto del canvas: "));
        int x = ancho/2;
        int y = alto/2;
        boolean salir = false;
        boolean auto = false;
        do {
            if (!auto) {
                for (int i=1; i<=alto; i++) {
                    for (int j=1; j<=ancho; j++) {
                        if (i==1||i==alto||j==1||j==ancho) System.out.print("*");
                        else if (i==y&&j==x) System.out.print("o");
                        else System.out.print(" ");
                    }
                    System.out.println();
                }
                System.out.println("W. Arriba");
                System.out.println("A. Izquierda");
                System.out.println("S. Abajo");
                System.out.println("D. Derecha");
                System.out.println("Q. Automático");
                System.out.println("X. Salir");
                String opcion = System.console().readLine();
                opcion = ""+opcion.toUpperCase().charAt(0);
                switch (opcion) {
                    case "W":
                        y = Math.max(2, y-1);
                        break;
                    case "A":
                        x = Math.max(2, x-1);
                        break;
                    case "S":
                        y = Math.min(alto-1, y+1);
                        break;
                    case "D":
                        x = Math.min(ancho-1, x+1);
                        break;
                    case "Q":
                        auto = true;
                        break;
                    case "X":
                        System.out.println("Hasta luego!");
                        salir = true;
                        break;
                    default:
                        System.out.println("Introduce una opción correcta!");
                        break;
                }
                } else {

                }
                Thread.sleep(10);
                System.out.print(CLEAN_SCREEN);
        } while (!salir);
    }
}
