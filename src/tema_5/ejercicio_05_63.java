package tema_5;

public class ejercicio_05_63 {
    public static void main(String[] args) {
        try {
            int altura1 = Integer.parseInt(System.console().readLine("Introduzca la altura de la primera pirámide: "));
            int altura2 = Integer.parseInt(System.console().readLine("Introduzca la altura de la segunda pirámide: "));
            int altMax = Math.max(altura1, altura2);
            int fila = 1;
            while (fila<=altMax) {
                if (altura1>altura2) {
                    for (int i=1; i<=altura1-fila; i++) System.out.print(" ");
                    for (int i=1; i<=2*fila-1; i++) System.out.print("*");
                    for (int i=1; i<=altura1-fila; i++) System.out.print(" ");
                    System.out.print(" ");
                    if (!(fila<=altMax-altura2)) {
                        for (int i=1; i<=altMax-fila; i++) System.out.print(" ");
                        for (int i=1; i<=2*(fila-altura1+altura2)-1; i++) System.out.print("*");
                    }
                }
                if (altura1==altura2) {
                    for (int i=1; i<=altura1-fila; i++) System.out.print(" ");
                    for (int i=1; i<=2*fila-1; i++) System.out.print("*");
                    for (int i=1; i<=altura1-fila; i++) System.out.print(" ");
                    System.out.print(" ");
                    for (int i=1; i<=altura2-fila; i++) System.out.print(" ");
                    for (int i=1; i<=2*fila-1; i++) System.out.print("*");
                }
                if (altura2>altura1) {
                    if (!(fila<=altMax-altura1)) {
                        for (int i=1; i<=altMax-fila; i++) System.out.print(" ");
                        for (int i=1; i<=2*fila-(2*(altura2-altura1))-1; i++) System.out.print("*");
                        for (int i=1; i<=altMax-fila; i++) System.out.print(" ");
                    } else for (int i=1; i<=2*altura1-1; i++) System.out.print(" ");
                    System.out.print(" ");
                    for (int i=1; i<=altura2-fila; i++) System.out.print(" ");
                    for (int i=1; i<=2*fila-1; i++) System.out.print("*");
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
