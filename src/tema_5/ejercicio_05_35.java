package tema_5;

public class ejercicio_05_35 {
    public static void main(String[] args) {
        try {
            int altura = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura de la X: "));
            if (altura < 3) {
                System.out.println("La altura debe ser al menos 2.");
                return;
            }
            altura=(altura+1)/2;
            int fila = altura;
            while (fila>=1) {
                for (int i=1; i<=altura-fila; i++) {
                    System.out.print(" ");
                }
                for (int i=1; i<=2*fila-1; i++) {
                    if (i==1||i==2*fila-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                fila--;
            }
            fila = 2;
            while (fila<=altura) {
                for (int i=1; i<=altura-fila; i++) {
                    System.out.print(" ");
                }
                for (int i=1; i<=2*fila-1; i++) {
                    if (i==1||i==2*fila-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
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
