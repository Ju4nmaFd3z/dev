package tema_5;

import java.nio.channels.Pipe.SourceChannel;

public class ejercicio_05_40 {
    public static void main(String[] args) {
        try {
            int altura = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura del rombo: "));
        if (altura < 2) {
            System.out.println("La altura debe ser al menos 2.");
            return;
        }
            int fila = 1;
            while (fila<=altura) {
                for (int i=1; i<=altura-fila; i++) {
                    System.out.print(" ");
                }
                int ancho = 2*fila-1;
                for (int i=1; i<=ancho; i++) {
                    if (i==1||i==ancho) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                fila++;
            }
            fila = altura-1;
            while (fila>=1) {
                for (int i=1; i<=altura-fila; i++) {
                    System.out.print(" ");
                }
                int ancho = 2*fila-1;
                for (int i=1; i<=ancho; i++) {
                    if (i==1||i==ancho) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                fila--;
            }
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido un valor incorrecto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}
