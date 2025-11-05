package tema_5;

public class ejercicio_05_35 {
    public static void main(String[] args) {
        try {
            int altura = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura de la X: "));
            int fila = 1;
            if (altura % 2 != 0 && altura >= 3) {
                while (fila <= altura) {
                    int col = 1;
                    while (col <= altura) {
                        if (col == fila || col == altura - fila + 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                        col++;
                    }
                    System.out.println();
                    fila++;
                }
            } else {
                System.out.println("Debe introducir una altura mayor o igual a 3.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
