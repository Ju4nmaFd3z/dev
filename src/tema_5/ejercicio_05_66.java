package tema_5;

public class ejercicio_05_66 {
    public static void main(String[] args) {
        try {
            int altura = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura de la figura: "));
            if (altura%2==0||altura<3) {
                System.out.println("La altura no es correcta, debe ser un número impar mayor o igual que 3.");
                return;
            }
            int fila = 1;
            while (fila<=altura) {
                if (fila<=altura/2+1) {
                    for (int i=1; i<=fila-1; i++) System.out.print(" ");
                    System.out.print("*");
                    System.out.print("    ");
                    System.out.print("*");
                } else {
                    for (int i=1; i<=altura-fila; i++) System.out.print(" ");
                    System.out.print("*");
                    System.out.print("    ");
                    System.out.print("*");
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
