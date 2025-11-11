package tema_5;

public class ejercicio_05_65 {
    public static void main(String[] args) {
        try {
            int altura = Integer.parseInt(System.console().readLine("Introduzca la altura de la A (un número mayor o igual a 3): "));
            if (altura<3) {
                System.out.println("Debe introducir una altura mayor o igual a 3.");
                return;
            }
            System.out.printf("Introduzca la fila del palito horizontal (entre 2 y %d): ", altura-1);
            int palo = Integer.parseInt(System.console().readLine());
            if (palo<2||palo>altura-1) {
                System.out.printf("Debe introducir una altura correcta entre 2 y %d%n", altura-1);
                return;
            }
            int fila = 1;
            while (fila<=altura) {
                for (int i=1; i<=altura-fila; i++) System.out.print(" ");
                for (int i=1; i<=2*fila-1; i++) {
                    if (i==1||i==2*fila-1||fila==palo) System.out.print("*");
                    else System.out.print(" ");
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
