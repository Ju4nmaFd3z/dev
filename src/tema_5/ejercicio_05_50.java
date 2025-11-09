package tema_5;

public class ejercicio_05_50 {
    public static void main(String[] args) {
        try {
            int altura = Integer.parseInt(System.console().readLine("Introduzca la altura (5 cómo mínimo): "));
            if (altura<5) {
                System.out.println("Debe introducir una altura mayor o igual a 5");
                return;
            }
            int espacios = Integer.parseInt(System.console().readLine("Introduzca el número de espacios entre los números (1 cómo mínimo): "));
            if (espacios<1) {
                System.out.println("Debe introducir un espacio como mínimo");
                return;
            }
            int fila = 1;
            while (fila<=altura) {
                for (int i=1; i<=1; i++) {
                    if (i==1) System.out.print("*");
                }
                for (int i=1; i<=espacios; i++) {
                    System.out.print(" ");
                }
                for (int i=1; i<=1; i++) {
                    if (fila==1||fila==altura||fila==3) System.out.print("****");
                    else if (fila==2) System.out.print("*   ");
                    else System.out.print("   *");
                }
                for (int i=1; i<=espacios; i++) {
                    System.out.print(" ");
                }
                for (int i=1; i<=1; i++) {
                    if (fila==1||fila==altura||fila==3) System.out.print("****");
                    else if (fila==2) System.out.print("*   ");
                    else System.out.print("   *");
                }
                System.out.println();
                fila++;
            }
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
