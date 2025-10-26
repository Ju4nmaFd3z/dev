package tema_5;

public class ejercicio_05_24 {
    public static void main(String[] args) {
        try {
            System.out.println("Este programa pinta una pirámide hecha a base de números.");
            int altura = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura de la pirámide: "));
            int fila = 1;
            while (fila<=altura) {
                for (int i=1; i<=altura-fila; i++) {
                    System.out.print(" ");
                }
                for (int i=1; i<=fila; i++) {
                    System.out.print(i);
                }
                for (int i=fila-1; i>=1; i--) {
                    System.out.print(i);
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
