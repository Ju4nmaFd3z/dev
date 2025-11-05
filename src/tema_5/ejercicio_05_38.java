package tema_5;

public class ejercicio_05_38 {
    public static void main(String[] args) {
        try {
            int altura = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura del reloj de arena: "));
            
            int fila = 1;
            while (fila <= altura) {
                for (int i = 1; i <= fila - 1; i++) {
                    System.out.print(" ");
                }
                for (int i = 1; i <= 2 * (altura - fila) + 1; i++) {
                    System.out.print("*");
                }
                System.out.println();
                fila++;
            }
            fila = 2;
            while (fila <= altura) {
                for (int i = 1; i <= altura - fila; i++) {
                    System.out.print(" ");
                }
                for (int i = 1; i <= 2 * fila - 1; i++) {
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