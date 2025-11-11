package tema_5;

public class ejercicio_05_61 {
    public static void main(String[] args) {
        try {
            int altura = Integer.parseInt(System.console().readLine("Introduzca la altura de la V (un número mayor o igual a 3): "));
            if (altura<3) {
                System.out.println("Debe introducir una altura mayor o igual a 3.");
                return;
            }
            int fila = 0;
            while (fila<altura) {
                for (int i=1; i<=fila; i++) System.out.print(" ");
                System.out.print("***");
                for (int i=1; i<altura-fila; i++) System.out.print(" ");
                for (int i=1; i<altura-fila; i++) System.out.print(" ");
                System.out.print("***");
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
