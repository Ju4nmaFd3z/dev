package tema_5;

public class ejercicio_05_64 {
    public static void main(String[] args) {
        try {
            boolean salir = false;
            int ancho = 6;
            int alto = 3;
            while (!salir) {
                int fila = 1;
                while (fila <= alto) {
                    for (int i = 1; i <= ancho; i++) {
                        if (i == 1 || fila == 1 || fila == alto || i == ancho)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                    fila++;
                }
                System.out.println("1. Agrandarlo");
                System.out.println("2. Achicarlo");
                System.out.println("3. Cambiar la orientacion");
                System.out.println("4. Salir");
                int opcion = Integer
                        .parseInt(System.console().readLine("Indique qué quiere hacer con el rectángulo: "));
                switch (opcion) {
                    case 1:
                        ancho++;
                        alto++;
                        break;
                    case 2:
                        if (ancho > 2 && alto > 2) {
                            ancho--;
                            alto--;
                        } else {
                            System.out.println("El rectángulo no puede ser más pequeño.");
                        }
                        break;
                    case 3:
                        int auxAncho = ancho;
                        ancho = alto;
                        alto = auxAncho;
                        break;
                    case 4:
                        System.out.println("Hasta luego!");
                        salir = true;
                        break;
                    default:
                        System.out.println("Debe introducir una opción correcta.");
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
