package tema_5;

public class ejercicio_05_59 {
    public static void main(String[] args) {
        try {
            int altura = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura del árbol: "));
            if (altura < 4) {
                System.out.println("La altura debe ser mayor o igual a 4");
                return;
            }
            int fila = 0;
            while (fila <= altura) {
                if (fila == 0) {
                    for (int i = 1; i < altura - fila; i++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    fila++;
                }
                System.out.println();
                while (fila < altura) {
                    for (int i = 2; i <= altura-fila+1; i++) {
                        System.out.print(" ");
                    }
                    for (int i = 1; i <= 2*fila-1; i++) {
                        if (i==1||fila==altura-1||i==2*fila-1) System.out.print("^");
                        else System.out.print(" ");
                    }
                    System.out.println();
                    fila++;
                }
                if (fila == altura) {
                    for (int i = 1; i <= altura - 1; i++) {
                        System.out.print(" ");
                    }
                    System.out.print("Y");
                    fila++;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
