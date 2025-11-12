package tema_5;

public class ejercicio_05_69 {
    public static void main(String[] args) {
        try {
            int altura = Integer.parseInt(System.console().readLine("Introduzca la altura de la pirámide maya: "));
            int fila = 1;
            while (fila<=altura) {
                for (int i=1; i<=altura-fila; i++) System.out.print(" ");
                for (int i=1; i<=fila; i++) {
                    System.out.print("*");
                }
                if (fila%2!=0) System.out.print("****");
                else System.out.print("    ");
                for (int i=1; i<=fila; i++) {
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
